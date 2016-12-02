package hir;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class DBExamen {
    
    //
    public static Examen getExamen(int exNr) throws DBException
    {
        Connection con = null;
        try
        {
            con = DB.getConnection();
            String sql = "SELECT * FROM Examen WHERE ExNr = ?";
            PreparedStatement stmt = con.prepareStatement(sql);

            stmt.setInt(1, exNr);

                        
            ResultSet srs = stmt.executeQuery(sql);
            
            String examenNaam, oplOndNaam; 
            int examenKans, aantalStudenten;
            
            if (srs.next())
            {
                exNr = srs.getInt("ExNr");
                examenNaam = srs.getString("ExamenNaam");
                examenKans = srs.getInt("ExamenKans");
                aantalStudenten = srs.getInt("Aantal_Studenten");
                oplOndNaam = srs.getString("OplOndNaam");
                
            }
            else {
                DB.closeConnection(con);
                return null;
            }
            
            Opleidingsonderdeel oplOnd = DBOpleidingsOnderdeel.getOpleidingsonderdeel(oplOndNaam);
            Examen ex = new Examen(exNr, examenNaam, examenKans, aantalStudenten);
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
