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

public class VistaSede extends javax.swing.JInternalFrame {

    /**
     * Creates new form VistaSede
     */
    
    public VistaSede() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        DgSede = new javax.swing.JDialog();
        PNOA1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        TxtCodSede1 = new javax.swing.JTextField();
        TxtNombreSede1 = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        TxtDirecSede1 = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        TxtTelfSede1 = new javax.swing.JTextField();
        BtnCrearSede1 = new javax.swing.JButton();
        BtnGuardarSede1 = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        CbxDirectorSede = new javax.swing.JComboBox<>();
        jLabel15 = new javax.swing.JLabel();
        TxtCorreoS1 = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        DgEliminarSede = new javax.swing.JDialog();
        lbtitutolo1 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        txteliminarcodSede = new javax.swing.JTextField();
        txteliminarnombre_s = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        btnconfirmareliminar_s = new javax.swing.JButton();
        btncancelareliminar_s = new javax.swing.JButton();
        PNOA = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TdSede = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        TxtBuscarSede = new javax.swing.JTextField();
        BtnCrearJFSede = new javax.swing.JButton();
        BtnEditarJFSede = new javax.swing.JButton();
        BtnListarJFSede = new javax.swing.JButton();
        BtnEliminarJFSede = new javax.swing.JButton();
        jbregresar = new javax.swing.JButton();
        btnimprimirsede = new javax.swing.JButton();

        PNOA1.setBackground(new java.awt.Color(204, 255, 255));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/imagenes/LogoCab.png"))); // NOI18N

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Sede");

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

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel10.setText("Codigo:");

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel11.setText("Direccion");

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel12.setText("Nombre:");

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel13.setText("Telefono:");

        BtnCrearSede1.setText("Crear");

        BtnGuardarSede1.setText("Guardar");

        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel14.setText("Director:");

        CbxDirectorSede.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel15.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel15.setText("Correo");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Id_Discplina", "Nombre", "Descripcion"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                true, true, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(jTable1);

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
                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(PNOA1Layout.createSequentialGroup()
                                .addGap(8, 8, 8)
                                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(PNOA1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(PNOA1Layout.createSequentialGroup()
                                .addComponent(TxtCodSede1, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(PNOA1Layout.createSequentialGroup()
                                .addGroup(PNOA1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(CbxDirectorSede, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(BtnCrearSede1)
                                    .addComponent(TxtDirecSede1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(PNOA1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(BtnGuardarSede1)
                                    .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(PNOA1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(TxtNombreSede1, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TxtTelfSede1, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TxtCorreoS1, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 25, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PNOA1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47))
        );
        PNOA1Layout.setVerticalGroup(
            PNOA1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PNOA1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(PNOA1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(TxtCodSede1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12)
                    .addComponent(TxtNombreSede1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(PNOA1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(TxtTelfSede1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11)
                    .addComponent(TxtDirecSede1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(PNOA1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(CbxDirectorSede, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15)
                    .addComponent(TxtCorreoS1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 14, Short.MAX_VALUE)
                .addGroup(PNOA1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BtnCrearSede1)
                    .addComponent(BtnGuardarSede1))
                .addContainerGap())
        );

        javax.swing.GroupLayout DgSedeLayout = new javax.swing.GroupLayout(DgSede.getContentPane());
        DgSede.getContentPane().setLayout(DgSedeLayout);
        DgSedeLayout.setHorizontalGroup(
            DgSedeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PNOA1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        DgSedeLayout.setVerticalGroup(
            DgSedeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PNOA1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        lbtitutolo1.setText("¿Seguro que desea Eliminar la Sede Seleccionada?");

        jLabel16.setText("ID:");

        txteliminarcodSede.setEditable(false);
        txteliminarcodSede.setBackground(new java.awt.Color(255, 255, 255));
        txteliminarcodSede.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txteliminarcodSede.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txteliminarcodSedeActionPerformed(evt);
            }
        });

        txteliminarnombre_s.setEditable(false);
        txteliminarnombre_s.setBackground(new java.awt.Color(255, 255, 255));
        txteliminarnombre_s.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel17.setText("Nombre:");

        btnconfirmareliminar_s.setText("ACEPTAR");

        btncancelareliminar_s.setText("CANCELAR");

        javax.swing.GroupLayout DgEliminarSedeLayout = new javax.swing.GroupLayout(DgEliminarSede.getContentPane());
        DgEliminarSede.getContentPane().setLayout(DgEliminarSedeLayout);
        DgEliminarSedeLayout.setHorizontalGroup(
            DgEliminarSedeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, DgEliminarSedeLayout.createSequentialGroup()
                .addContainerGap(57, Short.MAX_VALUE)
                .addGroup(DgEliminarSedeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(DgEliminarSedeLayout.createSequentialGroup()
                        .addComponent(btnconfirmareliminar_s)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btncancelareliminar_s))
                    .addComponent(lbtitutolo1)
                    .addGroup(DgEliminarSedeLayout.createSequentialGroup()
                        .addGroup(DgEliminarSedeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel17)
                            .addComponent(jLabel16))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(DgEliminarSedeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txteliminarnombre_s)
                            .addComponent(txteliminarcodSede))))
                .addGap(93, 93, 93))
        );
        DgEliminarSedeLayout.setVerticalGroup(
            DgEliminarSedeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DgEliminarSedeLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(lbtitutolo1)
                .addGap(18, 18, 18)
                .addGroup(DgEliminarSedeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txteliminarcodSede, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel16))
                .addGap(26, 26, 26)
                .addGroup(DgEliminarSedeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txteliminarnombre_s, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel17))
                .addGap(43, 43, 43)
                .addGroup(DgEliminarSedeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnconfirmareliminar_s)
                    .addComponent(btncancelareliminar_s))
                .addContainerGap(27, Short.MAX_VALUE))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        PNOA.setBackground(new java.awt.Color(204, 255, 255));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/imagenes/LogoCab.png"))); // NOI18N

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Sede");

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

        TdSede.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Nombre", "Direccion", "Telefono", "Email", "Director", "Id_OA", "Disciplina", "Capacidad"
            }
        ));
        jScrollPane1.setViewportView(TdSede);

        jLabel3.setText("BUSCAR");

        BtnCrearJFSede.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        BtnCrearJFSede.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/imagenes/new-file_40454 (3).png"))); // NOI18N
        BtnCrearJFSede.setText("Crear");

        BtnEditarJFSede.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        BtnEditarJFSede.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/imagenes/document-edit_icon-icons.com_52428 (1).png"))); // NOI18N
        BtnEditarJFSede.setText("Editar");

        BtnListarJFSede.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        BtnListarJFSede.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/imagenes/list_notes_930.png"))); // NOI18N
        BtnListarJFSede.setText("Listar");

        BtnEliminarJFSede.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        BtnEliminarJFSede.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/imagenes/delete-file_40456 (1).png"))); // NOI18N
        BtnEliminarJFSede.setText("Eliminar");
        BtnEliminarJFSede.setMaximumSize(new java.awt.Dimension(59, 23));
        BtnEliminarJFSede.setMinimumSize(new java.awt.Dimension(59, 23));

        jbregresar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/imagenes/icons8-izquierda-círculo-36.png"))); // NOI18N
        jbregresar.setBorder(null);
        jbregresar.setBorderPainted(false);
        jbregresar.setContentAreaFilled(false);
        jbregresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbregresarActionPerformed(evt);
            }
        });

        btnimprimirsede.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        btnimprimirsede.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/imagenes/printer_print_22133.png"))); // NOI18N
        btnimprimirsede.setText("Imprimir");

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
                        .addComponent(TxtBuscarSede, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(BtnCrearJFSede)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BtnEditarJFSede)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BtnListarJFSede)
                        .addGap(18, 18, 18)
                        .addComponent(BtnEliminarJFSede, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnimprimirsede)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PNOALayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jbregresar)
                .addGap(37, 37, 37))
        );
        PNOALayout.setVerticalGroup(
            PNOALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PNOALayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(PNOALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BtnEditarJFSede)
                    .addComponent(BtnCrearJFSede)
                    .addComponent(TxtBuscarSede, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(BtnListarJFSede)
                    .addComponent(BtnEliminarJFSede, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnimprimirsede))
                .addGap(30, 30, 30)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
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

    private void txteliminarcodSedeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txteliminarcodSedeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txteliminarcodSedeActionPerformed

    private void jbregresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbregresarActionPerformed
      
    }//GEN-LAST:event_jbregresarActionPerformed

    public JButton getBtnimprimirsede() {
        return btnimprimirsede;
    }

    public void setBtnimprimirsede(JButton btnimprimirsede) {
        this.btnimprimirsede = btnimprimirsede;
    }

    public JButton getBtnCrearJFSede() {
        return BtnCrearJFSede;
    }

    public void setBtnCrearJFSede(JButton BtnCrearJFSede) {
        this.BtnCrearJFSede = BtnCrearJFSede;
    }

    public JButton getBtnCrearSede1() {
        return BtnCrearSede1;
    }

    public void setBtnCrearSede1(JButton BtnCrearSede1) {
        this.BtnCrearSede1 = BtnCrearSede1;
    }

    public JButton getBtnEditarJFSede() {
        return BtnEditarJFSede;
    }

    public void setBtnEditarJFSede(JButton BtnEditarJFSede) {
        this.BtnEditarJFSede = BtnEditarJFSede;
    }

    public JButton getBtnEliminarJFSede() {
        return BtnEliminarJFSede;
    }

    public void setBtnEliminarJFSede(JButton BtnEliminarJFSede) {
        this.BtnEliminarJFSede = BtnEliminarJFSede;
    }

    public JButton getBtnGuardarSede1() {
        return BtnGuardarSede1;
    }

    public void setBtnGuardarSede1(JButton BtnGuardarSede1) {
        this.BtnGuardarSede1 = BtnGuardarSede1;
    }

    public JButton getBtnListarJFSede() {
        return BtnListarJFSede;
    }

    public void setBtnListarJFSede(JButton BtnListarJFSede) {
        this.BtnListarJFSede = BtnListarJFSede;
    }

    public JComboBox<String> getCbxDirectorSede() {
        return CbxDirectorSede;
    }

    public void setCbxDirectorSede(JComboBox<String> CbxDirectorSede) {
        this.CbxDirectorSede = CbxDirectorSede;
    }

    public JDialog getDgSede() {
        return DgSede;
    }

    public void setDgSede(JDialog DgSede) {
        this.DgSede = DgSede;
    }

    public JTable getTdSede() {
        return TdSede;
    }

    public void setTdSede(JTable TdSede) {
        this.TdSede = TdSede;
    }

    public JTextField getTxtBuscarSede() {
        return TxtBuscarSede;
    }

    public void setTxtBuscarSede(JTextField TxtBuscarSede) {
        this.TxtBuscarSede = TxtBuscarSede;
    }

    public JTextField getTxtCodSede1() {
        return TxtCodSede1;
    }

    public void setTxtCodSede1(JTextField TxtCodSede1) {
        this.TxtCodSede1 = TxtCodSede1;
    }

    public JTextField getTxtDirecSede1() {
        return TxtDirecSede1;
    }

    public void setTxtDirecSede1(JTextField TxtDirecSede1) {
        this.TxtDirecSede1 = TxtDirecSede1;
    }

    public JTextField getTxtNombreSede1() {
        return TxtNombreSede1;
    }

    public void setTxtNombreSede1(JTextField TxtNombreSede1) {
        this.TxtNombreSede1 = TxtNombreSede1;
    }

    public JTextField getTxtTelfSede1() {
        return TxtTelfSede1;
    }

    public void setTxtTelfSede1(JTextField TxtTelfSede1) {
        this.TxtTelfSede1 = TxtTelfSede1;
    }

    public JTextField getTxtCorreoS1() {
        return TxtCorreoS1;
    }

    public void setTxtCorreoS1(JTextField TxtCorreoS1) {
        this.TxtCorreoS1 = TxtCorreoS1;
    }

    public JButton getBtncancelareliminar_s() {
        return btncancelareliminar_s;
    }

    public void setBtncancelareliminar_s(JButton btncancelareliminar_s) {
        this.btncancelareliminar_s = btncancelareliminar_s;
    }

    public JButton getBtnconfirmareliminar_s() {
        return btnconfirmareliminar_s;
    }

    public void setBtnconfirmareliminar_s(JButton btnconfirmareliminar_s) {
        this.btnconfirmareliminar_s = btnconfirmareliminar_s;
    }

    public JTextField getTxteliminarcodSede() {
        return txteliminarcodSede;
    }

    public void setTxteliminarcodSede(JTextField txteliminarcodSede) {
        this.txteliminarcodSede = txteliminarcodSede;
    }

    public JTextField getTxteliminarnombre_s() {
        return txteliminarnombre_s;
    }

    public void setTxteliminarnombre_s(JTextField txteliminarnombre_s) {
        this.txteliminarnombre_s = txteliminarnombre_s;
    }

    public JDialog getDgEliminarSede() {
        return DgEliminarSede;
    }

    public void setDgEliminarSede(JDialog DgEliminarSede) {
        this.DgEliminarSede = DgEliminarSede;
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnCrearJFSede;
    private javax.swing.JButton BtnCrearSede1;
    private javax.swing.JButton BtnEditarJFSede;
    private javax.swing.JButton BtnEliminarJFSede;
    private javax.swing.JButton BtnGuardarSede1;
    private javax.swing.JButton BtnListarJFSede;
    private javax.swing.JComboBox<String> CbxDirectorSede;
    private javax.swing.JDialog DgEliminarSede;
    private javax.swing.JDialog DgSede;
    private javax.swing.JPanel PNOA;
    private javax.swing.JPanel PNOA1;
    private javax.swing.JTable TdSede;
    private javax.swing.JTextField TxtBuscarSede;
    private javax.swing.JTextField TxtCodSede1;
    private javax.swing.JTextField TxtCorreoS1;
    private javax.swing.JTextField TxtDirecSede1;
    private javax.swing.JTextField TxtNombreSede1;
    private javax.swing.JTextField TxtTelfSede1;
    private javax.swing.JButton btncancelareliminar_s;
    private javax.swing.JButton btnconfirmareliminar_s;
    private javax.swing.JButton btnimprimirsede;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JButton jbregresar;
    private javax.swing.JLabel lbtitutolo1;
    private javax.swing.JTextField txteliminarcodSede;
    private javax.swing.JTextField txteliminarnombre_s;
    // End of variables declaration//GEN-END:variables
}
