/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JTable;
import javax.swing.JTextField;

/**
 *
 * @author HP
 */

public class VistaOfertaAc extends javax.swing.JInternalFrame {

    /**
     * Creates new form VistaOfertaAc
     */
    
    public VistaOfertaAc() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        DgOfertaAcd = new javax.swing.JDialog();
        PNOA1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        TxtCodOA1 = new javax.swing.JTextField();
        TxtDiscOA1 = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        TxtCapOA1 = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        TxtNombreOA1 = new javax.swing.JTextField();
        BtnCrearOA = new javax.swing.JButton();
        BtnGuardarOA = new javax.swing.JButton();
        DgElimOfertaAcd = new javax.swing.JDialog();
        lbtitutolo1 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        txteliminarcod_OA = new javax.swing.JTextField();
        btnconfirmareliminar_OA = new javax.swing.JButton();
        btncancelareliminar_OA = new javax.swing.JButton();
        PNOA = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TbOA = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        TxtBuscarOA = new javax.swing.JTextField();
        BtnCrearJFOA = new javax.swing.JButton();
        BtnEditarJFOA = new javax.swing.JButton();
        BtnListarJFOA = new javax.swing.JButton();
        BtnEliminarJFOA = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        PNOA1.setBackground(new java.awt.Color(204, 255, 255));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/iconos/LogoCab.png"))); // NOI18N

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Oferta Academica");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel4)
            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel7.setText("Codigo:");

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel10.setText("Capacidad:");

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel11.setText("Disciplina:");

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel12.setText("Nombre:");

        BtnCrearOA.setText("Crear");

        BtnGuardarOA.setText("Guardar");

        javax.swing.GroupLayout PNOA1Layout = new javax.swing.GroupLayout(PNOA1);
        PNOA1.setLayout(PNOA1Layout);
        PNOA1Layout.setHorizontalGroup(
            PNOA1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PNOA1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PNOA1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(PNOA1Layout.createSequentialGroup()
                        .addGroup(PNOA1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(PNOA1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(PNOA1Layout.createSequentialGroup()
                                .addComponent(TxtCodOA1, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(PNOA1Layout.createSequentialGroup()
                                .addGroup(PNOA1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(BtnCrearOA)
                                    .addComponent(TxtCapOA1, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(PNOA1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(BtnGuardarOA))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(PNOA1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(TxtDiscOA1, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TxtNombreOA1, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        PNOA1Layout.setVerticalGroup(
            PNOA1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PNOA1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(PNOA1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(TxtCodOA1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11)
                    .addComponent(TxtDiscOA1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(PNOA1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(TxtNombreOA1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10)
                    .addComponent(TxtCapOA1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(PNOA1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BtnCrearOA)
                    .addComponent(BtnGuardarOA))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout DgOfertaAcdLayout = new javax.swing.GroupLayout(DgOfertaAcd.getContentPane());
        DgOfertaAcd.getContentPane().setLayout(DgOfertaAcdLayout);
        DgOfertaAcdLayout.setHorizontalGroup(
            DgOfertaAcdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PNOA1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        DgOfertaAcdLayout.setVerticalGroup(
            DgOfertaAcdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PNOA1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        lbtitutolo1.setText("¿Seguro que desea Eliminar la sedeSeleccionada?");

        jLabel16.setText("ID:");

        txteliminarcod_OA.setEditable(false);
        txteliminarcod_OA.setBackground(new java.awt.Color(255, 255, 255));
        txteliminarcod_OA.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        btnconfirmareliminar_OA.setText("ACEPTAR");

        btncancelareliminar_OA.setText("CANCELAR");

        javax.swing.GroupLayout DgElimOfertaAcdLayout = new javax.swing.GroupLayout(DgElimOfertaAcd.getContentPane());
        DgElimOfertaAcd.getContentPane().setLayout(DgElimOfertaAcdLayout);
        DgElimOfertaAcdLayout.setHorizontalGroup(
            DgElimOfertaAcdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
            .addGroup(DgElimOfertaAcdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(DgElimOfertaAcdLayout.createSequentialGroup()
                    .addGap(82, 82, 82)
                    .addGroup(DgElimOfertaAcdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(DgElimOfertaAcdLayout.createSequentialGroup()
                            .addComponent(btnconfirmareliminar_OA)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btncancelareliminar_OA))
                        .addComponent(lbtitutolo1)
                        .addGroup(DgElimOfertaAcdLayout.createSequentialGroup()
                            .addComponent(jLabel16)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txteliminarcod_OA, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addContainerGap(83, Short.MAX_VALUE)))
        );
        DgElimOfertaAcdLayout.setVerticalGroup(
            DgElimOfertaAcdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
            .addGroup(DgElimOfertaAcdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(DgElimOfertaAcdLayout.createSequentialGroup()
                    .addGap(60, 60, 60)
                    .addComponent(lbtitutolo1)
                    .addGap(18, 18, 18)
                    .addGroup(DgElimOfertaAcdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txteliminarcod_OA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel16))
                    .addGap(104, 104, 104)
                    .addGroup(DgElimOfertaAcdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnconfirmareliminar_OA)
                        .addComponent(btncancelareliminar_OA))
                    .addContainerGap(61, Short.MAX_VALUE)))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        PNOA.setBackground(new java.awt.Color(204, 255, 255));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/iconos/LogoCab.png"))); // NOI18N

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Oferta Academica");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1)
            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        TbOA.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "ID", "Sede", "Nombre", "Capacidad"
            }
        ));
        jScrollPane1.setViewportView(TbOA);

        jLabel3.setText("BUSCAR");

        BtnCrearJFOA.setText("Crear");

        BtnEditarJFOA.setText("Editar");

        BtnListarJFOA.setText("Listar");

        BtnEliminarJFOA.setText("Eliminar");
        BtnEliminarJFOA.setMaximumSize(new java.awt.Dimension(59, 23));
        BtnEliminarJFOA.setMinimumSize(new java.awt.Dimension(59, 23));

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/iconos/icons8-izquierda-círculo-36.png"))); // NOI18N
        jButton1.setBorder(null);
        jButton1.setBorderPainted(false);
        jButton1.setContentAreaFilled(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PNOALayout = new javax.swing.GroupLayout(PNOA);
        PNOA.setLayout(PNOALayout);
        PNOALayout.setHorizontalGroup(
            PNOALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PNOALayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PNOALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 549, Short.MAX_VALUE)
                    .addGroup(PNOALayout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(TxtBuscarOA)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(BtnCrearJFOA, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BtnEditarJFOA, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(BtnListarJFOA)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(BtnEliminarJFOA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(89, 89, 89)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PNOALayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(22, 22, 22))
        );
        PNOALayout.setVerticalGroup(
            PNOALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PNOALayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(PNOALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BtnEditarJFOA)
                    .addComponent(BtnCrearJFOA)
                    .addComponent(TxtBuscarOA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(BtnListarJFOA)
                    .addComponent(BtnEliminarJFOA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton1)
                .addContainerGap(18, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PNOA, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PNOA, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
  
    }//GEN-LAST:event_jButton1ActionPerformed

    //GETTERS Y SETTERS
    
    public JButton getBtnCrearJFOA() {
        return BtnCrearJFOA;
    }
    public void setBtnCrearJFOA(JButton BtnCrearJFOA) {
        this.BtnCrearJFOA = BtnCrearJFOA;
    }
    public JButton getBtnCrearOA() {
        return BtnCrearOA;
    }
    public void setBtnCrearOA(JButton BtnCrearOA) {
        this.BtnCrearOA = BtnCrearOA;
    }
    public JButton getBtnEditarJFOA() {
        return BtnEditarJFOA;
    }
    public void setBtnEditarJFOA(JButton BtnEditarJFOA) {
        this.BtnEditarJFOA = BtnEditarJFOA;
    }
    public JButton getBtnEliminarJFOA() {
        return BtnEliminarJFOA;
    }
    public void setBtnEliminarJFOA(JButton BtnEliminarJFOA) {
        this.BtnEliminarJFOA = BtnEliminarJFOA;
    }
    public JButton getBtnGuardarOA() {
        return BtnGuardarOA;
    }
    public void setBtnGuardarOA(JButton BtnGuardarOA) {
        this.BtnGuardarOA = BtnGuardarOA;
    }
    public JButton getBtnListarJFOA() {
        return BtnListarJFOA;
    }
    public void setBtnListarJFOA(JButton BtnListarJFOA) {
        this.BtnListarJFOA = BtnListarJFOA;
    }
    public JDialog getDgOfertaAcd() {
        return DgOfertaAcd;
    }
    public void setDgOfertaAcd(JDialog DgOfertaAcd) {
        this.DgOfertaAcd = DgOfertaAcd;
    }
    public JTable getTbOA() {
        return TbOA;
    }
    public void setTbOA(JTable TbOA) {
        this.TbOA = TbOA;
    }
    public JTextField getTxtBuscarOA() {
        return TxtBuscarOA;
    }
    public void setTxtBuscarOA(JTextField TxtBuscarOA) {
        this.TxtBuscarOA = TxtBuscarOA;
    }
    public JTextField getTxtCapOA1() {
        return TxtCapOA1;
    }
    public void setTxtCapOA1(JTextField TxtCapOA1) {
        this.TxtCapOA1 = TxtCapOA1;
    }
    public JTextField getTxtCodOA1() {
        return TxtCodOA1;
    }
    public void setTxtCodOA1(JTextField TxtCodOA1) {
        this.TxtCodOA1 = TxtCodOA1;
    }
    public JTextField getTxtDiscOA1() {
        return TxtDiscOA1;
    }
    public void setTxtDiscOA1(JTextField TxtDiscOA1) {
        this.TxtDiscOA1 = TxtDiscOA1;
    }
    public JTextField getTxtNombreOA1() {
        return TxtNombreOA1;
    }
    public void setTxtNombreOA1(JTextField TxtNombreOA1) {
        this.TxtNombreOA1 = TxtNombreOA1;
    }
    public JDialog getDgElimOfertaAcd() {
        return DgElimOfertaAcd;
    }
    public void setDgElimOfertaAcd(JDialog DgElimOfertaAcd) {
        this.DgElimOfertaAcd = DgElimOfertaAcd;
    }
    public JButton getBtncancelareliminar_OA() {
        return btncancelareliminar_OA;
    }
    public void setBtncancelareliminar_OA(JButton btncancelareliminar_OA) {
        this.btncancelareliminar_OA = btncancelareliminar_OA;
    }
    public JButton getBtnconfirmareliminar_OA() {
        return btnconfirmareliminar_OA;
    }
    public void setBtnconfirmareliminar_OA(JButton btnconfirmareliminar_OA) {
        this.btnconfirmareliminar_OA = btnconfirmareliminar_OA;
    }
    public JTextField getTxteliminarcod_OA() {
        return txteliminarcod_OA;
    }
    public void setTxteliminarcod_OA(JTextField txteliminarcod_OA) {
        this.txteliminarcod_OA = txteliminarcod_OA;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnCrearJFOA;
    private javax.swing.JButton BtnCrearOA;
    private javax.swing.JButton BtnEditarJFOA;
    private javax.swing.JButton BtnEliminarJFOA;
    private javax.swing.JButton BtnGuardarOA;
    private javax.swing.JButton BtnListarJFOA;
    private javax.swing.JDialog DgElimOfertaAcd;
    private javax.swing.JDialog DgOfertaAcd;
    private javax.swing.JPanel PNOA;
    private javax.swing.JPanel PNOA1;
    private javax.swing.JTable TbOA;
    private javax.swing.JTextField TxtBuscarOA;
    private javax.swing.JTextField TxtCapOA1;
    private javax.swing.JTextField TxtCodOA1;
    private javax.swing.JTextField TxtDiscOA1;
    private javax.swing.JTextField TxtNombreOA1;
    private javax.swing.JButton btncancelareliminar_OA;
    private javax.swing.JButton btnconfirmareliminar_OA;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbtitutolo1;
    private javax.swing.JTextField txteliminarcod_OA;
    // End of variables declaration//GEN-END:variables

}