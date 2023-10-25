/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vistas;

import AccesoADatos.HabitacData;
import AccesoADatos.ReservaData;
import AccesoADatos.TipoHabitacionData;
import AccesoADatos.HuespedData;
import Entidades.Habitacion;
import Entidades.Huesped;
import Entidades.Reserva;
import Entidades.TipoHabitacion;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Maquina3
 */
public class formReservasPorHuesped extends javax.swing.JInternalFrame {

    
    private HuespedData hData = new HuespedData();  
    private ArrayList<Huesped> listaHuespedes;
    
    
    //private TipoHabitacionData tipohabdata = new TipoHabitacionData();
    //private HabitacData habdata = new HabitacData();
    
    private ReservaData resdata = new ReservaData();
    private ArrayList<Reserva> listaResPorHuesped;
    
    
    //private ArrayList<TipoHabitacion> listarTipos;
    //private ArrayList<Habitacion> habitacionesPorTipo;
   
    
    
    
    
    
    private DefaultTableModel modeloListaHuespedes = new DefaultTableModel() {
        //Hacer que la tabla no sea editable haciendo doble click
        @Override
        public boolean isCellEditable(int row, int column) {
            return false; // Hacer que todas las celdas no sean editables
        }
    };
    
     private DefaultTableModel modeloListaResPorHuesped = new DefaultTableModel() {
        //Hacer que la tabla no sea editable haciendo doble click
        @Override
        public boolean isCellEditable(int row, int column) {
            return false; // Hacer que todas las celdas no sean editables
        }
    };
    
    
    
    public formReservasPorHuesped() {
        initComponents();
        crearCabecera();
        borrarTablaHuespedes();
        borrarTablaReservas();
        rellenarTablaHuespedes();
        txtDNI.setText("");
        
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTHuespedes = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTResPorHuesped = new javax.swing.JTable();
        txtDNI = new javax.swing.JTextField();
        jBBuscarHuesped = new javax.swing.JButton();

        setClosable(true);
        setTitle("Reservas por Huesped");

        jPanel1.setBackground(new java.awt.Color(26, 26, 26));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Seleccione un Huésped o Ingrese un DNI:");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Reservas:");

        jTHuespedes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jTHuespedes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTHuespedesMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTHuespedes);

        jTResPorHuesped.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(jTResPorHuesped);

        txtDNI.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtDNIKeyTyped(evt);
            }
        });

        jBBuscarHuesped.setText("Buscar");
        jBBuscarHuesped.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBBuscarHuespedActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jBBuscarHuesped, javax.swing.GroupLayout.DEFAULT_SIZE, 146, Short.MAX_VALUE)
                    .addComponent(txtDNI))
                .addGap(95, 95, 95)
                .addComponent(jLabel2)
                .addGap(486, 486, 486))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 519, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(28, 28, 28)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 539, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(18, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtDNI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jBBuscarHuesped)
                .addContainerGap(445, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addContainerGap(92, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 415, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addContainerGap()))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTHuespedesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTHuespedesMouseClicked
        // TODO add your handling code here:
        
        int idHuesp = (Integer) (modeloListaHuespedes.getValueAt(jTHuespedes.getSelectedRow(), 0)) ;
        //int idHab =  (jTHabitaciones.getSelectedRow(), 0);
        borrarTablaReservas();
      
        rellenarTablaResPorHuesped(idHuesp);
        
        
        
    }//GEN-LAST:event_jTHuespedesMouseClicked

    private void jBBuscarHuespedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBBuscarHuespedActionPerformed
        // TODO add your handling code here:
        if ( txtDNI.getText().isEmpty() ) {
            JOptionPane.showMessageDialog(null, "Debe ingresar un numero de DNI en el campo de texto");
        }
        else {
           
            Huesped h = hData.buscarHuespPorDni( txtDNI.getText() );
            
            if (h != null) {
                borrarTablaHuespedes();
                borrarTablaReservas();
                modeloListaHuespedes.addRow(new Object[]{h.getIdHuesp(),h.getApellidoHuesp(),h.getNombreHuesp(),h.getDniHuesp(),h.getEmailHuesp(),h.getTelefonoHuesp(),h.getDomicilioHuesp()    });
            }
            
             
            txtDNI.setText("");
            
            
        }
        
    }//GEN-LAST:event_jBBuscarHuespedActionPerformed

    private void txtDNIKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDNIKeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();
    if (!Character.isDigit(c)) {
        evt.consume(); // Consumir el evento si no es un número.

    } 
        
        
    }//GEN-LAST:event_txtDNIKeyTyped


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBBuscarHuesped;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTHuespedes;
    private javax.swing.JTable jTResPorHuesped;
    private javax.swing.JTextField txtDNI;
    // End of variables declaration//GEN-END:variables




  public void crearCabecera() {
        
        modeloListaHuespedes.addColumn("idHuesp");
        modeloListaHuespedes.addColumn("Apellido");
        modeloListaHuespedes.addColumn("Nombre");
        modeloListaHuespedes.addColumn("DNI");
        modeloListaHuespedes.addColumn("email");
        modeloListaHuespedes.addColumn("Telefono");
        modeloListaHuespedes.addColumn("Domicilio");
        
                
        jTHuespedes.setModel(modeloListaHuespedes);
        
        modeloListaResPorHuesped.addColumn("idRes");
        modeloListaResPorHuesped.addColumn("idHabit");
        modeloListaResPorHuesped.addColumn("NroHabit");
        modeloListaResPorHuesped.addColumn("Fecha Ingreso");
        modeloListaResPorHuesped.addColumn("Fecha Salida");
        modeloListaResPorHuesped.addColumn("Monto Total");
       
        jTResPorHuesped.setModel(modeloListaResPorHuesped);
        
    }
    
    
    public void borrarTablaHuespedes() {
        int filas = modeloListaHuespedes.getRowCount() - 1;
        
        for (; filas >= 0; filas--) {
            modeloListaHuespedes.removeRow(filas);
        }
    }
    
    public void borrarTablaReservas() {
        int filas = modeloListaResPorHuesped.getRowCount() - 1;
        
        for (; filas >= 0; filas--) {
            modeloListaResPorHuesped.removeRow(filas);
        }
    }
        

    public void rellenarTablaHuespedes() {
        
       // select idHuesp,apellidoHuesp,nombreHuesp,dniHuesp,domicilioHuesp,emailHuesp,telefonoHuesp from huesped where estadoHuesp = 1
    
       
        listaHuespedes = (ArrayList) hData.listarHuesped();
    
        for (Huesped h : listaHuespedes) {
            
            modeloListaHuespedes.addRow(new Object[]{h.getIdHuesp(),h.getApellidoHuesp(),h.getNombreHuesp(),h.getDniHuesp(),h.getEmailHuesp(),h.getTelefonoHuesp(),h.getDomicilioHuesp()    });
        
        }  
       
    }

    
    
    public void rellenarTablaResPorHuesped( int idHuesp ) {
        
        
       // listaResPorHuesped = (ArrayList)  resdata.listarReservasPorHuesped( int idHuesp );
        
       String sql = "select r.idReserva,r.idHabitacion, h.nroHabitacion, r.FechaIngreso, r.FechaSalida, r.montoTotal  \n" +
                    "from reserva as r join habitacion as h on (r.idHabitacion = h.idHabitacion) \n" +
                    "where idHuesped = ? order by FechaIngreso;";
       
        PreparedStatement ps;
        try {
            ps = resdata.getCon().prepareStatement(sql);
            ps.setInt(1, idHuesp);
            ResultSet rs = ps.executeQuery();
            
            while (rs.next()) {
                 modeloListaResPorHuesped.addRow(new Object[] { rs.getInt("idReserva"), rs.getInt("idHabitacion"), rs.getInt("nroHabitacion"), rs.getDate("FechaIngreso"),rs.getDate("FechaSalida"), rs.getDouble("montoTotal") } );
                
            }
            ps.close();
        }
        catch (SQLException ex){
            JOptionPane.showMessageDialog(null,"Error al cargar la tabla" + ex.getMessage());
        }
    }    
        
    

}
