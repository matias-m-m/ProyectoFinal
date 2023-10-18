
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
        String sql = "insert into tipohabitacion (nombreTipo, letraTipo, maxHuespedes, importepornoche, estado) values (?,?,?,?,1)";
        try {
            //preparo la consulta
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, tipohab.getNombreTipo());
            ps.setString(2, tipohab.getLetraTipo()+"");
            ps.setInt(3, tipohab.getMaxHuespedes());
            ps.setDouble(4, tipohab.getImportePorNoche() );
            //ps.setBoolean(5,true);
           
            ps.executeUpdate();
            ps.close();
            JOptionPane.showMessageDialog(null, "Tipo de Habitacion dada de alta con exito...");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al ejecutar la consulta...");
          
        }
    }
     
    
    //metodo para dar de baja un tipohabitacion a traves del id
    public void borrarTipoHabitacion(int idtipohab) {
        
        String sql_H = "update habitacion set estado = 0 where idtipohabitacion = ?";
        
        String sql = "update tipohabitacion set estado = 0 where idTipoHabit = ?";
        try {
            //borrado logico de habitaciones con el tipo enviado
            PreparedStatement ps = con.prepareStatement(sql_H);
            ps.setInt(1, idtipohab);
            ps.executeUpdate();
            
            ps = con.prepareStatement(sql);
            ps.setInt(1, idtipohab);
            ps.executeUpdate();
            
            ps.close();
            JOptionPane.showMessageDialog(null, "Tipo de Habitacion dada de baja con exito....");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al ejecutar la consulta....");
           
        }
    }
    
    
    public void editarTipoHabitacion(TipoHabitacion tipohab) {
        String sql = "update tipohabitacion set nombreTipo=?, letraTipo=?, maxHuespedes=?,importepornoche=?, estado = ? where idTipoHabit=?";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
           
            ps.setString(1, tipohab.getNombreTipo());
            ps.setString(2, tipohab.getLetraTipo()+"");
            ps.setInt(3, tipohab.getMaxHuespedes());
            ps.setDouble(4, tipohab.getImportePorNoche() );
            
            ps.setBoolean(5, tipohab.isEstado());    
          
            ps.setInt(6, tipohab.getIdTipoHabit());
            
                      
            ps.executeUpdate();
            ps.close();
            JOptionPane.showMessageDialog(null, "Tipo de Habitacion modificada con exito...");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al ejecutar la consulta..."+ex.getMessage());
           
        }
    
       
}



}
