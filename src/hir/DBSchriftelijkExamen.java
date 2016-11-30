package hir;

import java.sql.Connection;
import java.sql.PreparedStatement;
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
            
            String sql = "SELECT * FROM SchriftelijkExamen WHERE ExNr = ?";
            PreparedStatement stmt = con.prepareStatement(sql);

            stmt.setInt(1, exNr);

                       
            ResultSet srs = stmt.executeQuery();
            
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
