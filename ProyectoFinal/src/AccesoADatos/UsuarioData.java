/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AccesoADatos;


import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.security.auth.spi.LoginModule;
import javax.swing.JOptionPane;

public class UsuarioData {
   private Connection con;
   
   
    public UsuarioData(){
        this.con = Conexion.getConectar();
    }
    public boolean Login(String usr,String pass){
        boolean respuesta = false;
      String consulta = "SELECT * FROM usuarios WHERE usuario =? AND password =?";
       try {
           PreparedStatement ps=con.prepareStatement(consulta);
           ps.setString(1, usr);
           ps.setString(2, pass);
           ResultSet rs = ps.executeQuery();
           if (rs.next()) {
              respuesta=true;
               
           }else 
              respuesta=false;
       } catch (SQLException ex) {
           Logger.getLogger(UsuarioData.class.getName()).log(Level.SEVERE, null, ex);
       }
       
      return respuesta;
    }
    public boolean registrarUsuario(String usr, String pass) {
        String consulta = "INSERT INTO usuarios (usuario, password) VALUES (?, ?)";
        try {
            PreparedStatement ps = con.prepareStatement(consulta);
            ps.setString(1, usr);
            ps.setString(2, pass);
            int resultado = ps.executeUpdate();

            return resultado > 0;
        } catch (SQLException ex) {
            Logger.getLogger(UsuarioData.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }
}
