package hirgroep11;

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
                        
            ResultSet srs = stmt.executeQuery();
            
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
    public static HashSet<String> getOngeplandeOpleidingsOnderdelen(int semester, String oplNaam) throws DBException{
        Connection con = null;
        try{
            con = DB.getConnection();
            
            String sql = "Select distinct e.OplOndNaam From Examen e " +
                            "left join ExamenToegewezen et on e.ExNr = et.ExNr " +
                            "join Opleidingsonderdeel oo on oo.OplOndNaam = e.OplOndNaam " +
                            "join Bestaatuit bu on bu.OplOndNaam = oo.OplOndNaam " +
                            "where et.ExNr is null and e.ExamenKans = 1 and bu.OplNaam = ? and oo.semester = ?";
            PreparedStatement stmt = con.prepareStatement(sql);

            stmt.setInt(2, semester);
            stmt.setString(1, oplNaam);
            
            ResultSet srs = stmt.executeQuery();
            
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
            
            String sql = "SELECT semester"+
                         "FROM Opleidingsonderdeel "+
                         "WHERE OplOndNaam = ?";
            PreparedStatement stmt = con.prepareStatement(sql);

            stmt.setString(1, opleidingsonderdeelnaam);
            
            ResultSet srs = stmt.executeQuery();
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
        int aantalStudenten;
        try{
            con = DB.getConnection();
            
            String sql = "SELECT aantal_studenten "+
                         "FROM Opleidingsonderdeel "+
                         "WHERE  OplOndNaam = ?" ;
            PreparedStatement stmt = con.prepareStatement(sql);

            
            stmt.setString(1, opleidingsonderdeelnaam);
            
            ResultSet srs = stmt.executeQuery();
            if (srs.next())
            {
                aantalStudenten = srs.getInt("aantal_studenten");
                
            }
            else {
                DB.closeConnection(con);
                return 0;}
            
            DB.closeConnection(con);
            return aantalStudenten;
            
            
        
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
        String prof;
        try{
            con = DB.getConnection();
            
            String sql = "SELECT Pnr " +
                         "FROM Opleidingsonderdeel "+
                         "WHERE OplOndNaam = ?";
            PreparedStatement stmt = con.prepareStatement(sql);

            stmt.setString(1, opleidingsNaam);
            
            ResultSet srs = stmt.executeQuery();
            if(srs.next()){
            prof = DBProf.getProf(srs.getInt("Pnr")).getProfVoornaam() + " " + DBProf.getProf(srs.getInt("Pnr")).getProfAchternaam();
            } else{
                return null;
            }
            DB.closeConnection(con);
            return  prof ;
           
           
    
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
