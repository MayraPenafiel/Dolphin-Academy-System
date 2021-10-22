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
import javax.swing.JPanel;
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
        jbregresar = new javax.swing.JButton();
        BtnAddAsisJF = new javax.swing.JButton();
        BtnEditAsisJF = new javax.swing.JButton();
        BtnActAsisJF = new javax.swing.JButton();
        BtnCrearDelJF = new javax.swing.JButton();
        BtnPrintAsisJF = new javax.swing.JButton();

        PNOA1.setBackground(new java.awt.Color(204, 255, 255));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/imagenes/LogoCab.png"))); // NOI18N

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

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        PNOA.setBackground(new java.awt.Color(204, 255, 255));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/imagenes/LogoCab.png"))); // NOI18N

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Asistencia");

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
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Alumno", "Fecha Asistencia", "Asistencia", "Avanze"
            }
        ));
        jScrollPane1.setViewportView(TbDetalleR);

        jLabel3.setText("BUSCAR");

        jbregresar.setBackground(new java.awt.Color(204, 255, 204));
        jbregresar.setForeground(new java.awt.Color(204, 255, 255));
        jbregresar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/imagenes/icons8-izquierda-círculo-36.png"))); // NOI18N
        jbregresar.setToolTipText("Volver");

        BtnAddAsisJF.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        BtnAddAsisJF.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/imagenes/new-file_40454 (3).png"))); // NOI18N
        BtnAddAsisJF.setText("Añadir");

        BtnEditAsisJF.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        BtnEditAsisJF.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/imagenes/document-edit_icon-icons.com_52428 (1).png"))); // NOI18N
        BtnEditAsisJF.setText("Editar");

        BtnActAsisJF.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        BtnActAsisJF.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/imagenes/list_notes_930.png"))); // NOI18N
        BtnActAsisJF.setText("Actualizar");
        BtnActAsisJF.setToolTipText("Actualizar");

        BtnCrearDelJF.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        BtnCrearDelJF.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/imagenes/delete-file-icon.png"))); // NOI18N
        BtnCrearDelJF.setText("Eliminar");
        BtnCrearDelJF.setToolTipText("Actualizar");

        BtnPrintAsisJF.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        BtnPrintAsisJF.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/imagenes/printer_print_22133.png"))); // NOI18N
        BtnPrintAsisJF.setText("Imprimir");
        BtnPrintAsisJF.setToolTipText("Actualizar");

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
                        .addComponent(TxtBuscarDetR, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(BtnAddAsisJF)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(BtnEditAsisJF)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BtnActAsisJF)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BtnCrearDelJF)
                        .addGap(45, 45, 45)
                        .addComponent(BtnPrintAsisJF))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PNOALayout.createSequentialGroup()
                        .addGroup(PNOALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(PNOALayout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jbregresar, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(PNOALayout.createSequentialGroup()
                                .addGap(7, 7, 7)
                                .addComponent(jScrollPane1)))
                        .addGap(12, 12, 12)))
                .addContainerGap())
        );
        PNOALayout.setVerticalGroup(
            PNOALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PNOALayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(PNOALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PNOALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(TxtBuscarDetR, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel3))
                    .addGroup(PNOALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(BtnAddAsisJF)
                        .addComponent(BtnEditAsisJF)
                        .addComponent(BtnActAsisJF)
                        .addComponent(BtnCrearDelJF)
                        .addComponent(BtnPrintAsisJF)))
                .addGap(37, 37, 37)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jbregresar, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(25, Short.MAX_VALUE))
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

    //GETTER Y SETTERS
    
    public JButton getBtnActAsisJF() {
        return BtnActAsisJF;
    }

    public void setBtnActAsisJF(JButton BtnActAsisJF) {
        this.BtnActAsisJF = BtnActAsisJF;
    }

    public JButton getBtnAddAsisJF() {
        return BtnAddAsisJF;
    }

    public void setBtnAddAsisJF(JButton BtnAddAsisJF) {
        this.BtnAddAsisJF = BtnAddAsisJF;
    }

    public JButton getBtnCrearDelJF() {
        return BtnCrearDelJF;
    }

    public void setBtnCrearDelJF(JButton BtnCrearDelJF) {
        this.BtnCrearDelJF = BtnCrearDelJF;
    }

    public JButton getBtnCrearDetR() {
        return BtnCrearDetR;
    }

    public void setBtnCrearDetR(JButton BtnCrearDetR) {
        this.BtnCrearDetR = BtnCrearDetR;
    }

    public JButton getBtnEditAsisJF() {
        return BtnEditAsisJF;
    }

    public void setBtnEditAsisJF(JButton BtnEditAsisJF) {
        this.BtnEditAsisJF = BtnEditAsisJF;
    }

    public JButton getBtnGuardarDetR() {
        return BtnGuardarDetR;
    }

    public void setBtnGuardarDetR(JButton BtnGuardarDetR) {
        this.BtnGuardarDetR = BtnGuardarDetR;
    }

    public JButton getBtnPrintAsisJF() {
        return BtnPrintAsisJF;
    }

    public void setBtnPrintAsisJF(JButton BtnPrintAsisJF) {
        this.BtnPrintAsisJF = BtnPrintAsisJF;
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

    public JPanel getPNOA() {
        return PNOA;
    }

    public void setPNOA(JPanel PNOA) {
        this.PNOA = PNOA;
    }

    public JPanel getPNOA1() {
        return PNOA1;
    }

    public void setPNOA1(JPanel PNOA1) {
        this.PNOA1 = PNOA1;
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

    public JButton getJbregresar() {
        return jbregresar;
    }

    public void setJbregresar(JButton jbregresar) {
        this.jbregresar = jbregresar;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnActAsisJF;
    private javax.swing.JButton BtnAddAsisJF;
    private javax.swing.JButton BtnCrearDelJF;
    private javax.swing.JButton BtnCrearDetR;
    private javax.swing.JButton BtnEditAsisJF;
    private javax.swing.JButton BtnGuardarDetR;
    private javax.swing.JButton BtnPrintAsisJF;
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
    private javax.swing.JButton jbregresar;
    // End of variables declaration//GEN-END:variables
}
