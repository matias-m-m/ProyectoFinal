
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


    //recibo la conexion creada en la clase prueba del metodo conectar y la agrego a la variable conexion
    public TipoHabitacionData() {
        this.con = Conexion.getConectar();
    }   

    
    //metodos

    public Connection getCon() {
        return con;
    }
    
    
    
    
    
    //insertar reserva a traves de un object reserva
    public void insertarTipoHabitacion(TipoHabitacion tipohab) {
        String sql = "insert into tipohabitacion (nombreTipo, letraTipo, maxHuespedes, importepornoche) values (?,?,?,?)";
        try {
            //preparo la consulta
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, tipohab.getNombreTipo());
            ps.setString(2, tipohab.getLetraTipo()+"");
            ps.setInt(3, tipohab.getMaxHuespedes());
            ps.setDouble(4, tipohab.getImportePorNoche() );
           
            ps.executeUpdate();
            ps.close();
            JOptionPane.showMessageDialog(null, "Tipo de Habitacion dada de alta con exito...");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al ejecutar la consulta...");
          
        }
    }
     
    
    //metodo para dar de baja una reserva a traves del id
    public void borrarTipoHabitacion(int idtipohab) {
        
       // String sql_H = "delete from habitacion where idtipohabitacion = ?";
        
        String sql = "delete from tipohabitacion where idTipoHabit=?";
        try {
            //borrado logico de habitaciones con el tipo enviado
//            PreparedStatement ps = con.prepareStatement(sql_H);
//            ps.setInt(1, idtipohab);
//            ps.executeUpdate();
            
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
        String sql = "update tipohabitacion set nombreTipo=?, letraTipo=?, maxHuespedes=?,importepornoche=? where idTipoHabit=?";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
           
            ps.setString(1, tipohab.getNombreTipo());
            ps.setString(2, tipohab.getLetraTipo()+"");
            ps.setInt(3, tipohab.getMaxHuespedes());
            ps.setDouble(4, tipohab.getImportePorNoche() );
            
            ps.setInt(5, tipohab.getIdTipoHabit());
            
                      
            ps.executeUpdate();
            ps.close();
            JOptionPane.showMessageDialog(null, "Tipo de Habitacion modificada con exito...");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al ejecutar la consulta..."+ex.getMessage());
           
        }
    
       
}



}
