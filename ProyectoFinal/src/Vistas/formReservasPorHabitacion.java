
package Vistas;

import AccesoADatos.HabitacData;
import AccesoADatos.HuespedData;
import AccesoADatos.ReservaData;
import AccesoADatos.TipoHabitacionData;
import Entidades.Habitacion;
import Entidades.Huesped;
import Entidades.Reserva;
import Entidades.TipoHabitacion;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;



public class formReservasPorHabitacion extends javax.swing.JInternalFrame {

    
   // private ReservaData reservadata = new ReservaData();
   // private HuespedData huespeddata = new HuespedData();
    
    
    
    
    private TipoHabitacionData tipohabdata = new TipoHabitacionData();
    private HabitacData habdata = new HabitacData();
    private ReservaData resdata = new ReservaData();
    
    
    private ArrayList<TipoHabitacion> listarTipos;
    private ArrayList<Habitacion> habitacionesPorTipo;
    private ArrayList<Reserva> reservasPorHabit;
    
    
    
    
    
    private DefaultTableModel modeloListaHab = new DefaultTableModel() {
        //Hacer que la tabla no sea editable haciendo doble click
        @Override
        public boolean isCellEditable(int row, int column) {
            return false; // Hacer que todas las celdas no sean editables
        }
    };
    
     private DefaultTableModel modeloListaRes = new DefaultTableModel() {
        //Hacer que la tabla no sea editable haciendo doble click
        @Override
        public boolean isCellEditable(int row, int column) {
            return false; // Hacer que todas las celdas no sean editables
        }
    };
    
    
    public formReservasPorHabitacion() {
        initComponents();
        cargarComboTipos();
        crearCabecera();
        borrarTablaTipos();
        borrarTablaReservas();
        int i = 1;
        rellenarTablaHabitacionesPorTipo(i);
        txtCantHab.setText(modeloListaHab.getRowCount()+"");
        
    }

    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTHabitaciones = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTReservas = new javax.swing.JTable();
        jCNombresTipo = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtCantHab = new javax.swing.JTextField();

        setClosable(true);
        setTitle("Reservas Por Habitación");

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

        jTReservas.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane2.setViewportView(jTReservas);

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

        jLabel1.setText("Seleccione Tipo de Habitación: ");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Habitaciones");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Reservas");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("Cantidad de Habitaciones:");

        txtCantHab.setEditable(false);
        txtCantHab.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(23, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(18, 18, 18)
                        .addComponent(txtCantHab, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jCNombresTipo, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 492, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 535, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jCNombresTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 365, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtCantHab, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(21, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jCNombresTipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCNombresTipoActionPerformed
       int id = Integer.parseInt(jCNombresTipo.getSelectedItem().toString().substring(0, jCNombresTipo.getSelectedItem().toString().indexOf(" ")));
        
        borrarTablaTipos();
        rellenarTablaHabitacionesPorTipo(id);
        txtCantHab.setText(modeloListaHab.getRowCount()+"");
        borrarTablaReservas();
        
    }//GEN-LAST:event_jCNombresTipoActionPerformed

    private void jCNombresTipoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jCNombresTipoItemStateChanged
 
    }//GEN-LAST:event_jCNombresTipoItemStateChanged

    private void jTHabitacionesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTHabitacionesMouseClicked
        // TODO add your handling code here:
        
        
        int idHab = (Integer) (modeloListaHab.getValueAt(jTHabitaciones.getSelectedRow(), 0)) ;
        //int idHab =  (jTHabitaciones.getSelectedRow(), 0);
        borrarTablaReservas();
      
        rellenarTablaReservasPorHabit(idHab);
        
    }//GEN-LAST:event_jTHabitacionesMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> jCNombresTipo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTHabitaciones;
    private javax.swing.JTable jTReservas;
    private javax.swing.JTextField txtCantHab;
    // End of variables declaration//GEN-END:variables



    public void cargarComboTipos() {
       
     
        listarTipos = (ArrayList) tipohabdata.listarTipoHab();
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
        
        modeloListaRes.addColumn("id Reserva");
        modeloListaRes.addColumn("Fecha Ingreso");
        modeloListaRes.addColumn("Fecha Salida");
        modeloListaRes.addColumn("Monto Total");
        modeloListaRes.addColumn("Apellido");
        modeloListaRes.addColumn("Nombre");
        
        jTReservas.setModel(modeloListaRes);
        
    }
    
    
    public void borrarTablaTipos() {
        int filas = modeloListaHab.getRowCount() - 1;
        
        for (; filas >= 0; filas--) {
            modeloListaHab.removeRow(filas);
        }
    }
    
    public void borrarTablaReservas() {
        int filas = modeloListaRes.getRowCount() - 1;
        
        for (; filas >= 0; filas--) {
            modeloListaRes.removeRow(filas);
        }
    }
        
    
    
    public void rellenarTablaHabitacionesPorTipo(int idTipo) {
        
        
        
        habitacionesPorTipo = (ArrayList) habdata.listarHabPorTipo(idTipo);
    
        for (Habitacion h : habitacionesPorTipo) {
            
            modeloListaHab.addRow(new Object[]{h.getIdHabitacion(),h.getNroHabitacion(),h.getTipoHabitacion().getNombreTipo(),h.getPiso(),h.getTipoHabitacion().getMaxHuespedes(),h.getTipoHabitacion().getImportePorNoche()});
        
        }  
    }
    
    
   

/////////////////////////////////////////////////////////////////////////////////////////////////
/////////////////////////////////////////////////////////////////////////////////////////////////
    
    
     public void rellenarTablaReservasPorHabit(int idHab) {
        
             
       
        LocalDate vFech1,vFech2;
        

        String sql = "SELECT R.idReserva, R.FechaIngreso, R.FechaSalida, R.montoTotal, H.ApellidoHuesp, H.NombreHuesp "
                + "from reserva as R join huesped as H on (R.idHuesped = H.idHuesp) "
                + "where R.idHabitacion = ? and R.estado = 1";

       
        PreparedStatement ps;
        try {
            ps = tipohabdata.getCon().prepareStatement(sql);
            ps.setInt(1, idHab);
            ResultSet rs = ps.executeQuery();
            
            while (rs.next()) {
                 modeloListaRes.addRow(new Object[] { rs.getInt("idReserva"), rs.getDate("FechaIngreso"),rs.getDate("FechaSalida"), rs.getDouble("montoTotal"),rs.getString("ApellidoHuesp"), rs.getString("NombreHuesp") } );
                
            }
            ps.close();
        }
        catch (SQLException ex){
            JOptionPane.showMessageDialog(null,"Error al cargar la tabla" + ex.getMessage());
        }
    }    

    
    
////////////////////////////////////////////////////////////////////////////////////////////////
////////////////////////////////////////////////////////////////////////////////////////////////



    
}
