package hir;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.HashSet;

public class DBOpleidingsOnderdeel {
    
    //Leest 1 Opleidingsonderdeel in wanneer de naam van het vak wordt meegegeven. 
    public static Opleidingsonderdeel getOpleidingsonderdeel(String oplOndNaam) throws DBException
    {
        Connection con = null;
        try
        {
            con = DB.getConnection();
                        
            String sql = "SELECT * FROM Opleidingsonderdeel WHERE OplOndNaam = ?";
            PreparedStatement stmt = con.prepareStatement(sql);

            stmt.setString(1, oplOndNaam);
                        
            ResultSet srs = stmt.executeQuery(sql);
            
            String oplComNaam; 
            int modelTrajectJaar, aantalStudenten, semester, pnr;
            
            if (srs.next())
            {
                oplOndNaam = srs.getString("OplOndNaam");
                modelTrajectJaar = srs.getInt("modeltrajectjaar");
                aantalStudenten = srs.getInt("aantal_studenten");
                semester = srs.getInt("semester");
                oplComNaam = srs.getString("OplComNaam");
                pnr = srs.getInt("Pnr");
                
            }
            else {
                DB.closeConnection(con);
                return null;
            }
            
            Prof pr = DBProf.getProf(pnr);
            OpleidingsCommissie oplCom = DBOpleidingsCommissie.getOpleidingsCommissie(oplComNaam);
            Opleidingsonderdeel oplOnderdeel = new Opleidingsonderdeel(oplOndNaam, modelTrajectJaar, aantalStudenten, semester, oplCom, pr);
            
            DB.closeConnection(con);
            return oplOnderdeel;
            
        }
        catch (Exception ex)
        {
            ex.printStackTrace();
            DB.closeConnection(con);
            throw new DBException(ex);
        }        
    }
    public static HashSet<String> getOpleidingsOnderdelen(int modelTrajectJaar, String faculteitNaam) throws DBException{
        Connection con = null;
        try{
            con = DB.getConnection();
            Statement stmt = con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,
                                                 ResultSet.CONCUR_READ_ONLY);
            
            String sql = "SELECT OplOndNaam "+
                         "FROM Opleidingsonderdeel "+
                         "WHERE modeltrajectjaar = " + modelTrajectJaar + "AND FacNaam = " + faculteitNaam;
            ResultSet srs = stmt.executeQuery(sql);
            HashSet<String> opleidingsonderdelen = new HashSet<>();
            
            while(srs.next()){
                opleidingsonderdelen.add(srs.getString("OplOndNaam"));
            }
            DB.closeConnection(con);
            return opleidingsonderdelen;
            
            
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
    public static int getSemester(String opleidingsonderdeelnaam) throws DBException{
        Connection con = null;
        int semester;
        try{
            con = DB.getConnection();
            Statement stmt = con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,
                                                 ResultSet.CONCUR_READ_ONLY);
            String sql = "SELECT semester"+
                         "FROM Opleidingsonderdeel "+
                         "WHERE OplOndNaam = " + opleidingsonderdeelnaam;
            ResultSet srs = stmt.executeQuery(sql);
           return   semester= srs.getInt("semester");
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
    public static int getAantalStudenten(String opleidingsonderdeelnaam) throws DBException{
        Connection con = null;
        int AantalStudenten;
        try{
            con = DB.getConnection();
            Statement stmt = con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,
                                                 ResultSet.CONCUR_READ_ONLY);
            String sql = "SELECT aantal_studenten "+
                         "FROM Opleidingsonderdeel "+
                         "WHERE  OplOndNaam = " + opleidingsonderdeelnaam;
            ResultSet srs = stmt.executeQuery(sql);
            DB.closeConnection(con);
            return AantalStudenten = srs.getInt("aantal_studenten");
            
        
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
    public static String getVerantwoordelijkeLesgever(String opleidingsNaam) throws DBException{
        Connection con = null;
        String prof = null;
        try{
            con = DB.getConnection();
            Statement stmt = con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,
                                                 ResultSet.CONCUR_READ_ONLY);
            String sql = "SELECT Pnr  " +
                         "FROM Opleidingsonderdeel "+
                         "WHERE OplOndNaam = " + opleidingsNaam;
            ResultSet srs = stmt.executeQuery(sql);
            DB.closeConnection(con);
           return  prof = DBProf.getProf(srs.getInt("Pnr")).getProfVoornaam() + DBProf.getProf(srs.getInt("Pnr")).getProfAchternaam();
           
           
    
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
