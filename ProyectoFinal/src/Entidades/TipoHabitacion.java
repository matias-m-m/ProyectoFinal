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
public class TipoHabitacion {
    
    private int idTipoHabit;
    private String nombreTipo;
    private char letraTipo;
    private int maxHuespedes;
    private double importePorNoche;
    private boolean estado;

    
    /////////////////////////////  Constructores ///////////////////////////////////////////
    
    public TipoHabitacion() {
    }

    public TipoHabitacion(String nombreTipo, char letraTipo, int maxHuespedes, double importePorNoche, boolean estado) {
        this.nombreTipo = nombreTipo;
        this.letraTipo = letraTipo;
        this.maxHuespedes = maxHuespedes;
        this.importePorNoche = importePorNoche;
        this.estado = estado;
    }

    public TipoHabitacion(int idTipoHabit, String nombreTipo, char letraTipo, int maxHuespedes, double importePorNoche, boolean estado) {
        this.idTipoHabit = idTipoHabit;
        this.nombreTipo = nombreTipo;
        this.letraTipo = letraTipo;
        this.maxHuespedes = maxHuespedes;
        this.importePorNoche = importePorNoche;
        this.estado = estado;
    }
    //////////////////////////////////////////////////////////////////////////////////////////
    
    public int getIdTipoHabit() {
        return idTipoHabit;
    }

    public void setIdTipoHabit(int idTipoHabit) {
        this.idTipoHabit = idTipoHabit;
    }

    public String getNombreTipo() {
        return nombreTipo;
    }

    public void setNombreTipo(String nombreTipo) {
        this.nombreTipo = nombreTipo;
    }

    public char getLetraTipo() {
        return letraTipo;
    }

    public void setLetraTipo(char letraTipo) {
        this.letraTipo = letraTipo;
    }

    
    
    public int getMaxHuespedes() {
        return maxHuespedes;
    }

    public void setMaxHuespedes(int maxHuespedes) {
        this.maxHuespedes = maxHuespedes;
    }

    public double getImportePorNoche() {
        return importePorNoche;
    }

    public void setImportePorNoche(double importePorNoche) {
        this.importePorNoche = importePorNoche;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        //return "TipoHabitacion{" + "idTipoHabit=" + idTipoHabit + ", nombreTipo=" + nombreTipo + ", letraTipo=" + letraTipo + ", maxHuespedes=" + maxHuespedes + ", importePorNoche=" + importePorNoche + ", estado=" + estado + '}';
        return idTipoHabit +" - " + nombreTipo;
    }

    
    
  

   
    
    
    
}
