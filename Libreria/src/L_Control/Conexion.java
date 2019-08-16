package L_Control;

import java.sql.*;
import javax.swing.JOptionPane;
/*import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;*/

public class Conexion {
    private static Connection con = null;
    public static Connection conectar(){  //en la otra programacion se maneja como "obtener"
        if(con == null){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con=(Connection) DriverManager.getConnection("jdbc:mysql://localhost/libreria1","root","");
            System.out.println("conexion exitosa");
        } catch (ClassNotFoundException | SQLException e) {
            System.out.print(e.getMessage());
            JOptionPane.showMessageDialog(null, "error al conectar" + e);
        }
        }
        return con;
    }
    public void Connection() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
