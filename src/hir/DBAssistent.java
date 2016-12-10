package hir;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
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
    
     public static List<Assistent> getVrijeAssistenten(int slotNr, String oplOndNaam) throws DBException
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
    
}
