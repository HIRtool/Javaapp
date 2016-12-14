package hirgroep11;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class DBBestaatUit {
    
    //Legt de link tussen vakken(opleidingsonderdelen) en opleidingen. Zo kunnen verschillende opleidingen hetzelfde vak hebben
    public static void loadOplOnderdeelIntoOpleiding() throws DBException
    {
        Connection con = null;
        try
        {
            con = DB.getConnection();
            Statement stmt = con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,
                                                 ResultSet.CONCUR_READ_ONLY);

            String sql = "SELECT * FROM BestaatUit ";
            
            ResultSet srs = stmt.executeQuery(sql);
            
            String oplNaam, oplOndNaam; 
                        
            while (srs.next())
            {
                oplNaam = srs.getString("OplNaam");
                oplOndNaam = srs.getString("OplOndNaam");
                      
                Opleiding opl = DBOpleiding.getOpleiding(oplNaam);
                Opleidingsonderdeel oplOnd = DBOpleidingsOnderdeel.getOpleidingsonderdeel(oplOndNaam);
                if(!opl.hasOpleidingsonderdeel(oplOnd))
                {
                  opl.addOpleidingsonderdeel(oplOnd);
                }
            }
            DB.closeConnection(con);
            
        }
        catch (Exception ex)
        {
            ex.printStackTrace();
            DB.closeConnection(con);
            throw new DBException(ex);
        }        
    }
    
}
