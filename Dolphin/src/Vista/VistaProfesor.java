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
import javax.swing.JTable;
import javax.swing.JTextField;

/**
 *
 * @author HP
 */

public class VistaProfesor extends javax.swing.JInternalFrame {

    /**
     * Creates new form VistaProfesor
     */
    
    public VistaProfesor() {
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

        DgProfesor = new javax.swing.JDialog();
        PNOA1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        TxtCodProf = new javax.swing.JTextField();
        TxtCedulaProf = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        TxtNombreProf = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        TxtApeProf = new javax.swing.JTextField();
        BtnCrearProf = new javax.swing.JButton();
        BtnGuardarProf = new javax.swing.JButton();
        jLabel18 = new javax.swing.JLabel();
        DCProf = new com.toedter.calendar.JDateChooser();
        jLabel19 = new javax.swing.JLabel();
        TxtDireccionProf = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        TxtTelfProf = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        TxtFormacionProf = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        TxtContraseñaProf = new javax.swing.JTextField();
        jLabel23 = new javax.swing.JLabel();
        TxtEmailProf1 = new javax.swing.JTextField();
        jLabel24 = new javax.swing.JLabel();
        TxtCelularProf1 = new javax.swing.JTextField();
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
        TbProfesor = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        TxtBuscarProf = new javax.swing.JTextField();
        BtnCrearJFProf = new javax.swing.JButton();
        BtnEditarJFProf = new javax.swing.JButton();
        BtnListarJFProf = new javax.swing.JButton();
        BtnEliminarJFProf = new javax.swing.JButton();
        jbregresar = new javax.swing.JButton();
        btnimprimirprofe = new javax.swing.JButton();

        PNOA1.setBackground(new java.awt.Color(204, 255, 255));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/imagenes/LogoCab.png"))); // NOI18N

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Profesor");

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

        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel14.setText("Codigo:");

        jLabel15.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel15.setText("Nombres:");

        TxtCodProf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtCodProfActionPerformed(evt);
            }
        });

        jLabel16.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel16.setText("Cedula:");

        jLabel17.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel17.setText("Apellidos:");

        BtnCrearProf.setText("Crear");

        BtnGuardarProf.setText("Guardar");

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

        jLabel23.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel23.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel23.setText("Formacion:");

        jLabel24.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel24.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel24.setText("Contraseña:");

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
                            .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(PNOA1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(PNOA1Layout.createSequentialGroup()
                                .addGroup(PNOA1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(PNOA1Layout.createSequentialGroup()
                                        .addComponent(TxtCodProf, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(PNOA1Layout.createSequentialGroup()
                                        .addGroup(PNOA1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(DCProf, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(TxtNombreProf, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE)
                                            .addGroup(PNOA1Layout.createSequentialGroup()
                                                .addComponent(BtnCrearProf)
                                                .addGap(22, 22, 22)))
                                        .addGroup(PNOA1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(PNOA1Layout.createSequentialGroup()
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addGroup(PNOA1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                            .addGroup(PNOA1Layout.createSequentialGroup()
                                                .addGap(18, 18, 18)
                                                .addComponent(BtnGuardarProf)))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(PNOA1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(TxtCedulaProf, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(TxtApeProf, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(TxtDireccionProf, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(PNOA1Layout.createSequentialGroup()
                                .addComponent(TxtTelfProf, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(TxtEmailProf1, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(PNOA1Layout.createSequentialGroup()
                                .addComponent(TxtCelularProf1, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(TxtFormacionProf, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(TxtContraseñaProf, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 28, Short.MAX_VALUE)))
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
                    .addComponent(TxtCodProf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel16)
                    .addComponent(TxtCedulaProf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(PNOA1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17)
                    .addComponent(TxtApeProf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15)
                    .addComponent(TxtNombreProf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(PNOA1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel18)
                    .addComponent(DCProf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(PNOA1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(TxtDireccionProf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel19)))
                .addGap(18, 18, 18)
                .addGroup(PNOA1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel20)
                    .addComponent(TxtTelfProf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel21)
                    .addComponent(TxtEmailProf1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(PNOA1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel22)
                    .addGroup(PNOA1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel23)
                        .addComponent(TxtFormacionProf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(TxtCelularProf1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(PNOA1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel24)
                    .addComponent(TxtContraseñaProf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 59, Short.MAX_VALUE)
                .addGroup(PNOA1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BtnCrearProf)
                    .addComponent(BtnGuardarProf))
                .addGap(32, 32, 32))
        );

        javax.swing.GroupLayout DgProfesorLayout = new javax.swing.GroupLayout(DgProfesor.getContentPane());
        DgProfesor.getContentPane().setLayout(DgProfesorLayout);
        DgProfesorLayout.setHorizontalGroup(
            DgProfesorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PNOA1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        DgProfesorLayout.setVerticalGroup(
            DgProfesorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PNOA1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jLabel13.setText("Nombre:");

        lbtitutolo1.setText("¿Seguro/a que desea Eliminar al Profesor/a Seleccionada/o?");

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
                .addContainerGap(41, Short.MAX_VALUE)
                .addGroup(DlgEliminarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(DlgEliminarLayout.createSequentialGroup()
                        .addComponent(btnconfirmareliminar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btncancelareliminar))
                    .addComponent(lbtitutolo1)
                    .addGroup(DlgEliminarLayout.createSequentialGroup()
                        .addGroup(DlgEliminarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel13)
                            .addComponent(jLabel12))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(DlgEliminarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txteliminarid, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txteliminarnombre, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(63, 63, 63))
        );
        DlgEliminarLayout.setVerticalGroup(
            DlgEliminarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DlgEliminarLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(lbtitutolo1)
                .addGap(18, 18, 18)
                .addGroup(DlgEliminarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txteliminarid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12))
                .addGap(26, 26, 26)
                .addGroup(DlgEliminarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txteliminarnombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13))
                .addGap(46, 46, 46)
                .addGroup(DlgEliminarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnconfirmareliminar)
                    .addComponent(btncancelareliminar))
                .addContainerGap(32, Short.MAX_VALUE))
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
        jLabel2.setText("Profesor");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 733, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1)
            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        PNOA.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 11, -1, -1));

        TbProfesor.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Cedula", "Nombres", "Apellido", "Direccion", "Telefono", "Correo", "Fecha Nac", "Celular", "Formacion"
            }
        ));
        jScrollPane1.setViewportView(TbProfesor);

        PNOA.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 140, 810, 96));

        jLabel3.setText("BUSCAR");
        PNOA.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 69, -1, -1));
        PNOA.add(TxtBuscarProf, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 66, 128, -1));

        BtnCrearJFProf.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        BtnCrearJFProf.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/imagenes/new-file_40454 (3).png"))); // NOI18N
        BtnCrearJFProf.setText("Crear");
        PNOA.add(BtnCrearJFProf, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 60, -1, -1));

        BtnEditarJFProf.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        BtnEditarJFProf.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/imagenes/document-edit_icon-icons.com_52428 (1).png"))); // NOI18N
        BtnEditarJFProf.setText("Editar");
        PNOA.add(BtnEditarJFProf, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 60, -1, -1));

        BtnListarJFProf.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        BtnListarJFProf.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/imagenes/list_notes_930.png"))); // NOI18N
        BtnListarJFProf.setText("Listar");
        PNOA.add(BtnListarJFProf, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 60, -1, -1));

        BtnEliminarJFProf.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        BtnEliminarJFProf.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/imagenes/delete-file_40456 (1).png"))); // NOI18N
        BtnEliminarJFProf.setText("Eliminar");
        BtnEliminarJFProf.setMaximumSize(new java.awt.Dimension(59, 23));
        BtnEliminarJFProf.setMinimumSize(new java.awt.Dimension(59, 23));
        PNOA.add(BtnEliminarJFProf, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 60, -1, -1));

        jbregresar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/imagenes/icons8-izquierda-círculo-36.png"))); // NOI18N
        jbregresar.setToolTipText("regresar");
        jbregresar.setBorder(null);
        jbregresar.setBorderPainted(false);
        jbregresar.setContentAreaFilled(false);
        jbregresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbregresarActionPerformed(evt);
            }
        });
        PNOA.add(jbregresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 260, -1, -1));

        btnimprimirprofe.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        btnimprimirprofe.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/imagenes/printer_print_22133.png"))); // NOI18N
        btnimprimirprofe.setText("Imprimir");
        PNOA.add(btnimprimirprofe, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 60, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PNOA, javax.swing.GroupLayout.DEFAULT_SIZE, 820, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PNOA, javax.swing.GroupLayout.DEFAULT_SIZE, 317, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TxtCodProfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtCodProfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtCodProfActionPerformed

    private void jbregresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbregresarActionPerformed
        
    }//GEN-LAST:event_jbregresarActionPerformed

    public JTextField getTxtFormacionProf() {
        return TxtFormacionProf;
    }

    public void setTxtFormacionProf(JTextField TxtFormacionProf) {
        this.TxtFormacionProf = TxtFormacionProf;
    }

    public JDialog getDlgEliminar() {
        return DlgEliminar;
    }

    public void setDlgEliminar(JDialog DlgEliminar) {
        this.DlgEliminar = DlgEliminar;
    }

    public JTextField getTxtEmailProf1() {
        return TxtEmailProf1;
    }

    public void setTxtEmailProf1(JTextField TxtEmailProf1) {
        this.TxtEmailProf1 = TxtEmailProf1;
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

    public JTextField getTxtCelularProf1() {
        return TxtCelularProf1;
    }

    public void setTxtCelularProf1(JTextField TxtCelularProf1) {
        this.TxtCelularProf1 = TxtCelularProf1;
    }

    public JTextField getTxtContraseñaProf() {
        return TxtContraseñaProf;
    }

    public void setTxtContraseñaProf(JTextField TxtContraseñaProf) {
        this.TxtContraseñaProf = TxtContraseñaProf;
    }
    
    public JButton getBtnCrearJFProf() {
        return BtnCrearJFProf;
    }

    public void setBtnCrearJFProf(JButton BtnCrearJFProf) {
        this.BtnCrearJFProf = BtnCrearJFProf;
    }

    public JButton getBtnCrearProf() {
        return BtnCrearProf;
    }

    public void setBtnCrearProf(JButton BtnCrearProf) {
        this.BtnCrearProf = BtnCrearProf;
    }

    public JButton getBtnEditarJFProf() {
        return BtnEditarJFProf;
    }

    public void setBtnEditarJFProf(JButton BtnEditarJFProf) {
        this.BtnEditarJFProf = BtnEditarJFProf;
    }

    public JButton getBtnEliminarJFProf() {
        return BtnEliminarJFProf;
    }

    public void setBtnEliminarJFProf(JButton BtnEliminarJFProf) {
        this.BtnEliminarJFProf = BtnEliminarJFProf;
    }

    public JButton getBtnGuardarProf() {
        return BtnGuardarProf;
    }

    public void setBtnGuardarProf(JButton BtnGuardarProf) {
        this.BtnGuardarProf = BtnGuardarProf;
    }

    public JButton getBtnListarJFProf() {
        return BtnListarJFProf;
    }

    public void setBtnListarJFProf(JButton BtnListarJFProf) {
        this.BtnListarJFProf = BtnListarJFProf;
    }

    public JDateChooser getDCProf() {
        return DCProf;
    }

    public void setDCProf(JDateChooser DCProf) {
        this.DCProf = DCProf;
    }

    public JDialog getDgProfesor() {
        return DgProfesor;
    }

    public void setDgProfesor(JDialog DgProfesor) {
        this.DgProfesor = DgProfesor;
    }

    public JTable getTbProfesor() {
        return TbProfesor;
    }

    public void setTbProfesor(JTable TbProfesor) {
        this.TbProfesor = TbProfesor;
    }

    public JTextField getTxtApeProf() {
        return TxtApeProf;
    }

    public void setTxtApeProf(JTextField TxtApeProf) {
        this.TxtApeProf = TxtApeProf;
    }

    public JTextField getTxtBuscarProf() {
        return TxtBuscarProf;
    }

    public void setTxtBuscarProf(JTextField TxtBuscarProf) {
        this.TxtBuscarProf = TxtBuscarProf;
    }

    public JTextField getTxtCedulaProf() {
        return TxtCedulaProf;
    }

    public void setTxtCedulaProf(JTextField TxtCedulaProf) {
        this.TxtCedulaProf = TxtCedulaProf;
    }

    public JTextField getTxtCelularProf() {
        return TxtContraseñaProf;
    }

    public void setTxtCelularProf(JTextField TxtCelularProf) {
        this.TxtContraseñaProf = TxtCelularProf;
    }

    public JTextField getTxtCodProf() {
        return TxtCodProf;
    }

    public void setTxtCodProf(JTextField TxtCodProf) {
        this.TxtCodProf = TxtCodProf;
    }

    public JTextField getTxtDireccionProf() {
        return TxtDireccionProf;
    }

    public void setTxtDireccionProf(JTextField TxtDireccionProf) {
        this.TxtDireccionProf = TxtDireccionProf;
    }

    public JTextField getTxtEmailProf() {
        return TxtFormacionProf;
    }

    public void setTxtEmailProf(JTextField TxtEmailProf) {
        this.TxtFormacionProf = TxtEmailProf;
    }

    public JTextField getTxtNombreProf() {
        return TxtNombreProf;
    }

    public void setTxtNombreProf(JTextField TxtNombreProf) {
        this.TxtNombreProf = TxtNombreProf;
    }

    public JTextField getTxtTelfProf() {
        return TxtTelfProf;
    }

    public void setTxtTelfProf(JTextField TxtTelfProf) {
        this.TxtTelfProf = TxtTelfProf;
    }

    public JLabel getjLabel18() {
        return jLabel18;
    }

    public void setjLabel18(JLabel jLabel18) {
        this.jLabel18 = jLabel18;
    }

    public JButton getBtnimprimirprofe() {
        return btnimprimirprofe;
    }

    public void setBtnimprimirprofe(JButton btnimprimirprofe) {
        this.btnimprimirprofe = btnimprimirprofe;
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnCrearJFProf;
    private javax.swing.JButton BtnCrearProf;
    private javax.swing.JButton BtnEditarJFProf;
    private javax.swing.JButton BtnEliminarJFProf;
    private javax.swing.JButton BtnGuardarProf;
    private javax.swing.JButton BtnListarJFProf;
    private com.toedter.calendar.JDateChooser DCProf;
    private javax.swing.JDialog DgProfesor;
    private javax.swing.JDialog DlgEliminar;
    private javax.swing.JPanel PNOA;
    private javax.swing.JPanel PNOA1;
    private javax.swing.JTable TbProfesor;
    private javax.swing.JTextField TxtApeProf;
    private javax.swing.JTextField TxtBuscarProf;
    private javax.swing.JTextField TxtCedulaProf;
    private javax.swing.JTextField TxtCelularProf1;
    private javax.swing.JTextField TxtCodProf;
    private javax.swing.JTextField TxtContraseñaProf;
    private javax.swing.JTextField TxtDireccionProf;
    private javax.swing.JTextField TxtEmailProf1;
    private javax.swing.JTextField TxtFormacionProf;
    private javax.swing.JTextField TxtNombreProf;
    private javax.swing.JTextField TxtTelfProf;
    private javax.swing.JButton btncancelareliminar;
    private javax.swing.JButton btnconfirmareliminar;
    private javax.swing.JButton btnimprimirprofe;
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
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbregresar;
    private javax.swing.JLabel lbtitutolo1;
    private javax.swing.JTextField txteliminarid;
    private javax.swing.JTextField txteliminarnombre;
    // End of variables declaration//GEN-END:variables
}
