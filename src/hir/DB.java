package hir;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class DB {
    public static Connection getConnection() throws DBException
    {
        Connection con = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");

            String protocol = "jdbc" ;
            String subProtocol = "mysql" ;
            String subName = "//mysqlha2.ugent.be/BINFG11?user=BINFG11&password=16ezbxps";
            String URL = protocol +":"+ subProtocol +":"+ subName; 

            con = DriverManager.getConnection(URL);
            return con;
        } catch (SQLException sqle) {
            sqle.printStackTrace();
            closeConnection(con);
            throw new DBException(sqle);
        } catch (ClassNotFoundException cnfe) {            
            cnfe.printStackTrace();
            closeConnection(con);
            throw new DBException(cnfe);
        } catch (Exception ex) {            
            ex.printStackTrace();
            closeConnection(con);
            throw new DBException(ex);
        }
    }
    public static void closeConnection(Connection con) {
        try {
            con.close();
        } catch(SQLException sqle) {
            //do nothing
        }
    }
}
