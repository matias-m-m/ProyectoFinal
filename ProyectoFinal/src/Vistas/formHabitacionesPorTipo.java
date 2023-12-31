/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vistas;

import AccesoADatos.HabitacData;
import AccesoADatos.TipoHabitacionData;
import Entidades.Habitacion;
import Entidades.TipoHabitacion;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Maquina3
 */
public class formHabitacionesPorTipo extends javax.swing.JInternalFrame {

    private TipoHabitacionData tipohabdata = new TipoHabitacionData();
    private ArrayList<TipoHabitacion> listarTipos;
    
    
    private HabitacData habdata = new HabitacData();
    private ArrayList<Habitacion> habitacionesPorTipo;
    
    
    
    private DefaultTableModel modeloListaHab = new DefaultTableModel() {
        //Hacer que la tabla no sea editable haciendo doble click
        @Override
        public boolean isCellEditable(int row, int column) {
            return false; // Hacer que todas las celdas no sean editables
        }
    };
    
       
    public formHabitacionesPorTipo() {
        initComponents();
        cargarComboTipos();
        crearCabecera();
        borrarTablaTipos();
        int i = 1;
        rellenarTablaHabitacionesPorTipo(i);
        txtCantHab.setText(modeloListaHab.getRowCount()+"");
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jCNombresTipo = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTHabitaciones = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        txtCantHab = new javax.swing.JTextField();

        setClosable(true);
        setTitle("Habitaciones por Tipo");

        jPanel1.setBackground(new java.awt.Color(26, 26, 26));

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Seleccione Tipo de Habitación: ");

        jCNombresTipo.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jCNombresTipoItemStateChanged(evt);
            }
        });
        jCNombresTipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCNombresTipoActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Habitaciones");

        jTHabitaciones.setModel(new javax.swing.table.DefaultTableModel(
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
        jTHabitaciones.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTHabitacionesMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTHabitaciones);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Cantidad de Habitaciones:");

        txtCantHab.setEditable(false);
        txtCantHab.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(69, 69, 69)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jCNombresTipo, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 492, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(150, 150, 150)
                        .addComponent(jLabel4)
                        .addGap(18, 18, 18)
                        .addComponent(txtCantHab, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(30, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jCNombresTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtCantHab, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(83, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jCNombresTipoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jCNombresTipoItemStateChanged

    }//GEN-LAST:event_jCNombresTipoItemStateChanged

    private void jCNombresTipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCNombresTipoActionPerformed
        int id = Integer.parseInt(jCNombresTipo.getSelectedItem().toString().substring(0, jCNombresTipo.getSelectedItem().toString().indexOf(" ")));

        borrarTablaTipos();
        rellenarTablaHabitacionesPorTipo(id);
        txtCantHab.setText(modeloListaHab.getRowCount()+"");
        

    }//GEN-LAST:event_jCNombresTipoActionPerformed

    private void jTHabitacionesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTHabitacionesMouseClicked
        // TODO add your handling code here:

//        int idHab = (Integer) (modeloListaHab.getValueAt(jTHabitaciones.getSelectedRow(), 0)) ;
//        //int idHab =  (jTHabitaciones.getSelectedRow(), 0);
//        borrarTablaReservas();
//
//        rellenarTablaReservasPorHabit(idHab);

    }//GEN-LAST:event_jTHabitacionesMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> jCNombresTipo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTHabitaciones;
    private javax.swing.JTextField txtCantHab;
    // End of variables declaration//GEN-END:variables


  public void cargarComboTipos() {
       
     
        listarTipos = (ArrayList<TipoHabitacion>) tipohabdata.listarTipoHab();
        for (TipoHabitacion lista : listarTipos) {
            jCNombresTipo.addItem(lista.getIdTipoHabit()+" - "+lista.getNombreTipo());
        }  
        
       
    }
    
    
    public void crearCabecera() {
        
        modeloListaHab.addColumn("id Habit");
        modeloListaHab.addColumn("Nro Habit");
        modeloListaHab.addColumn("Nombre Tipo");
        modeloListaHab.addColumn("Piso");
        modeloListaHab.addColumn("Max.Huésp");
        modeloListaHab.addColumn("Imp./noche");
                
        jTHabitaciones.setModel(modeloListaHab);
       
    }
    
    
    public void borrarTablaTipos() {
        int filas = modeloListaHab.getRowCount() - 1;
        
        for (; filas >= 0; filas--) {
            modeloListaHab.removeRow(filas);
        }
    }
    
            
    
    
    public void rellenarTablaHabitacionesPorTipo(int idTipo) {
        
        
        
       habitacionesPorTipo = (ArrayList<Habitacion>) habdata.listarHabPorTipo(idTipo);

    
        for (Habitacion h : habitacionesPorTipo) {
            
            modeloListaHab.addRow(new Object[]{h.getIdHabitacion(),h.getNroHabitacion(),h.getTipoHabitacion().getNombreTipo(),h.getPiso(),h.getTipoHabitacion().getMaxHuespedes(),h.getTipoHabitacion().getImportePorNoche()});
        
        }  
    }
    
    


}
