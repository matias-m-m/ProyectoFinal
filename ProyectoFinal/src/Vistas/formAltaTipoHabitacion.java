/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vistas;

import AccesoADatos.*;
import Entidades.TipoHabitacion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Maquina3
 */
public class formAltaTipoHabitacion extends javax.swing.JInternalFrame {

    private TipoHabitacionData tipohabdata = new TipoHabitacionData();
    private DefaultTableModel modeloListaTipoHab = new DefaultTableModel() {
        //Hacer que la tabla no sea editable haciendo doble click
        @Override
        public boolean isCellEditable(int row, int column) {
            return false; // Hacer que todas las celdas no sean editables
        }
    };

    public formAltaTipoHabitacion() {
        initComponents();
        crearCabecera();
        rellenarTabla();

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
        jLabel3 = new javax.swing.JLabel();
        txtNombreTipoHabitacion = new javax.swing.JTextField();
        txtMaxHuespedes = new javax.swing.JTextField();
        txtImporte = new javax.swing.JTextField();
        btnGuardar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtLetraTipo = new javax.swing.JTextField();

        setBackground(new java.awt.Color(26, 26, 26));
        setClosable(true);
        setForeground(new java.awt.Color(26, 26, 26));
        setTitle("Alta de Tipo de Habitacion");

        jPanel1.setBackground(new java.awt.Color(26, 26, 26));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Nombre del Tipo de Habitación: ");

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Cantidad Máxima de Huéspedes: ");

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Importe por noche:");

        txtNombreTipoHabitacion.setFocusTraversalPolicyProvider(true);
        txtNombreTipoHabitacion.setNextFocusableComponent(txtLetraTipo);
        txtNombreTipoHabitacion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNombreTipoHabitacionKeyTyped(evt);
            }
        });

        txtMaxHuespedes.setFocusTraversalPolicyProvider(true);
        txtMaxHuespedes.setNextFocusableComponent(txtImporte);
        txtMaxHuespedes.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtMaxHuespedesKeyTyped(evt);
            }
        });

        txtImporte.setFocusTraversalPolicyProvider(true);
        txtImporte.setNextFocusableComponent(btnGuardar);
        txtImporte.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtImporteKeyTyped(evt);
            }
        });

        btnGuardar.setText("Guardar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

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
        jScrollPane1.setViewportView(jTable1);

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Tipos de Habitaciones existentes:");

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Letra Identificatoria del Tipo:");

        txtLetraTipo.setFocusTraversalPolicyProvider(true);
        txtLetraTipo.setNextFocusableComponent(txtMaxHuespedes);
        txtLetraTipo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtLetraTipoKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(416, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 489, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(444, 444, 444)
                            .addComponent(jLabel4))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGap(6, 6, 6)
                                    .addComponent(jLabel1))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGap(19, 19, 19)
                                    .addComponent(jLabel5))
                                .addComponent(jLabel2)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGap(67, 67, 67)
                                    .addComponent(jLabel3)))
                            .addGap(10, 10, 10)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtNombreTipoHabitacion, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtLetraTipo, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtMaxHuespedes, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtImporte, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(150, 150, 150)
                            .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addContainerGap(282, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(61, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jLabel4)
                    .addGap(2, 2, 2)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(3, 3, 3)
                            .addComponent(jLabel1))
                        .addComponent(txtNombreTipoHabitacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(11, 11, 11)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(3, 3, 3)
                            .addComponent(jLabel5))
                        .addComponent(txtLetraTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(11, 11, 11)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(3, 3, 3)
                            .addComponent(jLabel2))
                        .addComponent(txtMaxHuespedes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(11, 11, 11)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(3, 3, 3)
                            .addComponent(jLabel3))
                        .addComponent(txtImporte, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(30, 30, 30)
                    .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(62, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtLetraTipoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtLetraTipoKeyTyped
        char c = evt.getKeyChar();
        if (Character.isDigit(c)) {
            evt.consume(); // Consumir el evento, evitando que se ingrese el número.
    }//GEN-LAST:event_txtLetraTipoKeyTyped
    }
    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        // TODO add your handling code here:
        if (txtNombreTipoHabitacion.getText().isEmpty() || txtLetraTipo.getText().isEmpty()
            || txtMaxHuespedes.getText().isEmpty() || txtImporte.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Faltan agregar datos...");
        } else {

            //creo y cargo la entidad tipohabitacion para pasar como parametro al tipohabdata
            TipoHabitacion nuevaHab = new TipoHabitacion();
            nuevaHab.setNombreTipo(txtNombreTipoHabitacion.getText());
            nuevaHab.setLetraTipo(txtLetraTipo.getText().charAt(0));
            nuevaHab.setMaxHuespedes((Integer.parseInt(txtMaxHuespedes.getText())));
            nuevaHab.setImportePorNoche(Integer.parseInt(txtImporte.getText()));
            nuevaHab.setEstado(true);

            //Inserto el nuevo tipo de Habitacion
            tipohabdata.insertarTipoHabitacion(nuevaHab);

            //Borro los campos para una nueva inserción
            txtNombreTipoHabitacion.setText("");
            txtLetraTipo.setText("");
            txtMaxHuespedes.setText("");
            txtImporte.setText("");
            txtNombreTipoHabitacion.requestFocus();

            //Recargo la tabla con los tipo de habitacion existentes
            borrarTabla();
            rellenarTabla();
        }
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void txtNombreTipoHabitacionKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombreTipoHabitacionKeyTyped
        char c = evt.getKeyChar();
        if (Character.isDigit(c)) {
            evt.consume(); // Consumir el evento, evitando que se ingrese el número.
    }//GEN-LAST:event_txtNombreTipoHabitacionKeyTyped
    }
    private void txtMaxHuespedesKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtMaxHuespedesKeyTyped
        char c = evt.getKeyChar();
        if (!Character.isDigit(c)) {
            evt.consume(); // Consumir el evento si no es un número.
    }//GEN-LAST:event_txtMaxHuespedesKeyTyped
    }
    private void txtImporteKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtImporteKeyTyped
        char c = evt.getKeyChar();
        if (!Character.isDigit(c)) {
            evt.consume(); // Consumir el evento si no es un número.
    }//GEN-LAST:event_txtImporteKeyTyped
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGuardar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField txtImporte;
    private javax.swing.JTextField txtLetraTipo;
    private javax.swing.JTextField txtMaxHuespedes;
    private javax.swing.JTextField txtNombreTipoHabitacion;
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
                String est = rs.getBoolean("estado") + "";
                if (est.equals("true")) {
                    modeloListaTipoHab.addRow(new Object[]{rs.getInt("idTipoHabit"), rs.getString("nombreTipo"), rs.getString("letraTipo"), rs.getInt("maxHuespedes"), rs.getDouble("importepornoche"), "Habilitada"});
                } else {
                    modeloListaTipoHab.addRow(new Object[]{rs.getInt("idTipoHabit"), rs.getString("nombreTipo"), rs.getString("letraTipo"), rs.getInt("maxHuespedes"), rs.getDouble("importepornoche"), "Inhabilitada"});
                }
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al cargar la tabla" + ex.getMessage());
        }

    }

}
