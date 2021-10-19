/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import javax.swing.JButton;

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
        jLabel2 = new javax.swing.JLabel();
        BtnAlum = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        BtnProf = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        BtnAdm = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        LblTitulo = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        PnInicio.setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/iconos/Logo(1).png"))); // NOI18N

        BtnAlum.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/iconos/User(2).png"))); // NOI18N
        BtnAlum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnAlumActionPerformed(evt);
            }
        });

        jLabel1.setText("ADMINISTRADOR");

        BtnProf.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/iconos/User(2).png"))); // NOI18N
        BtnProf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnProfActionPerformed(evt);
            }
        });

        jLabel3.setText("PROFESOR");

        BtnAdm.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/iconos/User(2).png"))); // NOI18N
        BtnAdm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnAdmActionPerformed(evt);
            }
        });

        jLabel4.setText("ALUMNO");

        LblTitulo.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        LblTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LblTitulo.setText("DOLPHIN ACADEMY SYSTEM");

        javax.swing.GroupLayout PnInicioLayout = new javax.swing.GroupLayout(PnInicio);
        PnInicio.setLayout(PnInicioLayout);
        PnInicioLayout.setHorizontalGroup(
            PnInicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PnInicioLayout.createSequentialGroup()
                .addContainerGap(23, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 412, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(PnInicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PnInicioLayout.createSequentialGroup()
                        .addComponent(BtnProf)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel3))
                    .addGroup(PnInicioLayout.createSequentialGroup()
                        .addGroup(PnInicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(BtnAlum)
                            .addComponent(BtnAdm))
                        .addGap(18, 18, 18)
                        .addGroup(PnInicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel4))))
                .addGap(49, 49, 49))
            .addGroup(PnInicioLayout.createSequentialGroup()
                .addGap(189, 189, 189)
                .addComponent(LblTitulo)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        PnInicioLayout.setVerticalGroup(
            PnInicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PnInicioLayout.createSequentialGroup()
                .addGroup(PnInicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, PnInicioLayout.createSequentialGroup()
                        .addGap(69, 69, 69)
                        .addComponent(BtnAdm)
                        .addGap(18, 18, 18)
                        .addComponent(BtnAlum)
                        .addGap(18, 18, 18)
                        .addComponent(BtnProf))
                    .addGroup(PnInicioLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(LblTitulo)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 357, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, PnInicioLayout.createSequentialGroup()
                        .addGap(92, 92, 92)
                        .addComponent(jLabel1)
                        .addGap(93, 93, 93)
                        .addComponent(jLabel4)
                        .addGap(98, 98, 98)
                        .addComponent(jLabel3)))
                .addContainerGap(27, Short.MAX_VALUE))
        );

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("BIENVENIDO AL SISTEMA, INICIE SESION EN UNA DE LAS 3 CUENTAS");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PnInicio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
    // End of variables declaration//GEN-END:variables
}
