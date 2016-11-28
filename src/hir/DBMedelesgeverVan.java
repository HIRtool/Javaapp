package hir;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class DBMedelesgeverVan {
    
    //Laadt extra lesgevers(proffen) in voor een vak(opleidingsonderdeel)
    public static void loadMedelesgevers() throws DBException
    {
        Connection con = null;
        try
        {
            con = DB.getConnection();
            Statement stmt = con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,
                                                 ResultSet.CONCUR_READ_ONLY);

            String sql = "SELECT * "+
                         "FROM Medelesgevervan ";
            
            ResultSet srs = stmt.executeQuery(sql);
            
            String oplOndNaam; 
            int pnr;
            
            while (srs.next())
            {
                oplOndNaam = srs.getString("OplOndNaam");
                pnr = srs.getInt("Pnr");
                      
                Prof pr = DBProf.getProf(pnr);
                Opleidingsonderdeel oplOnd = DBOpleidingsOnderdeel.getOpleidingsonderdeel(oplOndNaam);
                if(!oplOnd.hasMedelesgever(pr))
                {
                  oplOnd.addMedelesgever(pr);
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
