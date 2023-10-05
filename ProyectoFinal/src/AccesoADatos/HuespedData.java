package AccesoADatos;

import Entidades.*;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class HuespedData {

    //atributos
    private Connection con;

    //constructor
    public HuespedData() {

    }

    //recibo la conexion creada en la clase prueba del metodo conectar y la agrego a la variable conexion
    public HuespedData(Connection conexion) {
        this.con = conexion;
    }

    //metodos
    //insertar huesped a traves de un object huesped
    public void insertarHuesped(Huesped huesped) {
        String sql = "insert into huesped (apellidoHuesp,nombreHuesp,dniHuesp,domicilioHuesp,emailHuesp,telefonoHuesp,estadoHuesp) values (?,?,?,?,?,?,1)";
        try {
            //preparo la consulta
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, huesped.getApellidoHuesp());
            ps.setString(2, huesped.getNombreHuesp());
            ps.setString(3, huesped.getDniHuesp());
            ps.setString(4, huesped.getDomicilioHuesp());
            ps.setString(5, huesped.getEmailHuesp());
            ps.setString(6, huesped.getTelefonoHuesp());
            ps.executeUpdate();
            ps.close();
            JOptionPane.showMessageDialog(null, "Registro cargado con exito...");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al ejecutar la consulta...");
            //Logger.getLogger(HuespedData.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    //metodo para dar de baja un huesped a traves del id
    public void borrarHuesped(int vid) {
        String sql = "update huesped set estadoHuesp=0 where idHuesp=?";
        try {
            //preparo la consulta
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, vid);
            ps.executeUpdate();
            ps.close();
            JOptionPane.showMessageDialog(null, "Registro dado de baja con exito....");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al ejecutar la consulta....");
            //Logger.getLogger(HuespedData.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    //metodo editar huesped a traves del objecto huesped
    public void editarHuesped(Huesped huesped) {
        String sql = "update huesped set apellidoHuesp=?,nombreHuesp=?,dniHuesp=?,domicilioHuesp=?,emailHuesp=?,telefonoHuesp=? where idHuesp=?";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, huesped.getApellidoHuesp());
            ps.setString(2, huesped.getNombreHuesp());
            ps.setString(3, huesped.getDniHuesp());
            ps.setString(4, huesped.getDomicilioHuesp());
            ps.setString(5, huesped.getEmailHuesp());
            ps.setString(6, huesped.getTelefonoHuesp());
            ps.setInt(7, huesped.getIdHuesp());
            ps.executeUpdate();
            ps.close();
            JOptionPane.showMessageDialog(null, "Registro modificado con exito...");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al ejecutar la consulta..."+ex.getMessage());
            //Logger.getLogger(HuespedData.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
}
