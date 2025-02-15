/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Project;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import net.proteanit.sql.DbUtils;
/**
 *
 * @author Nisht_du1fntt
 */
public class ConnectionProvider {

    public static Connection getCon() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
       private void fetchUserList() {
        try {
            // register the driver
            Class.forName("com.mysql.cj.jdbc.Driver");
            //create connection
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/blooddonation", "root", "");

            if (conn == null) {
                System.out.println("Connection error");
            } else {
                System.out.println("Connection established");
            }
            var st = conn.createStatement();
            ResultSet rs = st.executeQuery("select * from addnewdonor");
//            while(rs.next())
//            {
//                System.out.println("Name = "+ rs.getString("name"));
//            }
          
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ConnectionProvider.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(ConnectionProvider.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}


