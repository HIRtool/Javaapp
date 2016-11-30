package hir;

import static hir.DBFaculteit.getFaculteit;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.HashSet;

public class DBVakgroep {
    
    //Leest 1 Vakgroep in wanneer de naam van de vakgroep wordt meegegeven. Vult ook de HashSet "vakgroepen" aan in Faculteit
    public static Vakgroep getVakgroep(String vakgrNaam) throws DBException
    {
        Connection con = null;
        try
        {
            con = DB.getConnection();
            
            String sql = "SELECT * FROM Vakgroep WHERE VakgrNaam = ?";
            PreparedStatement stmt = con.prepareStatement(sql);

            stmt.setString(1, vakgrNaam);

                        
            ResultSet srs = stmt.executeQuery();
            
            String straat, gemeente, facNaam; 
            int nr, postcode;
            
            if (srs.next())
            {
                vakgrNaam = srs.getString("VakgrNaam");
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
    
    //Leest alle vakgroepen in
    public static HashSet<Vakgroep> loadVakgroepen() throws DBException
    {
        Connection con = null;
        try
        {
            con = DB.getConnection();
            Statement stmt = con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,
                                                 ResultSet.CONCUR_READ_ONLY);

            String sql = "SELECT VakgrNaam FROM Vakgroep";
            ResultSet srs = stmt.executeQuery(sql);

            HashSet<Vakgroep> vakgroepen = new HashSet<Vakgroep>();
            while (srs.next())
                vakgroepen.add(getVakgroep(srs.getString("VakgrNaam")));
            
            DB.closeConnection(con);
            return vakgroepen;
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
