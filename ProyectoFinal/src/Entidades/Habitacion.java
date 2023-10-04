/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

/**
 *
 * @author Maquina3
 */
public class Habitacion {
    
    private int idHabitacion;
    private int nroHabitacion;
    private TipoHabitacion tipoHabitacion;
    private int piso;
    private boolean estado;

    
    
    /////////////////////////////////  Constructores ///////////////////////////////////////////////////////////////
    
    
    public Habitacion() {
    }

    public Habitacion(int idHabitacion, int nroHabitacion, TipoHabitacion tipoHabitacion, int piso, boolean estado) {
        this.idHabitacion = idHabitacion;
        this.nroHabitacion = nroHabitacion;
        this.tipoHabitacion = tipoHabitacion;
        this.piso = piso;
        this.estado = estado;
    }

    public Habitacion(int nroHabitacion, TipoHabitacion tipoHabitacion, int piso, boolean estado) {
        this.nroHabitacion = nroHabitacion;
        this.tipoHabitacion = tipoHabitacion;
        this.piso = piso;
        this.estado = estado;
    }
    
    //////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    public int getIdHabitacion() {
        return idHabitacion;
    }

    public void setIdHabitacion(int idHabitacion) {
        this.idHabitacion = idHabitacion;
    }

    public int getNroHabitacion() {
        return nroHabitacion;
    }

    public void setNroHabitacion(int nroHabitacion) {
        this.nroHabitacion = nroHabitacion;
    }

    public TipoHabitacion getTipoHabitacion() {
        return tipoHabitacion;
    }

    public void setTipoHabitacion(TipoHabitacion tipoHabitacion) {
        this.tipoHabitacion = tipoHabitacion;
    }

    public int getPiso() {
        return piso;
    }

    public void setPiso(int piso) {
        this.piso = piso;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "Habitacion{" + "idHabitacion=" + idHabitacion + ", nroHabitacion=" + nroHabitacion + ", tipoHabitacion=" + tipoHabitacion + ", piso=" + piso + ", estado=" + estado + '}';
    }
    
    
    
    
    
    
    
    
    
}
