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
public class Huesped {
    
    private int idHuesp;
    private String apellidoHuesp;
    private String nombreHuesp;
    private String dniHuesp;
    private String domicilioHuesp;
    private String emailHuesp;
    private String telefonoHuesp;
    private boolean estadoHuesp;
    
    
    //////////////////////// Constructores //////////////////////////////////////

    public Huesped() {
    }

    public Huesped(int idHuesp, String apellidoHuesp, String nombreHuesp, String dniHuesp, String domicilioHuesp, String emailHuesp, String telefonoHuesp, boolean estadoHuesp) {
        this.idHuesp = idHuesp;
        this.apellidoHuesp = apellidoHuesp;
        this.nombreHuesp = nombreHuesp;
        this.dniHuesp = dniHuesp;
        this.domicilioHuesp = domicilioHuesp;
        this.emailHuesp = emailHuesp;
        this.telefonoHuesp = telefonoHuesp;
        this.estadoHuesp = estadoHuesp;
    }

    public Huesped(String apellidoHuesp, String nombreHuesp, String dniHuesp, String domicilioHuesp, String emailHuesp, String telefonoHuesp, boolean estadoHuesp) {
        this.apellidoHuesp = apellidoHuesp;
        this.nombreHuesp = nombreHuesp;
        this.dniHuesp = dniHuesp;
        this.domicilioHuesp = domicilioHuesp;
        this.emailHuesp = emailHuesp;
        this.telefonoHuesp = telefonoHuesp;
        this.estadoHuesp = estadoHuesp;
    }
    
    //metodos getter y setter

    public int getIdHuesp() {
        return idHuesp;
    }

    public void setIdHuesp(int idHuesp) {
        this.idHuesp = idHuesp;
    }

    public String getApellidoHuesp() {
        return apellidoHuesp;
    }

    public void setApellidoHuesp(String apellidoHuesp) {
        this.apellidoHuesp = apellidoHuesp;
    }

    public String getNombreHuesp() {
        return nombreHuesp;
    }

    public void setNombreHuesp(String nombreHuesp) {
        this.nombreHuesp = nombreHuesp;
    }

    public String getDniHuesp() {
        return dniHuesp;
    }

    public void setDniHuesp(String dniHuesp) {
        this.dniHuesp = dniHuesp;
    }

    public String getDomicilioHuesp() {
        return domicilioHuesp;
    }

    public void setDomicilioHuesp(String domicilioHuesp) {
        this.domicilioHuesp = domicilioHuesp;
    }

    public String getEmailHuesp() {
        return emailHuesp;
    }

    public void setEmailHuesp(String emailHuesp) {
        this.emailHuesp = emailHuesp;
    }

    public String getTelefonoHuesp() {
        return telefonoHuesp;
    }

    public void setTelefonoHuesp(String telefonoHuesp) {
        this.telefonoHuesp = telefonoHuesp;
    }

    public boolean isEstadoHuesp() {
        return estadoHuesp;
    }

    public void setEstadoHuesp(boolean estadoHuesp) {
        this.estadoHuesp = estadoHuesp;
    }
    

    
    
    
    
}
