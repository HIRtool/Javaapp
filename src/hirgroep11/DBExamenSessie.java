package hirgroep11;

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
        
        //Verwijdert examensessies en bijhorende lokalen en surveillanten (in DB is CASCADE ON DELETE gebruikt)
        public static void examenSessiesVerwijderen(Examen e) throws DBException, SQLException{
            Connection con = null;

            PreparedStatement srs = null;

            String sql =    "DELETE FROM BINFG11.ExamenSessie WHERE ExNr = ?";


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
