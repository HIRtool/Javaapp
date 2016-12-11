package hir;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashSet;

public class DBOpleiding {
    
    //Leest 1 Opleiding in wanneer de naam van de opleiding wordt meegegeven. Vult ook de HashSet "opleidingen" aan in Faculteit
    public static Opleiding getOpleiding(String oplNaam) throws DBException
    {
        Connection con = null;
        try
        {
            con = DB.getConnection();
            
            String sql = "SELECT * FROM Opleiding WHERE OplNaam = ?";
            PreparedStatement stmt = con.prepareStatement(sql);

            stmt.setString(1, oplNaam);

                        
            ResultSet srs = stmt.executeQuery();
            
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
    public static int getOpleidingsduur(Opleiding opl) throws DBException{
        Connection con = null;
        try
        {
             con = DB.getConnection();
            String sql = "SELECT opleidingsduur FROM Opleiding WHERE OplNaam = ? ";
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setString(1, opl.getOplNaam());
            
            ResultSet srs = stmt.executeQuery();
            int opleidingsduur;
            
            if (srs.next())
            {
                opleidingsduur = srs.getInt("opleidingsduur");
            }
            else {
                DB.closeConnection(con);
                return 0;
            }
            
            DB.closeConnection(con);
            
            return opleidingsduur;
            
        } catch (DBException dbe)
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
    public static HashSet<Opleiding> getOpleidingen(Faculteit faculteit) throws DBException{
        Connection con = null;
        try
        {
            con = DB.getConnection();
            
            String sql = "SELECT OplNaam FROM Opleiding WHERE FacNaam = ?";
            PreparedStatement stmt = con.prepareStatement(sql);

            stmt.setString(1, faculteit.getFacNaam());
            
            ResultSet srs = stmt.executeQuery();
            HashSet<Opleiding> opleidingen = new HashSet<>();
            
            while(srs.next()){
                Opleiding a = getOpleiding(srs.getString("OplNaam"));
                opleidingen.add(a);
                
            }
            DB.closeConnection(con);
                return opleidingen;
            } catch (DBException dbe)
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
