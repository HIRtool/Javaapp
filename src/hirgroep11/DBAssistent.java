package hirgroep11;

import hirgroep11.Slot.Moment;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class DBAssistent {
    
    //Leest 1 Assistent in wanneer het nummer van de assistent wordt meegegeven.
    public static Assistent getAssistent(int aNr) throws DBException
    {
        Connection con = null;
        try
        {
            con = DB.getConnection();
            
            String sql = "SELECT * FROM Assistent WHERE Anr = ?";
            PreparedStatement stmt = con.prepareStatement(sql);

            stmt.setInt(1, aNr);
            
            
            ResultSet srs = stmt.executeQuery();
            String assVoornaam, assAchternaam; 
            int soort, pnr;
            
            
            if (srs.next())
            {
                aNr = srs.getInt("Anr");
                assVoornaam = srs.getString("AssVoornaam");
                assAchternaam = srs.getString("AssAchternaam");
                soort = srs.getInt("soort");
                pnr = srs.getInt("Pnr");
                
                
            }
            else {
                DB.closeConnection(con);
                return null;
            }
            
            Prof p = DBProf.getProf(pnr);
            if(soort==1)
            {
                OnderzoeksAssistent assistent = new OnderzoeksAssistent(aNr, assVoornaam, assAchternaam, p);
                DB.closeConnection(con);
                return assistent;
            }
            else
                {OnderwijsAssistent assistent = new OnderwijsAssistent(aNr, assVoornaam, assAchternaam, p);
                DB.closeConnection(con);
                return assistent;
                }
            
            
        }
        catch (Exception ex)
        {
            ex.printStackTrace();
            DB.closeConnection(con);
            throw new DBException(ex);
        }        
    }
    public static ArrayList<Assistent> getAssistenten() throws DBException{
        Connection con = null;
        try
        {
            con = DB.getConnection();
            String sql = "SELECT Anr FROM Assistent";
             PreparedStatement stmt = con.prepareStatement(sql);
             ResultSet srs = stmt.executeQuery();
             
             ArrayList<Assistent> assistentenLijst = new ArrayList<>();
             assistentenLijst.add(getAssistent(srs.getInt("Anr")));
             return assistentenLijst;
            
                 
             }
                 
             
             
        
     catch (DBException dbe)
        {
            dbe.printStackTrace();
            DB.closeConnection(con);
            throw dbe;
        }     
        catch (Exception ex)
        {
            ex.printStackTrace();
            DB.closeConnection(con);
            throw new DBException(ex);
        } 
    
    
    }
    
     public static List<Assistent> getVrijeAssistenten(int slotNr) throws DBException
    {
        List<Assistent> vrijeAssistenten = new ArrayList<>();
        Connection con = null;
        try
        {
            con = DB.getConnection();
            
            String sql =    "select a.Anr, a.AssVoornaam, a.AssAchternaam, a.Soort, p.Pnr, p.ProfVoornaam, p.ProfAchternaam, sv.Esnr, es.slotNr from Assistent a " +
                            "join Prof p on p.Pnr = a.Pnr " +
                            "left join Surveillantvan sv on sv.Anr = a.Anr " +
                            "left join ExamenSessie es on es.Esnr = sv.Esnr " +
                            "group by a.Anr " +
                            "having sum(CASE WHEN sv.Esnr is null THEN 0 ELSE 1 END) < CASE a.Soort WHEN 1 THEN 3 WHEN 2 THEN 6  END and (es.SlotNr <> ? or es.SlotNr is null) " +
                            "order by sum(CASE WHEN sv.Esnr is null THEN 0 ELSE 1 END) asc ";
            PreparedStatement stmt = con.prepareStatement(sql);

            stmt.setInt(1, slotNr);
            
            
            ResultSet srs = stmt.executeQuery();
            String assVoornaam, assAchternaam, profVoornaam, profAchternaam; 
            int soort, pnr, aNr;
            
            
            while (srs.next())
            {
                aNr = srs.getInt("Anr");
                assVoornaam = srs.getString("AssVoornaam");
                assAchternaam = srs.getString("AssAchternaam");
                soort = srs.getInt("soort");
                pnr = srs.getInt("Pnr");
                profVoornaam = srs.getString("ProfVoornaam");
                profAchternaam = srs.getString("ProfAchternaam");
                
                Prof p = new Prof(pnr, profVoornaam, profAchternaam);
                if(soort==1)
                {
                    OnderzoeksAssistent assistent = new OnderzoeksAssistent(aNr, assVoornaam, assAchternaam, p);
                    vrijeAssistenten.add(assistent);

                } else {
                    OnderwijsAssistent assistent = new OnderwijsAssistent(aNr, assVoornaam, assAchternaam, p);
                    vrijeAssistenten.add(assistent);
                }
            }
            
            DB.closeConnection(con);
            return vrijeAssistenten;
            
        }
        catch (Exception ex)
        {
            ex.printStackTrace();
            DB.closeConnection(con);
            throw new DBException(ex);
        }        
    }

    public static void surveillantieToewijzen(ExamenSessie es, List<Assistent> geselecteerdeAssistenten) throws DBException, SQLException {
        Connection con = null;
        
        PreparedStatement srs = null;
        
        String sql = "INSERT INTO BINFG11.Surveillantvan(Esnr,Anr) VALUES (?,?)";
        
            
        try
        {
            con = DB.getConnection();
            con.setAutoCommit(false);
            srs = con.prepareStatement(sql);
            
            for(Assistent a : geselecteerdeAssistenten){
                srs.setInt(1, es.getESnr());
                srs.setInt(2, a.getANr());
                srs.executeUpdate();
            }
            
            con.commit();
        }
        catch (SQLException ex)
        {
            System.out.println(ex.getMessage());
            if (con != null){
                try{
                    System.err.print("Transaction is being rolled back");
                    con.rollback();
                } catch(SQLException excep){
                    System.out.println(ex.getMessage());
                }
            }
        } finally {
            if (srs != null){
                srs.close();
            }
            con.setAutoCommit(true);
            DB.closeConnection(con);
        } 
    }

    public static Iterable<Assistent> getBezetteAssistenten() throws DBException {
        
        List<Assistent> bezetteAssistenten = new ArrayList<>();
        Connection con = null;
        try
        {
            con = DB.getConnection();
            
            String sql =    "Select a.*, p.* from Assistent a " +
                            "join Surveillantvan sv on a.Anr = sv.Anr " +
                            "join Prof p on p.Pnr = a.Pnr " +
                            "group by a.Anr ";
            PreparedStatement stmt = con.prepareStatement(sql);
  
            ResultSet srs = stmt.executeQuery();
            String assVoornaam, assAchternaam, profVoornaam, profAchternaam; 
            int soort, pnr, aNr;
            
            
            while (srs.next())
            {
                aNr = srs.getInt("Anr");
                assVoornaam = srs.getString("AssVoornaam");
                assAchternaam = srs.getString("AssAchternaam");
                soort = srs.getInt("soort");
                pnr = srs.getInt("Pnr");
                profVoornaam = srs.getString("ProfVoornaam");
                profAchternaam = srs.getString("ProfAchternaam");
                
                Prof p = new Prof(pnr, profVoornaam, profAchternaam);
                if(soort==1)
                {
                    OnderzoeksAssistent assistent = new OnderzoeksAssistent(aNr, assVoornaam, assAchternaam, p);
                    bezetteAssistenten.add(assistent);

                } else {
                    OnderwijsAssistent assistent = new OnderwijsAssistent(aNr, assVoornaam, assAchternaam, p);
                    bezetteAssistenten.add(assistent);
                }
            }
            
            DB.closeConnection(con);
            return bezetteAssistenten;
            
        }
        catch (Exception ex)
        {
            ex.printStackTrace();
            DB.closeConnection(con);
            throw new DBException(ex);
        }
    }
    
    public static List<ExamenSessie> getExamensessies(Assistent a) throws DBException {
        
        List<ExamenSessie> examenSessies = new ArrayList<>();
        Connection con = null;
        try
        {
            con = DB.getConnection();
            
            String sql =    "Select es.Esnr, es.aantal_studenten, s.SlotNr, s.Datum, s.Moment, a.AssVoornaam, a.AssAchternaam From ExamenSessie es " +
                            "join Surveillantvan sv on es.Esnr = sv.Esnr " +
                            "join Slot s on s.SlotNr = es.SlotNr " +
                            "join Assistent a ON a.Anr = sv.Anr " +
                            "where a.Anr = ?";
            PreparedStatement stmt = con.prepareStatement(sql);
            
            stmt.setInt(1, a.getANr());
  
            ResultSet srs = stmt.executeQuery();
            Date datum ; 
            Moment moment;
            int esNr, slotNr, aantalStudenten;
            
            
            while (srs.next())
            {
                esNr = srs.getInt("es.EsNr");
                aantalStudenten = srs.getInt("es.aantal_studenten");
                slotNr = srs.getInt("s.SlotNr");
                datum = srs.getDate("s.Datum");
                if(srs.getInt("Moment")==1){
                    moment = Slot.Moment.VoorMiddag;
                }
                else{
                    moment = Slot.Moment.NaMiddag;
                }
                
                ExamenSessie es = new ExamenSessie(esNr, aantalStudenten, slotNr);
                es.setDatum(datum);
                es.setMoment(moment);
                examenSessies.add(es);
            }
            
            DB.closeConnection(con);
            return examenSessies;
            
        }
        catch (Exception ex)
        {
            ex.printStackTrace();
            DB.closeConnection(con);
            throw new DBException(ex);
        }
    }
    
    public static void surveillantieWisselen(ExamenSessie es, Assistent aWeg, Assistent aNieuw) throws DBException, SQLException{
        Connection con = null;
        
        PreparedStatement srs = null;
        
        String sql =    "UPDATE BINFG11.Surveillantvan SET Esnr = ? ,Anr = ? WHERE Esnr = ? AND Anr = ?";
        
            
        try
        {
            con = DB.getConnection();
            con.setAutoCommit(false);
            srs = con.prepareStatement(sql);
            
            srs.setInt(1, es.getESnr());
            srs.setInt(2, aNieuw.getANr());
            srs.setInt(3, es.getESnr());
            srs.setInt(4, aWeg.getANr());
            srs.executeUpdate();
                        
            con.commit();
        }
        catch (SQLException ex)
        {
            System.out.println(ex.getMessage());
            if (con != null){
                try{
                    System.err.print("Transaction is being rolled back");
                    con.rollback();
                } catch(SQLException excep){
                    System.out.println(ex.getMessage());
                }
            }
        } finally {
            if (srs != null){
                srs.close();
            }
            con.setAutoCommit(true);
            DB.closeConnection(con);
        }
    }
    
}
