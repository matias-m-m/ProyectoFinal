package AccesoADatos;

import Entidades.*;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class HuespedData {

    //atributos
    private Connection con;

    
    

    //recibo la conexion creada en la clase prueba del metodo conectar y la agrego a la variable conexion
    public HuespedData(){
        //llamo al metodo getConectar desde la clase Conexion
        this.con = Conexion.getConectar();
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
            JOptionPane.showMessageDialog(null, "Error al ejecutar la consulta..."+ex.getMessage());
            //Logger.getLogger(HuespedData.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    //metodo para dar de baja un huesped a traves del id
    public void bajasHuesped(int vid) {
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
    public void modificarHuesped(Huesped huesped) {
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
    //metodo listar Huesped activos
    public List<Huesped> listarHuesped(){
        Huesped huesped = null;
        ArrayList<Huesped> lista = new ArrayList<>();
        String sql = "select idHuesp,apellidoHuesp,nombreHuesp,dniHuesp,domicilioHuesp,emailHuesp,telefonoHuesp from huesped where estadoHuesp = 1";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                huesped = new Huesped();
                huesped.setIdHuesp(rs.getInt("idHuesp"));
                huesped.setApellidoHuesp(rs.getString("apellidoHuesp"));
                huesped.setNombreHuesp(rs.getString("nombreHuesp"));
                huesped.setDniHuesp(rs.getString("dniHuesp"));
                huesped.setDomicilioHuesp(rs.getString("domicilioHuesp"));
                huesped.setEmailHuesp(rs.getString("emailHuesp"));
                huesped.setTelefonoHuesp(rs.getString("telefonoHuesp"));
                lista.add(huesped);
            } 
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al ejecturar la consulta ..."+ex.getMessage());
            //Logger.getLogger(HuespedData.class.getName()).log(Level.SEVERE, null, ex);
        }
        return lista;
    }
    
    //metodo buscar Huesped por dni
    public Huesped buscarHuespPorDni(String vDni){
        Huesped huesped = null;
        String sql = "Select idHuesp,apellidoHuesp,nombreHuesp,dniHuesp,domicilioHuesp,emailHuesp,telefonoHuesp from huesped where dniHuesp=? and estadoHuesp = 1";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, vDni);
            ResultSet rs = ps.executeQuery();
            if(rs.next()){
                huesped = new Huesped();
                huesped.setIdHuesp(rs.getInt("idHuesp"));
                huesped.setApellidoHuesp(rs.getString("apellidoHuesp"));
                huesped.setNombreHuesp(rs.getString("nombreHuesp"));
                huesped.setDniHuesp(rs.getString("dniHuesp"));
                huesped.setDomicilioHuesp(rs.getString("domicilioHuesp"));
                huesped.setEmailHuesp(rs.getString("emailHuesp"));
                huesped.setTelefonoHuesp(rs.getString("telefonoHuesp"));
                huesped.setEstadoHuesp(true);
            } else {
                JOptionPane.showMessageDialog(null,"El huesped no está regsitrado o el DNI es incorrecto");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al ejecutar la consulta..."+ex.getMessage());
            //Logger.getLogger(HuespedData.class.getName()).log(Level.SEVERE, null, ex);
        }
        return huesped;
    }
}
