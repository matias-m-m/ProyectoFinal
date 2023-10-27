/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AccesoADatos;
import Entidades.*;import Entidades.*;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author andre
 */
public class HabitacData {
    private Connection con;
    
    
    
    public HabitacData(){
        this.con = Conexion.getConectar();
    }
    
    public void nuevaHabitac(Habitacion h){
        String sqlInsert = "INSERT INTO habitacion"
                + "(nroHabitacion,idTipoHabitacion,piso,estado) values (?,?,?,?)";
        try{
            PreparedStatement psIns = con.prepareStatement(sqlInsert);
            psIns.setInt(1,h.getNroHabitacion());
            psIns.setInt(2,h.getTipoHabitacion().getIdTipoHabit());
            psIns.setInt(3,h.getPiso());
            psIns.setBoolean(4,true);
            psIns.executeUpdate();
            psIns.close();
            JOptionPane.showMessageDialog(null, "Habitación cargada con éxito");
        } catch (SQLException x){
            JOptionPane.showMessageDialog(null, "Error al cargar la habitacion");
        }

    }
    
    public void editarHabitacion(Habitacion h){
        String sqlEdit="UPDATE habitacion SET nroHabitacion=?,idTipoHabitacion=?,piso=?,estado=? WHERE idHabitacion=?";
        try{
          PreparedStatement psEdit = con.prepareStatement(sqlEdit);
            psEdit.setInt(1,h.getNroHabitacion());
            psEdit.setInt(2,h.getTipoHabitacion().getIdTipoHabit());
            psEdit.setInt(3,h.getPiso());
            psEdit.setBoolean(4,h.isEstado());
            psEdit.setInt(5, h.getIdHabitacion());
            psEdit.executeUpdate();
            psEdit.close();
            JOptionPane.showMessageDialog(null, "Habitación modificada correctamente");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al editar la habitación: "+ex.getMessage());
            //Logger.getLogger(HuespedData.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void bajarhabitacion(int id){
        String sqlBaja="UPDATE habitacion SET estado=0 WHERE idHabitacion=?";
        try{
          PreparedStatement psBaja = con.prepareStatement(sqlBaja);
            psBaja.setInt(1,id);
            
            psBaja.executeUpdate();
            psBaja.close();
            JOptionPane.showMessageDialog(null, "Habitación deshabilitada con exito");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al editar la habitación: "+ex.getMessage());
            //Logger.getLogger(HuespedData.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    
    
    public void bajarhabitacionesdeTipo( int tipohab ) {
        String sqlBajaVarias="UPDATE habitacion SET estado=0 WHERE idTipoHabitacion=?";
        try{
          PreparedStatement psBajas = con.prepareStatement(sqlBajaVarias);
            psBajas.setInt(1,tipohab);
            
            psBajas.executeUpdate();
            psBajas.close();
            JOptionPane.showMessageDialog(null, "Habitaciones deshabilitadas con exito");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al editar la habitación: "+ex.getMessage());
            //Logger.getLogger(HuespedData.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    
    
    public void habilitarHabitacionesDeTipo( int tipohab ) {
        String sqlHabilitarVarias="UPDATE habitacion SET estado=1 WHERE idTipoHabitacion=?";
        try{
          PreparedStatement psHabilitar = con.prepareStatement(sqlHabilitarVarias);
            psHabilitar.setInt(1,tipohab);
            
            psHabilitar.executeUpdate();
            psHabilitar.close();
            JOptionPane.showMessageDialog(null, "Habitaciones habilitadas con exito");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al editar la habitación: "+ex.getMessage());
            //Logger.getLogger(HuespedData.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        
    }
   
    ///////////////////////////////////////////////////////////////////////////////////////////////////
    
  
    public List<Habitacion> listarHabPorTipo(int idTipo) {
        
        
        
        Habitacion  hab = null;
        ArrayList<Habitacion> listahab = new ArrayList<>();
        
        TipoHabitacion th =  null;
       
        
        
        
        String sql0 = "select idTipoHabit,nombreTipo, letraTipo, maxHuespedes, importepornoche from tipohabitacion where estado = 1 and idTipoHabit = ?";
         
            
        String sql = "select idHabitacion,nroHabitacion,idTipoHabitacion,piso from habitacion where estado = 1 and idTipoHabitacion = ?";
        
     
        try {
      
            PreparedStatement ps0 = con.prepareStatement(sql0);
            ps0.setInt(1, idTipo);
            ResultSet rs0 = ps0.executeQuery();
            
            if (rs0.next()){
                th = new TipoHabitacion();
                th.setIdTipoHabit(rs0.getInt("idTipoHabit"));
                th.setNombreTipo(rs0.getString("nombreTipo"));
                th.setLetraTipo(rs0.getString("letraTipo").charAt(0));
                th.setMaxHuespedes(rs0.getInt("maxHuespedes"));
                th.setImportePorNoche(rs0.getDouble("importepornoche"));
                th.setEstado(true);
            }
            
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, idTipo);
            ResultSet rs = ps.executeQuery();
                     
            while(rs.next()){
                hab = new Habitacion();
                
                hab.setIdHabitacion(rs.getInt("idHabitacion"));
                hab.setNroHabitacion(rs.getInt("nroHabitacion"));
               
                hab.setTipoHabitacion(th);
               
                hab.setPiso(rs.getInt("piso"));
                hab.setEstado(true);
                
                listahab.add(hab);
                 
            }
            ps0.close();
            ps.close();
        } 
        catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al ejecturar la consulta ..."+ex.getMessage());
            //Logger.getLogger(HuespedData.class.getName()).log(Level.SEVERE, null, ex);
        }
        return listahab;
    }
    
    
    
}
