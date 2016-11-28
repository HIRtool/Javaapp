package hir;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class DBOpleiding {
    
    //Leest 1 Opleiding in wanneer de naam van de opleiding wordt meegegeven. Vult ook de HashSet "opleidingen" aan in Faculteit
    public static Opleiding getOpleiding(String oplNaam) throws DBException
    {
        Connection con = null;
        try
        {
            con = DB.getConnection();
            Statement stmt = con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,
                                                 ResultSet.CONCUR_READ_ONLY);

            String sql = "SELECT * "+
                         "FROM Opleiding "+
                         "WHERE OplNaam = " + oplNaam;
            
            ResultSet srs = stmt.executeQuery(sql);
            
            String facNaam; 
            int aantalStudenten, opleidingsduur;
            
            if (srs.next())
            {
                oplNaam = srs.getString("OplNaam");
                aantalStudenten = srs.getInt("aantal_studenten");
                opleidingsduur = srs.getInt("opleidingsduur");
                facNaam = srs.getString("FacNaam");
                
            }
            else {
                DB.closeConnection(con);
                return null;
            }
            
            Faculteit fac = DBFaculteit.getFaculteit(facNaam);
            Opleiding opl = new Opleiding(oplNaam, aantalStudenten, opleidingsduur, fac);
            if(fac.opleidingenHasOpleiding(opl))
            {
                DB.closeConnection(con);
                return opl;
            }
            else
            {
                fac.addOpleiding(opl);
                DB.closeConnection(con);
                return opl;
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
