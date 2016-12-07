
package hir;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashSet;

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
    
    public static void SlotToewijzen(int exNr, Slot slot) throws DBException, SQLException
    {
        Connection con = null;
        try
        {
            con = DB.getConnection();
            
            // create a Statement from the connection
            Statement statement = con.createStatement();

            // insert the data
            int slotNr = slot.getSlotNr();
            statement.executeUpdate("INSERT INTO ExamenToegewezen VALUES (ExNr, SlotNr) (" + exNr + ", " + slotNr +")");
            
            
            
            DB.closeConnection(con);
        }
        catch (Exception ex)
        {
            ex.printStackTrace();
            DB.closeConnection(con);
            throw new DBException(ex);
        }  
    }
    
    public static void deleteSlotToewijzen(int exNr, Slot slot)throws DBException, SQLException
    {
        Connection con = null;
        try
        {
            con = DB.getConnection();
            
            // create a Statement from the connection
            Statement statement = con.createStatement();

            // insert the data
            int slotNr = slot.getSlotNr();
            statement.executeUpdate("DELETE FROM ExamenToegewezen WHERE ExNr = " + exNr + " AND SlotNR =  " + slotNr);
            
            
            
            DB.closeConnection(con);
        }
        catch (Exception ex)
        {
            ex.printStackTrace();
            DB.closeConnection(con);
            throw new DBException(ex);
        }  
    }
}
