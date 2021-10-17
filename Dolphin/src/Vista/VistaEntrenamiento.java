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
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.JTextField;

/**
 *
 * @author HP
 */

public class VistaEntrenamiento extends javax.swing.JInternalFrame {

    /**
     * Creates new form VistaEntrenamiento
     */
    
    public VistaEntrenamiento() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        DgEntrenamientp = new javax.swing.JDialog();
        PnEntrenamiento1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        TxtDescEnt = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        DCFechaFinEnt = new com.toedter.calendar.JDateChooser();
        DCFechaIniEnt = new com.toedter.calendar.JDateChooser();
        TxtCodEnt = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        TxtObsEnt = new javax.swing.JTextField();
        BtnCancelarEnt = new javax.swing.JButton();
        BtnGuardarEnt = new javax.swing.JButton();
        jcbdiscent = new javax.swing.JComboBox<>();
        jcbproent = new javax.swing.JComboBox<>();
        dgdelent2 = new javax.swing.JDialog();
        jPanel5 = new javax.swing.JPanel();
        lbtitutolo2 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        txtdescdel2 = new javax.swing.JTextField();
        jbconfirmar2 = new javax.swing.JButton();
        Txtidel2 = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jbcancelardel = new javax.swing.JButton();
        PNOA = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TbEntrenamiento = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        TxtBuscarEnt = new javax.swing.JTextField();
        BtnCrearJFEnt = new javax.swing.JButton();
        BtnEditarJFEnt = new javax.swing.JButton();
        BtnListarJFEnt = new javax.swing.JButton();
        BtnEliminarJFEnt = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        PnEntrenamiento1.setBackground(new java.awt.Color(204, 255, 255));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/iconos/LogoCab.png"))); // NOI18N

        jLabel11.setBackground(new java.awt.Color(255, 255, 255));
        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("ENTRENAMIENTO");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel7)
            .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel12.setText("Codigo:");

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel13.setText("Inicio:");

        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel14.setText("Fin:");

        jLabel15.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel15.setText("Profesor:");

        jLabel16.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel16.setText("Disciplina:");

        jLabel17.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel17.setText("Descripcion:");

        jLabel18.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel18.setText("Observacion:");

        BtnCancelarEnt.setText("Cancelar");

        BtnGuardarEnt.setText("Guardar");

        jcbdiscent.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "----------", " " }));

        jcbproent.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--------------" }));

        javax.swing.GroupLayout PnEntrenamiento1Layout = new javax.swing.GroupLayout(PnEntrenamiento1);
        PnEntrenamiento1.setLayout(PnEntrenamiento1Layout);
        PnEntrenamiento1Layout.setHorizontalGroup(
            PnEntrenamiento1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PnEntrenamiento1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PnEntrenamiento1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PnEntrenamiento1Layout.createSequentialGroup()
                        .addGroup(PnEntrenamiento1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel15, javax.swing.GroupLayout.DEFAULT_SIZE, 138, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(PnEntrenamiento1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(PnEntrenamiento1Layout.createSequentialGroup()
                                .addGroup(PnEntrenamiento1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(TxtCodEnt, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(PnEntrenamiento1Layout.createSequentialGroup()
                                        .addGap(31, 31, 31)
                                        .addComponent(BtnGuardarEnt)))
                                .addGroup(PnEntrenamiento1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(PnEntrenamiento1Layout.createSequentialGroup()
                                        .addGap(58, 58, 58)
                                        .addComponent(BtnCancelarEnt))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PnEntrenamiento1Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel16)
                                        .addGap(17, 17, 17))))
                            .addGroup(PnEntrenamiento1Layout.createSequentialGroup()
                                .addGroup(PnEntrenamiento1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(DCFechaFinEnt, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(DCFechaIniEnt, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jcbproent, javax.swing.GroupLayout.Alignment.LEADING, 0, 119, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(PnEntrenamiento1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(PnEntrenamiento1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jcbdiscent, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(PnEntrenamiento1Layout.createSequentialGroup()
                                .addGroup(PnEntrenamiento1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(TxtDescEnt, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(TxtObsEnt, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        PnEntrenamiento1Layout.setVerticalGroup(
            PnEntrenamiento1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PnEntrenamiento1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PnEntrenamiento1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(PnEntrenamiento1Layout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(PnEntrenamiento1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel12)
                            .addComponent(TxtCodEnt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel16)
                            .addComponent(jcbdiscent, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(PnEntrenamiento1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel13)
                            .addComponent(DCFechaIniEnt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(PnEntrenamiento1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel17)
                                .addComponent(TxtDescEnt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(PnEntrenamiento1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(PnEntrenamiento1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel14)
                                .addComponent(DCFechaFinEnt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel18)))
                    .addComponent(TxtObsEnt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(PnEntrenamiento1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(jcbproent, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(PnEntrenamiento1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BtnCancelarEnt)
                    .addComponent(BtnGuardarEnt))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout DgEntrenamientpLayout = new javax.swing.GroupLayout(DgEntrenamientp.getContentPane());
        DgEntrenamientp.getContentPane().setLayout(DgEntrenamientpLayout);
        DgEntrenamientpLayout.setHorizontalGroup(
            DgEntrenamientpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PnEntrenamiento1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        DgEntrenamientpLayout.setVerticalGroup(
            DgEntrenamientpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PnEntrenamiento1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel5.setBackground(new java.awt.Color(0, 102, 102));

        lbtitutolo2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lbtitutolo2.setForeground(new java.awt.Color(255, 255, 255));
        lbtitutolo2.setText("¿Seguro que desea Eliminar El Entrenamiento Seleccionado?");

        jScrollPane4.setViewportView(txtdescdel2);

        jbconfirmar2.setBackground(new java.awt.Color(255, 255, 255));
        jbconfirmar2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jbconfirmar2.setForeground(new java.awt.Color(0, 153, 153));
        jbconfirmar2.setText("Confirmar");

        Txtidel2.setEditable(false);
        Txtidel2.setBackground(new java.awt.Color(255, 255, 255));
        Txtidel2.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel22.setForeground(new java.awt.Color(204, 204, 255));
        jLabel22.setText("ID:");

        jLabel23.setBackground(new java.awt.Color(204, 204, 255));
        jLabel23.setForeground(new java.awt.Color(204, 204, 255));
        jLabel23.setText("Descripcion: ");

        jbcancelardel.setBackground(new java.awt.Color(255, 255, 255));
        jbcancelardel.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jbcancelardel.setForeground(new java.awt.Color(0, 153, 153));
        jbcancelardel.setText("Cancelar");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(jLabel23)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(jbconfirmar2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jbcancelardel)
                                .addGap(43, 43, 43))))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(88, 88, 88)
                        .addComponent(jLabel22)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Txtidel2, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(lbtitutolo2)))
                .addContainerGap(27, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(29, Short.MAX_VALUE)
                .addComponent(lbtitutolo2)
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel22)
                    .addComponent(Txtidel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel23)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jbconfirmar2)
                    .addComponent(jbcancelardel))
                .addGap(31, 31, 31))
        );

        javax.swing.GroupLayout dgdelent2Layout = new javax.swing.GroupLayout(dgdelent2.getContentPane());
        dgdelent2.getContentPane().setLayout(dgdelent2Layout);
        dgdelent2Layout.setHorizontalGroup(
            dgdelent2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        dgdelent2Layout.setVerticalGroup(
            dgdelent2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        PNOA.setBackground(new java.awt.Color(204, 255, 255));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/iconos/LogoCab.png"))); // NOI18N

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Entrenamiento");

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

        TbEntrenamiento.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Id_Profesor", "Id_Disciplina", "Inicio", "Fin", "Descripcion", "Observaciones"
            }
        ));
        jScrollPane1.setViewportView(TbEntrenamiento);

        jLabel3.setText("BUSCAR");

        BtnCrearJFEnt.setText("Crear");

        BtnEditarJFEnt.setText("Editar");

        BtnListarJFEnt.setText("Listar");

        BtnEliminarJFEnt.setText("Eliminar");
        BtnEliminarJFEnt.setMaximumSize(new java.awt.Dimension(59, 23));
        BtnEliminarJFEnt.setMinimumSize(new java.awt.Dimension(59, 23));

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
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 621, Short.MAX_VALUE)
                    .addGroup(PNOALayout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(TxtBuscarEnt)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(BtnCrearJFEnt, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BtnEditarJFEnt, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(BtnListarJFEnt)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(BtnEliminarJFEnt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(89, 89, 89)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PNOALayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(20, 20, 20))
        );
        PNOALayout.setVerticalGroup(
            PNOALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PNOALayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(PNOALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BtnEditarJFEnt)
                    .addComponent(BtnCrearJFEnt)
                    .addComponent(TxtBuscarEnt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(BtnListarJFEnt)
                    .addComponent(BtnEliminarJFEnt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton1)
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

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       
    }//GEN-LAST:event_jButton1ActionPerformed

    // Metodos GETTERS Y SETTERS
    
    //Vista Principal
    public JButton getBtnCrearJFEnt() {
        return BtnCrearJFEnt;
    }
    public void setBtnCrearJFEnt(JButton BtnCrearJFEnt) {
        this.BtnCrearJFEnt = BtnCrearJFEnt;
    }
    public JButton getBtnEditarJFEnt() {
        return BtnEditarJFEnt;
    }
    public void setBtnEditarJFEnt(JButton BtnEditarJFEnt) {
        this.BtnEditarJFEnt = BtnEditarJFEnt;
    }
    public JButton getBtnEliminarJFEnt() {
        return BtnEliminarJFEnt;
    }
    public void setBtnEliminarJFEnt(JButton BtnEliminarJFEnt) {
        this.BtnEliminarJFEnt = BtnEliminarJFEnt;
    }
    public JButton getBtnListarJFEnt() {
        return BtnListarJFEnt;
    }
    public void setBtnListarJFEnt(JButton BtnListarJFEnt) {
        this.BtnListarJFEnt = BtnListarJFEnt;
    }
    public JPanel getPNOA() {
        return PNOA;
    }
    public void setPNOA(JPanel PNOA) {
        this.PNOA = PNOA;
    }
    public JTable getTbEntrenamiento() {
        return TbEntrenamiento;
    }
    public void setTbEntrenamiento(JTable TbEntrenamiento) {
        this.TbEntrenamiento = TbEntrenamiento;
    }
    public JTextField getTxtBuscarEnt() {
        return TxtBuscarEnt;
    }
    public void setTxtBuscarEnt(JTextField TxtBuscarEnt) {
        this.TxtBuscarEnt = TxtBuscarEnt;
    }
    
    //Diagolo Ingresar/Modificar
    public JButton getBtnCancelarEnt() {
        return BtnCancelarEnt;
    }
    public void setBtnCancelarEnt(JButton BtnCancelarEnt) {
        this.BtnCancelarEnt = BtnCancelarEnt;
    }
    public JButton getBtnGuardarEnt() {
        return BtnGuardarEnt;
    }
    public void setBtnGuardarEnt(JButton BtnGuardarEnt) {
        this.BtnGuardarEnt = BtnGuardarEnt;
    }
    public JDateChooser getDCFechaFinEnt() {
        return DCFechaFinEnt;
    }
    public void setDCFechaFinEnt(JDateChooser DCFechaFinEnt) {
        this.DCFechaFinEnt = DCFechaFinEnt;
    }
    public JDateChooser getDCFechaIniEnt() {
        return DCFechaIniEnt;
    }
    public void setDCFechaIniEnt(JDateChooser DCFechaIniEnt) {
        this.DCFechaIniEnt = DCFechaIniEnt;
    }
    public JDialog getDgEntrenamientp() {
        return DgEntrenamientp;
    }
    public void setDgEntrenamientp(JDialog DgEntrenamientp) {
        this.DgEntrenamientp = DgEntrenamientp;
    }
    public JPanel getPnEntrenamiento1() {
        return PnEntrenamiento1;
    }
    public void setPnEntrenamiento1(JPanel PnEntrenamiento1) {
        this.PnEntrenamiento1 = PnEntrenamiento1;
    }
    public JTextField getTxtCodEnt() {
        return TxtCodEnt;
    }
    public void setTxtCodEnt(JTextField TxtCodEnt) {
        this.TxtCodEnt = TxtCodEnt;
    }
    public JTextField getTxtDescEnt() {
        return TxtDescEnt;
    }
    public void setTxtDescEnt(JTextField TxtDescEnt) {
        this.TxtDescEnt = TxtDescEnt;
    }
    public JTextField getTxtObsEnt() {
        return TxtObsEnt;
    }
    public void setTxtObsEnt(JTextField TxtObsEnt) {
        this.TxtObsEnt = TxtObsEnt;
    }
    public JComboBox<String> getJcbdiscent() {
        return jcbdiscent;
    }
    public void setJcbdiscent(JComboBox<String> jcbdiscent) {
        this.jcbdiscent = jcbdiscent;
    }
    public JComboBox<String> getJcbproent() {
        return jcbproent;
    }
    public void setJcbproent(JComboBox<String> jcbproent) {
        this.jcbproent = jcbproent;
    }
    
    //Ventana Eliminar
    public JTextField getTxtidel2() {
        return Txtidel2;
    }
    public void setTxtidel2(JTextField Txtidel2) {
        this.Txtidel2 = Txtidel2;
    }
    public JDialog getDgdelent2() {
        return dgdelent2;
    }
    public void setDgdelent2(JDialog dgdelent2) {
        this.dgdelent2 = dgdelent2;
    }
    public JButton getJbconfirmar2() {
        return jbconfirmar2;
    }
    public void setJbconfirmar2(JButton jbconfirmar2) {
        this.jbconfirmar2 = jbconfirmar2;
    }
    public JLabel getLbtitutolo2() {
        return lbtitutolo2;
    }
    public void setLbtitutolo2(JLabel lbtitutolo2) {
        this.lbtitutolo2 = lbtitutolo2;
    }
    public JTextField getTxtdescdel2() {
        return txtdescdel2;
    }
    public void setTxtdescdel2(JTextField txtdescdel2) {
        this.txtdescdel2 = txtdescdel2;
    }
    public JButton getJbcancelardel() {
        return jbcancelardel;
    }
    public void setJbcancelardel(JButton jbcancelardel) {
        this.jbcancelardel = jbcancelardel;
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnCancelarEnt;
    private javax.swing.JButton BtnCrearJFEnt;
    private javax.swing.JButton BtnEditarJFEnt;
    private javax.swing.JButton BtnEliminarJFEnt;
    private javax.swing.JButton BtnGuardarEnt;
    private javax.swing.JButton BtnListarJFEnt;
    private com.toedter.calendar.JDateChooser DCFechaFinEnt;
    private com.toedter.calendar.JDateChooser DCFechaIniEnt;
    private javax.swing.JDialog DgEntrenamientp;
    private javax.swing.JPanel PNOA;
    private javax.swing.JPanel PnEntrenamiento1;
    private javax.swing.JTable TbEntrenamiento;
    private javax.swing.JTextField TxtBuscarEnt;
    private javax.swing.JTextField TxtCodEnt;
    private javax.swing.JTextField TxtDescEnt;
    private javax.swing.JTextField TxtObsEnt;
    private javax.swing.JTextField Txtidel2;
    private javax.swing.JDialog dgdelent2;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JButton jbcancelardel;
    private javax.swing.JButton jbconfirmar2;
    private javax.swing.JComboBox<String> jcbdiscent;
    private javax.swing.JComboBox<String> jcbproent;
    private javax.swing.JLabel lbtitutolo2;
    private javax.swing.JTextField txtdescdel2;
    // End of variables declaration//GEN-END:variables

}