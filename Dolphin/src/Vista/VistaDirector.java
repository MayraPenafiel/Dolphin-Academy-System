/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import com.toedter.calendar.JDateChooser;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTable;
import javax.swing.JTextField;

/**
 *
 * @author HP
 */

public class VistaDirector extends javax.swing.JInternalFrame {

    /**
     * Creates new form VistaDirector
     */
    public VistaDirector() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        DgDirector = new javax.swing.JDialog();
        PNOA1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        TxtCodDirec = new javax.swing.JTextField();
        TxtCedulaDirec = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        TxtNombreDirec = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        TxtApeDirec = new javax.swing.JTextField();
        BtnCrearDirec = new javax.swing.JButton();
        BtnGuardarDirec = new javax.swing.JButton();
        jLabel18 = new javax.swing.JLabel();
        DCDirec = new com.toedter.calendar.JDateChooser();
        jLabel19 = new javax.swing.JLabel();
        TxtDireccionDirec = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        TxtTelfDirec = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        TxtEmailDirec = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        TxtCelularDirec = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtcontraseña = new javax.swing.JPasswordField();
        jLabel8 = new javax.swing.JLabel();
        txtformacion = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtdireccion_sede = new javax.swing.JTextField();
        DlgEliminar = new javax.swing.JDialog();
        jLabel13 = new javax.swing.JLabel();
        lbtitutolo1 = new javax.swing.JLabel();
        txteliminarnombre = new javax.swing.JTextField();
        btnconfirmareliminar = new javax.swing.JButton();
        btncancelareliminar = new javax.swing.JButton();
        txteliminarid = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        PNOA = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TbDirector = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        TxtBuscarDirec = new javax.swing.JTextField();
        BtnCrearJFDirec = new javax.swing.JButton();
        BtnEditarJFDirec = new javax.swing.JButton();
        BtnListarJFDirec = new javax.swing.JButton();
        BtnEliminarJFDirec = new javax.swing.JButton();
        jbregresar = new javax.swing.JButton();
        btnimprimirdire = new javax.swing.JButton();

        PNOA1.setBackground(new java.awt.Color(204, 255, 255));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/imagenes/LogoCab.png"))); // NOI18N

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Director");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 618, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel4)
            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel14.setText("Codigo:");

        jLabel15.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel15.setText("Nombres:");

        TxtCodDirec.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtCodDirecActionPerformed(evt);
            }
        });

        jLabel16.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel16.setText("Cedula:");

        jLabel17.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel17.setText("Apellidos:");

        TxtApeDirec.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtApeDirecActionPerformed(evt);
            }
        });

        BtnCrearDirec.setText("Cancelar");

        BtnGuardarDirec.setText("Guardar");

        jLabel18.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel18.setText("Fecha de Nacimiento");

        jLabel19.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel19.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel19.setText("Direccion:");

        jLabel20.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel20.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel20.setText("Telefono:");

        jLabel21.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel21.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel21.setText("Correo:");

        jLabel22.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel22.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel22.setText("Celular:");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("Contraseña:");

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel8.setText("Formacion:");

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel7.setText("Sede:");

        javax.swing.GroupLayout PNOA1Layout = new javax.swing.GroupLayout(PNOA1);
        PNOA1.setLayout(PNOA1Layout);
        PNOA1Layout.setHorizontalGroup(
            PNOA1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PNOA1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PNOA1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(PNOA1Layout.createSequentialGroup()
                        .addGroup(PNOA1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(PNOA1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(PNOA1Layout.createSequentialGroup()
                                    .addGap(8, 8, 8)
                                    .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(PNOA1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(PNOA1Layout.createSequentialGroup()
                                .addGroup(PNOA1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(PNOA1Layout.createSequentialGroup()
                                        .addComponent(TxtTelfDirec, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(78, 78, 78)
                                        .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jLabel8))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 5, Short.MAX_VALUE)
                                .addGroup(PNOA1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(TxtEmailDirec, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtformacion, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(PNOA1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(TxtApeDirec, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(PNOA1Layout.createSequentialGroup()
                                    .addGroup(PNOA1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(PNOA1Layout.createSequentialGroup()
                                            .addComponent(TxtCodDirec, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(72, 72, 72)
                                            .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(PNOA1Layout.createSequentialGroup()
                                            .addGroup(PNOA1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                .addComponent(DCDirec, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(TxtNombreDirec, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGap(75, 75, 75)
                                            .addGroup(PNOA1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(PNOA1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(TxtCedulaDirec, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(TxtDireccionDirec, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(PNOA1Layout.createSequentialGroup()
                                    .addComponent(BtnCrearDirec)
                                    .addGap(147, 147, 147)))
                            .addGroup(PNOA1Layout.createSequentialGroup()
                                .addGroup(PNOA1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(BtnGuardarDirec)
                                    .addGroup(PNOA1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(txtcontraseña, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(TxtCelularDirec, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE)))
                                .addGap(69, 69, 69)
                                .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtdireccion_sede, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap())
        );
        PNOA1Layout.setVerticalGroup(
            PNOA1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PNOA1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(PNOA1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(TxtCodDirec, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel16)
                    .addComponent(TxtCedulaDirec, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(PNOA1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17)
                    .addComponent(TxtApeDirec, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15)
                    .addComponent(TxtNombreDirec, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(PNOA1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel18)
                    .addComponent(DCDirec, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(PNOA1Layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addGroup(PNOA1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel19)
                            .addComponent(TxtDireccionDirec, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addGroup(PNOA1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PNOA1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel20)
                        .addComponent(TxtTelfDirec, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel21))
                    .addComponent(TxtEmailDirec, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(PNOA1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PNOA1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel22)
                        .addGroup(PNOA1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(TxtCelularDirec, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8)))
                    .addComponent(txtformacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(PNOA1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtdireccion_sede, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(PNOA1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel6)
                        .addComponent(txtcontraseña, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel7)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                .addGroup(PNOA1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BtnCrearDirec)
                    .addComponent(BtnGuardarDirec))
                .addGap(23, 23, 23))
        );

        javax.swing.GroupLayout DgDirectorLayout = new javax.swing.GroupLayout(DgDirector.getContentPane());
        DgDirector.getContentPane().setLayout(DgDirectorLayout);
        DgDirectorLayout.setHorizontalGroup(
            DgDirectorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PNOA1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        DgDirectorLayout.setVerticalGroup(
            DgDirectorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PNOA1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jLabel13.setText("Nombre:");

        lbtitutolo1.setText("¿Seguro/a que desea Eliminar al Director Seleccionada?");

        txteliminarnombre.setEditable(false);
        txteliminarnombre.setBackground(new java.awt.Color(255, 255, 255));
        txteliminarnombre.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        btnconfirmareliminar.setText("ACEPTAR");

        btncancelareliminar.setText("CANCELAR");

        txteliminarid.setEditable(false);
        txteliminarid.setBackground(new java.awt.Color(255, 255, 255));
        txteliminarid.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel12.setText("ID:");

        javax.swing.GroupLayout DlgEliminarLayout = new javax.swing.GroupLayout(DlgEliminar.getContentPane());
        DlgEliminar.getContentPane().setLayout(DlgEliminarLayout);
        DlgEliminarLayout.setHorizontalGroup(
            DlgEliminarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, DlgEliminarLayout.createSequentialGroup()
                .addContainerGap(28, Short.MAX_VALUE)
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
                        .addComponent(jLabel12)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txteliminarid, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(30, 30, 30))
        );
        DlgEliminarLayout.setVerticalGroup(
            DlgEliminarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DlgEliminarLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(lbtitutolo1)
                .addGap(18, 18, 18)
                .addGroup(DlgEliminarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txteliminarid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12))
                .addGap(26, 26, 26)
                .addGroup(DlgEliminarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txteliminarnombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13))
                .addGap(58, 58, 58)
                .addGroup(DlgEliminarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnconfirmareliminar)
                    .addComponent(btncancelareliminar))
                .addContainerGap(17, Short.MAX_VALUE))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        PNOA.setBackground(new java.awt.Color(204, 255, 255));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/imagenes/LogoCab.png"))); // NOI18N

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Director");

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

        TbDirector.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Cedula", "Nombres", "Apellido", "Direccion", "Telefono", "Correo", "Fecha Nac", "Celular", "Formacion", "Sede"
            }
        ));
        jScrollPane1.setViewportView(TbDirector);

        jLabel3.setText("BUSCAR");

        BtnCrearJFDirec.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        BtnCrearJFDirec.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/imagenes/new-file_40454 (3).png"))); // NOI18N
        BtnCrearJFDirec.setText("Crear");

        BtnEditarJFDirec.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        BtnEditarJFDirec.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/imagenes/document-edit_icon-icons.com_52428 (1).png"))); // NOI18N
        BtnEditarJFDirec.setText("Editar");

        BtnListarJFDirec.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        BtnListarJFDirec.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/imagenes/list_notes_930.png"))); // NOI18N
        BtnListarJFDirec.setText("Listar");

        BtnEliminarJFDirec.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        BtnEliminarJFDirec.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/imagenes/delete-file_40456 (1).png"))); // NOI18N
        BtnEliminarJFDirec.setText("Eliminar");
        BtnEliminarJFDirec.setMaximumSize(new java.awt.Dimension(59, 23));
        BtnEliminarJFDirec.setMinimumSize(new java.awt.Dimension(59, 23));

        jbregresar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/imagenes/icons8-izquierda-círculo-36.png"))); // NOI18N
        jbregresar.setBorder(null);
        jbregresar.setBorderPainted(false);
        jbregresar.setContentAreaFilled(false);
        jbregresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbregresarActionPerformed(evt);
            }
        });

        btnimprimirdire.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        btnimprimirdire.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/imagenes/printer_print_22133.png"))); // NOI18N
        btnimprimirdire.setText("Imprimir");

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
                        .addComponent(TxtBuscarDirec, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(42, 42, 42)
                        .addComponent(BtnCrearJFDirec)
                        .addGap(18, 18, 18)
                        .addComponent(BtnEditarJFDirec, javax.swing.GroupLayout.DEFAULT_SIZE, 108, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(BtnListarJFDirec)
                        .addGap(18, 18, 18)
                        .addComponent(BtnEliminarJFDirec, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(42, 42, 42)
                        .addComponent(btnimprimirdire)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PNOALayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jbregresar)
                .addGap(18, 18, 18))
        );
        PNOALayout.setVerticalGroup(
            PNOALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PNOALayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(PNOALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BtnEditarJFDirec)
                    .addComponent(BtnCrearJFDirec)
                    .addComponent(TxtBuscarDirec, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(BtnListarJFDirec)
                    .addComponent(BtnEliminarJFDirec, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnimprimirdire))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
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

    private void TxtCodDirecActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtCodDirecActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtCodDirecActionPerformed

    private void TxtApeDirecActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtApeDirecActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtApeDirecActionPerformed

    private void jbregresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbregresarActionPerformed
        // TODO add your handling code here:
      
    }//GEN-LAST:event_jbregresarActionPerformed
    
    public JPasswordField getTxtcontraseña() {
        return txtcontraseña;
    }

    public void setTxtcontraseña(JPasswordField txtcontraseña) {
        this.txtcontraseña = txtcontraseña;
    }

    public JTextField getTxtformacion() {
        return txtformacion;
    }

    public JButton getBtnimprimirdire() {
        return btnimprimirdire;
    }

    public void setBtnimprimirdire(JButton btnimprimirdire) {
        this.btnimprimirdire = btnimprimirdire;
    }
    
    public void setTxtformacion(JTextField txtformacion) {    
        this.txtformacion = txtformacion;
    }

    public JButton getBtnCrearDirec() {
        return BtnCrearDirec;
    }

    public void setBtnCrearDirec(JButton BtnCrearDirec) {
        this.BtnCrearDirec = BtnCrearDirec;
    }

    public JButton getBtnCrearJFDirec() {
        return BtnCrearJFDirec;
    }

    public void setBtnCrearJFDirec(JButton BtnCrearJFDirec) {
        this.BtnCrearJFDirec = BtnCrearJFDirec;
    }

    public JButton getBtnEditarJFDirec() {
        return BtnEditarJFDirec;
    }

    public void setBtnEditarJFDirec(JButton BtnEditarJFDirec) {
        this.BtnEditarJFDirec = BtnEditarJFDirec;
    }

    public JButton getBtnEliminarJFDirec() {
        return BtnEliminarJFDirec;
    }

    public void setBtnEliminarJFDirec(JButton BtnEliminarJFDirec) {
        this.BtnEliminarJFDirec = BtnEliminarJFDirec;
    }

    public JButton getBtnGuardarDirec() {
        return BtnGuardarDirec;
    }

    public void setBtnGuardarDirec(JButton BtnGuardarDirec) {
        this.BtnGuardarDirec = BtnGuardarDirec;
    }

    public JButton getBtnListarJFDirec() {
        return BtnListarJFDirec;
    }

    public void setBtnListarJFDirec(JButton BtnListarJFDirec) {
        this.BtnListarJFDirec = BtnListarJFDirec;
    }

    public JDateChooser getDCDirec() {
        return DCDirec;
    }

    public void setDCDirec(JDateChooser DCDirec) {
        this.DCDirec = DCDirec;
    }

    public JDialog getDgDirector() {
        return DgDirector;
    }

    public void setDgDirector(JDialog DgDirector) {
        this.DgDirector = DgDirector;
    }

    public JTable getTbDirector() {
        return TbDirector;
    }

    public void setTbDirector(JTable TbDirector) {
        this.TbDirector = TbDirector;
    }

    public JTextField getTxtApeDirec() {
        return TxtApeDirec;
    }

    public void setTxtApeDirec(JTextField TxtApeDirec) {
        this.TxtApeDirec = TxtApeDirec;
    }

    public JTextField getTxtBuscarDirec() {
        return TxtBuscarDirec;
    }

    public void setTxtBuscarDirec(JTextField TxtBuscarDirec) {
        this.TxtBuscarDirec = TxtBuscarDirec;
    }

    public JTextField getTxtCedulaDirec() {
        return TxtCedulaDirec;
    }

    public void setTxtCedulaDirec(JTextField TxtCedulaDirec) {
        this.TxtCedulaDirec = TxtCedulaDirec;
    }

    public JTextField getTxtCelularDirec() {
        return TxtCelularDirec;
    }

    public void setTxtCelularDirec(JTextField TxtCelularDirec) {
        this.TxtCelularDirec = TxtCelularDirec;
    }

    public JTextField getTxtCodDirec() {
        return TxtCodDirec;
    }

    public void setTxtCodDirec(JTextField TxtCodDirec) {
        this.TxtCodDirec = TxtCodDirec;
    }

    public JTextField getTxtDireccionDirec() {
        return TxtDireccionDirec;
    }

    public void setTxtDireccionDirec(JTextField TxtDireccionDirec) {
        this.TxtDireccionDirec = TxtDireccionDirec;
    }

    public JTextField getTxtEmailDirec() {
        return TxtEmailDirec;
    }

    public void setTxtEmailDirec(JTextField TxtEmailDirec) {
        this.TxtEmailDirec = TxtEmailDirec;
    }

    public JTextField getTxtNombreDirec() {
        return TxtNombreDirec;
    }

    public void setTxtNombreDirec(JTextField TxtNombreDirec) {
        this.TxtNombreDirec = TxtNombreDirec;
    }

    public JTextField getTxtTelfDirec() {
        return TxtTelfDirec;
    }

    public void setTxtTelfDirec(JTextField TxtTelfDirec) {
        this.TxtTelfDirec = TxtTelfDirec;
    }

    public JButton getBtncancelareliminar() {
        return btncancelareliminar;
    }

    public void setBtncancelareliminar(JButton btncancelareliminar) {
        this.btncancelareliminar = btncancelareliminar;
    }

    public JButton getBtnconfirmareliminar() {
        return btnconfirmareliminar;
    }

    public void setBtnconfirmareliminar(JButton btnconfirmareliminar) {
        this.btnconfirmareliminar = btnconfirmareliminar;
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

    public JDialog getDlgEliminar() {
        return DlgEliminar;
    }

    public void setDlgEliminar(JDialog DlgEliminar) {
        this.DlgEliminar = DlgEliminar;
    }

    public JTextField getTxtdireccion_sede() {
        return txtdireccion_sede;
    }

    public void setTxtdireccion_sede(JTextField txtdireccion_sede) {
        this.txtdireccion_sede = txtdireccion_sede;
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
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnCrearDirec;
    private javax.swing.JButton BtnCrearJFDirec;
    private javax.swing.JButton BtnEditarJFDirec;
    private javax.swing.JButton BtnEliminarJFDirec;
    private javax.swing.JButton BtnGuardarDirec;
    private javax.swing.JButton BtnListarJFDirec;
    private com.toedter.calendar.JDateChooser DCDirec;
    private javax.swing.JDialog DgDirector;
    private javax.swing.JDialog DlgEliminar;
    private javax.swing.JPanel PNOA;
    private javax.swing.JPanel PNOA1;
    private javax.swing.JTable TbDirector;
    private javax.swing.JTextField TxtApeDirec;
    private javax.swing.JTextField TxtBuscarDirec;
    private javax.swing.JTextField TxtCedulaDirec;
    private javax.swing.JTextField TxtCelularDirec;
    private javax.swing.JTextField TxtCodDirec;
    private javax.swing.JTextField TxtDireccionDirec;
    private javax.swing.JTextField TxtEmailDirec;
    private javax.swing.JTextField TxtNombreDirec;
    private javax.swing.JTextField TxtTelfDirec;
    private javax.swing.JButton btncancelareliminar;
    private javax.swing.JButton btnconfirmareliminar;
    private javax.swing.JButton btnimprimirdire;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbregresar;
    private javax.swing.JLabel lbtitutolo1;
    private javax.swing.JPasswordField txtcontraseña;
    private javax.swing.JTextField txtdireccion_sede;
    private javax.swing.JTextField txteliminarid;
    private javax.swing.JTextField txteliminarnombre;
    private javax.swing.JTextField txtformacion;
    // End of variables declaration//GEN-END:variables
}
