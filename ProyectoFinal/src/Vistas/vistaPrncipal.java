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
        jaltasresev.setVisible(false);
        btnEditReserva.setVisible(false);
        btnNvaHabit.setVisible(false);
        btnEditHabit.setVisible(false);
        jButton9.setVisible(false);
        jportipohabitación.setVisible(false);
        jporfecha.setVisible(false);
        jporHabitación.setVisible(false);
        jporhuesped.setVisible(false);
        btnAltaHuesp.setVisible(false);
        btnEditHuesp.setVisible(false);
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
        btnBigReserva = new javax.swing.JButton();
        btnBigHuesp = new javax.swing.JButton();
        btnBigHabit = new javax.swing.JButton();
        btnBigConsult = new javax.swing.JButton();
        btnEditReserva = new javax.swing.JButton();
        btnNvaHabit = new javax.swing.JButton();
        btnEditHabit = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        btnAltaHuesp = new javax.swing.JButton();
        btnEditHuesp = new javax.swing.JButton();
        jporHabitación = new javax.swing.JButton();
        jporhuesped = new javax.swing.JButton();
        jporfecha = new javax.swing.JButton();
        jportipohabitación = new javax.swing.JButton();
        jaltasresev = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        menuReserva = new javax.swing.JMenu();
        imNvaReserva = new javax.swing.JMenuItem();
        imEditReserva = new javax.swing.JMenuItem();
        menuHabitac = new javax.swing.JMenu();
        imAltaTipoHab = new javax.swing.JMenuItem();
        miBajaEditTipoHab = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        miAltaHabit = new javax.swing.JMenuItem();
        miBajaEditHab = new javax.swing.JMenuItem();
        menuConsultas = new javax.swing.JMenu();
        jMResPorHab = new javax.swing.JMenuItem();
        jMResPorHuesp = new javax.swing.JMenuItem();
        jMResEntreFechas = new javax.swing.JMenuItem();
        jMHabitPorTipo = new javax.swing.JMenuItem();
        menuHuesp = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnBigReserva.setBackground(new java.awt.Color(0, 0, 0));
        btnBigReserva.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        btnBigReserva.setForeground(new java.awt.Color(255, 255, 255));
        btnBigReserva.setText("Reserva");
        btnBigReserva.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnBigReserva.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnBigReservaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnBigReservaMouseExited(evt);
            }
        });
        btnBigReserva.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBigReservaActionPerformed(evt);
            }
        });
        jPanel1.add(btnBigReserva, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 860, 200, 70));

        btnBigHuesp.setBackground(new java.awt.Color(0, 0, 0));
        btnBigHuesp.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        btnBigHuesp.setForeground(new java.awt.Color(255, 255, 255));
        btnBigHuesp.setText("Huespedes");
        btnBigHuesp.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnBigHuespMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnBigHuespMouseExited(evt);
            }
        });
        btnBigHuesp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBigHuespActionPerformed(evt);
            }
        });
        jPanel1.add(btnBigHuesp, new org.netbeans.lib.awtextra.AbsoluteConstraints(1640, 860, 200, 70));

        btnBigHabit.setBackground(new java.awt.Color(0, 0, 0));
        btnBigHabit.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        btnBigHabit.setForeground(new java.awt.Color(255, 255, 255));
        btnBigHabit.setText("Habitaciones");
        btnBigHabit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnBigHabitMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnBigHabitMouseExited(evt);
            }
        });
        btnBigHabit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBigHabitActionPerformed(evt);
            }
        });
        jPanel1.add(btnBigHabit, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 860, 200, 70));

        btnBigConsult.setBackground(new java.awt.Color(0, 0, 0));
        btnBigConsult.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        btnBigConsult.setForeground(new java.awt.Color(255, 255, 255));
        btnBigConsult.setText("Consulta");
        btnBigConsult.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnBigConsultMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnBigConsultMouseExited(evt);
            }
        });
        btnBigConsult.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBigConsultActionPerformed(evt);
            }
        });
        jPanel1.add(btnBigConsult, new org.netbeans.lib.awtextra.AbsoluteConstraints(1090, 860, 210, 70));

        btnEditReserva.setBackground(new java.awt.Color(0, 0, 0));
        btnEditReserva.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnEditReserva.setForeground(new java.awt.Color(255, 255, 255));
        btnEditReserva.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/iconoeditar.png"))); // NOI18N
        btnEditReserva.setText("BAJA/EDITAR");
        btnEditReserva.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditReservaActionPerformed(evt);
            }
        });
        jPanel1.add(btnEditReserva, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 810, 200, 50));

        btnNvaHabit.setBackground(new java.awt.Color(0, 0, 0));
        btnNvaHabit.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btnNvaHabit.setForeground(new java.awt.Color(255, 255, 255));
        btnNvaHabit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/iconoagregar.png"))); // NOI18N
        btnNvaHabit.setText("    ALTAS  ");
        btnNvaHabit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNvaHabitActionPerformed(evt);
            }
        });
        jPanel1.add(btnNvaHabit, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 760, 200, 50));

        btnEditHabit.setBackground(new java.awt.Color(0, 0, 0));
        btnEditHabit.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnEditHabit.setForeground(new java.awt.Color(255, 255, 255));
        btnEditHabit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/iconoeditar.png"))); // NOI18N
        btnEditHabit.setText("BAJA/EDITAR");
        btnEditHabit.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentHidden(java.awt.event.ComponentEvent evt) {
                btnEditHabitComponentHidden(evt);
            }
        });
        btnEditHabit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditHabitActionPerformed(evt);
            }
        });
        jPanel1.add(btnEditHabit, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 810, 200, 50));

        jButton9.setBackground(new java.awt.Color(0, 0, 0));
        jButton9.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jButton9.setForeground(new java.awt.Color(255, 255, 255));
        jButton9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/iconoagregar.png"))); // NOI18N
        jButton9.setText("RESERVAS");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton9, new org.netbeans.lib.awtextra.AbsoluteConstraints(1090, 810, 210, 50));

        btnAltaHuesp.setBackground(new java.awt.Color(0, 0, 0));
        btnAltaHuesp.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btnAltaHuesp.setForeground(new java.awt.Color(255, 255, 255));
        btnAltaHuesp.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/iconoagregar.png"))); // NOI18N
        btnAltaHuesp.setText("ALTAS");
        btnAltaHuesp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAltaHuespActionPerformed(evt);
            }
        });
        jPanel1.add(btnAltaHuesp, new org.netbeans.lib.awtextra.AbsoluteConstraints(1640, 760, 200, 50));

        btnEditHuesp.setBackground(new java.awt.Color(0, 0, 0));
        btnEditHuesp.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnEditHuesp.setForeground(new java.awt.Color(255, 255, 255));
        btnEditHuesp.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/iconoeditar.png"))); // NOI18N
        btnEditHuesp.setText("BAJA/EDITAR");
        btnEditHuesp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditHuespActionPerformed(evt);
            }
        });
        jPanel1.add(btnEditHuesp, new org.netbeans.lib.awtextra.AbsoluteConstraints(1640, 810, 200, 50));

        jporHabitación.setBackground(new java.awt.Color(0, 0, 0));
        jporHabitación.setForeground(new java.awt.Color(255, 255, 255));
        jporHabitación.setText("POR HABITACIÓN");
        jporHabitación.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jporHabitaciónActionPerformed(evt);
            }
        });
        jPanel1.add(jporHabitación, new org.netbeans.lib.awtextra.AbsoluteConstraints(1090, 690, 210, -1));

        jporhuesped.setBackground(new java.awt.Color(0, 0, 0));
        jporhuesped.setForeground(new java.awt.Color(255, 255, 255));
        jporhuesped.setText("POR HUESPED");
        jporhuesped.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jporhuespedActionPerformed(evt);
            }
        });
        jPanel1.add(jporhuesped, new org.netbeans.lib.awtextra.AbsoluteConstraints(1090, 720, 210, -1));

        jporfecha.setBackground(new java.awt.Color(0, 0, 0));
        jporfecha.setForeground(new java.awt.Color(255, 255, 255));
        jporfecha.setText("POR FECHA");
        jporfecha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jporfechaActionPerformed(evt);
            }
        });
        jPanel1.add(jporfecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(1090, 750, 210, -1));

        jportipohabitación.setBackground(new java.awt.Color(0, 0, 0));
        jportipohabitación.setForeground(new java.awt.Color(255, 255, 255));
        jportipohabitación.setText("POR TIPO DE HABITACIÓN");
        jportipohabitación.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jportipohabitaciónActionPerformed(evt);
            }
        });
        jPanel1.add(jportipohabitación, new org.netbeans.lib.awtextra.AbsoluteConstraints(1090, 780, 210, -1));

        jaltasresev.setBackground(new java.awt.Color(0, 0, 0));
        jaltasresev.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jaltasresev.setForeground(new java.awt.Color(255, 255, 255));
        jaltasresev.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/iconoagregar.png"))); // NOI18N
        jaltasresev.setText("ALTAS");
        jaltasresev.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jaltasresevMouseClicked(evt);
            }
        });
        jaltasresev.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jaltasresevActionPerformed(evt);
            }
        });
        jPanel1.add(jaltasresev, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 762, 200, 50));

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

        menuReserva.setText("Reserva");

        imNvaReserva.setText("Altas");
        imNvaReserva.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                imNvaReservaActionPerformed(evt);
            }
        });
        menuReserva.add(imNvaReserva);

        imEditReserva.setText("Bajas/Editar");
        imEditReserva.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                imEditReservaActionPerformed(evt);
            }
        });
        menuReserva.add(imEditReserva);

        jMenuBar1.add(menuReserva);

        menuHabitac.setText("Habitaciones");

        imAltaTipoHab.setText("Alta Tipo de Habitacion");
        imAltaTipoHab.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                imAltaTipoHabActionPerformed(evt);
            }
        });
        menuHabitac.add(imAltaTipoHab);

        miBajaEditTipoHab.setText("Baja/Modificacion Tipo de Habitación");
        miBajaEditTipoHab.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miBajaEditTipoHabActionPerformed(evt);
            }
        });
        menuHabitac.add(miBajaEditTipoHab);
        menuHabitac.add(jSeparator1);

        miAltaHabit.setText("Altas De Habitación");
        miAltaHabit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miAltaHabitActionPerformed(evt);
            }
        });
        menuHabitac.add(miAltaHabit);

        miBajaEditHab.setText("Bajas/Modificacion De Habitación");
        miBajaEditHab.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miBajaEditHabActionPerformed(evt);
            }
        });
        menuHabitac.add(miBajaEditHab);

        jMenuBar1.add(menuHabitac);

        menuConsultas.setText("Consultas");

        jMResPorHab.setText("Reservas por Habitación");
        jMResPorHab.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMResPorHabActionPerformed(evt);
            }
        });
        menuConsultas.add(jMResPorHab);

        jMResPorHuesp.setText("Reservas por Huésped");
        jMResPorHuesp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMResPorHuespActionPerformed(evt);
            }
        });
        menuConsultas.add(jMResPorHuesp);

        jMResEntreFechas.setText("Reservas entre Fechas");
        jMResEntreFechas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMResEntreFechasActionPerformed(evt);
            }
        });
        menuConsultas.add(jMResEntreFechas);

        jMHabitPorTipo.setText("Habitaciones por Tipo Habitación");
        jMHabitPorTipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMHabitPorTipoActionPerformed(evt);
            }
        });
        menuConsultas.add(jMHabitPorTipo);

        jMenuBar1.add(menuConsultas);

        menuHuesp.setText("Huespedes");

        jMenuItem2.setText("Altas");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        menuHuesp.add(jMenuItem2);

        jMenuItem3.setText("Bajas/Editar");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        menuHuesp.add(jMenuItem3);

        jMenuBar1.add(menuHuesp);

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

    private void btnBigReservaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBigReservaActionPerformed
        // jescritorio.removeAll();
        // jescritorio.repaint();
        jaltasresev.setVisible(true);
        btnEditReserva.setVisible(true);

        // formReserva reserva = new formReserva();
        // reserva.setVisible(true);
        //jescritorio.add(reserva);
        //jescritorio.moveToFront(reserva);
    }//GEN-LAST:event_btnBigReservaActionPerformed

    private void btnBigHuespActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBigHuespActionPerformed

        btnAltaHuesp.setVisible(true);
        btnEditHuesp.setVisible(true);
        //movi este formulario al jbutton11actionperformed
        //formAltasReserva altasHues = new formAltasReserva();
        //altasHues.setVisible(true);
        //colocar color de fondo al formulario
        //altasHues.getContentPane().setBackground(new Color(251, 128, 82));
        //jescritorio.add(altasHues);
        //jescritorio.moveToFront(altasHues);
    }//GEN-LAST:event_btnBigHuespActionPerformed
// estos eventos los uso para cambiar de color los botones al pasar por encima de ellos
//jbutton 1 pertenece al reserva
    private void btnBigReservaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBigReservaMouseEntered
        btnBigReserva.setBackground(Color.WHITE); // Cambia el fondo a rojo al pasar el cursor
        btnBigReserva.setForeground(Color.BLACK); // Cambia el color del texto a blanco
        btnBigReserva.setSize(new Dimension(190, 60)); // Cambia el tamaño al 80% del tamaño original
    }//GEN-LAST:event_btnBigReservaMouseEntered

    private void btnBigReservaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBigReservaMouseExited
        btnBigReserva.setBackground(Color.BLACK);
        btnBigReserva.setForeground(Color.WHITE);
        btnBigReserva.setSize(new Dimension(200, 70)); // Restaura el tamaño original

    }//GEN-LAST:event_btnBigReservaMouseExited
//el jbutton 4 pertenece a consulta
    private void btnBigConsultMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBigConsultMouseEntered
        btnBigConsult.setBackground(Color.WHITE); // Cambia el fondo a rojo al pasar el cursor
        btnBigConsult.setForeground(Color.BLACK); // Cambia el color del texto a blanco
        btnBigConsult.setSize(new Dimension(200, 60)); // Cambia el tamaño al 80% del tamaño original
    }//GEN-LAST:event_btnBigConsultMouseEntered

    private void btnBigConsultMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBigConsultMouseExited
        btnBigConsult.setBackground(Color.BLACK);
        btnBigConsult.setForeground(Color.WHITE);
        btnBigConsult.setSize(new Dimension(210, 70)); // Restaura el tamaño original
    }//GEN-LAST:event_btnBigConsultMouseExited
//el jbutton 2 pertenece a huesped
    private void btnBigHuespMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBigHuespMouseEntered
        btnBigHuesp.setBackground(Color.WHITE); // Cambia el fondo a rojo al pasar el cursor
        btnBigHuesp.setForeground(Color.BLACK); // Cambia el color del texto a blanco
        btnBigHuesp.setSize(new Dimension(190, 60)); // Cambia el tamaño al 80% del tamaño original
    }//GEN-LAST:event_btnBigHuespMouseEntered

    private void btnBigHuespMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBigHuespMouseExited
        btnBigHuesp.setBackground(Color.BLACK);
        btnBigHuesp.setForeground(Color.WHITE);
        btnBigHuesp.setSize(new Dimension(200, 70)); // Restaura el tamaño original

    }//GEN-LAST:event_btnBigHuespMouseExited

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

    private void imAltaTipoHabActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_imAltaTipoHabActionPerformed
        // TODO add your handling code here:
        formAltaTipoHabitacion fAltTipHab = new formAltaTipoHabitacion();
        fAltTipHab.setVisible(true);
        jescritorio.add(fAltTipHab);
        jescritorio.moveToFront(fAltTipHab);

    }//GEN-LAST:event_imAltaTipoHabActionPerformed

    private void miBajaEditTipoHabActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miBajaEditTipoHabActionPerformed
        // TODO add your handling code here:
        formBajayModificacionTipoHabitacion fBajayModiftTipHab = new formBajayModificacionTipoHabitacion();
        fBajayModiftTipHab.setVisible(true);
        jescritorio.add(fBajayModiftTipHab);
        jescritorio.moveToFront(fBajayModiftTipHab);

    }//GEN-LAST:event_miBajaEditTipoHabActionPerformed

    private void btnEditReservaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditReservaActionPerformed
        btnEditReserva.setVisible(false);
        formBajasyModificacionReserva modifReserva = new formBajasyModificacionReserva();
        modifReserva.setVisible(true);
        jescritorio.add(modifReserva);
        jescritorio.moveToFront(modifReserva);


    }//GEN-LAST:event_btnEditReservaActionPerformed

    private void btnNvaHabitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNvaHabitActionPerformed
        btnNvaHabit.setVisible(false);
        formAltasHabitacion fAltas = new formAltasHabitacion();
        fAltas.setVisible(true);
        jescritorio.add(fAltas);
        jescritorio.moveToFront(fAltas);

    }//GEN-LAST:event_btnNvaHabitActionPerformed

    private void btnEditHabitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditHabitActionPerformed
        btnEditHabit.setVisible(false);
        formBajasModificacionHabitacion fAltas = new formBajasModificacionHabitacion();
        fAltas.setVisible(true);
        jescritorio.add(fAltas);
        jescritorio.moveToFront(fAltas);
    }//GEN-LAST:event_btnEditHabitActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        jButton9.setVisible(false);
        jporHabitación.setVisible(true);
        jporfecha.setVisible(true);
        jporhuesped.setVisible(true);
        jportipohabitación.setVisible(true);
                
    }//GEN-LAST:event_jButton9ActionPerformed
// estos botones hay  que ordenarlo pertenecen arriba alos action de reserva habitacion consulta  y huesped
    private void btnBigConsultActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBigConsultActionPerformed
        jButton9.setVisible(true);

    }//GEN-LAST:event_btnBigConsultActionPerformed

    private void btnBigHabitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBigHabitActionPerformed
        btnNvaHabit.setVisible(true);
        btnEditHabit.setVisible(true);
    }//GEN-LAST:event_btnBigHabitActionPerformed

    private void btnAltaHuespActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAltaHuespActionPerformed

        btnAltaHuesp.setVisible(false);
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
    }//GEN-LAST:event_btnAltaHuespActionPerformed

    private void btnEditHuespActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditHuespActionPerformed
        btnEditHuesp.setVisible(false);
        formBajasyModificacionHuesped fBaMo = new formBajasyModificacionHuesped();
        fBaMo.setVisible(true);
        jescritorio.add(fBaMo);
        jescritorio.moveToFront(fBaMo);
    }//GEN-LAST:event_btnEditHuespActionPerformed

    private void imNvaReservaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_imNvaReservaActionPerformed
        // TODO add your handling code here:
        altasreserva nvaReserva = new altasreserva();
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


    private void btnEditHabitComponentHidden(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_btnEditHabitComponentHidden
        // TODO add your handling code here:
    }//GEN-LAST:event_btnEditHabitComponentHidden

    private void btnBigHabitMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBigHabitMouseExited
        btnBigHabit.setBackground(Color.BLACK);
        btnBigHabit.setForeground(Color.WHITE);
        btnBigHabit.setSize(new Dimension(200, 70)); // Restaura el tamaño original
    }//GEN-LAST:event_btnBigHabitMouseExited

//el jbutton 3 pertenece a habitaciones
    private void btnBigHabitMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBigHabitMouseEntered
        btnBigHabit.setBackground(Color.WHITE); // Cambia el fondo a rojo al pasar el cursor
        btnBigHabit.setForeground(Color.BLACK); // Cambia el color del texto a blanco
        btnBigHabit.setSize(new Dimension(190, 60)); // Cambia el tamaño al 80% del tamaño original
    }//GEN-LAST:event_btnBigHabitMouseEntered

    private void jMResEntreFechasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMResEntreFechasActionPerformed
        // TODO add your handling code here:
        formReservasEntreFechas fechas = new formReservasEntreFechas();
        fechas.setVisible(true);
        jescritorio.add(fechas);
        jescritorio.moveToFront(fechas);


    }//GEN-LAST:event_jMResEntreFechasActionPerformed

    private void imEditReservaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_imEditReservaActionPerformed
        formBajasyModificacionReserva fBajasyModificacionReserva = new formBajasyModificacionReserva();
        fBajasyModificacionReserva.setVisible(true);
        jescritorio.add(fBajasyModificacionReserva);
        jescritorio.moveToFront(fBajasyModificacionReserva);
    }//GEN-LAST:event_imEditReservaActionPerformed

    private void miBajaEditHabActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miBajaEditHabActionPerformed
        formBajasModificacionHabitacion forModificacionHabitacion = new formBajasModificacionHabitacion();
        forModificacionHabitacion.setVisible(true);
        jescritorio.add(forModificacionHabitacion);
        jescritorio.moveToFront(forModificacionHabitacion);
    }//GEN-LAST:event_miBajaEditHabActionPerformed

    private void miAltaHabitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miAltaHabitActionPerformed
        formAltasHabitacion fAltasHabitacion = new formAltasHabitacion();
        fAltasHabitacion.setVisible(true);
        jescritorio.add(fAltasHabitacion);
        jescritorio.moveToFront(fAltasHabitacion);
    }//GEN-LAST:event_miAltaHabitActionPerformed

    private void jporHabitaciónActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jporHabitaciónActionPerformed
        formReservasPorHabitacion fReservasPorHabitacion = new formReservasPorHabitacion();
        fReservasPorHabitacion.setVisible(true);
        jescritorio.add(fReservasPorHabitacion);
        jescritorio.moveToFront(fReservasPorHabitacion);
        jporHabitación.setVisible(false);
    }//GEN-LAST:event_jporHabitaciónActionPerformed

    private void jporhuespedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jporhuespedActionPerformed
        formReservasPorHuesped fHuesped = new formReservasPorHuesped();
        fHuesped.setVisible(true);
        jescritorio.add(fHuesped);
        jescritorio.moveToFront(fHuesped);
        jporhuesped.setVisible(false);
    }//GEN-LAST:event_jporhuespedActionPerformed

    private void jporfechaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jporfechaActionPerformed
      formReservasEntreFechas fResEntreFech = new formReservasEntreFechas();
        fResEntreFech.setVisible(true);
        jescritorio.add(fResEntreFech);
        jescritorio.moveToFront(fResEntreFech);
        jporfecha.setVisible(false);
    }//GEN-LAST:event_jporfechaActionPerformed

    private void jportipohabitaciónActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jportipohabitaciónActionPerformed
        formHabitacionesPorTipo fHabitacionesPorTipo = new formHabitacionesPorTipo();
        fHabitacionesPorTipo.setVisible(true);
        jescritorio.add(fHabitacionesPorTipo);
        jescritorio.moveToFront(fHabitacionesPorTipo);
        jportipohabitación.setVisible(false);
    }//GEN-LAST:event_jportipohabitaciónActionPerformed

    private void jaltasresevMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jaltasresevMouseClicked
        jaltasresev.setVisible(false);
        altasreserva fAltasReserva = new altasreserva();
        fAltasReserva.setVisible(true);
        jescritorio.add(fAltasReserva);
        jescritorio.moveToFront(fAltasReserva);
        
    }//GEN-LAST:event_jaltasresevMouseClicked

    private void jaltasresevActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jaltasresevActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jaltasresevActionPerformed

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
    private javax.swing.JButton btnAltaHuesp;
    private javax.swing.JButton btnBigConsult;
    private javax.swing.JButton btnBigHabit;
    private javax.swing.JButton btnBigHuesp;
    private javax.swing.JButton btnBigReserva;
    private javax.swing.JButton btnEditHabit;
    private javax.swing.JButton btnEditHuesp;
    private javax.swing.JButton btnEditReserva;
    private javax.swing.JButton btnNvaHabit;
    private javax.swing.JMenuItem imAltaTipoHab;
    private javax.swing.JMenuItem imEditReserva;
    private javax.swing.JMenuItem imNvaReserva;
    private javax.swing.JButton jButton9;
    private javax.swing.JMenuItem jMHabitPorTipo;
    private javax.swing.JMenuItem jMResEntreFechas;
    private javax.swing.JMenuItem jMResPorHab;
    private javax.swing.JMenuItem jMResPorHuesp;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JButton jaltasresev;
    private javax.swing.JDesktopPane jescritorio;
    private javax.swing.JButton jporHabitación;
    private javax.swing.JButton jporfecha;
    private javax.swing.JButton jporhuesped;
    private javax.swing.JButton jportipohabitación;
    private javax.swing.JMenu menuConsultas;
    private javax.swing.JMenu menuHabitac;
    private javax.swing.JMenu menuHuesp;
    private javax.swing.JMenu menuReserva;
    private javax.swing.JMenuItem miAltaHabit;
    private javax.swing.JMenuItem miBajaEditHab;
    private javax.swing.JMenuItem miBajaEditTipoHab;
    // End of variables declaration//GEN-END:variables
}
