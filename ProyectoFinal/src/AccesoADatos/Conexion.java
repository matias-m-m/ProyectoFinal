package AccesoADatos;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class Conexion {

    //atributos
    private static String url = "jdbc:mariadb://localhost/bdhotel";
    private static String user = "root";
    private static String pass = "";
    private static Connection conexion = null;

    //constructor
    private Conexion() { //para no instanciar un objecto Conexion

    }

    //creo el metodo conectar
    public static Connection getConectar() {

        if (conexion == null) {

            try {
                //cargo el driver
                Class.forName("org.mariadb.jdbc.Driver");
                //creo la conexion a la base de datos
                conexion = DriverManager.getConnection(url, user, pass);
            } catch (ClassNotFoundException ex) {
                JOptionPane.showMessageDialog(null, "Error al cargar el driver..." + ex.getMessage());
                //Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Error al cargar la base de datos..." + ex.getMessage());
                //Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return conexion;

    }

}
