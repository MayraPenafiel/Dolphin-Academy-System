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
public class VistaProfesor extends javax.swing.JFrame {

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
        TxtEmailProf = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        TxtCelularProf = new javax.swing.JTextField();
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

        PNOA1.setBackground(new java.awt.Color(204, 255, 255));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/iconos/LogoCab.png"))); // NOI18N

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

        TxtCodProf.setText("Generacion Aut.");
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
                            .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                                            .addComponent(BtnCrearProf)
                                            .addComponent(TxtNombreProf, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(PNOA1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(BtnGuardarProf)
                                            .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))))
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
                                .addComponent(TxtEmailProf, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(TxtCelularProf, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                    .addComponent(TxtEmailProf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(PNOA1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel22)
                    .addComponent(TxtCelularProf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(PNOA1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BtnCrearProf)
                    .addComponent(BtnGuardarProf))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        PNOA.setBackground(new java.awt.Color(204, 255, 255));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/iconos/LogoCab.png"))); // NOI18N

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
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 486, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1)
            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        TbProfesor.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Cedula", "Nombres", "Apellido", "Direccion", "Telefono", "Correo", "Fecha Nac", "Celukar"
            }
        ));
        jScrollPane1.setViewportView(TbProfesor);

        jLabel3.setText("BUSCAR");

        BtnCrearJFProf.setText("Crear");

        BtnEditarJFProf.setText("Editar");

        BtnListarJFProf.setText("Listar");

        BtnEliminarJFProf.setText("Eliminar");
        BtnEliminarJFProf.setMaximumSize(new java.awt.Dimension(59, 23));
        BtnEliminarJFProf.setMinimumSize(new java.awt.Dimension(59, 23));

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
                        .addComponent(TxtBuscarProf, javax.swing.GroupLayout.DEFAULT_SIZE, 128, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(BtnCrearJFProf, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BtnEditarJFProf, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(BtnListarJFProf)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(BtnEliminarJFProf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(89, 89, 89)))
                .addContainerGap())
        );
        PNOALayout.setVerticalGroup(
            PNOALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PNOALayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(PNOALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BtnEditarJFProf)
                    .addComponent(BtnCrearJFProf)
                    .addComponent(TxtBuscarProf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(BtnListarJFProf)
                    .addComponent(BtnEliminarJFProf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PNOA, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PNOA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TxtCodProfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtCodProfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtCodProfActionPerformed

//    /**
//     * @param args the command line arguments
//     */
//    public static void main(String args[]) {
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(VistaProfesor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(VistaProfesor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(VistaProfesor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(VistaProfesor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new VistaProfesor().setVisible(true);
//            }
//        });
//    }
    
    //GETTERS Y SETTERS
    
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
        return TxtCelularProf;
    }

    public void setTxtCelularProf(JTextField TxtCelularProf) {
        this.TxtCelularProf = TxtCelularProf;
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
        return TxtEmailProf;
    }

    public void setTxtEmailProf(JTextField TxtEmailProf) {
        this.TxtEmailProf = TxtEmailProf;
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

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnCrearJFProf;
    private javax.swing.JButton BtnCrearProf;
    private javax.swing.JButton BtnEditarJFProf;
    private javax.swing.JButton BtnEliminarJFProf;
    private javax.swing.JButton BtnGuardarProf;
    private javax.swing.JButton BtnListarJFProf;
    private com.toedter.calendar.JDateChooser DCProf;
    private javax.swing.JDialog DgProfesor;
    private javax.swing.JPanel PNOA;
    private javax.swing.JPanel PNOA1;
    private javax.swing.JTable TbProfesor;
    private javax.swing.JTextField TxtApeProf;
    private javax.swing.JTextField TxtBuscarProf;
    private javax.swing.JTextField TxtCedulaProf;
    private javax.swing.JTextField TxtCelularProf;
    private javax.swing.JTextField TxtCodProf;
    private javax.swing.JTextField TxtDireccionProf;
    private javax.swing.JTextField TxtEmailProf;
    private javax.swing.JTextField TxtNombreProf;
    private javax.swing.JTextField TxtTelfProf;
    private javax.swing.JLabel jLabel1;
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
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
