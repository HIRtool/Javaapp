package hir;

import java.sql.Array;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import javax.sql.rowset.serial.SerialArray;

public class DBExamen {
    
    //Leest alle schriftelijke examens in en maakt er een lijst van Examens van
    public static HashSet<Examen> getSchriftelijkExamens() throws DBException
    {
        Connection con = null;
        try
        {
            con = DB.getConnection();
            Statement stmt = con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,
                                                 ResultSet.CONCUR_READ_ONLY);

            String sql = "Select * From SchriftelijkExamen se, Examen e Where se.ExNr = e.ExNr";
            ResultSet srs = stmt.executeQuery(sql);
                                 
            int exNr, exKans, aantalStudenten;
            String exNaam;
            SchriftelijkExamen.Soort soort;
            Opleidingsonderdeel oplOnd;
            HashSet schriftelijkeExamens = new HashSet<>();
            
            while (srs.next()){
                exNr = srs.getInt("ExNr");
                exNaam = srs.getString("ExamenNaam");
                exKans = srs.getInt("ExamenKans");
                aantalStudenten = srs.getInt("Aantal_Studenten");
                oplOnd = DBOpleidingsOnderdeel.getOpleidingsonderdeel(srs.getString("OplOndNaam")) ;
                if (srs.getInt("Soort")==1){
                    soort = SchriftelijkExamen.Soort.OpenBoek;
                }
                else{
                    soort = SchriftelijkExamen.Soort.GeslotenBoek;
                }
                
                SchriftelijkExamen se = new SchriftelijkExamen(soort, exNr, exNaam, exKans, aantalStudenten, oplOnd);
                schriftelijkeExamens.add(se);
            }
               
            
                DB.closeConnection(con);
                return schriftelijkeExamens;
            
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
    
    //Leest alle mondelinge examens in en maakt er een lijst van Examens van
    public static HashSet<Examen> getMondelingExamens() throws DBException
    {
        Connection con = null;
        try
        {
            con = DB.getConnection();
            Statement stmt = con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,
                                                 ResultSet.CONCUR_READ_ONLY);

            String sql = "Select * From MondelingExamen me, Examen e Where me.ExNr = e.ExNr";
            ResultSet srs = stmt.executeQuery(sql);
                                 
            int exNr, exKans, aantalStudenten, maxAantalStudenten;
            String exNaam;
            Opleidingsonderdeel oplOnd;
            HashSet mondelingeExamens = new HashSet<>();
            
            while (srs.next()){
                exNr = srs.getInt("ExNr");
                exNaam = srs.getString("ExamenNaam");
                exKans = srs.getInt("ExamenKans");
                aantalStudenten = srs.getInt("Aantal_Studenten");
                oplOnd = DBOpleidingsOnderdeel.getOpleidingsonderdeel(srs.getString("OplOndNaam")) ;
                maxAantalStudenten = srs.getInt("Max_Aantal_Studenten");
                
                MondelingExamen me = new MondelingExamen(maxAantalStudenten, exNr, exNaam, exKans, aantalStudenten, oplOnd);
                mondelingeExamens.add(me);
            }
               
            
                DB.closeConnection(con);
                return mondelingeExamens;
            
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
    
    //Leest alle  examens in en maakt er een lijst van Examens van
    public static List<Examen> getExamens(List<Integer> exNrs) throws DBException
    {
        Connection con = null;
        try
        {
            con = DB.getConnection();
            
            String sql = "Select  e.ExNr, " +
                                "e.ExamenNaam, " +
                                "e.ExamenKans, " +
                                "e.Aantal_Studenten, " +
                                "e.OplOndNaam, " +
                                "Case WHEN me.ExNr is not null THEN \"Mondeling\" " +
                                     "WHEN se.ExNr is not null THEN \"Schriftelijk\" " +
                                "END \"Type Examen\", " +
                                "me.Max_Aantal_Studenten, " +
                                "se.Soort " +
                        "From Examen e " +
                        "left join MondelingExamen me " +
                        "on me.ExNr = e.ExNr " +
                        "left join SchriftelijkExamen se " +
                        "on se.ExNr = e.ExNr " +
                        "where e.ExNr in (EXNRARRAY)";
            
            //stmt.setArray(1, con.createArrayOf("INT", exNrs.toArray(new Integer[exNrs.size()])));
            
            StringBuilder s = new StringBuilder();
            s.append(exNrs.get(0));
            for(int i=1;i<exNrs.size();i++){
                s.append(",");
                s.append(exNrs.get(i));
            }
            
            sql = sql.replace("EXNRARRAY", s.toString());
            
            PreparedStatement stmt = con.prepareStatement(sql);
            
            ResultSet srs = stmt.executeQuery();
                                 
            int exNr, exKans, aantalStudenten, maxAantalStudenten;
            String exNaam;
            SchriftelijkExamen.Soort soort;
            Opleidingsonderdeel oplOnd;
            List<Examen> examens = new ArrayList<>();
            
            while (srs.next()){
                exNr = srs.getInt("ExNr");
                exNaam = srs.getString("ExamenNaam");
                exKans = srs.getInt("ExamenKans");
                aantalStudenten = srs.getInt("Aantal_Studenten");
                oplOnd = DBOpleidingsOnderdeel.getOpleidingsonderdeel(srs.getString("OplOndNaam")) ;
                if (srs.getString("Type Examen").equalsIgnoreCase("Schriftelijk")){
                    if (srs.getInt("Soort")==1){
                        soort = SchriftelijkExamen.Soort.OpenBoek;
                    }
                    else{
                        soort = SchriftelijkExamen.Soort.GeslotenBoek;
                    }
                    SchriftelijkExamen se = new SchriftelijkExamen(soort, exNr, exNaam, exKans, aantalStudenten, oplOnd);
                    examens.add(se);
                }
                else {
                    maxAantalStudenten = srs.getInt("Max_Aantal_Studenten");
                
                    MondelingExamen me = new MondelingExamen(maxAantalStudenten, exNr, exNaam, exKans, aantalStudenten, oplOnd);
                    examens.add(me);
                }
                
            }
               
            
                DB.closeConnection(con);
                return examens;
            
            
                      
            
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
    
    public static String getSoortExamen(String oplOndNaam, int exKans) throws DBException{
         Connection con = null;
        try
        {
            con = DB.getConnection();
           
            String sql = "Select e.ExNr, " +
                                
                                "Case WHEN me.ExNr is not null THEN \"Mondeling\" " +
                                     "WHEN se.ExNr is not null THEN \"Schriftelijk\" " +
                                "END \"Type Examen\", " +
                                "me.Max_Aantal_Studenten, " +
                                "se.Soort " +
                        "From Examen e " +
                        "left join MondelingExamen me " +
                        "on me.ExNr = e.ExNr " +
                        "left join SchriftelijkExamen se " +
                        "on se.ExNr = e.ExNr " +
                        "Where e.OplOndNaam = ? And e.ExamenKans = ?" ;
            PreparedStatement stmt = con.prepareStatement(sql);

            stmt.setString(1, oplOndNaam);
            stmt.setInt(2, exKans);
            
            ResultSet srs = stmt.executeQuery();
             
            String exSoort;
                        
            if(srs.next()){
                exSoort = srs.getString("Type Examen");
                }
            else{
                DB.closeConnection(con);
                return "Geen examen";
            }
             DB.closeConnection(con);
                return exSoort;             
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
    
    public static int getExamenNr(String oplOndNaam, int exKans) throws DBException{
         Connection con = null;
        try
        {
            con = DB.getConnection();
           
            String sql = "Select ExNr " +
                            "From Examen " +
                            "Where OplOndNaam = ? And ExamenKans = ?" ;
            PreparedStatement stmt = con.prepareStatement(sql);

            stmt.setString(1, oplOndNaam);
            stmt.setInt(2, exKans);
            
            int exNr;
            
            ResultSet srs = stmt.executeQuery();
            if(srs.next()){
                exNr = srs.getInt("ExNr");
            } else {
                DB.closeConnection(con);
                throw new Exception("Examen niet gevonden voor Opleiding: " + oplOndNaam + " en examenkans " + exKans);
            }
                        
            DB.closeConnection(con);
            return exNr;             
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
    
    public static List<Integer> getOngeplandeExamenNrs(int semester, String oplNaam, int exKans)throws DBException{
         Connection con = null;
        try
        {
            con = DB.getConnection();
           
            String sql =    "Select e.ExNr From Examen e " +
                            "left join ExamenToegewezen et on e.ExNr = et.ExNr " +
                            "join Opleidingsonderdeel oo on oo.OplOndNaam = e.OplOndNaam " +
                            "join Bestaatuit bu on bu.OplOndNaam = oo.OplOndNaam " +
                            "where et.ExNr is null and e.ExamenKans = ? and bu.OplNaam = ? and oo.semester = ?" ;
            PreparedStatement stmt = con.prepareStatement(sql);

            stmt.setInt(1, exKans);
            stmt.setString(2, oplNaam);
            stmt.setInt(3, semester);
            
            ResultSet srs = stmt.executeQuery();
            
            List<Integer> ongeplandeExamenNrs = new ArrayList<>();
            
            while(srs.next()){
                ongeplandeExamenNrs.add(srs.getInt("ExNr"));
            } 
                        
            DB.closeConnection(con);
            return ongeplandeExamenNrs;             
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
