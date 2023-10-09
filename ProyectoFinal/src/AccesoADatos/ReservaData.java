
package AccesoADatos;


import Entidades.*;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.time.LocalDate;
import javax.swing.JOptionPane;


public class ReservaData {
    
    //atributos
    private Connection con;

    //constructor
    public ReservaData() {

    }

    //recibo la conexion creada en la clase prueba del metodo conectar y la agrego a la variable conexion
    public ReservaData(Connection conexion) {
        this.con = conexion;
    }

    
     //metodos
    //insertar reserva a traves de un object reserva
    public void insertarReserva(Reserva res) {
        String sql = "insert into reserva (idHabitacion,idHuesped,FechaIngreso,FechaSalida,montoTotal,estado) values (?,?,?,?,?,?)";
        try {
            //preparo la consulta
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, res.getIdHabitacion());
            ps.setInt(2, res.getIdHuesped());
            ps.setDate(3, Date.valueOf(res.getFechaIngreso()) );
            ps.setDate(4, Date.valueOf(res.getFechaSalida()) );
            ps.setDouble(5, res.getMontoTotal());
            ps.setBoolean(6, res.isEstado());
            ps.executeUpdate();
            ps.close();
            JOptionPane.showMessageDialog(null, "Reserva dada de alta con exito...");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al ejecutar la consulta...");
          
        }
    }
    
    
    
     //metodo para dar de baja una reserva a traves del id
    public void borrarReserva(int idRes) {
        String sql = "update reserva set estadop=0 where idReserva=?";
        try {
            //preparo la consulta
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, idRes);
            ps.executeUpdate();
            ps.close();
            JOptionPane.showMessageDialog(null, "Reserva dado de baja con exito....");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al ejecutar la consulta....");
           
        }
    }

    //metodo editar reserva a traves del objecto reserva
    public void editarReserva(Reserva res) {
        String sql = "update reserva set idHabitacion=?,idHuesped=?,FechaIngreso=?,FechaSalida=?,montoTotal=?,estado=? where idReserva=?";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, res.getIdHabitacion());
            ps.setInt(2, res.getIdHuesped());
            ps.setDate(3, Date.valueOf(res.getFechaIngreso()) );
            ps.setDate(4, Date.valueOf(res.getFechaSalida()) );
            ps.setDouble(5, res.getMontoTotal());
            ps.setBoolean(6, res.isEstado() );
            ps.setInt(7, res.getIdReserva());
            ps.executeUpdate();
            ps.close();
            JOptionPane.showMessageDialog(null, "Reserva modificada con exito...");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al ejecutar la consulta..."+ex.getMessage());
           
        }

    }
    
    
    
    
    
    
}
