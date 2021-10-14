/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

/**
 *
 * @author HP
 */
public class VistaInicioSesion extends javax.swing.JFrame {

    /**
     * Creates new form VistaInicioSesion
     */
    public VistaInicioSesion() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        PnInicioSesion = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        TxtNombreUser = new javax.swing.JTextField();
        BtnRegistrar = new javax.swing.JButton();
        BtnIngresar = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        pwfcontraseña = new javax.swing.JPasswordField();

        jLabel1.setText("jLabel1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        PnInicioSesion.setBackground(new java.awt.Color(0, 102, 102));

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Andalus", 1, 11)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("DOLPHIN ACADEMY SYSTEM");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("INICIO DE SESION");

        jLabel4.setFont(new java.awt.Font("Andalus", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel4.setText("NOMBRE DE USUARIO");

        jLabel5.setFont(new java.awt.Font("Andalus", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel5.setText("CONTRASEÑA");

        TxtNombreUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtNombreUserActionPerformed(evt);
            }
        });

        BtnRegistrar.setText("Cancelar");

        BtnIngresar.setText("Ingresar");

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/iconos/LogoCab.png"))); // NOI18N

        javax.swing.GroupLayout PnInicioSesionLayout = new javax.swing.GroupLayout(PnInicioSesion);
        PnInicioSesion.setLayout(PnInicioSesionLayout);
        PnInicioSesionLayout.setHorizontalGroup(
            PnInicioSesionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PnInicioSesionLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PnInicioSesionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PnInicioSesionLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(BtnIngresar)
                        .addGap(95, 95, 95)
                        .addComponent(BtnRegistrar)
                        .addGap(115, 115, 115))
                    .addGroup(PnInicioSesionLayout.createSequentialGroup()
                        .addGroup(PnInicioSesionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(PnInicioSesionLayout.createSequentialGroup()
                                .addGap(46, 46, 46)
                                .addComponent(jLabel6))
                            .addGroup(PnInicioSesionLayout.createSequentialGroup()
                                .addGap(11, 11, 11)
                                .addComponent(jLabel2)))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 263, Short.MAX_VALUE)
                        .addGap(48, 48, 48))))
            .addGroup(PnInicioSesionLayout.createSequentialGroup()
                .addGroup(PnInicioSesionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PnInicioSesionLayout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PnInicioSesionLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(PnInicioSesionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(TxtNombreUser, javax.swing.GroupLayout.DEFAULT_SIZE, 115, Short.MAX_VALUE)
                    .addComponent(pwfcontraseña))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        PnInicioSesionLayout.setVerticalGroup(
            PnInicioSesionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PnInicioSesionLayout.createSequentialGroup()
                .addGroup(PnInicioSesionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PnInicioSesionLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2))
                    .addGroup(PnInicioSesionLayout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addComponent(jLabel3)))
                .addGap(36, 36, 36)
                .addGroup(PnInicioSesionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(TxtNombreUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(PnInicioSesionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(pwfcontraseña, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addGroup(PnInicioSesionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BtnIngresar)
                    .addComponent(BtnRegistrar))
                .addGap(19, 19, 19))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PnInicioSesion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PnInicioSesion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TxtNombreUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtNombreUserActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtNombreUserActionPerformed


    // GETTER Y SETTERS
    public JButton getBtnIngresar() {
        return BtnIngresar;
    }
    public void setBtnIngresar(JButton BtnIngresar) {
        this.BtnIngresar = BtnIngresar;
    }
    public JButton getBtnRegistrar() {
        return BtnRegistrar;
    }
    public void setBtnRegistrar(JButton BtnRegistrar) {
        this.BtnRegistrar = BtnRegistrar;
    }
    public JPanel getPnInicioSesion() {
        return PnInicioSesion;
    }
    public void setPnInicioSesion(JPanel PnInicioSesion) {
        this.PnInicioSesion = PnInicioSesion;
    }
    public JPasswordField getPwfcontraseña() {
        return pwfcontraseña;
    }
    public void setPwfcontraseña(JPasswordField pwfcontraseña) {
        this.pwfcontraseña = pwfcontraseña;
    }
    public JTextField getTxtNombreUser() {
        return TxtNombreUser;
    }
    public void setTxtNombreUser(JTextField TxtNombreUser) {
        this.TxtNombreUser = TxtNombreUser;
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnIngresar;
    private javax.swing.JButton BtnRegistrar;
    private javax.swing.JPanel PnInicioSesion;
    private javax.swing.JTextField TxtNombreUser;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPasswordField pwfcontraseña;
    // End of variables declaration//GEN-END:variables
}
