
package hirgroep11;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.HashSet;
import java.util.List;

public class DBExamenToegewezen {
    
    public static int getExNr(String oplOndNaam)throws DBException{
        Connection con = null;
        try
        {
            con = DB.getConnection();
                        
            String sql = "SELECT ExNr FROM Examen WHERE OplOndNaam = ?";
            PreparedStatement stmt = con.prepareStatement(sql);

            stmt.setString(1, oplOndNaam);
                        
            ResultSet srs = stmt.executeQuery();
            
            
            int exNr;
            
            if (srs.next())
            {
                
                exNr = srs.getInt("ExNr");
                
            }
            else {
                DB.closeConnection(con);
                return 0;
            }
            
            DB.closeConnection(con);
            return exNr;
            
        }
        catch (Exception ex)
        {
            ex.printStackTrace();
            DB.closeConnection(con);
            throw new DBException(ex);
        }
    }
    
    public static HashSet<Integer> checkSlotNrs(int exNr) throws DBException{
        Connection con = null;
        try
        {
            con = DB.getConnection();
                        
            String sql = "SELECT SlotNr FROM ExamenToegewezen WHERE ExNr = ?";
            PreparedStatement stmt = con.prepareStatement(sql);

            stmt.setInt(1, exNr);
                        
            ResultSet srs = stmt.executeQuery();
            
            HashSet<Integer> slotNrs = new HashSet<>();
            int slotNr;
            
            while (srs.next())
            {
                
                slotNr = srs.getInt("SlotNr");
                slotNrs.add(slotNr);
                
            }
            
            
            DB.closeConnection(con);
            return slotNrs;
            
        }
        catch (Exception ex)
        {
            ex.printStackTrace();
            DB.closeConnection(con);
            throw new DBException(ex);
        }
    }
    
    public static void SlotToewijzen(int exNr, List<Slot> slots) throws DBException, SQLException
    {
        Connection con = null;
        
        PreparedStatement srs = null;
        
        String sql = "INSERT INTO BINFG11.ExamenToegewezen(ExNr,SlotNr) VALUES (?,?)";
            
        try
        {
            con = DB.getConnection();
            con.setAutoCommit(false);
            srs = con.prepareStatement(sql);
            
            for (Slot a : slots){
                srs.setInt(1, exNr);
                srs.setInt(2, a.getSlotNr());
                srs.executeUpdate();
            }
            
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
    
    public static void deleteToegewezenExamen(Examen e)throws DBException, SQLException
    {
        Connection con = null;

            PreparedStatement srs = null;

            String sql =    "DELETE FROM BINFG11.ExamenToegewezen WHERE ExNr = ?";
            
            try
            {
                con = DB.getConnection();
                con.setAutoCommit(false);
                srs = con.prepareStatement(sql);

                srs.setInt(1, e.getExNr());
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
}
