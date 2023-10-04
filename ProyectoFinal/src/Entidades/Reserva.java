/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

import java.time.LocalDate;

/**
 *
 * @author Maquina3
 */
public class Reserva {
    
    private int idReserva;
    private int idHabitacion;
    private int idHuesped;
    private LocalDate fechaIngreso;
    private LocalDate fechaSalida;
    private double montoTotal;
    private boolean estado;
    
    
    ///////////////////////// Constructores //////////////////////////////////
      

    public Reserva() {
    }
    
    
    public Reserva(int idReserva, int idHabitacion, int idHuesped, LocalDate fechaIngreso, LocalDate fechaSalida, double montoTotal, boolean estado) {
        this.idReserva = idReserva;
        this.idHabitacion = idHabitacion;
        this.idHuesped = idHuesped;
        this.fechaIngreso = fechaIngreso;
        this.fechaSalida = fechaSalida;
        this.montoTotal = montoTotal;
        this.estado = estado;
    }

    public Reserva(int idHabitacion, int idHuesped, LocalDate fechaIngreso, LocalDate fechaSalida, double montoTotal, boolean estado) {
        this.idHabitacion = idHabitacion;
        this.idHuesped = idHuesped;
        this.fechaIngreso = fechaIngreso;
        this.fechaSalida = fechaSalida;
        this.montoTotal = montoTotal;
        this.estado = estado;
    }
    
    
     //////////////////////////////////////////////////////////////////////////

    public int getIdReserva() {
        return idReserva;
    }

    public void setIdReserva(int idReserva) {
        this.idReserva = idReserva;
    }

    public int getIdHabitacion() {
        return idHabitacion;
    }

    public void setIdHabitacion(int idHabitacion) {
        this.idHabitacion = idHabitacion;
    }

    public int getIdHuesped() {
        return idHuesped;
    }

    public void setIdHuesped(int idHuesped) {
        this.idHuesped = idHuesped;
    }

    public LocalDate getFechaIngreso() {
        return fechaIngreso;
    }

    public void setFechaIngreso(LocalDate fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

    public LocalDate getFechaSalida() {
        return fechaSalida;
    }

    public void setFechaSalida(LocalDate fechaSalida) {
        this.fechaSalida = fechaSalida;
    }

    public double getMontoTotal() {
        return montoTotal;
    }

    public void setMontoTotal(double montoTotal) {
        this.montoTotal = montoTotal;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "Reserva{" + "idReserva=" + idReserva + ", idHabitacion=" + idHabitacion + ", idHuesped=" + idHuesped + ", fechaIngreso=" + fechaIngreso + ", fechaSalida=" + fechaSalida + ", montoTotal=" + montoTotal + ", estado=" + estado + '}';
    }
    
    
    
    
    
    
    
    
}
