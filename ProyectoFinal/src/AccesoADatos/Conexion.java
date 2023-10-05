package AccesoADatos;

import java.sql.*;
import javax.swing.JOptionPane;

public class Conexion {

    //atributos
    private String url;
    private String user;
    private String pass;
    private static Connection conex = null;

    //constructor
    public Conexion() {

    }

    public Conexion(String url, String user, String pass) {
        this.url = url;
        this.user = user;
        this.pass = pass;
    }

    //creo el metodo conectar
    public Connection getConectar(String url, String user, String pass) {

        if (conex == null) {
            try {
                //cargo el driver
                Class.forName("org.mariadb.jdbc.Driver");
                //creo la conexion a la base de datos
                conex = DriverManager.getConnection(url, user, pass);
                
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Error al cargar la base de datos..." + ex.getMessage());
               // Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);

            } catch (ClassNotFoundException ex) {
                JOptionPane.showMessageDialog(null, "Error al cargar el driver..." + ex.getMessage());
                //Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return conex;
    }

}
