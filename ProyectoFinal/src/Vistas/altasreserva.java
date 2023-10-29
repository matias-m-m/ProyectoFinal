/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vistas;

import AccesoADatos.HuespedData;
import AccesoADatos.ReservaData;
import Entidades.Huesped;
import Entidades.Reserva;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.time.ZoneId;
import java.time.temporal.ChronoUnit;
import java.util.Calendar;
import javax.swing.JOptionPane;

/**
 *
 * @author matias
 */
public class altasreserva extends javax.swing.JInternalFrame {
 private ReservaData reservadata = new ReservaData();
    private HuespedData huespeddata = new HuespedData();
    /**
     * Creates new form altas
     */
    public altasreserva() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        fechaIngresoChooser = new com.toedter.calendar.JDateChooser();
        jLabel1 = new javax.swing.JLabel();
        nroHuespedes = new javax.swing.JSpinner();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        fechaSalidaChooser = new com.toedter.calendar.JDateChooser();
        btnConsultar = new javax.swing.JButton();
        labelNombreApellido = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        inputBuscarDNI = new javax.swing.JTextField();
        buscarHuesped = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaHabitaciones = new javax.swing.JTable();
        totalReserva = new javax.swing.JLabel();
        valorTotalPesos = new javax.swing.JLabel();
        btnConfirmar = new javax.swing.JButton();

        setClosable(true);
        setResizable(true);

        jPanel1.setBackground(new java.awt.Color(27, 27, 27));

        fechaIngresoChooser.setFocusTraversalPolicyProvider(true);
        fechaIngresoChooser.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                fechaIngresoChooserPropertyChange(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Fecha de  Ingreso:");

        nroHuespedes.setFocusTraversalPolicyProvider(true);
        nroHuespedes.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                nroHuespedesStateChanged(evt);
            }
        });
        nroHuespedes.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                nroHuespedesKeyTyped(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Cantidad de Huéspedes: ");

        jLabel2.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Fecha de Salida: ");

        fechaSalidaChooser.setFocusTraversalPolicyProvider(true);

        btnConsultar.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnConsultar.setText("Consultar disponibilidad");
        btnConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultarActionPerformed(evt);
            }
        });

        labelNombreApellido.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        labelNombreApellido.setForeground(new java.awt.Color(255, 255, 255));
        labelNombreApellido.setText("Busque un DNI");

        jLabel4.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Titular:");

        inputBuscarDNI.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                inputBuscarDNIKeyTyped(evt);
            }
        });

        buscarHuesped.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarHuespedActionPerformed(evt);
            }
        });

        tablaHabitaciones.setModel(new javax.swing.table.DefaultTableModel(
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
        tablaHabitaciones.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaHabitacionesMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tablaHabitaciones);

        totalReserva.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        totalReserva.setForeground(new java.awt.Color(255, 255, 255));
        totalReserva.setText("Total de la Reserva $");

        valorTotalPesos.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        valorTotalPesos.setForeground(new java.awt.Color(255, 255, 255));
        valorTotalPesos.setText("$0000");

        btnConfirmar.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnConfirmar.setText("Confirmar reserva");
        btnConfirmar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConfirmarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(nroHuespedes, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3)
                            .addComponent(fechaIngresoChooser, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(fechaSalidaChooser, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2)
                            .addComponent(btnConsultar, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 538, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(26, 26, 26)
                                .addComponent(labelNombreApellido))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(inputBuscarDNI, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(buscarHuesped)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(totalReserva)
                        .addGap(18, 18, 18)
                        .addComponent(valorTotalPesos))
                    .addComponent(btnConfirmar, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(nroHuespedes, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(fechaIngresoChooser, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(fechaSalidaChooser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnConsultar, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(labelNombreApellido))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(buscarHuesped)
                    .addComponent(inputBuscarDNI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(valorTotalPesos)
                    .addComponent(totalReserva))
                .addGap(18, 18, 18)
                .addComponent(btnConfirmar, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void fechaIngresoChooserPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_fechaIngresoChooserPropertyChange
        // TODO add your handling code here:

        Calendar calendar = Calendar.getInstance();
        java.util.Date fechaActual = calendar.getTime();

        fechaSalidaChooser.setMinSelectableDate(fechaIngresoChooser.getDate());
    }//GEN-LAST:event_fechaIngresoChooserPropertyChange

    private void nroHuespedesStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_nroHuespedesStateChanged
        // TODO add your handling code here:
       // borrarTabla();
       // rellenarTablaSpinner();

    }//GEN-LAST:event_nroHuespedesStateChanged

    private void nroHuespedesKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nroHuespedesKeyTyped
        char c = evt.getKeyChar();
        if (!Character.isDigit(c)) {
            evt.consume(); // Consumir el evento si no es un número.

        }
    }//GEN-LAST:event_nroHuespedesKeyTyped

    private void btnConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultarActionPerformed
        // TODO add your handling code here:
        // Obtener la fecha actual o la fecha deseada (por ejemplo, la fecha mínima)
        java.util.Calendar currentDate = java.util.GregorianCalendar.getInstance();
        if (fechaIngresoChooser.getDate().before(currentDate.getTime()) || fechaSalidaChooser.getDate().before(currentDate.getTime())) {
            LocalDate fechaAct = LocalDate.now();
            JOptionPane.showMessageDialog(null,"Las fechas ingresadas no son válidas. Fecha minima: "+ fechaAct);

        } else {
            int idhab;
            if(tablaHabitaciones.getSelectedRow() !=-1){
                idhab = (Integer) tablaHabitaciones.getValueAt(tablaHabitaciones.getSelectedRow(), 0);
                String sqlObtenerfechas="SELECT idReserva FROM reserva \n" +
                "WHERE  ((FechaSalida BETWEEN ? AND ?) OR \n" +
                "       (FechaIngreso BETWEEN ? AND ?) OR\n" +
                "       (FechaIngreso <= ? AND FechaSalida >= ?)) AND\n" +
                "       (idHabitacion=?) AND estado=1;";
                //Agregamos Estado=1 para que tome las reservas activas
                PreparedStatement psFechas;
                LocalDate vFech1;
                LocalDate vFech2;
                Date fechaEntradaSQL;
                Date fechaSalidaSQL;

                if(fechaIngresoChooser.getDate() != null && fechaSalidaChooser.getDate() != null ){
                    vFech1 = fechaIngresoChooser.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
                    vFech2 = fechaSalidaChooser.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
                    //            if(vFech1.compareTo(vFech2)==1){
                        //            System.out.println("El ingreso es mayor a la salida. Mal");
                        //        } else if(vFech1.compareTo(vFech2)==0){
                        //            System.out.println("Las fechas son las mismas. Mal");
                        //        } else {
                        //            System.out.println("ingreso menor a salida. Bien");
                        //        }

                    fechaEntradaSQL = Date.valueOf(String.valueOf(vFech1));
                    fechaSalidaSQL = Date.valueOf(String.valueOf(vFech2));
                    try{
                        psFechas = reservadata.getCon().prepareStatement(sqlObtenerfechas);
                        // psFechas.setInt(1,nrohab);
                        //PRIMERA COMPARACION
                        psFechas.setDate(1,fechaEntradaSQL);
                        psFechas.setDate(2, fechaSalidaSQL);
                        //SEGUNDA COMPARACION
                        psFechas.setDate(3,fechaEntradaSQL);
                        psFechas.setDate(4, fechaSalidaSQL);
                        //TERCERA COMPARACION
                        psFechas.setDate(5,fechaEntradaSQL);
                        psFechas.setDate(6, fechaSalidaSQL);
                        psFechas.setInt(7,idhab);
                        ResultSet rsfechas = psFechas.executeQuery();

                        if(rsfechas.next()){
                            System.out.println(rsfechas);
                            JOptionPane.showMessageDialog(null,"El rango de fecha ya contiene reservas. Habitacion ocupada");
                        } else {
                            JOptionPane.showMessageDialog(null,"Hay disponibilidad!");
                            int diasTotales = (int) ChronoUnit.DAYS.between(vFech1,vFech2);
                            double precioTotal= diasTotales* ((Double) tablaHabitaciones.getValueAt(tablaHabitaciones.getSelectedRow(), 5));
                            valorTotalPesos.setText(precioTotal+"");

                        }
                        psFechas.close();

                    } catch(SQLException ex) {
                        JOptionPane.showMessageDialog(null, "Error al cargar la tabla" + ex.getMessage());
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "No se seleccionaron fechas");
                }
            } else {
                JOptionPane.showMessageDialog(null,"Seleccione una habitacion");
            }
        }

    }//GEN-LAST:event_btnConsultarActionPerformed

    private void inputBuscarDNIKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_inputBuscarDNIKeyTyped
        char c = evt.getKeyChar();
        if (!Character.isDigit(c)) {
            evt.consume(); // Consumir el evento si no es un número.

        }
    }//GEN-LAST:event_inputBuscarDNIKeyTyped

    private void buscarHuespedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarHuespedActionPerformed
        // TODO add your handling code here:
        if(inputBuscarDNI.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Ingrese un DNI a buscar");
        } else {

            String dniString = inputBuscarDNI.getText();
            Huesped huesp = new Huesped();
            huesp = huespeddata.buscarHuespPorDni(dniString);

            if(huesp!=null){
                labelNombreApellido.setText(huesp.getIdHuesp()+"");
                labelNombreApellido.setText(huesp.getApellidoHuesp()+", "+huesp.getNombreHuesp());
                btnConfirmar.setEnabled(true);
            } else {
                labelNombreApellido.setText("00");
                labelNombreApellido.setText("Huesped no encontrado");
                btnConfirmar.setEnabled(false);
            }

        }
    }//GEN-LAST:event_buscarHuespedActionPerformed

    private void tablaHabitacionesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaHabitacionesMouseClicked

    }//GEN-LAST:event_tablaHabitacionesMouseClicked

    private void btnConfirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConfirmarActionPerformed
        // TODO add your handling code here:
        Reserva res = new Reserva();
        res.setEstado(true);
        LocalDate vFech1,vFech2;
        vFech1 = fechaIngresoChooser.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
        vFech2 = fechaSalidaChooser.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
        res.setFechaIngreso(vFech1);
        res.setFechaSalida(vFech2);
        res.setMontoTotal(Double.parseDouble(valorTotalPesos.getText()));
        res.setIdHuesped(Integer.parseInt(labelNombreApellido.getText()));
        res.setIdHabitacion((int) tablaHabitaciones.getValueAt(tablaHabitaciones.getSelectedRow(),0));
        reservadata.insertarReserva(res);
    }//GEN-LAST:event_btnConfirmarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnConfirmar;
    private javax.swing.JButton btnConsultar;
    private javax.swing.JButton buscarHuesped;
    private com.toedter.calendar.JDateChooser fechaIngresoChooser;
    private com.toedter.calendar.JDateChooser fechaSalidaChooser;
    private javax.swing.JTextField inputBuscarDNI;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel labelNombreApellido;
    private javax.swing.JSpinner nroHuespedes;
    private javax.swing.JTable tablaHabitaciones;
    private javax.swing.JLabel totalReserva;
    private javax.swing.JLabel valorTotalPesos;
    // End of variables declaration//GEN-END:variables

}
