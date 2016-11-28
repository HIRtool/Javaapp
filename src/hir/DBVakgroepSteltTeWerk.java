package hir;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class DBVakgroepSteltTeWerk {
    
    //Legt de link tussen proffen die werken bij een vakgroep
    public static void loadProffenIntoVakgroep() throws DBException
    {
        Connection con = null;
        try
        {
            con = DB.getConnection();
            Statement stmt = con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,
                                                 ResultSet.CONCUR_READ_ONLY);

            String sql = "SELECT * "+
                         "FROM Vakgroep ";
            
            ResultSet srs = stmt.executeQuery(sql);
            
            String vakgrNaam; 
            int pnr;
            
            while (srs.next())
            {
                vakgrNaam = srs.getString("VakgrNaam");
                pnr = srs.getInt("Pnr");
                      
                Prof pr = DBProf.getProf(pnr);
                Vakgroep vakgr = DBVakgroep.getVakgroep(vakgrNaam);
                if(!vakgr.hasProf(pr))
                {
                  vakgr.addProf(pr);
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
