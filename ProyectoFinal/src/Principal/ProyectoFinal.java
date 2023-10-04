/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Principal;

import Entidades.*;

/**
 *
 * @author Maquina3
 */
public class ProyectoFinal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        TipoHabitacion t1 = new TipoHabitacion( 'S',1,3000);
        TipoHabitacion t2 = new TipoHabitacion( 'D',2,7000);
        TipoHabitacion t3 = new TipoHabitacion( 'T',3,12000);
        TipoHabitacion t4 = new TipoHabitacion( 'L',2,12000);
        
        
        
        Habitacion h1 = new Habitacion(8,t1,0,true);
        Habitacion h2 = new Habitacion(14,t1,1,false);
        
        Habitacion h3 = new Habitacion(34,t2,0,true);
        Habitacion h4 = new Habitacion(25,t2,2,true);
        
        Habitacion h5 = new Habitacion(36,t3,3,true);
        Habitacion h6 = new Habitacion(40,t3,3,false);
        
        Habitacion h7 = new Habitacion(45,t4,1,true);
        Habitacion h8 = new Habitacion(48,t4,2,false);
        
        
        System.out.println("Habit h2 cuesta: " + h2.getTipoHabitacion().getImportePorNoche() + " por noche y es para: " + h2.getTipoHabitacion().getMaxHuespedes() + " personas");
        System.out.println("Piso :"+h2.getPiso());   
        
     
        
       
    }
    
}
