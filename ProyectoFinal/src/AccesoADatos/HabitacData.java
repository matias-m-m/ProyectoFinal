/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AccesoADatos;
import Entidades.*;import Entidades.*;
import java.sql.*;
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
            JOptionPane.showMessageDialog(null, "Habitación "+ h.getTipoHabitacion().toString()+" cargada con éxito");
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
    
}
