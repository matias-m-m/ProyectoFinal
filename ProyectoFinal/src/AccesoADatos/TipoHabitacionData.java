
package AccesoADatos;

import Entidades.*;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;


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


     
    
    public List<TipoHabitacion> listarTipoHab(){
        
        TipoHabitacion tipohab = null;
        ArrayList<TipoHabitacion> lista = new ArrayList<>();
        String sql = "select idTipoHabit, nombreTipo, letraTipo, maxHuespedes, importepornoche from tipohabitacion where estado = 1";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            
            while(rs.next()){
                tipohab = new TipoHabitacion();
                tipohab.setIdTipoHabit(rs.getInt("idTipoHabit"));
                tipohab.setNombreTipo(rs.getString("nombreTipo"));
                tipohab.setLetraTipo(rs.getString("letraTipo").charAt(0));
                tipohab.setMaxHuespedes(rs.getInt("maxHuespedes"));
                tipohab.setImportePorNoche(rs.getDouble("importepornoche"));
                
                lista.add(tipohab);
            }    
            ps.close();
        } 
        catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al ejecturar la consulta ..."+ex.getMessage());
            //Logger.getLogger(HuespedData.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return lista ;
    }

    
    
    
    public TipoHabitacion devolver1TipoHab(int id){
        
        TipoHabitacion tipohab = null;
        
        String sql = "select idTipoHabit, nombreTipo, letraTipo, maxHuespedes, importepornoche from tipohabitacion where estado = 1 and idTipoHabit = ?";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            JOptionPane.showMessageDialog(null,"prepare la consulta");
            ResultSet rs = ps.executeQuery();
            JOptionPane.showMessageDialog(null,"ejecute la consulta");
        //    while(rs.next()){
                tipohab = new TipoHabitacion();
                
                JOptionPane.showMessageDialog(null,"cree la variable tipohab");
                //tipohab.setIdTipoHabit(id);
                //tipohab.setIdTipoHabit(rs.getInt("idTipoHabit"));
                tipohab.setNombreTipo(rs.getString("nombreTipo"));
                tipohab.setLetraTipo(rs.getString("letraTipo").charAt(0));
                tipohab.setMaxHuespedes(rs.getInt("maxHuespedes"));
                tipohab.setImportePorNoche(rs.getDouble("importepornoche"));
                JOptionPane.showMessageDialog(null,"Cargué datos en la variable");
                tipohab.setEstado(true);
            //    lista.add(tipohab);
          //  }    
            ps.close();
        } 
        catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al ejecturar la consulta ..."+ex.getMessage());
            //Logger.getLogger(HuespedData.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return tipohab ;
    }
    

}
