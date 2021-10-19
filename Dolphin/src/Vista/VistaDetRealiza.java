/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import com.toedter.calendar.JDateChooser;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JTable;
import javax.swing.JTextField;

/**
 *
 * @author HP
 */
public class VistaDetRealiza extends javax.swing.JInternalFrame {

    /**
     * Creates new form VistaDetRealiza
     */
    
    public VistaDetRealiza() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        DgDetalleRealiza = new javax.swing.JDialog();
        PNOA1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        TxtCodDetR = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        TxtAsisDetR = new javax.swing.JTextField();
        BtnCrearDetR = new javax.swing.JButton();
        BtnGuardarDetR = new javax.swing.JButton();
        CbxERenDetR = new javax.swing.JComboBox<>();
        DCFechaAsis = new com.toedter.calendar.JDateChooser();
        jLabel13 = new javax.swing.JLabel();
        TxtAvanzeDetR = new javax.swing.JTextField();
        PNOA = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TbDetalleR = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        TxtBuscarDetR = new javax.swing.JTextField();
        BtnCrearJDetR = new javax.swing.JButton();
        BtnEditarJFDetR = new javax.swing.JButton();
        BtnListarJFDetR = new javax.swing.JButton();
        BtnEliminarJFDetR = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();

        PNOA1.setBackground(new java.awt.Color(204, 255, 255));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/iconos/LogoCab.png"))); // NOI18N

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Detalle-Realiza");

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
        jLabel10.setText("Fecha-Asistencia");

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel11.setText("Encabezado:");

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel12.setText("Asistencia:");

        BtnCrearDetR.setText("Crear");

        BtnGuardarDetR.setText("Guardar");

        CbxERenDetR.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel13.setText("Avanze:");

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
                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel13, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(PNOA1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(PNOA1Layout.createSequentialGroup()
                                .addGroup(PNOA1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PNOA1Layout.createSequentialGroup()
                                        .addComponent(DCFechaAsis, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(PNOA1Layout.createSequentialGroup()
                                        .addComponent(TxtCodDetR, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(PNOA1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(TxtAsisDetR, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE)
                                    .addComponent(CbxERenDetR, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(PNOA1Layout.createSequentialGroup()
                                .addGroup(PNOA1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(BtnCrearDetR)
                                    .addComponent(TxtAvanzeDetR, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addComponent(BtnGuardarDetR)))
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
                    .addComponent(TxtCodDetR, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11)
                    .addComponent(CbxERenDetR, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(PNOA1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(PNOA1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel12)
                        .addComponent(TxtAsisDetR, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel10))
                    .addComponent(DCFechaAsis, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(PNOA1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(TxtAvanzeDetR, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(PNOA1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BtnCrearDetR)
                    .addComponent(BtnGuardarDetR))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout DgDetalleRealizaLayout = new javax.swing.GroupLayout(DgDetalleRealiza.getContentPane());
        DgDetalleRealiza.getContentPane().setLayout(DgDetalleRealizaLayout);
        DgDetalleRealizaLayout.setHorizontalGroup(
            DgDetalleRealizaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PNOA1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        DgDetalleRealizaLayout.setVerticalGroup(
            DgDetalleRealizaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PNOA1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        PNOA.setBackground(new java.awt.Color(204, 255, 255));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/iconos/LogoCab.png"))); // NOI18N

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Detalle-Realiza");

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

        TbDetalleR.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "ID", "Encabezado", "Fecha Asistencia", "Asistencia", "Avanze"
            }
        ));
        jScrollPane1.setViewportView(TbDetalleR);

        jLabel3.setText("BUSCAR");

        BtnCrearJDetR.setText("Crear");

        BtnEditarJFDetR.setText("Editar");

        BtnListarJFDetR.setText("Listar");

        BtnEliminarJFDetR.setText("Eliminar");
        BtnEliminarJFDetR.setMaximumSize(new java.awt.Dimension(59, 23));
        BtnEliminarJFDetR.setMinimumSize(new java.awt.Dimension(59, 23));

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/iconos/icons8-izquierda-círculo-36.png"))); // NOI18N
        jButton3.setActionCommand("");
        jButton3.setBorder(null);
        jButton3.setBorderPainted(false);
        jButton3.setContentAreaFilled(false);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
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
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PNOALayout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(TxtBuscarDetR, javax.swing.GroupLayout.DEFAULT_SIZE, 175, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(BtnCrearJDetR, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BtnEditarJFDetR, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(BtnListarJFDetR)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(BtnEliminarJFDetR, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(89, 89, 89))
                    .addGroup(PNOALayout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 590, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PNOALayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButton3)
                        .addGap(12, 12, 12)))
                .addContainerGap())
        );
        PNOALayout.setVerticalGroup(
            PNOALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PNOALayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(PNOALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BtnEditarJFDetR)
                    .addComponent(BtnCrearJDetR)
                    .addComponent(TxtBuscarDetR, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(BtnListarJFDetR)
                    .addComponent(BtnEliminarJFDetR, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton3)
                .addContainerGap(21, Short.MAX_VALUE))
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

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_jButton3ActionPerformed

    //GETTER Y SETTERS
    public JButton getBtnCrearDetR() {
        return BtnCrearDetR;
    }

    public void setBtnCrearDetR(JButton BtnCrearDetR) {
        this.BtnCrearDetR = BtnCrearDetR;
    }

    public JButton getBtnCrearJDetR() {
        return BtnCrearJDetR;
    }

    public void setBtnCrearJDetR(JButton BtnCrearJDetR) {
        this.BtnCrearJDetR = BtnCrearJDetR;
    }

    public JButton getBtnEditarJFDetR() {
        return BtnEditarJFDetR;
    }

    public void setBtnEditarJFDetR(JButton BtnEditarJFDetR) {
        this.BtnEditarJFDetR = BtnEditarJFDetR;
    }

    public JButton getBtnEliminarJFDetR() {
        return BtnEliminarJFDetR;
    }

    public void setBtnEliminarJFDetR(JButton BtnEliminarJFDetR) {
        this.BtnEliminarJFDetR = BtnEliminarJFDetR;
    }

    public JButton getBtnGuardarDetR() {
        return BtnGuardarDetR;
    }

    public void setBtnGuardarDetR(JButton BtnGuardarDetR) {
        this.BtnGuardarDetR = BtnGuardarDetR;
    }

    public JButton getBtnListarJFDetR() {
        return BtnListarJFDetR;
    }

    public void setBtnListarJFDetR(JButton BtnListarJFDetR) {
        this.BtnListarJFDetR = BtnListarJFDetR;
    }

    public JComboBox<String> getCbxERenDetR() {
        return CbxERenDetR;
    }

    public void setCbxERenDetR(JComboBox<String> CbxERenDetR) {
        this.CbxERenDetR = CbxERenDetR;
    }

    public JDateChooser getDCFechaAsis() {
        return DCFechaAsis;
    }

    public void setDCFechaAsis(JDateChooser DCFechaAsis) {
        this.DCFechaAsis = DCFechaAsis;
    }

    public JDialog getDgDetalleRealiza() {
        return DgDetalleRealiza;
    }

    public void setDgDetalleRealiza(JDialog DgDetalleRealiza) {
        this.DgDetalleRealiza = DgDetalleRealiza;
    }

    public JTable getTbDetalleR() {
        return TbDetalleR;
    }

    public void setTbDetalleR(JTable TbDetalleR) {
        this.TbDetalleR = TbDetalleR;
    }

    public JTextField getTxtAsisDetR() {
        return TxtAsisDetR;
    }

    public void setTxtAsisDetR(JTextField TxtAsisDetR) {
        this.TxtAsisDetR = TxtAsisDetR;
    }

    public JTextField getTxtAvanzeDetR() {
        return TxtAvanzeDetR;
    }

    public void setTxtAvanzeDetR(JTextField TxtAvanzeDetR) {
        this.TxtAvanzeDetR = TxtAvanzeDetR;
    }

    public JTextField getTxtBuscarDetR() {
        return TxtBuscarDetR;
    }

    public void setTxtBuscarDetR(JTextField TxtBuscarDetR) {
        this.TxtBuscarDetR = TxtBuscarDetR;
    }

    public JTextField getTxtCodDetR() {
        return TxtCodDetR;
    }

    public void setTxtCodDetR(JTextField TxtCodDetR) {
        this.TxtCodDetR = TxtCodDetR;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnCrearDetR;
    private javax.swing.JButton BtnCrearJDetR;
    private javax.swing.JButton BtnEditarJFDetR;
    private javax.swing.JButton BtnEliminarJFDetR;
    private javax.swing.JButton BtnGuardarDetR;
    private javax.swing.JButton BtnListarJFDetR;
    private javax.swing.JComboBox<String> CbxERenDetR;
    private com.toedter.calendar.JDateChooser DCFechaAsis;
    private javax.swing.JDialog DgDetalleRealiza;
    private javax.swing.JPanel PNOA;
    private javax.swing.JPanel PNOA1;
    private javax.swing.JTable TbDetalleR;
    private javax.swing.JTextField TxtAsisDetR;
    private javax.swing.JTextField TxtAvanzeDetR;
    private javax.swing.JTextField TxtBuscarDetR;
    private javax.swing.JTextField TxtCodDetR;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
