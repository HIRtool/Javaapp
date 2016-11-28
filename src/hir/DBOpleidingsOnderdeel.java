package hir;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class DBOpleidingsOnderdeel {
    
    //Leest 1 Opleidingsonderdeel in wanneer de naam van het vak wordt meegegeven. 
    public static Opleidingsonderdeel getOpleidingsonderdeel(String oplOndNaam) throws DBException
    {
        Connection con = null;
        try
        {
            con = DB.getConnection();
            Statement stmt = con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,
                                                 ResultSet.CONCUR_READ_ONLY);

            String sql = "SELECT * "+
                         "FROM Opleidingsonderdeel "+
                         "WHERE OplOndNaam = " + oplOndNaam;
            
            ResultSet srs = stmt.executeQuery(sql);
            
            String oplComNaam; 
            int modelTrajectJaar, aantalStudenten, semester, pnr;
            
            if (srs.next())
            {
                oplOndNaam = srs.getString("OplOndNaam");
                modelTrajectJaar = srs.getInt("modeltrajectjaar");
                aantalStudenten = srs.getInt("aantal_studenten");
                semester = srs.getInt("semester");
                oplComNaam = srs.getString("OplComNaam");
                pnr = srs.getInt("Pnr");
                
            }
            else {
                DB.closeConnection(con);
                return null;
            }
            
            Prof pr = DBProf.getProf(pnr);
            OpleidingsCommissie oplCom = DBOpleidingsCommissie.getOpleidingsCommissie(oplComNaam);
            Opleidingsonderdeel oplOnderdeel = new Opleidingsonderdeel(oplOndNaam, modelTrajectJaar, aantalStudenten, semester, oplCom, pr);
            
            DB.closeConnection(con);
            return oplOnderdeel;
            
        }
        catch (Exception ex)
        {
            ex.printStackTrace();
            DB.closeConnection(con);
            throw new DBException(ex);
        }        
    }
    
}
