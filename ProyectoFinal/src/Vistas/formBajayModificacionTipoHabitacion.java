/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vistas;

import AccesoADatos.TipoHabitacionData;
import Entidades.TipoHabitacion;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author juanb
 */
public class formBajayModificacionTipoHabitacion extends javax.swing.JInternalFrame {

    private TipoHabitacionData tipohabdata = new TipoHabitacionData();
    private DefaultTableModel modeloListaTipoHab = new DefaultTableModel() {
        //Hacer que la tabla no sea editable haciendo doble click
        @Override
        public boolean isCellEditable(int row, int column) {
            return false; // Hacer que todas las celdas no sean editables
        }
    };
    
    
    public formBajayModificacionTipoHabitacion() {
        initComponents();
        crearCabecera();
        rellenarTabla();
        borrarTextfield();
        noeditableTextfield();
        
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtid = new javax.swing.JTextField();
        txtnombre = new javax.swing.JTextField();
        txtletra = new javax.swing.JTextField();
        txtmax = new javax.swing.JTextField();
        txtimporte = new javax.swing.JTextField();
        jRBaja = new javax.swing.JRadioButton();
        jRModificacion = new javax.swing.JRadioButton();
        jButton1 = new javax.swing.JButton();

        setClosable(true);
        setTitle("Baja y Modifiacion de Tipo de Habitacion");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
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
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jLabel1.setText("Seleccione un Tipo de Habitacion:");

        jLabel2.setText("idTipoHabit");

        jLabel3.setText("nombreTipo:");

        jLabel4.setText("letraTipo:");

        jLabel5.setText("maxHuespedes:");

        jLabel6.setText("importepornoche:");

        jRBaja.setText("Dar de Baja");
        jRBaja.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRBajaActionPerformed(evt);
            }
        });

        jRModificacion.setText("Editar");
        jRModificacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRModificacionActionPerformed(evt);
            }
        });

        jButton1.setText("Confirmar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 582, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addGap(18, 18, 18)
                                        .addComponent(txtid, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jLabel5))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(34, 34, 34)
                                        .addComponent(jLabel3)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(txtnombre, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(37, 37, 37)
                                        .addComponent(jLabel4))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(21, 21, 21)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addComponent(txtmax, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(42, 42, 42))
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addComponent(jRBaja)
                                                .addGap(68, 68, 68)))
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jRModificacion)
                                            .addComponent(jLabel6))
                                        .addGap(18, 18, 18)
                                        .addComponent(txtimporte, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtletra, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(270, 270, 270))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(txtnombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(txtletra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtimporte, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(txtmax, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRBaja)
                    .addComponent(jRModificacion))
                .addGap(18, 18, 18)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(37, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        
         //Establece el indice de la fila seleccionada
        int rowIndex = jTable1.getSelectedRow();
        
        //Setea los inputs de texto con los valores de la fila y cada columna
        //EJ: fila X, columna 0
        txtid.setText( modeloListaTipoHab.getValueAt(rowIndex,0)+"");
        //Fila X, columna 1
        txtnombre.setText((String) modeloListaTipoHab.getValueAt(rowIndex,1));
        txtletra.setText( modeloListaTipoHab.getValueAt(rowIndex,2)+"");
        txtmax.setText(modeloListaTipoHab.getValueAt(rowIndex,3)+"");
        txtimporte.setText(modeloListaTipoHab.getValueAt(rowIndex,4)+"");
        
 
    }//GEN-LAST:event_jTable1MouseClicked

    private void jRBajaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRBajaActionPerformed
        // TODO add your handling code here:
        jRModificacion.setSelected(false);
    }//GEN-LAST:event_jRBajaActionPerformed

    private void jRModificacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRModificacionActionPerformed
        // TODO add your handling code here:
        jRBaja.setSelected(false);
    }//GEN-LAST:event_jRModificacionActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // dar de baja
        if ( jRBaja.isSelected() ){
            if (txtid.getText().isEmpty()){
                JOptionPane.showMessageDialog(null,"Debe seleccionar una fila de la tabla para eliminar.");
            }
            else {
                tipohabdata.borrarTipoHabitacion(Integer.parseInt(txtid.getText()));
            }
                
        }
        
        // actualizar
        if ( jRModificacion.isSelected() ){
            if (txtid.getText().isEmpty()){
                JOptionPane.showMessageDialog(null,"Debe seleccionar una fila de la tabla para eliminar.");
            }
            else {
                if (txtnombre.getText().isEmpty() || txtletra.getText().isEmpty() || 
                    txtmax.getText().isEmpty() || txtimporte.getText().isEmpty()) {
                        JOptionPane.showMessageDialog(null, "Faltan agregar datos...");
                }
                else {
                
                    TipoHabitacion nueva = new TipoHabitacion();
                    
                    nueva.setIdTipoHabit(Integer.parseInt(txtid.getText()));
                    nueva.setNombreTipo(txtnombre.getText());
                    nueva.setLetraTipo(txtletra.getText().charAt(0));
                    nueva.setMaxHuespedes(Integer.parseInt(txtmax.getText()));
                    nueva.setImportePorNoche(Double.parseDouble(txtimporte.getText()));
                    
                    tipohabdata.editarTipoHabitacion(nueva);
                }
                
            }
        }
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JRadioButton jRBaja;
    private javax.swing.JRadioButton jRModificacion;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField txtid;
    private javax.swing.JTextField txtimporte;
    private javax.swing.JTextField txtletra;
    private javax.swing.JTextField txtmax;
    private javax.swing.JTextField txtnombre;
    // End of variables declaration//GEN-END:variables

 public void crearCabecera() {
        
        modeloListaTipoHab.addColumn("id TipoHabitacion");
        modeloListaTipoHab.addColumn("Nombre Tipo");
        modeloListaTipoHab.addColumn("Letra Tipo");
        modeloListaTipoHab.addColumn("Max. Huéspedes");
        modeloListaTipoHab.addColumn("Importe por noche");
        
        jTable1.setModel(modeloListaTipoHab);
    }
    
    
    public void borrarTabla() {
    
        int filas = modeloListaTipoHab.getRowCount() - 1;
        
        for (; filas >= 0; filas--) {
            modeloListaTipoHab.removeRow(filas);
        }
        
    }
    
    
    public void rellenarTabla() {
        
        
        
        String sql = "select idTipoHabit, nombreTipo, letraTipo, maxHuespedes, importepornoche from tipohabitacion order by idTipoHabit";
        
        PreparedStatement ps;
        try {
            ps = tipohabdata.getCon().prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            
            while (rs.next()) {
                modeloListaTipoHab.addRow(new Object[] { rs.getInt("idTipoHabit"), rs.getString("nombreTipo"),rs.getString("letraTipo"), rs.getInt("maxHuespedes"),rs.getDouble("importepornoche") } );
            }
            ps.close();
        }
        catch (SQLException ex){
            JOptionPane.showMessageDialog(null,"Error al cargar la tabla" + ex.getMessage());
        }
        
        
    }


    public void borrarTextfield(){
    
        txtid.setText("");
        txtnombre.setText("");
        txtletra.setText("");
        txtmax.setText("");
        txtimporte.setText("");
       
    }

    
    public void noeditableTextfield() {
        
        txtid.setEditable(false);
        txtnombre.setEditable(false);
        txtletra.setEditable(false);
        txtmax.setEditable(false);
        txtimporte.setEditable(false);
       
    }



    public void editableTextfield() {
        
        //txtid.setEditable(true);
        txtnombre.setEditable(true);
        txtletra.setEditable(true);
        txtmax.setEditable(true);
        txtimporte.setEditable(true);
       
    }
    
    

}
