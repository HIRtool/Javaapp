package hirgroep11;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

public class DBLokaal {

    public static HashSet<Lokaal> getLokalen() throws DBException {

        Connection con = null;
        try {
            con = DB.getConnection();
            Statement stmt = con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,
                    ResultSet.CONCUR_READ_ONLY);
            String sql = "SELECT *"
                    + "FROM Lokaal ";
            ResultSet srs = stmt.executeQuery(sql);
            HashSet<Lokaal> lokalen = new HashSet<>();
            String LokaalNaam, straat, gemeente;
            int nummer, postcode, capaciteit;
            while (srs.next()) {
                LokaalNaam = srs.getString("Lokaalnaam");
                straat = srs.getString("straat");
                gemeente = srs.getString("gemeente");
                nummer = srs.getInt("nummer");
                postcode = srs.getInt("postcode");
                capaciteit = srs.getInt("capaciteit");
                Adres b = new Adres(straat, nummer, postcode, gemeente);
                Lokaal a = new Lokaal(LokaalNaam, b, capaciteit);
                lokalen.add(a);
            }
            DB.closeConnection(con);
            return lokalen;

        } catch (Exception ex) {
            ex.printStackTrace();
            DB.closeConnection(con);
            throw new DBException(ex);
        }

    }
    
    public static ArrayList<Lokaal> laadVrijeLokalen (int slotNr) throws DBException
    {
        Connection con = null;
        try
        {
            con = DB.getConnection();
            
            String sql =    "Select * From Lokaal l Where l.LokaalNaam not in " +
                            "(Select lt.LokaalNaam from LokaalToegewezen lt " +
                            "join ExamenSessie es on es.Esnr = lt.Esnr Where es.SlotNr = ?)" +
                            "order by l.straat, l.capaciteit desc";
            
            
            PreparedStatement stmt = con.prepareStatement(sql);

            stmt.setInt(1, slotNr);
            
            String lokaalNaam, straat, gemeente;
            int nummer, postcode, capaciteit;
                        
            ResultSet srs = stmt.executeQuery();
            
            ArrayList<Lokaal> lokalen = new ArrayList<>();
            while (srs.next())
            {
                lokaalNaam = srs.getString("Lokaalnaam");
                straat = srs.getString("straat");
                gemeente = srs.getString("gemeente");
                nummer = srs.getInt("nummer");
                postcode = srs.getInt("postcode");
                capaciteit = srs.getInt("capaciteit");
                Adres b = new Adres(straat, nummer, postcode, gemeente);
                Lokaal a = new Lokaal(lokaalNaam, b, capaciteit);
                lokalen.add(a);
            }
            
            
            DB.closeConnection(con);
            return lokalen;
        }
        catch (Exception ex)
        {
            ex.printStackTrace();
            DB.closeConnection(con);
            throw new DBException(ex);
        }
    }

    public static int getCapaciteit(String lokaalNaam) throws DBException {
        Connection con = null;
        int capaciteit;
        try {
            con = DB.getConnection();

            String sql = "SELECT capaciteit "
                    + "FROM Lokaal "
                    + "WHERE LokaalNaam = ?";
            PreparedStatement stmt = con.prepareStatement(sql);

            stmt.setString(1, lokaalNaam);

            ResultSet srs = stmt.executeQuery();

            capaciteit = srs.getInt("capaciteit");
            return capaciteit;
        } catch (DBException dbe) {
            dbe.printStackTrace();
            DB.closeConnection(con);
            throw dbe;
        } catch (Exception ex) {
            ex.printStackTrace();
            DB.closeConnection(con);
            throw new DBException(ex);
        }

    }
    public static Lokaal getLokaal(String lokaalNaam) throws SQLException, DBException{
         Connection con = null;
         try {
            con = DB.getConnection();

            String sql = "SELECT * "
                    + "FROM Lokaal "
                    + "WHERE LokaalNaam = ?";
            PreparedStatement stmt = con.prepareStatement(sql);

            stmt.setString(1, lokaalNaam);

            ResultSet srs = stmt.executeQuery();
            String LokaalNaam, straat, gemeente;
            int nummer, postcode, capaciteit;
            if (srs.next()) {
                LokaalNaam = srs.getString("Lokaalnaam");
                straat = srs.getString("straat");
                gemeente = srs.getString("gemeente");
                nummer = srs.getInt("nummer");
                postcode = srs.getInt("postcode");
                capaciteit = srs.getInt("capaciteit");
                
                
            } else {
                DB.closeConnection(con);
                return null;
            }
            Adres b = new Adres(straat, nummer, postcode, gemeente);
            Lokaal a = new Lokaal(LokaalNaam, b, capaciteit);
            DB.closeConnection(con);
            return a;
            
            
        } catch (DBException dbe) {
            dbe.printStackTrace();
            DB.closeConnection(con);
            throw dbe;
        } catch (Exception ex) {
            ex.printStackTrace();
            DB.closeConnection(con);
            throw new DBException(ex);
        }
    }
    public static void LokalenBoeken(Lokaal l, int esnr) throws SQLException, DBException{

        Connection con = null;
        
        PreparedStatement srs = null;
        
        String sql = "INSERT INTO BINFG11.LokaalToegewezen (LokaalNaam, Esnr) VALUES  (?,?)";
        
            
        try
        {
            con = DB.getConnection();
            con.setAutoCommit(false);
            srs = con.prepareStatement(sql);
            
            
            srs.setString(1, l.getLokaalNaam());
            srs.setInt(2, esnr);
            srs.executeUpdate();
            
            con.commit();
        }
        catch (SQLException ex)
        {
            System.out.println(ex.getMessage());
            if (con != null){
                try{
                    System.err.print("Transaction is being rolled back");
                    con.rollback();
                } catch(SQLException excep){
                    System.out.println(ex.getMessage());
                }
            }
        } finally {
            if (srs != null){
                srs.close();
            }
            con.setAutoCommit(true);
            DB.closeConnection(con);
        } 
    }
    /*public static Lokaal getLokaal(String lokaalNaam) throws DBException{
        Connection con = null;
        try
        {
            con = DB.getConnection();
            
            String sql = "SELECT * FROM Lokaal WHERE LokaalNaam = ?";
            PreparedStatement stmt = con.prepareStatement(sql);

            stmt.setString(1, lokaalNaam);
            
            ResultSet srs = stmt.executeQuery();
            int nummer, postcode, capaciteit;
            String straat, gemeente;       
          
            }  catch (DBException dbe)
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
    }*/

    public static HashSet<String> getLokaal(int aantalStudenten) throws DBException {
        Connection con = null;
        try {
            con = DB.getConnection();
            Statement stmt = con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,
                    ResultSet.CONCUR_READ_ONLY);
            String sql = "SELECT LokaalNaam "
                    + "FROM Lokaal  "
                    + "WHERE capaciteit <= " + aantalStudenten;
            ResultSet srs = stmt.executeQuery(sql);
            HashSet<String> lokalen = new HashSet<>();
            while (srs.next()) {
                lokalen.add(srs.getString("LokaalNaam") + "(" + getCapaciteit(srs.getString("LokaalNaam")) + ")");
            }
            DB.closeConnection(con);
            return lokalen;

        } catch (DBException dbe) {
            dbe.printStackTrace();
            DB.closeConnection(con);
            throw dbe;
        } catch (Exception ex) {
            ex.printStackTrace();
            DB.closeConnection(con);
            throw new DBException(ex);
        }

    }
}
