package hir;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.HashSet;

public class DBLokaal {
    
    //Leest 1 lokaal in wanneer de naam vh lokaal wordt meegegeven.
    public static Lokaal getLokaal(String lokaalNaam) throws DBException
    {
        Connection con = null;
        try
        {
            con = DB.getConnection();
            Statement stmt = con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,
                                                 ResultSet.CONCUR_READ_ONLY);

            String sql = "SELECT * "+
                         "FROM Lokaal "+
                         "WHERE LokaalNaam = " + lokaalNaam;
            
            ResultSet srs = stmt.executeQuery(sql);
            String straat, gemeente; 
            int nummer, postcode, capaciteit;
            
            
            if (srs.next())
            {
                lokaalNaam = srs.getString("LokaalNaam");
                straat = srs.getString("straat");
                nummer = srs.getInt("nummer");
                postcode = srs.getInt("postcode");
                gemeente = srs.getString("gemeente");
                capaciteit = srs.getInt("capaciteit");
                
            }
            else {
                DB.closeConnection(con);
                return null;
            }
            Adres adres = new Adres(straat, nummer, postcode, gemeente);
            Lokaal lokaal = new Lokaal(lokaalNaam, adres, capaciteit);
                        
            DB.closeConnection(con);
            return lokaal;
        }
        catch (Exception ex)
        {
            ex.printStackTrace();
            DB.closeConnection(con);
            throw new DBException(ex);
        }        
    }
    
    //Leest alle faculteiten in
    public static HashSet<Lokaal> getLokalen() throws DBException
    {
        Connection con = null;
        try
        {
            con = DB.getConnection();
            Statement stmt = con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,
                                                 ResultSet.CONCUR_READ_ONLY);

            String sql = "SELECT LokaalNaam "+
                         "FROM Lokaal";
            ResultSet srs = stmt.executeQuery(sql);

            HashSet<Lokaal> lokalen = new HashSet<Lokaal>();
            while (srs.next())
                lokalen.add(getLokaal(srs.getString("LokaalNaam")));
            
            DB.closeConnection(con);
            return lokalen;
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
    
}
