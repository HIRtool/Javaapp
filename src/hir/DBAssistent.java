package hir;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.HashSet;

public class DBAssistent {
    
    //Leest 1 Assistent in wanneer het nummer van de assistent wordt meegegeven.
    public static Assistent getAssistent(int aNr) throws DBException
    {
        Connection con = null;
        try
        {
            con = DB.getConnection();
            Statement stmt = con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,
                                                 ResultSet.CONCUR_READ_ONLY);

            String sql = "SELECT * "+
                         "FROM Assistent "+
                         "WHERE Anr = " + aNr;
            
            ResultSet srs = stmt.executeQuery(sql);
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
    
    
}
