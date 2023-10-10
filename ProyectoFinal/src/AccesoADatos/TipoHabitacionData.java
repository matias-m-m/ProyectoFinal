
package AccesoADatos;

import Entidades.*;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import java.time.LocalDate;


public class TipoHabitacionData {
 
    //atributos
    private Connection con;


    //Constructor
    public TipoHabitacionData() {

    }

    //recibo la conexion creada en la clase prueba del metodo conectar y la agrego a la variable conexion
    public TipoHabitacionData(Connection conexion) {
        this.con = conexion;
    }   

    
    //metodos
    //insertar reserva a traves de un object reserva
    public void insertarTipoHabitacion(TipoHabitacion tipohab) {
        String sql = "insert into tipohabitacion (nombreTipo,maxHuespedes,importepornoche) values (?,?,?)";
        try {
            //preparo la consulta
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, tipohab.getNombreTipo()+"");
            ps.setInt(2, tipohab.getMaxHuespedes());
            ps.setDouble(3, tipohab.getImportePorNoche() );
           
            ps.executeUpdate();
            ps.close();
            JOptionPane.showMessageDialog(null, "Tipo de Habitacion dada de alta con exito...");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al ejecutar la consulta...");
          
        }
    }
     
    
    //metodo para dar de baja una reserva a traves del id
    public void borrarTipoHabitacion(int idtipohab) {
        String sql = "delete from tipohabitacion where idTipoHabit=?";
        try {
            //preparo la consulta
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, idtipohab);
            ps.executeUpdate();
            ps.close();
            JOptionPane.showMessageDialog(null, "Tipo de Habitacion dada de baja con exito....");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al ejecutar la consulta....");
           
        }
    }
    
    
    public void editarTipoHabitacion(TipoHabitacion tipohab) {
        String sql = "update tipohabitacion set nombreTipo=?,maxHuespedes=?,importepornoche=? where idTipoHabit=?";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
           
            ps.setString(1, tipohab.getNombreTipo()+"");
            ps.setInt(2, tipohab.getMaxHuespedes());
            ps.setDouble(3, tipohab.getImportePorNoche() );
            ps.setInt(4, tipohab.getIdTipoHabit());
            
                      
            ps.executeUpdate();
            ps.close();
            JOptionPane.showMessageDialog(null, "Tipo de Habitacion modificada con exito...");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al ejecutar la consulta..."+ex.getMessage());
           
        }
    
       
}



}
