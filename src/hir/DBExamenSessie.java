package hir;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class DBExamenSessie {
    
    public static int exSessieAanmaken(int aantalStudenten, int slotNr, int exNr) throws SQLException, DBException{

        Connection con = null;
        try
        {
            con = DB.getConnection();
                        
            String updateTableSQL = "INSERT INTO BINFG11.ExamenSessie(aantal_studenten,SlotNr,ExNr) VALUES (?,?,?)";
            
            PreparedStatement preparedStatement = con.prepareStatement(updateTableSQL, PreparedStatement.RETURN_GENERATED_KEYS);
            
            preparedStatement.setInt(1, aantalStudenten);
            preparedStatement.setInt(2, slotNr);
            preparedStatement.setInt(3, exNr);
            // execute insert SQL statement
            preparedStatement.executeUpdate();
            
            ResultSet keys = preparedStatement.getGeneratedKeys();
            int esNr = 0;
            if(keys.next())
                esNr = keys.getInt("GENERATED_KEY");
                
            
            DB.closeConnection(con);
            return esNr;
        
        }
        catch (Exception ex)
        {
            ex.printStackTrace();
            DB.closeConnection(con);
            throw new DBException(ex);
        }  
    }
    
}
