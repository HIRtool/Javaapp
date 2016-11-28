package hir;

import hir.Slot.Moment;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Date;

public class DBSlot {
    
    //Laadt alle slots
    public static void loadSlots() throws DBException
    {
        Connection con = null;
        try
        {
            con = DB.getConnection();
            Statement stmt = con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,
                                                 ResultSet.CONCUR_READ_ONLY);

            String sql = "SELECT * "+
                         "FROM Slot ";
            
            ResultSet srs = stmt.executeQuery(sql);
            
            Date datum; 
            int slotNr;
            Moment moment;
            
            while (srs.next())
            {
                slotNr = srs.getInt("SlotNr");
                datum = srs.getDate("Datum");
                if(srs.getInt("Moment")==1){
                    moment = Slot.Moment.VoorMiddag;
                }
                else{
                    moment = Slot.Moment.NaMiddag;
                }
                      
                Slot slot = new Slot(slotNr, datum, moment);
                
            }
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
