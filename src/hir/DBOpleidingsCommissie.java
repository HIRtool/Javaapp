package hir;

import java.sql.Connection;
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
            Statement stmt = con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,
                                                 ResultSet.CONCUR_READ_ONLY);

            String sql = "SELECT * "+
                         "FROM OpleidingsCommissie "+
                         "WHERE OplComNaam = " + oplComNaam;
            
            ResultSet srs = stmt.executeQuery(sql);
            
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
