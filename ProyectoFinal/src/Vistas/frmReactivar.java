/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vistas;

import AccesoADatos.TipoHabitacionData;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Usuario
 */
public class frmReactivar extends javax.swing.JInternalFrame {

    private TipoHabitacionData dataDB = new TipoHabitacionData();
    /**
     * Creates new form frmReactivar
     */
    public frmReactivar() {
        initComponents();
        cabeceraTipoHabs();
        cabeceraHabitac();
        cabeceraHuespedes();
        rellenarTablaHabitaciones();
        rellenarTablaHuespedes();
        rellenarTablaTipoHabs();
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
        jScrollPane1 = new javax.swing.JScrollPane();
        jTHabitaciones = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTHuespedes = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTTiposHab = new javax.swing.JTable();
        btnActivarHuesped = new javax.swing.JButton();
        btnActivarTipohabitac = new javax.swing.JButton();
        btnActivarHabitacion = new javax.swing.JButton();

        setClosable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Reactivaciones");

        jPanel1.setBackground(new java.awt.Color(27, 27, 27));

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Para reactivarlos seleccione un item y haga click en Reactivar");

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Las siguientes tablas muestran elementos dados de baja, invisibles para el sistema.");

        jLabel3.setText("HABITACIONES");

        jTHabitaciones.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jTHabitaciones.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTHabitacionesMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTHabitaciones);

        jTHuespedes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jTHuespedes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTHuespedesMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTHuespedes);

        jLabel4.setText("HUESPEDES");

        jLabel5.setText("TIPOS DE HABTACIONES");

        jTTiposHab.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jTTiposHab.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTTiposHabMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(jTTiposHab);

        btnActivarHuesped.setText("Reactivar");
        btnActivarHuesped.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActivarHuespedActionPerformed(evt);
            }
        });

        btnActivarTipohabitac.setText("Reactivar");
        btnActivarTipohabitac.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActivarTipohabitacActionPerformed(evt);
            }
        });

        btnActivarHabitacion.setText("Reactivar");
        btnActivarHabitacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActivarHabitacionActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addContainerGap(142, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addContainerGap(17, Short.MAX_VALUE))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(btnActivarHabitacion)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 415, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 415, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnActivarHuesped))
                    .addComponent(jLabel5)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 415, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnActivarTipohabitac, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnActivarHabitacion)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnActivarHuesped)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnActivarTipohabitac)
                .addContainerGap(12, Short.MAX_VALUE))
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

    private void jTHabitacionesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTHabitacionesMouseClicked
        // TODO add your handling code here:


    }//GEN-LAST:event_jTHabitacionesMouseClicked

    private void jTHuespedesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTHuespedesMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jTHuespedesMouseClicked

    private void jTTiposHabMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTTiposHabMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jTTiposHabMouseClicked

    private void btnActivarHabitacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActivarHabitacionActionPerformed
        // TODO add your handling code here:
        activarHabitacion();
    }//GEN-LAST:event_btnActivarHabitacionActionPerformed

    private void btnActivarTipohabitacActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActivarTipohabitacActionPerformed
        // TODO add your handling code here:
        activarTipoHab();
    }//GEN-LAST:event_btnActivarTipohabitacActionPerformed

    private void btnActivarHuespedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActivarHuespedActionPerformed
        // TODO add your handling code here:
        activarHuesped();
    }//GEN-LAST:event_btnActivarHuespedActionPerformed

    
    //HACER LAS REACTIVACIONES
    private void activarHabitacion(){
        String sqlUpdate="UPDATE habitacion SET estado=1 WHERE idHabitacion=?";
        if (jTHabitaciones.getSelectedRow() != -1) {
            int idHab = Integer.parseInt(jTHabitaciones.getModel().getValueAt(jTHabitaciones.getSelectedRow(), 0).toString());
            PreparedStatement ps;
        try {
            ps = dataDB.getCon().prepareStatement(sqlUpdate);
            ps.setInt(1,idHab);
            ps.executeUpdate();
            ps.close();
            borrarTHabitac();
            rellenarTablaHabitaciones();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al reactivar:" + ex.getMessage());
        }
    } else {
           JOptionPane.showMessageDialog(null, "Debe seleccionar una habitacion"); 
        }
    }
    
    
    private void activarHuesped(){
        String sqlUpdate="UPDATE huesped SET estadoHuesp=1 WHERE idHuesp=?";
        if (jTHuespedes.getSelectedRow() != -1) {
            int idHuesp = Integer.parseInt(jTHuespedes.getModel().getValueAt(jTHuespedes.getSelectedRow(), 0).toString());
            PreparedStatement ps;
        try {
            ps = dataDB.getCon().prepareStatement(sqlUpdate);
            ps.setInt(1,idHuesp);
            ps.executeUpdate();
            ps.close();
            
            borrarTablaHuesp();
            rellenarTablaHuespedes();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al reactivar:" + ex.getMessage());
        }
    } else {
           JOptionPane.showMessageDialog(null, "Debe seleccionar un huesped"); 
        }
    }
    
    private void activarTipoHab(){
        String sqlUpdate="UPDATE tipohabitacion SET estado=1 WHERE idTipoHabit=?";
        if (jTTiposHab.getSelectedRow() != -1) {
            int idTH = Integer.parseInt(jTTiposHab.getModel().getValueAt(jTTiposHab.getSelectedRow(), 0).toString());
            PreparedStatement ps;
        try {
            ps = dataDB.getCon().prepareStatement(sqlUpdate);
            ps.setInt(1,idTH);
            ps.executeUpdate();
            ps.close();
            
            borrarTTiposH();
            rellenarTablaTipoHabs();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al reactivar:" + ex.getMessage());
        }
    } else {
           JOptionPane.showMessageDialog(null, "Debe seleccionar un tipo de Habitacion"); 
        }
    }
    
    
    
    
    //ARMAR CABECERAS Y MODELOS DE TODAS LAS TABLAS
    private DefaultTableModel modeloTHabitaciones = new DefaultTableModel() {
        //Hacer que la tabla no sea editable haciendo doble click
        @Override
        public boolean isCellEditable(int row, int column) {
            return false; // Hacer que todas las celdas no sean editables
        }
        
    };
    public void cabeceraHabitac() {

        modeloTHabitaciones.addColumn("ID");//0 int
        modeloTHabitaciones.addColumn("N°");//1 int
        modeloTHabitaciones.addColumn("Tipo ID");//2 int
        modeloTHabitaciones.addColumn("Piso");//3 int

        jTHabitaciones.setModel(modeloTHabitaciones);
    }
    public void rellenarTablaHabitaciones() {

        String SQLRellenaHabitacs = "SELECT\n"
                + "    idHabitacion,\n"
                + "    nroHabitacion,\n"
                + "    idTipoHabitacion,\n"
                + "    piso\n"
                +"FROM habitacion\n"
                + "WHERE estado=0;";

        PreparedStatement ps;
        try {
            ps = dataDB.getCon().prepareStatement(SQLRellenaHabitacs);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                modeloTHabitaciones.addRow(new Object[]{rs.getInt("idHabitacion"),"N° "+rs.getInt("nroHabitacion"), rs.getInt("idTipoHabitacion"), rs.getInt("piso")});
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al cargar la tabla" + ex.getMessage());
        }

    }
    
    
    
    
    
    
    private DefaultTableModel modeloTTipoHabs = new DefaultTableModel() {
        //Hacer que la tabla no sea editable haciendo doble click
        @Override
        public boolean isCellEditable(int row, int column) {
            return false; // Hacer que todas las celdas no sean editables
        }
    };
    
    public void cabeceraTipoHabs() {

        modeloTTipoHabs.addColumn("ID");//0 int
        modeloTTipoHabs.addColumn("Nombre");//1 varchar
        modeloTTipoHabs.addColumn("Letra");//2 char
        modeloTTipoHabs.addColumn("Capacidad");//3 int
        modeloTTipoHabs.addColumn("$/Noche");//4 int

        jTTiposHab.setModel(modeloTTipoHabs);
    }
    public void rellenarTablaTipoHabs() {

        String SQLRellenaTipos = "SELECT\n"
                + "    idTipoHabit,\n"
                + "    nombreTipo,\n"
                + "    letraTipo,\n"
                + "    maxHuespedes,\n"
                + "    importepornoche\n"
                +"FROM tipohabitacion\n"
                + "WHERE estado=0;";

        PreparedStatement ps;
        try {
            ps = dataDB.getCon().prepareStatement(SQLRellenaTipos);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                modeloTTipoHabs.addRow(new Object[]{rs.getInt("idTipoHabit"),rs.getString("nombreTipo"), rs.getString("letraTipo"), rs.getInt("maxHuespedes"),rs.getInt("importepornoche")});
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al cargar la tabla" + ex.getMessage());
        }

    }
    
    
    
  
    
    private DefaultTableModel modeloTHuespedes = new DefaultTableModel() {
        //Hacer que la tabla no sea editable haciendo doble click
        @Override
        public boolean isCellEditable(int row, int column) {
            return false; // Hacer que todas las celdas no sean editables
        }
    };
    
   public void cabeceraHuespedes() {

        modeloTHuespedes.addColumn("ID");//0 int
        modeloTHuespedes.addColumn("Apellido y  nombre");//1 varchar
        modeloTHuespedes.addColumn("DNI");//3 varchar
        modeloTHuespedes.addColumn("Telefono");//4 varchar

        jTHuespedes.setModel(modeloTHuespedes);
    }
    
    
   public void rellenarTablaHuespedes() {

        String SQLRellenaHuesp = "SELECT\n"
                + "    idHuesp,\n"
                + "    ApellidoHuesp,\n"
                + "    NombreHuesp,\n"
                + "    dniHuesp,\n"
                + "    telefonoHuesp\n"
                + "FROM huesped\n"
                + "WHERE estadoHuesp=0;";

        PreparedStatement ps;
        try {
            ps = dataDB.getCon().prepareStatement(SQLRellenaHuesp);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                modeloTHuespedes.addRow(new Object[]{rs.getInt("idHuesp"),rs.getString("apellidoHuesp")+", "+ rs.getString("nombreHuesp"), rs.getString("dniHuesp"), rs.getString("telefonoHuesp")});
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al cargar la tabla" + ex.getMessage());
        }

    }
    
    public void borrarTablaHuesp() {

        int filas = modeloTHuespedes.getRowCount() - 1;

        for (; filas >= 0; filas--) {
            modeloTHuespedes.removeRow(filas);
        }

    }
    
    public void borrarTHabitac() {

        int filas = modeloTHabitaciones.getRowCount() - 1;

        for (; filas >= 0; filas--) {
            modeloTHabitaciones.removeRow(filas);
        }

    }
    
    public void borrarTTiposH() {

        int filas = modeloTTipoHabs.getRowCount() - 1;

        for (; filas >= 0; filas--) {
            modeloTTipoHabs.removeRow(filas);
        }

    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActivarHabitacion;
    private javax.swing.JButton btnActivarHuesped;
    private javax.swing.JButton btnActivarTipohabitac;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTHabitaciones;
    private javax.swing.JTable jTHuespedes;
    private javax.swing.JTable jTTiposHab;
    // End of variables declaration//GEN-END:variables
}
