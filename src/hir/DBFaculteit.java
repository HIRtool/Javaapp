package hir;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.HashSet;

public class DBFaculteit {
    
    //Leest 1 faculteit in wanneer de naam vd faculteit wordt meegegeven.
    public static Faculteit getFaculteit(String facNaam) throws DBException
    {
        Connection con = null;
        try
        {
            con = DB.getConnection();
            
            String sql = "SELECT * FROM Faculteit WHERE FacNaam = ?";
            PreparedStatement stmt = con.prepareStatement(sql);

            stmt.setString(1, facNaam);
            
            ResultSet srs = stmt.executeQuery();
            String straat, gemeente, decaan; 
            int nummer, postcode;
            
            
            if (srs.next())
            {
                facNaam = srs.getString("FacNaam");
                straat = srs.getString("straat");
                nummer = srs.getInt("nummer");
                postcode = srs.getInt("postcode");
                gemeente = srs.getString("gemeente");
                decaan = srs.getString("decaan");
                
            }
            else {
                DB.closeConnection(con);
                return null;
            }
            Adres adres = new Adres(straat, nummer, postcode, gemeente);
            Faculteit faculteit = new Faculteit(facNaam, decaan, adres);
                        
            DB.closeConnection(con);
            return faculteit;
        }
        catch (Exception ex)
        {
            ex.printStackTrace();
            DB.closeConnection(con);
            throw new DBException(ex);
        }        
    }
    
    //Leest alle faculteiten in
    public static HashSet<Faculteit> getFaculteiten() throws DBException
    {
        Connection con = null;
        try
        {
            con = DB.getConnection();
            Statement stmt = con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,
                                                 ResultSet.CONCUR_READ_ONLY);

            String sql = "SELECT FacNaam FROM Faculteit";
            ResultSet srs = stmt.executeQuery(sql);

            HashSet<Faculteit> faculteiten = new HashSet<Faculteit>();
            while (srs.next())
                faculteiten.add(getFaculteit(srs.getString("FacNaam")));
            
            DB.closeConnection(con);
            return faculteiten;
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
