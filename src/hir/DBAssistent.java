package hir;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
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
            
            String sql =    "Select a.*, p.* From Assistent a " +
                            "join Prof p on a.Pnr = p.Pnr " +
                            "join Opleidingsonderdeel oo on a.Pnr = oo.Pnr " +
                            "where oo.OplOndNaam = ? and a.Anr not in (select ss.Anr from ( " +
                                "Select  a.Anr, a.Soort, es.SlotNr from Assistent a " +
                                "join Surveillantvan sv on a.Anr = sv.Anr " +
                                "join ExamenSessie es on es.Esnr = sv.Esnr " +
                                "group by a.Anr " +
                                "having CASE a.Soort WHEN 1 THEN 3 WHEN 2 THEN 6  END <= count(1) " +
                                "or es.SlotNr = ?) ss) " +
                            "union all " +
                            "Select a.*, p.* From Assistent a " +
                            "join Prof p on a.Pnr = p.Pnr " +
                            "join Opleidingsonderdeel oo on a.Pnr = oo.Pnr " +
                            "where oo.OplOndNaam <> ? and a.Anr not in (select ss.Anr from ( " +
                                "Select  a.Anr, a.Soort, es.SlotNr from Assistent a " +
                                "join Surveillantvan sv on a.Anr = sv.Anr " +
                                "join ExamenSessie es on es.Esnr = sv.Esnr " +
                                "group by a.Anr " +
                                "having CASE a.Soort WHEN 1 THEN 3 WHEN 2 THEN 6 END <= count(1) " +
                                "or es.SlotNr = ?) ss)";
            PreparedStatement stmt = con.prepareStatement(sql);

            stmt.setInt(1, slotNr);
            stmt.setString(2, oplOndNaam);
            stmt.setInt(1, slotNr);
            stmt.setString(4, oplOndNaam);
            
            
            ResultSet srs = stmt.executeQuery();
            String assVoornaam, assAchternaam, profVoornaam, profAchternaam; 
            int soort, pnr, aNr;
            
            
            if (srs.next())
            {
                aNr = srs.getInt("Anr");
                assVoornaam = srs.getString("AssVoornaam");
                assAchternaam = srs.getString("AssAchternaam");
                soort = srs.getInt("soort");
                pnr = srs.getInt("Pnr");
                profVoornaam = srs.getString("ProfVoornaam");
                profAchternaam = srs.getString("ProfAchternaam");
                
            }
            else {
                DB.closeConnection(con);
                return null;
            }
            
            Prof p = new Prof(pnr, assVoornaam, assAchternaam);
            if(soort==1)
            {
                OnderzoeksAssistent assistent = new OnderzoeksAssistent(aNr, assVoornaam, assAchternaam, p);
                vrijeAssistenten.add(assistent);
                
            }
            else {
                OnderwijsAssistent assistent = new OnderwijsAssistent(aNr, assVoornaam, assAchternaam, p);
                vrijeAssistenten.add(assistent);
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
    
}
