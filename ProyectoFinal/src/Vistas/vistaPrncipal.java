/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vistas;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.UIManager;

/**
 *
 * @author matias
 */
public class vistaPrncipal extends javax.swing.JFrame {

    /**
     * Creates new form vistaPrncipal
     */
    public vistaPrncipal() {
        initComponents();
        jButton5.setVisible(false);
        jButton6.setVisible(false);
        jButton7.setVisible(false);
        jButton8.setVisible(false);
        jButton9.setVisible(false);
        jButton10.setVisible(false);
        jButton11.setVisible(false);
        jButton12.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jescritorio = new javax.swing.JDesktopPane();
        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        imNvaReserva = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMAltaTipoHab = new javax.swing.JMenuItem();
        jMBajaModifTipoHabit = new javax.swing.JMenuItem();
        jMHabPorTipo = new javax.swing.JMenu();
        jMResPorHab = new javax.swing.JMenuItem();
        jMResPorHuesp = new javax.swing.JMenuItem();
        jMResEntreFechas = new javax.swing.JMenuItem();
        jMHabitPorTipo = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setBackground(new java.awt.Color(0, 0, 0));
        jButton1.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Reserva");
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton1MouseExited(evt);
            }
        });
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 860, 200, 70));

        jButton2.setBackground(new java.awt.Color(0, 0, 0));
        jButton2.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Huespedes");
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton2MouseExited(evt);
            }
        });
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1640, 860, 200, 70));

        jButton3.setBackground(new java.awt.Color(0, 0, 0));
        jButton3.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("Habitaciones");
        jButton3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton3MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton3MouseExited(evt);
            }
        });
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 860, 200, 70));

        jButton4.setBackground(new java.awt.Color(0, 0, 0));
        jButton4.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jButton4.setForeground(new java.awt.Color(255, 255, 255));
        jButton4.setText("Consulta");
        jButton4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton4MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton4MouseExited(evt);
            }
        });
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(1090, 860, 210, 70));

        jButton6.setBackground(new java.awt.Color(0, 0, 0));
        jButton6.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jButton6.setForeground(new java.awt.Color(255, 255, 255));
        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/icono editar.png"))); // NOI18N
        jButton6.setText("BAJA/EDITAR");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 810, 200, 50));

        jButton7.setBackground(new java.awt.Color(0, 0, 0));
        jButton7.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jButton7.setForeground(new java.awt.Color(255, 255, 255));
        jButton7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/icono agregar.png"))); // NOI18N
        jButton7.setText("    ALTAS  ");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 760, 200, 50));

        jButton8.setBackground(new java.awt.Color(0, 0, 0));
        jButton8.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jButton8.setForeground(new java.awt.Color(255, 255, 255));
        jButton8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/icono editar.png"))); // NOI18N
        jButton8.setText("BAJA/EDITAR");
        jButton8.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentHidden(java.awt.event.ComponentEvent evt) {
                jButton8ComponentHidden(evt);
            }
        });
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 810, 200, 50));

        jButton9.setBackground(new java.awt.Color(0, 0, 0));
        jButton9.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jButton9.setForeground(new java.awt.Color(255, 255, 255));
        jButton9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/icono agregar.png"))); // NOI18N
        jButton9.setText("    ALTAS  ");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton9, new org.netbeans.lib.awtextra.AbsoluteConstraints(1090, 760, 210, 50));

        jButton10.setBackground(new java.awt.Color(0, 0, 0));
        jButton10.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jButton10.setForeground(new java.awt.Color(255, 255, 255));
        jButton10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/icono editar.png"))); // NOI18N
        jButton10.setText("BAJA/EDITAR");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton10, new org.netbeans.lib.awtextra.AbsoluteConstraints(1090, 810, 210, 50));

        jButton11.setBackground(new java.awt.Color(0, 0, 0));
        jButton11.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jButton11.setForeground(new java.awt.Color(255, 255, 255));
        jButton11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/icono agregar.png"))); // NOI18N
        jButton11.setText("ALTAS");
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton11, new org.netbeans.lib.awtextra.AbsoluteConstraints(1640, 760, 200, 50));

        jButton12.setBackground(new java.awt.Color(0, 0, 0));
        jButton12.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jButton12.setForeground(new java.awt.Color(255, 255, 255));
        jButton12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/icono editar.png"))); // NOI18N
        jButton12.setText("BAJA/EDITAR");
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton12, new org.netbeans.lib.awtextra.AbsoluteConstraints(1640, 810, 200, 50));

        jButton5.setBackground(new java.awt.Color(0, 0, 0));
        jButton5.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jButton5.setForeground(new java.awt.Color(255, 255, 255));
        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/icono agregar.png"))); // NOI18N
        jButton5.setText("    ALTAS  ");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 760, 200, 50));

        jescritorio.setLayer(jPanel1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jescritorioLayout = new javax.swing.GroupLayout(jescritorio);
        jescritorio.setLayout(jescritorioLayout);
        jescritorioLayout.setHorizontalGroup(
            jescritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jescritorioLayout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1920, Short.MAX_VALUE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jescritorioLayout.setVerticalGroup(
            jescritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jescritorioLayout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1080, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jMenu1.setText("Reserva");

        imNvaReserva.setText("Nueva reserva");
        imNvaReserva.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                imNvaReservaActionPerformed(evt);
            }
        });
        jMenu1.add(imNvaReserva);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Habitaciones");

        jMAltaTipoHab.setText("Alta Tipo de Habitacion");
        jMAltaTipoHab.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMAltaTipoHabActionPerformed(evt);
            }
        });
        jMenu2.add(jMAltaTipoHab);

        jMBajaModifTipoHabit.setText("Baja/Modificacion Tipo de Habitación");
        jMBajaModifTipoHabit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMBajaModifTipoHabitActionPerformed(evt);
            }
        });
        jMenu2.add(jMBajaModifTipoHabit);

        jMenuBar1.add(jMenu2);

        jMHabPorTipo.setText("Consultas");

        jMResPorHab.setText("Reservas por Habitación");
        jMResPorHab.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMResPorHabActionPerformed(evt);
            }
        });
        jMHabPorTipo.add(jMResPorHab);

        jMResPorHuesp.setText("Reservas por Huésped");
        jMResPorHuesp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMResPorHuespActionPerformed(evt);
            }
        });
        jMHabPorTipo.add(jMResPorHuesp);

        jMResEntreFechas.setText("Reservas entre Fechas");
        jMResEntreFechas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMResEntreFechasActionPerformed(evt);
            }
        });
        jMHabPorTipo.add(jMResEntreFechas);

        jMHabitPorTipo.setText("Habitaciones por Tipo Habitación");
        jMHabitPorTipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMHabitPorTipoActionPerformed(evt);
            }
        });
        jMHabPorTipo.add(jMHabitPorTipo);

        jMenuBar1.add(jMHabPorTipo);

        jMenu4.setText("Huespedes");

        jMenuItem2.setText("Altas");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem2);

        jMenuItem3.setText("Bajas/Editar");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem3);

        jMenuBar1.add(jMenu4);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jescritorio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jescritorio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // jescritorio.removeAll();
        // jescritorio.repaint();
        jButton5.setVisible(true);
        jButton6.setVisible(true);

        // formReserva reserva = new formReserva();
        // reserva.setVisible(true);
        //jescritorio.add(reserva);
        //jescritorio.moveToFront(reserva);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

        jButton11.setVisible(true);
        jButton12.setVisible(true);
        //movi este formulario al jbutton11actionperformed
        //formAltasReserva altasHues = new formAltasReserva();
        //altasHues.setVisible(true);
        //colocar color de fondo al formulario
        //altasHues.getContentPane().setBackground(new Color(251, 128, 82));
        //jescritorio.add(altasHues);
        //jescritorio.moveToFront(altasHues);
    }//GEN-LAST:event_jButton2ActionPerformed
// estos eventos los uso para cambiar de color los botones al pasar por encima de ellos
//jbutton 1 pertenece al reserva
    private void jButton1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseEntered
        jButton1.setBackground(Color.WHITE); // Cambia el fondo a rojo al pasar el cursor
        jButton1.setForeground(Color.BLACK); // Cambia el color del texto a blanco
        jButton1.setSize(new Dimension(190, 60)); // Cambia el tamaño al 80% del tamaño original
    }//GEN-LAST:event_jButton1MouseEntered

    private void jButton1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseExited
        jButton1.setBackground(Color.BLACK);
        jButton1.setForeground(Color.WHITE);
        jButton1.setSize(new Dimension(200, 70)); // Restaura el tamaño original

    }//GEN-LAST:event_jButton1MouseExited
//el jbutton 4 pertenece a consulta
    private void jButton4MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton4MouseEntered
        jButton4.setBackground(Color.WHITE); // Cambia el fondo a rojo al pasar el cursor
        jButton4.setForeground(Color.BLACK); // Cambia el color del texto a blanco
        jButton4.setSize(new Dimension(200, 60)); // Cambia el tamaño al 80% del tamaño original
    }//GEN-LAST:event_jButton4MouseEntered

    private void jButton4MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton4MouseExited
        jButton4.setBackground(Color.BLACK);
        jButton4.setForeground(Color.WHITE);
        jButton4.setSize(new Dimension(210, 70)); // Restaura el tamaño original
    }//GEN-LAST:event_jButton4MouseExited
//el jbutton 2 pertenece a huesped
    private void jButton2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseEntered
        jButton2.setBackground(Color.WHITE); // Cambia el fondo a rojo al pasar el cursor
        jButton2.setForeground(Color.BLACK); // Cambia el color del texto a blanco
        jButton2.setSize(new Dimension(190, 60)); // Cambia el tamaño al 80% del tamaño original
    }//GEN-LAST:event_jButton2MouseEntered

    private void jButton2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseExited
        jButton2.setBackground(Color.BLACK);
        jButton2.setForeground(Color.WHITE);
        jButton2.setSize(new Dimension(200, 70)); // Restaura el tamaño original

    }//GEN-LAST:event_jButton2MouseExited

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        //jescritorio.removeAll();
        //jescritorio.repaint();
        formAltasHuesped fAltas = new formAltasHuesped();
        fAltas.setVisible(true);
        jescritorio.add(fAltas);
        jescritorio.moveToFront(fAltas);

    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        formBajasyModificacionHuesped fBaMo = new formBajasyModificacionHuesped();
        fBaMo.setVisible(true);
        jescritorio.add(fBaMo);
        jescritorio.moveToFront(fBaMo);
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMAltaTipoHabActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMAltaTipoHabActionPerformed
        // TODO add your handling code here:
        formAltaTipoHabitacion fAltTipHab = new formAltaTipoHabitacion();
        fAltTipHab.setVisible(true);
        jescritorio.add(fAltTipHab);
        jescritorio.moveToFront(fAltTipHab);

    }//GEN-LAST:event_jMAltaTipoHabActionPerformed

    private void jMBajaModifTipoHabitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMBajaModifTipoHabitActionPerformed
        // TODO add your handling code here:
        formBajayModificacionTipoHabitacion fBajayModiftTipHab = new formBajayModificacionTipoHabitacion();
        fBajayModiftTipHab.setVisible(true);
        jescritorio.add(fBajayModiftTipHab);
        jescritorio.moveToFront(fBajayModiftTipHab);

    }//GEN-LAST:event_jMBajaModifTipoHabitActionPerformed
// estos son los botones para que se muestren al accionar en ellos  son 8 botones 
    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        jButton5.setVisible(false);
        formAltasReserva nvaReserva = new formAltasReserva();
        nvaReserva.setVisible(true);
        jescritorio.add(nvaReserva);
        jescritorio.moveToFront(nvaReserva);

    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        jButton6.setVisible(false);
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        jButton7.setVisible(false);
        
        formAltaTipoHabitacion fAltTipHab = new formAltaTipoHabitacion();
        fAltTipHab.setVisible(true);
        jescritorio.add(fAltTipHab);
        jescritorio.moveToFront(fAltTipHab);
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        jButton8.setVisible(false);
        formBajayModificacionTipoHabitacion fBajayModiftTipHab = new formBajayModificacionTipoHabitacion();
        fBajayModiftTipHab.setVisible(true);
        jescritorio.add(fBajayModiftTipHab);
        jescritorio.moveToFront(fBajayModiftTipHab);
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        jButton9.setVisible(false);
        formReservasPorHabitacion fBajayModiftTipHab = new formReservasPorHabitacion();
        fBajayModiftTipHab.setVisible(true);
        jescritorio.add(fBajayModiftTipHab);
        jescritorio.moveToFront(fBajayModiftTipHab);
    }//GEN-LAST:event_jButton9ActionPerformed
// estos botones hay  que ordenarlo pertenecen arriba alos action de reserva habitacion consulta  y huesped
    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        jButton9.setVisible(true);
        jButton10.setVisible(true);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        jButton7.setVisible(true);
        jButton8.setVisible(true);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        jButton10.setVisible(false);
    }//GEN-LAST:event_jButton10ActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed

        jButton11.setVisible(false);
        formAltasHuesped fAltas = new formAltasHuesped();
        fAltas.setVisible(true);
        jescritorio.add(fAltas);
        jescritorio.moveToFront(fAltas);
        //este es otro formulario tambien para altas?
        // formAltasReserva altasHues = new formAltasReserva();
        //altasHues.setVisible(true);
        // altasHues.getContentPane().setBackground(new Color(251, 128, 82));
        //jescritorio.add(altasHues);
        //jescritorio.moveToFront(altasHues);
    }//GEN-LAST:event_jButton11ActionPerformed

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed
        jButton12.setVisible(false);
        formBajasyModificacionHuesped fBaMo = new formBajasyModificacionHuesped();
        fBaMo.setVisible(true);
        jescritorio.add(fBaMo);
        jescritorio.moveToFront(fBaMo);
    }//GEN-LAST:event_jButton12ActionPerformed

    private void imNvaReservaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_imNvaReservaActionPerformed
        // TODO add your handling code here:
        formAltasReserva nvaReserva = new formAltasReserva();
        nvaReserva.setVisible(true);
        jescritorio.add(nvaReserva);
        jescritorio.moveToFront(nvaReserva);
    }//GEN-LAST:event_imNvaReservaActionPerformed

    private void jMResPorHabActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMResPorHabActionPerformed
        // TODO add your handling code here:
        formReservasPorHabitacion fResPorHab = new formReservasPorHabitacion();
        fResPorHab.setVisible(true);
        jescritorio.add(fResPorHab);
        jescritorio.moveToFront(fResPorHab);
        
        
    }//GEN-LAST:event_jMResPorHabActionPerformed

    private void jMResPorHuespActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMResPorHuespActionPerformed
        // TODO add your handling code here:
        formReservasPorHuesped fResPorHuesp = new formReservasPorHuesped();
        fResPorHuesp.setVisible(true);
        jescritorio.add(fResPorHuesp);
        jescritorio.moveToFront(fResPorHuesp);
               
        
    }//GEN-LAST:event_jMResPorHuespActionPerformed

    private void jMHabitPorTipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMHabitPorTipoActionPerformed
        // TODO add your handling code here:
        formHabitacionesPorTipo fHabPorTipo = new formHabitacionesPorTipo();
        fHabPorTipo.setVisible(true);
        jescritorio.add(fHabPorTipo);
        jescritorio.moveToFront(fHabPorTipo);
        
        
    }//GEN-LAST:event_jMHabitPorTipoActionPerformed

<<<<<<< Updated upstream
    private void jButton8ComponentHidden(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_jButton8ComponentHidden
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton8ComponentHidden

    private void jButton3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3MouseExited
        jButton3.setBackground(Color.BLACK);
        jButton3.setForeground(Color.WHITE);
        jButton3.setSize(new Dimension(200, 70)); // Restaura el tamaño original
    }//GEN-LAST:event_jButton3MouseExited

//el jbutton 3 pertenece a habitaciones
    private void jButton3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3MouseEntered
        jButton3.setBackground(Color.WHITE); // Cambia el fondo a rojo al pasar el cursor
        jButton3.setForeground(Color.BLACK); // Cambia el color del texto a blanco
        jButton3.setSize(new Dimension(190, 60)); // Cambia el tamaño al 80% del tamaño original
    }//GEN-LAST:event_jButton3MouseEntered
=======
    private void jMResEntreFechasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMResEntreFechasActionPerformed
        // TODO add your handling code here:
        formReservasEntreFechas fResEntreFech = new formReservasEntreFechas();
        fResEntreFech.setVisible(true);
        jescritorio.add(fResEntreFech);
        jescritorio.moveToFront(fResEntreFech);
        
        
    }//GEN-LAST:event_jMResEntreFechasActionPerformed
>>>>>>> Stashed changes

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(vistaPrncipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(vistaPrncipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(vistaPrncipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(vistaPrncipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new vistaPrncipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem imNvaReserva;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JMenuItem jMAltaTipoHab;
    private javax.swing.JMenuItem jMBajaModifTipoHabit;
    private javax.swing.JMenu jMHabPorTipo;
    private javax.swing.JMenuItem jMHabitPorTipo;
    private javax.swing.JMenuItem jMResEntreFechas;
    private javax.swing.JMenuItem jMResPorHab;
    private javax.swing.JMenuItem jMResPorHuesp;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JDesktopPane jescritorio;
    // End of variables declaration//GEN-END:variables
}
