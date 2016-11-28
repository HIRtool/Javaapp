package hir;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class DBSchriftelijkExamen {
    
    //
    public static SchriftelijkExamen getSchriftelijkExamen(int exNr) throws DBException
    {
        Connection con = null;
        try
        {
            con = DB.getConnection();
            Statement stmt = con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,
                                                 ResultSet.CONCUR_READ_ONLY);

            String sql = "SELECT * "+
                         "FROM SchriftelijkExamen "+
                         "WHERE ExNr = " + exNr;
            
            ResultSet srs = stmt.executeQuery(sql);
            
            int soort, slotNr;
            
            if (srs.next())
            {
                exNr = srs.getString("VakgrNaam");
                straat = srs.getString("straat");
                nr = srs.getInt("nummer");
                postcode = srs.getInt("postcode");
                gemeente = srs.getString("gemeente");
                facNaam = srs.getString("FacNaam");
                
            }
            else {
                DB.closeConnection(con);
                return null;
            }
            
            Faculteit fac = DBFaculteit.getFaculteit(facNaam);
            Adres adres = new Adres(straat, nr, postcode, gemeente);
            Vakgroep vakgroep = new Vakgroep(vakgrNaam, adres);
            if(fac.hasVakgroep(vakgroep))
            {
                DB.closeConnection(con);
                return vakgroep;
            }
            else
            {
                fac.addVakgroep(vakgroep);
                DB.closeConnection(con);
                return vakgroep;
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
