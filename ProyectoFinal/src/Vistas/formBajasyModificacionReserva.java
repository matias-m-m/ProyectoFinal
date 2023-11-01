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
import javax.swing.table.DefaultTableModel;
import javax.swing.SpinnerModel;
import javax.swing.SpinnerNumberModel;

/**
 *
 * @author matias
 */
public class formBajasyModificacionReserva extends javax.swing.JInternalFrame {

    private HuespedData hData = new HuespedData();
    private ReservaData rData = new ReservaData();
    private DefaultTableModel modeloListaReservasH = new DefaultTableModel();

    private DefaultTableModel modeloTablaHabs = new DefaultTableModel();

    private int idHuesped;

    /**
     * Creates new form formBajasyModificacionReserva
     */
    public formBajasyModificacionReserva() {
        initComponents();
        
        // Obtén la fecha actual
        Calendar calendar = Calendar.getInstance();
        java.util.Date fechaActual = calendar.getTime();
        System.out.println(calendar);
        System.out.println(fechaActual);
        // Establece la fecha actual como la fecha mínima seleccionable
        fechaIngresoChooser.setMinSelectableDate(fechaActual);
        fechaSalidaChooser.setMinSelectableDate(fechaActual);
        
        
        borrarTabla();
        cargarCabecera();
        borrarTabla2();
        crearCabeceraHabit();
        rellenarTabla();
        SpinnerModel model = new SpinnerNumberModel(1, 1, 100, 1);
        nroHuespedes.setModel(model);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        txtDNI = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jBBuscarHuesped = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTResPorHuesped = new javax.swing.JTable();
        totalReserva = new javax.swing.JLabel();
        valorTotalPesos = new javax.swing.JLabel();
        panelModificar = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        nroHuespedes = new javax.swing.JSpinner();
        jLabel2 = new javax.swing.JLabel();
        fechaIngresoChooser = new com.toedter.calendar.JDateChooser();
        jLabel4 = new javax.swing.JLabel();
        fechaSalidaChooser = new com.toedter.calendar.JDateChooser();
        btnConsultar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaHabitaciones = new javax.swing.JTable();
        btnConfirmar = new javax.swing.JButton();
        radioDarDeBaja = new javax.swing.JRadioButton();
        radioModificar = new javax.swing.JRadioButton();

        setClosable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Baja/Modificacion de Reservas");

        jPanel1.setBackground(new java.awt.Color(27, 27, 27));

        txtDNI.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtDNIKeyTyped(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Ingrese un DNI:");

        jBBuscarHuesped.setText("Buscar");
        jBBuscarHuesped.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBBuscarHuespedActionPerformed(evt);
            }
        });

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
        jTResPorHuesped.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTResPorHuespedMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTResPorHuesped);

        totalReserva.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        totalReserva.setForeground(new java.awt.Color(255, 255, 255));
        totalReserva.setText("Total de la Reserva $");

        valorTotalPesos.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        valorTotalPesos.setForeground(new java.awt.Color(255, 255, 255));
        valorTotalPesos.setText("$0000");

        panelModificar.setBackground(jPanel1.getBackground());
        panelModificar.setBorder(javax.swing.BorderFactory.createTitledBorder("Nueva reserva"));
        panelModificar.setEnabled(false);

        jLabel3.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Cantidad de Huéspedes: ");

        nroHuespedes.setEnabled(panelModificar.isEnabled());
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

        jLabel2.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Fecha de  Ingreso:");

        fechaIngresoChooser.setEnabled(panelModificar.isEnabled());
        fechaIngresoChooser.setFocusTraversalPolicyProvider(true);
        fechaIngresoChooser.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                fechaIngresoChooserPropertyChange(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Fecha de Salida: ");

        fechaSalidaChooser.setEnabled(panelModificar.isEnabled());
        fechaSalidaChooser.setFocusTraversalPolicyProvider(true);

        btnConsultar.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnConsultar.setText("Verificar Datos");
        btnConsultar.setEnabled(panelModificar.isEnabled());
        btnConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultarActionPerformed(evt);
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
        tablaHabitaciones.setEnabled(panelModificar.isEnabled());
        tablaHabitaciones.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaHabitacionesMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tablaHabitaciones);

        javax.swing.GroupLayout panelModificarLayout = new javax.swing.GroupLayout(panelModificar);
        panelModificar.setLayout(panelModificarLayout);
        panelModificarLayout.setHorizontalGroup(
            panelModificarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelModificarLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelModificarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(nroHuespedes, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(fechaIngresoChooser, javax.swing.GroupLayout.DEFAULT_SIZE, 186, Short.MAX_VALUE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel4)
                    .addComponent(fechaSalidaChooser, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnConsultar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(33, 33, 33)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 515, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(14, Short.MAX_VALUE))
        );
        panelModificarLayout.setVerticalGroup(
            panelModificarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelModificarLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelModificarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panelModificarLayout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(nroHuespedes, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(fechaIngresoChooser, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(fechaSalidaChooser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnConsultar)))
                .addContainerGap(18, Short.MAX_VALUE))
        );

        btnConfirmar.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnConfirmar.setText("Confirmar");
        btnConfirmar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConfirmarActionPerformed(evt);
            }
        });

        buttonGroup1.add(radioDarDeBaja);
        radioDarDeBaja.setForeground(jLabel2.getForeground());
        radioDarDeBaja.setText("Dar de baja");
        radioDarDeBaja.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioDarDeBajaActionPerformed(evt);
            }
        });

        buttonGroup1.add(radioModificar);
        radioModificar.setForeground(jLabel2.getForeground());
        radioModificar.setText("Modificar");
        radioModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioModificarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(panelModificar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(totalReserva)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(valorTotalPesos))
                            .addComponent(btnConfirmar, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(radioDarDeBaja)
                            .addComponent(radioModificar)))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 955, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(txtDNI, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jBBuscarHuesped))
                        .addComponent(jLabel1)))
                .addContainerGap(11, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtDNI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBBuscarHuesped))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(panelModificar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(radioDarDeBaja)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(radioModificar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(totalReserva)
                            .addComponent(valorTotalPesos))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnConfirmar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(26, 26, 26))
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

    private void txtDNIKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDNIKeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        if (!Character.isDigit(c)) {
            evt.consume(); // Consumir el evento si no es un número.

        }

    }//GEN-LAST:event_txtDNIKeyTyped

    private void cambiarEstado(boolean x) {
        fechaIngresoChooser.setEnabled(x);
        fechaSalidaChooser.setEnabled(x);
        nroHuespedes.setEnabled(x);
        btnConsultar.setEnabled(x);
        tablaHabitaciones.setEnabled(x);
    }

    public void borrarTabla() {

        int filas = modeloListaReservasH.getRowCount() - 1;

        for (; filas >= 0; filas--) {
            modeloListaReservasH.removeRow(filas);
        }

    }

    public void cargarCabecera() {

        modeloListaReservasH.addColumn("id Reserva");
        modeloListaReservasH.addColumn("Nro Habit");
        modeloListaReservasH.addColumn("Fecha Ingreso");
        modeloListaReservasH.addColumn("Fecha Salida");
        //modeloListaReservasH.addColumn("Cant. Huesp.");
        modeloListaReservasH.addColumn("monto Total");

        jTResPorHuesped.setModel(modeloListaReservasH);
    }

    public void borrarTabla2() {
        int filas = modeloTablaHabs.getRowCount() - 1;

        for (; filas >= 0; filas--) {
            modeloTablaHabs.removeRow(filas);
        }
    }

    public void crearCabeceraHabit() {

        modeloTablaHabs.addColumn("ID");//0
        modeloTablaHabs.addColumn("Nro");//1
        modeloTablaHabs.addColumn("Piso");//2
        modeloTablaHabs.addColumn("Tipo");//3
        modeloTablaHabs.addColumn("Capacidad");//4
        modeloTablaHabs.addColumn("$/Noche");//5

        tablaHabitaciones.setModel(modeloTablaHabs);
    }


    private void jBBuscarHuespedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBBuscarHuespedActionPerformed
        // TODO add your handling code here:


    borrarTabla();

    if (txtDNI.getText().isEmpty()) {
        JOptionPane.showMessageDialog(null, "Debe ingresar un número de DNI en el campo de texto");
    } else {

        String SQLBusq = "SELECT p.idHuesp , r.idReserva,r.idHabitacion, h.nroHabitacion, r.FechaIngreso, r.FechaSalida, r.montoTotal  \n"
                + "FROM reserva AS r JOIN habitacion as h ON (r.idHabitacion = h.idHabitacion) \n"
                + "JOIN huesped AS p ON r.idHuesped = p.idHuesp \n"
                + "WHERE dniHuesp = ? and r.estado = 1 order by FechaIngreso;";

        PreparedStatement ps;
        try {
            ps = rData.getCon().prepareStatement(SQLBusq);
            ps.setString(1, txtDNI.getText());
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                modeloListaReservasH.addRow(new Object[]{
                    rs.getInt("idReserva"),
                    rs.getInt("nroHabitacion"),
                    rs.getDate("FechaIngreso"),
                    rs.getDate("FechaSalida"),
                    //rs.getInt("Cant"), // Corrección: Agregar una coma aquí
                    rs.getDouble("montoTotal")
                });
                   idHuesped = rs.getInt("idHuesp");
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al cargar la tabla" + ex.getMessage());
        }
    }


    }//GEN-LAST:event_jBBuscarHuespedActionPerformed

    private void nroHuespedesStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_nroHuespedesStateChanged
        // TODO add your handling code here:
        borrarTabla2();
        rellenarTablaSpinner();


    }//GEN-LAST:event_nroHuespedesStateChanged

    private void nroHuespedesKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nroHuespedesKeyTyped
        char c = evt.getKeyChar();
        if (!Character.isDigit(c)) {
            evt.consume(); // Consumir el evento si no es un número.

        }
    }//GEN-LAST:event_nroHuespedesKeyTyped

    private void fechaIngresoChooserPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_fechaIngresoChooserPropertyChange
        // TODO add your handling code here:

        Calendar calendar = Calendar.getInstance();
        java.util.Date fechaActual = calendar.getTime();

        fechaSalidaChooser.setMinSelectableDate(fechaIngresoChooser.getDate());
    }//GEN-LAST:event_fechaIngresoChooserPropertyChange

    private void btnConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultarActionPerformed
        // TODO add your handling code here:

        // Obtener la fecha actual o la fecha deseada (por ejemplo, la fecha mínima)
        java.util.Calendar currentDate = java.util.GregorianCalendar.getInstance();
        if (fechaIngresoChooser.getDate().before(currentDate.getTime()) || fechaSalidaChooser.getDate().before(currentDate.getTime())) {
            LocalDate fechaAct = LocalDate.now();
            JOptionPane.showMessageDialog(null, "Las fechas ingresadas no son válidas. Fecha minima: " + fechaAct);

        } else {
            int idhab;
            if (tablaHabitaciones.getSelectedRow() != -1) {
                idhab = (Integer) tablaHabitaciones.getValueAt(tablaHabitaciones.getSelectedRow(), 0);
                String sqlObtenerfechas = "SELECT idReserva FROM reserva \n"
                        + "WHERE  ((FechaSalida BETWEEN ? AND ?) OR \n"
                        + "       (FechaIngreso BETWEEN ? AND ?) OR\n"
                        + "       (FechaIngreso <= ? AND FechaSalida >= ?)) AND\n"
                        + "       (idHabitacion=?) AND estado=1;";
                //Agregamos Estado=1 para que tome las reservas activas
                PreparedStatement psFechas;
                LocalDate vFech1;
                LocalDate vFech2;
                Date fechaEntradaSQL;
                Date fechaSalidaSQL;

                if (fechaIngresoChooser.getDate() != null && fechaSalidaChooser.getDate() != null) {
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
                    try {
                        psFechas = rData.getCon().prepareStatement(sqlObtenerfechas);
                        // psFechas.setInt(1,nrohab);
                        //PRIMERA COMPARACION
                        psFechas.setDate(1, fechaEntradaSQL);
                        psFechas.setDate(2, fechaSalidaSQL);
                        //SEGUNDA COMPARACION
                        psFechas.setDate(3, fechaEntradaSQL);
                        psFechas.setDate(4, fechaSalidaSQL);
                        //TERCERA COMPARACION
                        psFechas.setDate(5, fechaEntradaSQL);
                        psFechas.setDate(6, fechaSalidaSQL);
                        psFechas.setInt(7, idhab);
                        ResultSet rsfechas = psFechas.executeQuery();

                        if (rsfechas.next()) {
                            System.out.println(rsfechas);
                            JOptionPane.showMessageDialog(null, "El rango de fecha ya contiene reservas. Habitacion ocupada");
                        } else {
                            JOptionPane.showMessageDialog(null, "Hay disponibilidad!");
                            int diasTotales = (int) ChronoUnit.DAYS.between(vFech1, vFech2);
                            double precioTotal = diasTotales * ((Double) tablaHabitaciones.getValueAt(tablaHabitaciones.getSelectedRow(), 5));
                            valorTotalPesos.setText(precioTotal + "");

                        }
                        psFechas.close();

                    } catch (SQLException ex) {
                        JOptionPane.showMessageDialog(null, "Error al cargar la tabla" + ex.getMessage());
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "No se seleccionaron fechas");
                }
            } else {
                JOptionPane.showMessageDialog(null, "Seleccione una habitacion");
            }
        }

    }//GEN-LAST:event_btnConsultarActionPerformed

    private void tablaHabitacionesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaHabitacionesMouseClicked

    }//GEN-LAST:event_tablaHabitacionesMouseClicked

    private void btnConfirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConfirmarActionPerformed
        // TODO add your handling code here:

        //Baja de Reservas
        //////////////////////
        if (radioDarDeBaja.isSelected()) {
            if (jTResPorHuesped.getSelectedRow() == -1) {
                JOptionPane.showMessageDialog(null, "Debe seleccionar una fila de la tabla para eliminar la Reserva.");
            } else {

                int id = Integer.parseInt(jTResPorHuesped.getValueAt(jTResPorHuesped.getSelectedRow(), 0).toString());
                rData.borrarReserva(id);

                borrarTabla();

                String SQLBusq = "SELECT r.idReserva,r.idHabitacion, h.nroHabitacion, r.FechaIngreso, r.FechaSalida, r.montoTotal  \n"
                        + "FROM reserva AS r JOIN habitacion as h ON (r.idHabitacion = h.idHabitacion) \n"
                        + "JOIN huesped AS p ON r.idHuesped = p.idHuesp \n"
                        + "WHERE dniHuesp = ? and r.estado = 1 order by FechaIngreso;";

                PreparedStatement ps;
                try {
                    ps = rData.getCon().prepareStatement(SQLBusq);
                    ps.setString(1, txtDNI.getText());
                    ResultSet rs = ps.executeQuery();

                    while (rs.next()) {
                        modeloListaReservasH.addRow(new Object[]{rs.getInt("idReserva"), rs.getInt("idHabitacion"), rs.getInt("nroHabitacion"), rs.getDate("FechaIngreso"), rs.getDate("FechaSalida"), rs.getDouble("montoTotal")});

                    }
                    ps.close();
                } catch (SQLException ex) {
                    JOptionPane.showMessageDialog(null, "Error al cargar la tabla" + ex.getMessage());
                }
            }
        }

        // Actualizacion de reserva
        ////////////////////////////
        if (radioModificar.isSelected()) {
            if (jTResPorHuesped.getSelectedRow() == -1) {
                JOptionPane.showMessageDialog(null, "Debe seleccionar una fila de la tabla para Modificar la Reserva.");
            } else {
                //Baja
                int id = Integer.parseInt(jTResPorHuesped.getValueAt(jTResPorHuesped.getSelectedRow(), 0).toString());
                rData.borrarReserva(id);

                borrarTabla();

                //Alta
                Reserva res = new Reserva();
                res.setEstado(true);
                LocalDate vFech1, vFech2;
                vFech1 = fechaIngresoChooser.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
                vFech2 = fechaSalidaChooser.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
                res.setFechaIngreso(vFech1);
                res.setFechaSalida(vFech2);
                res.setMontoTotal(Double.parseDouble(valorTotalPesos.getText()));
                res.setIdHuesped(idHuesped);
                res.setIdHabitacion((int) tablaHabitaciones.getValueAt(tablaHabitaciones.getSelectedRow(), 0));
                rData.insertarReserva(res);
                
            }
        }


    }//GEN-LAST:event_btnConfirmarActionPerformed

    private void radioModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioModificarActionPerformed
        // TODO add your handling code here:
        cambiarEstado(true);
        panelModificar.setEnabled(true);
    }//GEN-LAST:event_radioModificarActionPerformed

    private void radioDarDeBajaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioDarDeBajaActionPerformed
        // TODO add your handling code here:
        cambiarEstado(false);
        panelModificar.setEnabled(false);

    }//GEN-LAST:event_radioDarDeBajaActionPerformed

    private void jTResPorHuespedMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTResPorHuespedMouseClicked
        // TODO add your handling code here:
        int fselec = jTResPorHuesped.getSelectedRow();

    }//GEN-LAST:event_jTResPorHuespedMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnConfirmar;
    private javax.swing.JButton btnConsultar;
    private javax.swing.ButtonGroup buttonGroup1;
    private com.toedter.calendar.JDateChooser fechaIngresoChooser;
    private com.toedter.calendar.JDateChooser fechaSalidaChooser;
    private javax.swing.JButton jBBuscarHuesped;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTResPorHuesped;
    private javax.swing.JSpinner nroHuespedes;
    private javax.swing.JPanel panelModificar;
    private javax.swing.JRadioButton radioDarDeBaja;
    private javax.swing.JRadioButton radioModificar;
    private javax.swing.JTable tablaHabitaciones;
    private javax.swing.JLabel totalReserva;
    private javax.swing.JTextField txtDNI;
    private javax.swing.JLabel valorTotalPesos;
    // End of variables declaration//GEN-END:variables

    public void rellenarTabla() {

        String SQLPrimeraCarga = "SELECT\n"
                + "    H.IdHabitacion,\n"
                + "    H.nrohabitacion,\n"
                + "    H.piso,\n"
                + "    H.estado,\n"
                + "    T.maxHuespedes,\n"
                + "    T.importepornoche,\n"
                + "    T.letraTipo\n"
                + "FROM HABITACION H\n"
                + "JOIN TIPOHABITACION T ON H.idTipoHabitacion = T.idTipohabit\n"
                + "WHERE H.estado=1;";

        PreparedStatement ps;
        try {
            ps = rData.getCon().prepareStatement(SQLPrimeraCarga);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                modeloTablaHabs.addRow(new Object[]{rs.getInt("H.IdHabitacion"), "N°" + rs.getInt("H.nrohabitacion"), rs.getInt("H.piso"), rs.getString("T.letraTipo"), rs.getInt("T.maxHuespedes"), rs.getDouble("T.importepornoche")});
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al cargar la tabla" + ex.getMessage());
        }

    }

    public void rellenarTablaSpinner() {

        String SQLPrimeraCarga = "SELECT\n"
                + "    H.IdHabitacion,\n"
                + "    H.nrohabitacion,\n"
                + "    H.piso,\n"
                + "    H.estado,\n"
                + "    T.maxHuespedes,\n"
                + "    T.importepornoche,\n"
                + "    T.letraTipo\n"
                + "FROM HABITACION H\n"
                + "JOIN TIPOHABITACION T ON H.idTipoHabitacion = T.idTipohabit\n"
                + "WHERE H.estado=1 AND T.maxHuespedes = ?;";

        PreparedStatement ps;
        int valorH = (int) nroHuespedes.getValue();

        try {
            ps = rData.getCon().prepareStatement(SQLPrimeraCarga);
            ps.setInt(1, valorH);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                modeloTablaHabs.addRow(new Object[]{rs.getInt("H.IdHabitacion"), "N°" + rs.getInt("H.nrohabitacion"), rs.getInt("H.piso"), rs.getString("T.letraTipo"), rs.getInt("T.maxHuespedes"), rs.getDouble("T.importepornoche")});
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al cargar la tabla" + ex.getMessage());
        }

    }

}
