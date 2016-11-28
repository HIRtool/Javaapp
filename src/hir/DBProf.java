package hir;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class DBProf {
    
    //Leest 1 prof in wanneer het nummer vd prof wordt meegegeven.
    public static Prof getProf(int pnr) throws DBException
    {
        Connection con = null;
        try
        {
            con = DB.getConnection();
            Statement stmt = con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,
                                                 ResultSet.CONCUR_READ_ONLY);

            String sql = "SELECT * "+
                         "FROM Prof "+
                         "WHERE Pnr = " + pnr;
            
            ResultSet srs = stmt.executeQuery(sql);
            String profVoornaam, profAchternaam; 
            
            
            
            if (srs.next())
            {
                pnr = srs.getInt("Pnr");
                profVoornaam = srs.getString("ProfVoornaam");
                profAchternaam = srs.getString("ProfAchternaam");
                
            }
            else {
                DB.closeConnection(con);
                return null;
            }
            
            Prof prof = new Prof(pnr, profVoornaam, profAchternaam);
                        
            DB.closeConnection(con);
            return prof;
        }
        catch (Exception ex)
        {
            ex.printStackTrace();
            DB.closeConnection(con);
            throw new DBException(ex);
        }        
    }
    
    
    
}
