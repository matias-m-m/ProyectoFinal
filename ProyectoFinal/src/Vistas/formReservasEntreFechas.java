/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vistas;

import AccesoADatos.ReservaData;
import AccesoADatos.TipoHabitacionData;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.time.ZoneId;
import static java.time.temporal.TemporalQueries.localDate;
import java.util.Calendar;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Maquina3
 */
public class formReservasEntreFechas extends javax.swing.JInternalFrame {

    
    private ReservaData reservadata = new ReservaData();
    private TipoHabitacionData tipohabdata = new TipoHabitacionData();
    
    private DefaultTableModel modeloListaRes = new DefaultTableModel() {
        //Hacer que la tabla no sea editable haciendo doble click
        @Override
        public boolean isCellEditable(int row, int column) {
            return false; // Hacer que todas las celdas no sean editables
        }
    };
    
    
    
    
    public formReservasEntreFechas() {
        initComponents();
        cargarCabecera();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTResEntreFech = new javax.swing.JTable();
        jDateChooserFechaIn = new com.toedter.calendar.JDateChooser();
        jDateChooserFechaFin = new com.toedter.calendar.JDateChooser();
        jLabel3 = new javax.swing.JLabel();
        jBConsultaResEntreFech = new javax.swing.JButton();

        setClosable(true);
        setTitle("Reservas entre fechas");

        jLabel1.setText("Seleccione Fecha de Inicio:");

        jLabel2.setText("Seleccione Fecha de Fin");

        jTResEntreFech.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jTResEntreFech);

        jDateChooserFechaIn.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                jDateChooserFechaInPropertyChange(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Reservas entre las fechas ingresadas:");

        jBConsultaResEntreFech.setText("Consultar");
        jBConsultaResEntreFech.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBConsultaResEntreFechActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel1)
                                .addComponent(jLabel2))
                            .addGap(18, 18, 18)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jDateChooserFechaFin, javax.swing.GroupLayout.DEFAULT_SIZE, 149, Short.MAX_VALUE)
                                .addComponent(jDateChooserFechaIn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGap(74, 74, 74)
                            .addComponent(jBConsultaResEntreFech, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 681, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(48, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1)
                            .addComponent(jDateChooserFechaIn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jDateChooserFechaFin, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jBConsultaResEntreFech, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 367, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jDateChooserFechaInPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_jDateChooserFechaInPropertyChange
        // TODO add your handling code here:
       // Calendar calendar = Calendar.getInstance();
       // java.util.Date fechaActual = calendar.getTime();
        
    }//GEN-LAST:event_jDateChooserFechaInPropertyChange

    private void jBConsultaResEntreFechActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBConsultaResEntreFechActionPerformed
        // TODO add your handling code here:
        
        LocalDate FechInicio, FechFin;
        
        if (jDateChooserFechaIn.getDate().toString().isEmpty() || jDateChooserFechaFin.getDate().toString().isEmpty() ) {
            JOptionPane.showMessageDialog(null,"Debe seleccionar las dos fechas para realizar la consulta");
        }
        else {
            FechInicio = jDateChooserFechaIn.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
            FechFin = jDateChooserFechaFin.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
            
            int result = FechInicio.compareTo(FechFin);
            if ( result > 0 ) {
            
                JOptionPane.showMessageDialog(null,"La fecha de Inicio es mayor a la fecha de Fin de la consulta");
            }
            else {
                borrarTabla();
                rellenarTablaReservasEntreFechas( FechInicio, FechFin );
            }
        }
        
       
    }//GEN-LAST:event_jBConsultaResEntreFechActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBConsultaResEntreFech;
    private com.toedter.calendar.JDateChooser jDateChooserFechaFin;
    private com.toedter.calendar.JDateChooser jDateChooserFechaIn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTResEntreFech;
    // End of variables declaration//GEN-END:variables


    public void cargarCabecera() {
       
        modeloListaRes.addColumn("id Reserva");
        modeloListaRes.addColumn("Nro Habit");
        modeloListaRes.addColumn("Fecha Ingreso");
        modeloListaRes.addColumn("Fecha Salida");
        modeloListaRes.addColumn("monto Total");
        modeloListaRes.addColumn("Apellido Huesp");
        modeloListaRes.addColumn("Nombre Huesp");
        
                
        jTResEntreFech.setModel(modeloListaRes);
    }


    public void borrarTabla() {
        
        int filas = modeloListaRes.getRowCount() - 1;
        
        for (; filas >= 0; filas--) {
            modeloListaRes.removeRow(filas);
        }
        
    }


    public void rellenarTablaReservasEntreFechas( LocalDate fechIn, LocalDate fechFi ) {
        
             
       
        
        

        String sql = "SELECT R.idReserva, Q.nroHabitacion, R.FechaIngreso, R.FechaSalida, R.montoTotal, H.ApellidoHuesp, H.NombreHuesp "
                + "from reserva as R join habitacion as Q on (R.idHabitacion = Q.idHabitacion) join huesped as H on (R.idHuesped = H.idHuesp) "
                + "where R.FechaIngreso >= ? and R.FechaSalida <= ? and R.estado = 1";

                
        java.sql.Date inicio = java.sql.Date.valueOf(String.valueOf(fechIn));
        java.sql.Date fin = java.sql.Date.valueOf(String.valueOf(fechFi));
        PreparedStatement ps;
        
        try {
            ps = reservadata.getCon().prepareStatement(sql);
            ps.setDate(1, inicio);
            ps.setDate(2, fin );
            
            
            ResultSet rs = ps.executeQuery();
            
            while (rs.next()) {
                 
                modeloListaRes.addRow(new Object[] { rs.getInt("idReserva"), rs.getInt("NroHabitacion"),rs.getDate("FechaIngreso"), rs.getDate("FechaSalida"), rs.getDouble("montoTotal"),rs.getString("ApellidoHuesp"), rs.getString("NombreHuesp") } );
                
            }
            ps.close();
        }
        catch (SQLException ex){
            JOptionPane.showMessageDialog(null,"Error al cargar la tabla" + ex.getMessage());
        }
    }    
    
    
    
}
