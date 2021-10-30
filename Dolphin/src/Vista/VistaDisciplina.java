/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 *
 * @author HP
 */

public class VistaDisciplina extends javax.swing.JInternalFrame {

    /**
     * Creates new form VistaDisciplina
     */
    
    public VistaDisciplina() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        DgDisciplina = new javax.swing.JDialog();
        PNOA1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtcodigo = new javax.swing.JTextField();
        txtnombred = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        btnaceptar = new javax.swing.JButton();
        btncancelar = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtdescripciond = new javax.swing.JTextArea();
        jScrollPane3 = new javax.swing.JScrollPane();
        txtobservacionesd = new javax.swing.JTextArea();
        DlgEliminar = new javax.swing.JDialog();
        jLabel13 = new javax.swing.JLabel();
        lbtitutolo1 = new javax.swing.JLabel();
        txteliminarnombre = new javax.swing.JTextField();
        btnconfirmareliminar = new javax.swing.JButton();
        btncancelareliminar = new javax.swing.JButton();
        txteliminarid = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        PNOA = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbldisciplina = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        txtbuscard = new javax.swing.JTextField();
        btncrear = new javax.swing.JButton();
        btneditar = new javax.swing.JButton();
        btnlistar = new javax.swing.JButton();
        btneliminar = new javax.swing.JButton();
        jbregresar = new javax.swing.JButton();
        btnimprimirdisciplina = new javax.swing.JButton();

        PNOA1.setBackground(new java.awt.Color(204, 255, 255));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/imagenes/LogoCab.png"))); // NOI18N

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Disciplina");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 559, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(41, Short.MAX_VALUE))
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
        jLabel10.setText("Descripcion:");

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel11.setText("Nombre:");

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel12.setText("Observaciones:");

        btnaceptar.setText("Crear");

        btncancelar.setText("Cancelar");

        txtdescripciond.setColumns(20);
        txtdescripciond.setRows(5);
        jScrollPane2.setViewportView(txtdescripciond);

        txtobservacionesd.setColumns(20);
        txtobservacionesd.setRows(5);
        jScrollPane3.setViewportView(txtobservacionesd);

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
                        .addGap(40, 40, 40)
                        .addGroup(PNOA1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnaceptar)
                            .addGroup(PNOA1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                                .addComponent(txtcodigo, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE)))
                        .addGroup(PNOA1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(PNOA1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(PNOA1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(22, 22, 22))
                            .addGroup(PNOA1Layout.createSequentialGroup()
                                .addGap(92, 92, 92)
                                .addComponent(btncancelar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGroup(PNOA1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtnombred, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                        .addGap(54, 54, 54)))
                .addContainerGap())
        );
        PNOA1Layout.setVerticalGroup(
            PNOA1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PNOA1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(PNOA1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PNOA1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtcodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel11)
                        .addComponent(txtnombred, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGroup(PNOA1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PNOA1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(PNOA1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel10)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 69, Short.MAX_VALUE)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
                    .addGroup(PNOA1Layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(jLabel12)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                .addGroup(PNOA1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnaceptar)
                    .addComponent(btncancelar))
                .addGap(26, 26, 26))
        );

        javax.swing.GroupLayout DgDisciplinaLayout = new javax.swing.GroupLayout(DgDisciplina.getContentPane());
        DgDisciplina.getContentPane().setLayout(DgDisciplinaLayout);
        DgDisciplinaLayout.setHorizontalGroup(
            DgDisciplinaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PNOA1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        DgDisciplinaLayout.setVerticalGroup(
            DgDisciplinaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PNOA1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jLabel13.setText("Nombre:");

        lbtitutolo1.setText("¿Seguro que desea Eliminar la Disciplina Seleccionada?");

        txteliminarnombre.setEditable(false);
        txteliminarnombre.setBackground(new java.awt.Color(255, 255, 255));
        txteliminarnombre.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        btnconfirmareliminar.setText("ACEPTAR");

        btncancelareliminar.setText("CANCELAR");

        txteliminarid.setEditable(false);
        txteliminarid.setBackground(new java.awt.Color(255, 255, 255));
        txteliminarid.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel14.setText("ID:");

        javax.swing.GroupLayout DlgEliminarLayout = new javax.swing.GroupLayout(DlgEliminar.getContentPane());
        DlgEliminar.getContentPane().setLayout(DlgEliminarLayout);
        DlgEliminarLayout.setHorizontalGroup(
            DlgEliminarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, DlgEliminarLayout.createSequentialGroup()
                .addContainerGap(36, Short.MAX_VALUE)
                .addGroup(DlgEliminarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(DlgEliminarLayout.createSequentialGroup()
                        .addComponent(btnconfirmareliminar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btncancelareliminar))
                    .addComponent(lbtitutolo1)
                    .addGroup(DlgEliminarLayout.createSequentialGroup()
                        .addComponent(jLabel13)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txteliminarnombre))
                    .addGroup(DlgEliminarLayout.createSequentialGroup()
                        .addComponent(jLabel14)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txteliminarid, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(30, 30, 30))
        );
        DlgEliminarLayout.setVerticalGroup(
            DlgEliminarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DlgEliminarLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(lbtitutolo1)
                .addGap(39, 39, 39)
                .addGroup(DlgEliminarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txteliminarid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14))
                .addGap(26, 26, 26)
                .addGroup(DlgEliminarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txteliminarnombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13))
                .addGap(40, 40, 40)
                .addGroup(DlgEliminarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnconfirmareliminar)
                    .addComponent(btncancelareliminar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        PNOA.setBackground(new java.awt.Color(204, 255, 255));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/imagenes/LogoCab.png"))); // NOI18N

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Disciplina");

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

        tbldisciplina.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "ID", "Nombre", "Descripcion", "Observacion"
            }
        ));
        jScrollPane1.setViewportView(tbldisciplina);

        jLabel3.setText("BUSCAR");

        btncrear.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        btncrear.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/imagenes/new-file_40454 (3).png"))); // NOI18N
        btncrear.setText("Crear");

        btneditar.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        btneditar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/imagenes/document-edit_icon-icons.com_52428 (1).png"))); // NOI18N
        btneditar.setText("Editar");

        btnlistar.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        btnlistar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/imagenes/list_notes_930.png"))); // NOI18N
        btnlistar.setText("Listar");

        btneliminar.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        btneliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/imagenes/delete-file_40456 (1).png"))); // NOI18N
        btneliminar.setText("Eliminar");
        btneliminar.setMaximumSize(new java.awt.Dimension(59, 23));
        btneliminar.setMinimumSize(new java.awt.Dimension(59, 23));

        jbregresar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/imagenes/icons8-izquierda-círculo-36.png"))); // NOI18N
        jbregresar.setBorder(null);
        jbregresar.setBorderPainted(false);
        jbregresar.setContentAreaFilled(false);
        jbregresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbregresarActionPerformed(evt);
            }
        });

        btnimprimirdisciplina.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        btnimprimirdisciplina.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/imagenes/printer_print_22133.png"))); // NOI18N
        btnimprimirdisciplina.setText("Imprimir");

        javax.swing.GroupLayout PNOALayout = new javax.swing.GroupLayout(PNOA);
        PNOA.setLayout(PNOALayout);
        PNOALayout.setHorizontalGroup(
            PNOALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PNOALayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PNOALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1)
                    .addGroup(PNOALayout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtbuscard, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32)
                        .addComponent(btncrear)
                        .addGap(18, 18, 18)
                        .addComponent(btneditar)
                        .addGap(18, 18, 18)
                        .addComponent(btnlistar)
                        .addGap(18, 18, 18)
                        .addComponent(btneliminar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 93, Short.MAX_VALUE)
                        .addComponent(btnimprimirdisciplina))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PNOALayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jbregresar)))
                .addContainerGap())
        );
        PNOALayout.setVerticalGroup(
            PNOALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PNOALayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(PNOALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btneditar)
                    .addComponent(btncrear)
                    .addComponent(txtbuscard, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(btnlistar)
                    .addComponent(btneliminar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnimprimirdisciplina))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jbregresar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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

    private void jbregresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbregresarActionPerformed
  
    }//GEN-LAST:event_jbregresarActionPerformed

    //GETTERS Y SETTERS
    public JDialog getDgDisciplina() {
        return DgDisciplina;
    }
    public void setDgDisciplina(JDialog DgDisciplina) {
        this.DgDisciplina = DgDisciplina;
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
    public JButton getBtnaceptar() {
        return btnaceptar;
    }
    public void setBtnaceptar(JButton btnaceptar) {
        this.btnaceptar = btnaceptar;
    }
    public JButton getBtncancelar() {
        return btncancelar;
    }
    public void setBtncancelar(JButton btncancelar) {
        this.btncancelar = btncancelar;
    }
    public JButton getBtncrear() {
        return btncrear;
    }
    public void setBtncrear(JButton btncrear) {
        this.btncrear = btncrear;
    }
    public JButton getBtneditar() {
        return btneditar;
    }
    public void setBtneditar(JButton btneditar) {
        this.btneditar = btneditar;
    }
    public JButton getBtneliminar() {
        return btneliminar;
    }
    public void setBtneliminar(JButton btneliminar) {
        this.btneliminar = btneliminar;
    }
    public JButton getBtnlistar() {
        return btnlistar;
    }
    public void setBtnlistar(JButton btnlistar) {
        this.btnlistar = btnlistar;
    }
    public JTable getTbldisciplina() {
        return tbldisciplina;
    }
    public void setTbldisciplina(JTable tbldisciplina) {
        this.tbldisciplina = tbldisciplina;
    }
    public JTextField getTxtbuscard() {
        return txtbuscard;
    }
    public void setTxtbuscard(JTextField txtbuscard) {
        this.txtbuscard = txtbuscard;
    }
    public JTextField getTxtcodigo() {
        return txtcodigo;
    }
    public void setTxtcodigo(JTextField txtcodigo) {
        this.txtcodigo = txtcodigo;
    }
    public JTextArea getTxtdescripciond() {
        return txtdescripciond;
    }
    public void setTxtdescripciond(JTextArea txtdescripciond) {
        this.txtdescripciond = txtdescripciond;
    }
    public JTextField getTxtnombred() {
        return txtnombred;
    }
    public void setTxtnombred(JTextField txtnombred) {
        this.txtnombred = txtnombred;
    }
    public JTextArea getTxtobservacionesd() {
        return txtobservacionesd;
    }
    public void setTxtobservacionesd(JTextArea txtobservacionesd) {
        this.txtobservacionesd = txtobservacionesd;
    }
    public JButton getBtnimprimirdisciplina() {
        return btnimprimirdisciplina;
    }
    public void setBtnimprimirdisciplina(JButton btnimprimirdisciplina) {
        this.btnimprimirdisciplina = btnimprimirdisciplina;
    }
    public JDialog getDlgEliminar() {
        return DlgEliminar;
    }
    public void setDlgEliminar(JDialog DlgEliminar) {
        this.DlgEliminar = DlgEliminar;
    }
    public JButton getJbregresar() {
        return jbregresar;
    }
    public void setJbregresar(JButton jbregresar) {
        this.jbregresar = jbregresar;
    }
    public JLabel getLbtitutolo1() {
        return lbtitutolo1;
    }
    public void setLbtitutolo1(JLabel lbtitutolo1) {
        this.lbtitutolo1 = lbtitutolo1;
    }
    public JTextField getTxteliminarid() {
        return txteliminarid;
    }
    public void setTxteliminarid(JTextField txteliminarid) {
        this.txteliminarid = txteliminarid;
    }
    public JTextField getTxteliminarnombre() {
        return txteliminarnombre;
    }
    public void setTxteliminarnombre(JTextField txteliminarnombre) {
        this.txteliminarnombre = txteliminarnombre;
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDialog DgDisciplina;
    private javax.swing.JDialog DlgEliminar;
    private javax.swing.JPanel PNOA;
    private javax.swing.JPanel PNOA1;
    private javax.swing.JButton btnaceptar;
    private javax.swing.JButton btncancelar;
    private javax.swing.JButton btncancelareliminar;
    private javax.swing.JButton btnconfirmareliminar;
    private javax.swing.JButton btncrear;
    private javax.swing.JButton btneditar;
    private javax.swing.JButton btneliminar;
    private javax.swing.JButton btnimprimirdisciplina;
    private javax.swing.JButton btnlistar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JButton jbregresar;
    private javax.swing.JLabel lbtitutolo1;
    private javax.swing.JTable tbldisciplina;
    private javax.swing.JTextField txtbuscard;
    private javax.swing.JTextField txtcodigo;
    private javax.swing.JTextArea txtdescripciond;
    private javax.swing.JTextField txteliminarid;
    private javax.swing.JTextField txteliminarnombre;
    private javax.swing.JTextField txtnombred;
    private javax.swing.JTextArea txtobservacionesd;
    // End of variables declaration//GEN-END:variables

    public void setLocationRelativeTo(Object object) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}