/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vistas;

import AccesoADatos.HabitacData;
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
    private HabitacData habdata = new HabitacData();
    
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
        jPanel1 = new javax.swing.JPanel();
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
        jLabel7 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();

        setClosable(true);
        setTitle("Baja y Modifiacion de Tipo de Habitacion");

        jPanel1.setBackground(new java.awt.Color(26, 26, 26));

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

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Seleccione un Tipo de Habitacion:");

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("ID");

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Nombre");

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Letra");

        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Capacidad");

        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("$/noche");

        txtnombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtnombreKeyTyped(evt);
            }
        });

        txtletra.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtletraKeyTyped(evt);
            }
        });

        txtmax.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtmaxKeyTyped(evt);
            }
        });

        txtimporte.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtimporteKeyTyped(evt);
            }
        });

        jRBaja.setForeground(new java.awt.Color(255, 255, 255));
        jRBaja.setText("Dar de Baja");
        jRBaja.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRBajaActionPerformed(evt);
            }
        });

        jRModificacion.setForeground(new java.awt.Color(255, 255, 255));
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

        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Estado");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Habilitada", "Inhabilitada" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(57, 57, 57)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtid, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addGap(23, 23, 23)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel6))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(txtletra, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jLabel5)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtmax, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(txtimporte, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(22, 22, 22)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel3)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtnombre, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel7)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(157, 157, 157)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jRBaja)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jRModificacion))
                            .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(136, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 692, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(25, 25, 25)
                            .addComponent(jLabel1)))
                    .addContainerGap(19, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(273, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtnombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jRBaja)
                    .addComponent(jRModificacion))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtletra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(txtmax, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtimporte, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6))
                        .addGap(11, 11, 11)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(39, 39, 39))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jLabel1)
                    .addGap(18, 18, 18)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(240, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
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
        if ((modeloListaTipoHab.getValueAt(rowIndex,5)+"").equals("true")) {
            jComboBox1.setSelectedItem("Habilitada");    
        }
        if ((modeloListaTipoHab.getValueAt(rowIndex,5)+"").equals("false")) {
            jComboBox1.setSelectedItem("Inhabilitada");    
        }
       
            
        
        
        //txtEstado.setText(modeloListaTipoHab.getValueAt(rowIndex,5)+"");
 
    }//GEN-LAST:event_jTable1MouseClicked

    private void jRBajaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRBajaActionPerformed
        // TODO add your handling code here:
        jRModificacion.setSelected(false);
        
    }//GEN-LAST:event_jRBajaActionPerformed

    private void jRModificacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRModificacionActionPerformed
        // TODO add your handling code here:
        jRBaja.setSelected(false);
        editableTextfield();
    }//GEN-LAST:event_jRModificacionActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // dar de baja
        if ( jRBaja.isSelected() ){
            if (txtid.getText().isEmpty()){
                JOptionPane.showMessageDialog(null,"Debe seleccionar una fila de la tabla para eliminar.");
            }
            else {
                tipohabdata.borrarTipoHabitacion(Integer.parseInt(txtid.getText()));
                habdata.bajarhabitacionesdeTipo(Integer.parseInt(txtid.getText()));//borrar las habitaciones de ese tipo
                borrarTabla();
                rellenarTabla();
            }
                
        }
        
        // actualizar
        if ( jRModificacion.isSelected() ){
            if (txtid.getText().isEmpty()){
                JOptionPane.showMessageDialog(null,"Debe seleccionar una fila de la tabla para actualizar.");
            }
            else {
                if (txtnombre.getText().isEmpty() || txtletra.getText().isEmpty() || 
                    txtmax.getText().isEmpty() || txtimporte.getText().isEmpty() ) {
                        JOptionPane.showMessageDialog(null, "Faltan agregar datos...");
                }
                else {
                
                    TipoHabitacion nueva = new TipoHabitacion();
                    
                    nueva.setIdTipoHabit(Integer.parseInt(txtid.getText()));
                    nueva.setNombreTipo(txtnombre.getText());
                    nueva.setLetraTipo(txtletra.getText().charAt(0));
                    nueva.setMaxHuespedes(Integer.parseInt(txtmax.getText()));
                    nueva.setImportePorNoche(Double.parseDouble(txtimporte.getText()));
                   
                    if (jComboBox1.getSelectedItem().equals("Habilitada")) {
                        nueva.setEstado(Boolean.parseBoolean("true"));
                        
                        habdata.habilitarHabitacionesDeTipo(Integer.parseInt(txtid.getText()));
                    }
                    else {
                        nueva.setEstado(Boolean.parseBoolean("false"));    ;
                    }
                    
                    
                    tipohabdata.editarTipoHabitacion(nueva);
                    
                    borrarTabla();
                    rellenarTabla();
                }
                
            }
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
       
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void txtnombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtnombreKeyTyped
          char c = evt.getKeyChar();
        if (Character.isDigit(c)) {
            evt.consume(); // Consumir el evento, evitando que se ingrese el número.
        }
    }//GEN-LAST:event_txtnombreKeyTyped

    private void txtletraKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtletraKeyTyped
          char c = evt.getKeyChar();
        if (Character.isDigit(c)) {
            evt.consume(); // Consumir el evento, evitando que se ingrese el número.
        }
    }//GEN-LAST:event_txtletraKeyTyped

    private void txtmaxKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtmaxKeyTyped
                 char c = evt.getKeyChar();
    if (!Character.isDigit(c)) {
        evt.consume(); // Consumir el evento si no es un número.

    }
    }//GEN-LAST:event_txtmaxKeyTyped

    private void txtimporteKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtimporteKeyTyped
                   char c = evt.getKeyChar();
    if (!Character.isDigit(c)) {
        evt.consume(); // Consumir el evento si no es un número.

    }
    }//GEN-LAST:event_txtimporteKeyTyped


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
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
        modeloListaTipoHab.addColumn("Estado");
        
        jTable1.setModel(modeloListaTipoHab);
    }
    
    
    public void borrarTabla() {
    
        int filas = modeloListaTipoHab.getRowCount() - 1;
        
        for (; filas >= 0; filas--) {
            modeloListaTipoHab.removeRow(filas);
        }
        
    }
    
    
    public void rellenarTabla() {
        
        
        
        String sql = "select idTipoHabit, nombreTipo, letraTipo, maxHuespedes, importepornoche, estado from tipohabitacion order by idTipoHabit";
        
        PreparedStatement ps;
        try {
            ps = tipohabdata.getCon().prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            
            while (rs.next()) {
                String est = rs.getBoolean("estado")+"";
                if (est.equals("true")) {
                    modeloListaTipoHab.addRow(new Object[] { rs.getInt("idTipoHabit"), rs.getString("nombreTipo"),rs.getString("letraTipo"), rs.getInt("maxHuespedes"),rs.getDouble("importepornoche"), "Habilitada" } );
                }
                else {
                   modeloListaTipoHab.addRow(new Object[] { rs.getInt("idTipoHabit"), rs.getString("nombreTipo"),rs.getString("letraTipo"), rs.getInt("maxHuespedes"),rs.getDouble("importepornoche"), "Inhabilitada"} );
                }
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
        //txtEstado.setText("");
       
    }

    
    public void noeditableTextfield() {
        
        txtid.setEditable(false);
        txtnombre.setEditable(false);
        txtletra.setEditable(false);
        txtmax.setEditable(false);
        txtimporte.setEditable(false);
        //txtEstado.setEditable(false);
       
    }



    public void editableTextfield() {
        
        //txtid.setEditable(true);
        txtnombre.setEditable(true);
        txtletra.setEditable(true);
        txtmax.setEditable(true);
        txtimporte.setEditable(true);
        //txtEstado.setEditable(true);
       
    }
    
    

}
