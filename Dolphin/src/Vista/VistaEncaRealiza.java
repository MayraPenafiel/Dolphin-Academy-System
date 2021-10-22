/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JTable;
import javax.swing.JTextField;

/**
 *
 * @author HP
 */

public class VistaEncaRealiza extends javax.swing.JInternalFrame {

    /**
     * Creates new form VistaEncaRealiza
     */
    
    public VistaEncaRealiza() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        DgEncR = new javax.swing.JDialog();
        PNOA1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        TxtCodDisc1 = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        BtnCrearEncR = new javax.swing.JButton();
        BtnGuardarEncR = new javax.swing.JButton();
        CbxEntEncR = new javax.swing.JComboBox<>();
        CbxAlumEncR = new javax.swing.JComboBox<>();
        PNOA = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TbDisciplina = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        TxtBuscarEncRealiza = new javax.swing.JTextField();
        BtnCrearJFER = new javax.swing.JButton();
        BtnEditarJFER = new javax.swing.JButton();
        BtnListarJFER = new javax.swing.JButton();
        BtnEliminarJFER = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        PNOA1.setBackground(new java.awt.Color(204, 255, 255));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/imagenes/LogoCab.png"))); // NOI18N

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Realiza");

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
        jLabel10.setText("Alumno:");

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel11.setText("Entrenamiento:");

        BtnCrearEncR.setText("Crear");

        BtnGuardarEncR.setText("Guardar");

        CbxEntEncR.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        CbxAlumEncR.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        javax.swing.GroupLayout PNOA1Layout = new javax.swing.GroupLayout(PNOA1);
        PNOA1.setLayout(PNOA1Layout);
        PNOA1Layout.setHorizontalGroup(
            PNOA1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PNOA1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PNOA1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(PNOA1Layout.createSequentialGroup()
                        .addGroup(PNOA1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, 116, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(PNOA1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(CbxAlumEncR, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(PNOA1Layout.createSequentialGroup()
                                .addGroup(PNOA1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(BtnCrearEncR)
                                    .addComponent(TxtCodDisc1, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(PNOA1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(PNOA1Layout.createSequentialGroup()
                                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(CbxEntEncR, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(BtnGuardarEncR))))
                        .addGap(0, 82, Short.MAX_VALUE)))
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
                    .addComponent(TxtCodDisc1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11)
                    .addComponent(CbxEntEncR, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(PNOA1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(CbxAlumEncR, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(PNOA1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BtnCrearEncR)
                    .addComponent(BtnGuardarEncR))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout DgEncRLayout = new javax.swing.GroupLayout(DgEncR.getContentPane());
        DgEncR.getContentPane().setLayout(DgEncRLayout);
        DgEncRLayout.setHorizontalGroup(
            DgEncRLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PNOA1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        DgEncRLayout.setVerticalGroup(
            DgEncRLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PNOA1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        PNOA.setBackground(new java.awt.Color(204, 255, 255));
        PNOA.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/imagenes/LogoCab.png"))); // NOI18N

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Realiza");

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

        PNOA.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 11, 546, -1));

        TbDisciplina.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "ID", "Entrenamiento", "Alumno"
            }
        ));
        jScrollPane1.setViewportView(TbDisciplina);

        PNOA.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 117, 556, 97));

        jLabel3.setText("BUSCAR");
        PNOA.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 69, -1, -1));
        PNOA.add(TxtBuscarEncRealiza, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 66, 123, -1));

        BtnCrearJFER.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        BtnCrearJFER.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/imagenes/new-file_40454 (3).png"))); // NOI18N
        BtnCrearJFER.setText("Crear");
        PNOA.add(BtnCrearJFER, new org.netbeans.lib.awtextra.AbsoluteConstraints(193, 65, -1, -1));

        BtnEditarJFER.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        BtnEditarJFER.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/imagenes/document-edit_icon-icons.com_52428 (1).png"))); // NOI18N
        BtnEditarJFER.setText("Editar");
        PNOA.add(BtnEditarJFER, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 70, -1, -1));

        BtnListarJFER.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        BtnListarJFER.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/imagenes/list_notes_930.png"))); // NOI18N
        BtnListarJFER.setText("Listar");
        PNOA.add(BtnListarJFER, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 70, -1, -1));

        BtnEliminarJFER.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        BtnEliminarJFER.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/imagenes/delete-file_40456 (1).png"))); // NOI18N
        BtnEliminarJFER.setText("Eliminar");
        BtnEliminarJFER.setMaximumSize(new java.awt.Dimension(59, 23));
        BtnEliminarJFER.setMinimumSize(new java.awt.Dimension(59, 23));
        PNOA.add(BtnEliminarJFER, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 70, -1, -1));

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/iconos/icons8-izquierda-círculo-36.png"))); // NOI18N
        jButton1.setBorder(null);
        jButton1.setBorderPainted(false);
        jButton1.setContentAreaFilled(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        PNOA.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 230, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PNOA, javax.swing.GroupLayout.DEFAULT_SIZE, 689, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PNOA, javax.swing.GroupLayout.DEFAULT_SIZE, 281, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       
    }//GEN-LAST:event_jButton1ActionPerformed

    //GETTER Y SETTER
    
    public JButton getBtnCrearEncR() {
        return BtnCrearEncR;
    }

    public void setBtnCrearEncR(JButton BtnCrearEncR) {
        this.BtnCrearEncR = BtnCrearEncR;
    }

    public JButton getBtnCrearJFER() {
        return BtnCrearJFER;
    }

    public void setBtnCrearJFER(JButton BtnCrearJFER) {
        this.BtnCrearJFER = BtnCrearJFER;
    }

    public JButton getBtnEditarJFER() {
        return BtnEditarJFER;
    }

    public void setBtnEditarJFER(JButton BtnEditarJFER) {
        this.BtnEditarJFER = BtnEditarJFER;
    }

    public JButton getBtnEliminarJFER() {
        return BtnEliminarJFER;
    }

    public void setBtnEliminarJFER(JButton BtnEliminarJFER) {
        this.BtnEliminarJFER = BtnEliminarJFER;
    }

    public JButton getBtnGuardarEncR() {
        return BtnGuardarEncR;
    }

    public void setBtnGuardarEncR(JButton BtnGuardarEncR) {
        this.BtnGuardarEncR = BtnGuardarEncR;
    }

    public JButton getBtnListarJFER() {
        return BtnListarJFER;
    }

    public void setBtnListarJFER(JButton BtnListarJFER) {
        this.BtnListarJFER = BtnListarJFER;
    }

    public JComboBox<String> getCbxAlumEncR() {
        return CbxAlumEncR;
    }

    public void setCbxAlumEncR(JComboBox<String> CbxAlumEncR) {
        this.CbxAlumEncR = CbxAlumEncR;
    }

    public JComboBox<String> getCbxEntEncR() {
        return CbxEntEncR;
    }

    public void setCbxEntEncR(JComboBox<String> CbxEntEncR) {
        this.CbxEntEncR = CbxEntEncR;
    }

    public JDialog getDgEncR() {
        return DgEncR;
    }

    public void setDgEncR(JDialog DgEncR) {
        this.DgEncR = DgEncR;
    }

    public JTable getTbDisciplina() {
        return TbDisciplina;
    }

    public void setTbDisciplina(JTable TbDisciplina) {
        this.TbDisciplina = TbDisciplina;
    }

    public JTextField getTxtBuscarEncRealiza() {
        return TxtBuscarEncRealiza;
    }

    public void setTxtBuscarEncRealiza(JTextField TxtBuscarEncRealiza) {
        this.TxtBuscarEncRealiza = TxtBuscarEncRealiza;
    }

    public JTextField getTxtCodDisc1() {
        return TxtCodDisc1;
    }

    public void setTxtCodDisc1(JTextField TxtCodDisc1) {
        this.TxtCodDisc1 = TxtCodDisc1;
    }    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnCrearEncR;
    private javax.swing.JButton BtnCrearJFER;
    private javax.swing.JButton BtnEditarJFER;
    private javax.swing.JButton BtnEliminarJFER;
    private javax.swing.JButton BtnGuardarEncR;
    private javax.swing.JButton BtnListarJFER;
    private javax.swing.JComboBox<String> CbxAlumEncR;
    private javax.swing.JComboBox<String> CbxEntEncR;
    private javax.swing.JDialog DgEncR;
    private javax.swing.JPanel PNOA;
    private javax.swing.JPanel PNOA1;
    private javax.swing.JTable TbDisciplina;
    private javax.swing.JTextField TxtBuscarEncRealiza;
    private javax.swing.JTextField TxtCodDisc1;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
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