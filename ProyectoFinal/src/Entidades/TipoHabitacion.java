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
    private char nombreTipo;
    private int maxHuespedes;
    private double importePorNoche;

    
    /////////////////////////////  Constructores ///////////////////////////////////////////
    
    public TipoHabitacion() {
    }

    public TipoHabitacion(char nombreTipo, int maxHuespedes, double importePorNoche) {
        this.nombreTipo = nombreTipo;
        this.maxHuespedes = maxHuespedes;
        this.importePorNoche = importePorNoche;
    }

    public TipoHabitacion(int idTipoHabit, char nombreTipo, int maxHuespedes, double importePorNoche) {
        this.idTipoHabit = idTipoHabit;
        this.nombreTipo = nombreTipo;
        this.maxHuespedes = maxHuespedes;
        this.importePorNoche = importePorNoche;
    }
    //////////////////////////////////////////////////////////////////////////////////////////
    
    public int getIdTipoHabit() {
        return idTipoHabit;
    }

    public void setIdTipoHabit(int idTipoHabit) {
        this.idTipoHabit = idTipoHabit;
    }

    public char getNombreTipo() {
        return nombreTipo;
    }

    public void setNombreTipo(char nombreTipo) {
        this.nombreTipo = nombreTipo;
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

    @Override
    public String toString() {
        return "TipoHabitacion{" + "nombreTipo=" + nombreTipo + ", maxHuespedes=" + maxHuespedes + ", importePorNoche=" + importePorNoche + '}';
    }
    
    
    
    
}
