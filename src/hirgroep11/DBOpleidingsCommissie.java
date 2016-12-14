package hirgroep11;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class DBOpleidingsCommissie {
    
    //Leest 1 commissie in wanneer de naam van de commissie wordt meegegeven.
    public static OpleidingsCommissie getOpleidingsCommissie(String oplComNaam) throws DBException
    {
        Connection con = null;
        try
        {
            con = DB.getConnection();
            
            String sql = "SELECT * FROM Opleidingscommissie WHERE OplComNaam = ?";
            PreparedStatement stmt = con.prepareStatement(sql);

            stmt.setString(1, oplComNaam);
                       
            ResultSet srs = stmt.executeQuery();
            
            String oplNaam; 
            int pnr;
            
            if (srs.next())
            {
                oplComNaam = srs.getString("OplComNaam");
                pnr = srs.getInt("Pnr");
                oplNaam = srs.getString("OplNaam");
                
            }
            else {
                DB.closeConnection(con);
                return null;
            }
            
            Prof pr = DBProf.getProf(pnr);
            Opleiding opl = DBOpleiding.getOpleiding(oplNaam);
            OpleidingsCommissie oplCom = new OpleidingsCommissie(oplComNaam, pr, opl);
            DB.closeConnection(con);
            return oplCom;
            
        }
        catch (Exception ex)
        {
            ex.printStackTrace();
            DB.closeConnection(con);
            throw new DBException(ex);
        }
    }    
    
}
