/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author HP
 */

public class VistaPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form Inicio
     */
    
    public VistaPrincipal() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PnInicio = new javax.swing.JPanel();
        BtnAlum = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        BtnProf = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        BtnAdm = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        LblTitulo = new javax.swing.JLabel();
        jbsalir = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        PnInicio.setBackground(new java.awt.Color(255, 255, 255));

        BtnAlum.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/imagenes/User(2).png"))); // NOI18N
        BtnAlum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnAlumActionPerformed(evt);
            }
        });

        jLabel1.setText("ADMINISTRADOR");

        BtnProf.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/imagenes/User(2).png"))); // NOI18N
        BtnProf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnProfActionPerformed(evt);
            }
        });

        jLabel3.setText("PROFESOR");

        BtnAdm.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/imagenes/User(2).png"))); // NOI18N
        BtnAdm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnAdmActionPerformed(evt);
            }
        });

        jLabel4.setText("ALUMNO");

        LblTitulo.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        LblTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LblTitulo.setText("DOLPHIN ACADEMY SYSTEM");

        jbsalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/imagenes/OS » Mac OS X.png"))); // NOI18N
        jbsalir.setToolTipText("Salir");

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/imagenes/Logo(1).png"))); // NOI18N

        javax.swing.GroupLayout PnInicioLayout = new javax.swing.GroupLayout(PnInicio);
        PnInicio.setLayout(PnInicioLayout);
        PnInicioLayout.setHorizontalGroup(
            PnInicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PnInicioLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 425, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(PnInicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PnInicioLayout.createSequentialGroup()
                        .addComponent(BtnAdm)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel1))
                    .addGroup(PnInicioLayout.createSequentialGroup()
                        .addGroup(PnInicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(BtnAlum)
                            .addComponent(BtnProf))
                        .addGap(27, 27, 27)
                        .addGroup(PnInicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4))))
                .addContainerGap(67, Short.MAX_VALUE))
            .addGroup(PnInicioLayout.createSequentialGroup()
                .addGap(189, 189, 189)
                .addComponent(LblTitulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jbsalir, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30))
        );
        PnInicioLayout.setVerticalGroup(
            PnInicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PnInicioLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PnInicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LblTitulo)
                    .addComponent(jbsalir))
                .addGroup(PnInicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PnInicioLayout.createSequentialGroup()
                        .addGroup(PnInicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(PnInicioLayout.createSequentialGroup()
                                .addGap(35, 35, 35)
                                .addComponent(BtnAdm))
                            .addGroup(PnInicioLayout.createSequentialGroup()
                                .addGap(72, 72, 72)
                                .addComponent(jLabel1)))
                        .addGroup(PnInicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(PnInicioLayout.createSequentialGroup()
                                .addGap(32, 32, 32)
                                .addComponent(BtnAlum))
                            .addGroup(PnInicioLayout.createSequentialGroup()
                                .addGap(60, 60, 60)
                                .addComponent(jLabel4)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                        .addGroup(PnInicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(PnInicioLayout.createSequentialGroup()
                                .addGap(14, 14, 14)
                                .addComponent(BtnProf)
                                .addContainerGap(36, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PnInicioLayout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(81, 81, 81))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PnInicioLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                        .addComponent(jLabel2)
                        .addGap(23, 23, 23))))
        );

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("BIENVENIDO AL SISTEMA, INICIE SESION EN UNA DE LAS 3 CUENTAS");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(PnInicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(PnInicio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtnProfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnProfActionPerformed
       
    }//GEN-LAST:event_BtnProfActionPerformed

    private void BtnAlumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnAlumActionPerformed
        
    }//GEN-LAST:event_BtnAlumActionPerformed

    private void BtnAdmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnAdmActionPerformed
       
    }//GEN-LAST:event_BtnAdmActionPerformed

    //GETTERS Y SETTERS
    public JButton getBtnAdm() {
        return BtnAdm;
    }
    public void setBtnAdm(JButton BtnAdm) {
        this.BtnAdm = BtnAdm;
    }
    public JButton getBtnAlum() {
        return BtnAlum;
    }
    public void setBtnAlum(JButton BtnAlum) {
        this.BtnAlum = BtnAlum;
    }
    public JButton getBtnProf() {
        return BtnProf;
    }
    public void setBtnProf(JButton BtnProf) {
        this.BtnProf = BtnProf;
    }

    public JLabel getLblTitulo() {
        return LblTitulo;
    }

    public void setLblTitulo(JLabel LblTitulo) {
        this.LblTitulo = LblTitulo;
    }

    public JPanel getPnInicio() {
        return PnInicio;
    }

    public void setPnInicio(JPanel PnInicio) {
        this.PnInicio = PnInicio;
    }

    public JButton getJbsalir() {
        return jbsalir;
    }

    public void setJbsalir(JButton jbsalir) {
        this.jbsalir = jbsalir;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnAdm;
    private javax.swing.JButton BtnAlum;
    private javax.swing.JButton BtnProf;
    private javax.swing.JLabel LblTitulo;
    private javax.swing.JPanel PnInicio;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JButton jbsalir;
    // End of variables declaration//GEN-END:variables
}
