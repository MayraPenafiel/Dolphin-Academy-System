/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import javax.swing.JCheckBoxMenuItem;
import javax.swing.JDesktopPane;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

/**
 *
 * @author HP
 */

public class VistaMenu extends javax.swing.JFrame {

    /**
     * Creates new form Persona
     */
    
    public VistaMenu() {
        initComponents();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenu1 = new javax.swing.JMenu();
        jMenuItem4 = new javax.swing.JMenuItem();
        jCheckBoxMenuItem1 = new javax.swing.JCheckBoxMenuItem();
        DskMenu = new javax.swing.JDesktopPane();
        jToolBar1 = new javax.swing.JToolBar();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JToolBar.Separator();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        MenuAl = new javax.swing.JMenu();
        MIAlumno = new javax.swing.JMenuItem();
        MIProfesor = new javax.swing.JMenuItem();
        MIAdm = new javax.swing.JMenuItem();
        MIDetRealiza = new javax.swing.JMenuItem();
        MIDisciplina = new javax.swing.JMenuItem();
        jmencare = new javax.swing.JMenuItem();
        MIEnt = new javax.swing.JMenuItem();
        MIOA = new javax.swing.JMenuItem();
        MISede = new javax.swing.JMenuItem();
        jmisalir = new javax.swing.JMenuItem();
        MnMenu = new javax.swing.JMenu();

        jMenu1.setText("jMenu1");

        jMenuItem4.setText("jMenuItem4");

        jCheckBoxMenuItem1.setSelected(true);
        jCheckBoxMenuItem1.setText("jCheckBoxMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        DskMenu.setBackground(new java.awt.Color(255, 255, 255));

        jToolBar1.setRollover(true);

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/iconos/User.png"))); // NOI18N
        jButton1.setFocusable(false);
        jButton1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar1.add(jButton1);

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/iconos/Magnifying Glass.png"))); // NOI18N
        jButton2.setFocusable(false);
        jButton2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton2.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar1.add(jButton2);

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/iconos/Download.png"))); // NOI18N
        jButton3.setFocusable(false);
        jButton3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton3.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar1.add(jButton3);
        jToolBar1.add(jSeparator1);

        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/iconos/Book.png"))); // NOI18N
        jButton4.setFocusable(false);
        jButton4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton4.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar1.add(jButton4);

        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/iconos/UI » Window.png"))); // NOI18N
        jButton5.setFocusable(false);
        jButton5.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton5.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar1.add(jButton5);

        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/iconos/icons8-salida-48.png"))); // NOI18N
        jButton6.setToolTipText("Salir");
        jButton6.setBorder(null);
        jButton6.setBorderPainted(false);
        jButton6.setContentAreaFilled(false);
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        DskMenu.setLayer(jToolBar1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        DskMenu.setLayer(jButton6, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout DskMenuLayout = new javax.swing.GroupLayout(DskMenu);
        DskMenu.setLayout(DskMenuLayout);
        DskMenuLayout.setHorizontalGroup(
            DskMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jToolBar1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(DskMenuLayout.createSequentialGroup()
                .addGap(173, 661, Short.MAX_VALUE)
                .addComponent(jButton6)
                .addContainerGap())
        );
        DskMenuLayout.setVerticalGroup(
            DskMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DskMenuLayout.createSequentialGroup()
                .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton6)
                .addContainerGap(365, Short.MAX_VALUE))
        );

        jLabel1.setText("Dolphin Academy System");

        MenuAl.setText("Menu");

        MIAlumno.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/iconos/icons8-classmates-standing-20.png"))); // NOI18N
        MIAlumno.setText("Alumno");
        MIAlumno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MIAlumnoActionPerformed(evt);
            }
        });
        MenuAl.add(MIAlumno);

        MIProfesor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/iconos/icons8-profesor-20.png"))); // NOI18N
        MIProfesor.setText("Profesor");
        MIProfesor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MIProfesorActionPerformed(evt);
            }
        });
        MenuAl.add(MIProfesor);

        MIAdm.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/iconos/icons8-director-de-escuela-20.png"))); // NOI18N
        MIAdm.setText("Administradores");
        MIAdm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MIAdmActionPerformed(evt);
            }
        });
        MenuAl.add(MIAdm);

        MIDetRealiza.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/iconos/icons8-lista-20.png"))); // NOI18N
        MIDetRealiza.setText("Det. Realiza");
        MIDetRealiza.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MIDetRealizaActionPerformed(evt);
            }
        });
        MenuAl.add(MIDetRealiza);

        MIDisciplina.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/iconos/icons8-boxeo-20.png"))); // NOI18N
        MIDisciplina.setText("Disciplina");
        MIDisciplina.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MIDisciplinaActionPerformed(evt);
            }
        });
        MenuAl.add(MIDisciplina);

        jmencare.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/iconos/icons8-añadir-lista-20.png"))); // NOI18N
        jmencare.setText("Enc.Realiza");
        jmencare.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmencareActionPerformed(evt);
            }
        });
        MenuAl.add(jmencare);

        MIEnt.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/iconos/icons8-coach-20.png"))); // NOI18N
        MIEnt.setText("Entrenamiento");
        MIEnt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MIEntActionPerformed(evt);
            }
        });
        MenuAl.add(MIEnt);

        MIOA.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/iconos/icons8-venta-20.png"))); // NOI18N
        MIOA.setText("Oferta Academica");
        MIOA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MIOAActionPerformed(evt);
            }
        });
        MenuAl.add(MIOA);

        MISede.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/iconos/icons8-embajada-20.png"))); // NOI18N
        MISede.setText("Sede");
        MISede.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MISedeActionPerformed(evt);
            }
        });
        MenuAl.add(MISede);

        jmisalir.setText("Salir");
        MenuAl.add(jmisalir);

        jMenuBar1.add(MenuAl);

        MnMenu.setText("Edit");
        jMenuBar1.add(MnMenu);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(DskMenu)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(0, 605, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(DskMenu)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void MIAdmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MIAdmActionPerformed
        // TODO add your handling code here:
       
    }//GEN-LAST:event_MIAdmActionPerformed

    private void MIAlumnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MIAlumnoActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_MIAlumnoActionPerformed

    private void MIProfesorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MIProfesorActionPerformed
 
    }//GEN-LAST:event_MIProfesorActionPerformed

    private void MIDetRealizaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MIDetRealizaActionPerformed
        // TODO add your handling code here:
       
    }//GEN-LAST:event_MIDetRealizaActionPerformed

    private void MIDisciplinaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MIDisciplinaActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_MIDisciplinaActionPerformed

    private void jmencareActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmencareActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jmencareActionPerformed

    private void MIEntActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MIEntActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MIEntActionPerformed

    private void MIOAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MIOAActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MIOAActionPerformed

    private void MISedeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MISedeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MISedeActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton6ActionPerformed
    
    //GETTERS Y SETTERS
    public JMenuItem getMIDetRealiza() {
        return MIDetRealiza;
    }
    public void setMIDetRealiza(JMenuItem MIDetRealiza) {
        this.MIDetRealiza = MIDetRealiza;
    }
    public JMenuItem getMIDisciplina() {
        return MIDisciplina;
    }
    public void setMIDisciplina(JMenuItem MIDisciplina) {
        this.MIDisciplina = MIDisciplina;
    }
    public JMenuItem getMIEnt() {
        return MIEnt;
    }
    public void setMIEnt(JMenuItem MIEnt) {
        this.MIEnt = MIEnt;
    }
    public JMenuItem getMIOA() {
        return MIOA;
    }
    public void setMIOA(JMenuItem MIOA) {
        this.MIOA = MIOA;
    }
    public JMenuItem getMISede() {
        return MISede;
    }
    public void setMISede(JMenuItem MISede) {
        this.MISede = MISede;
    }
    public JDesktopPane getDskMenu() {
        return DskMenu;
    }
    public void setDskMenu(JDesktopPane DskMenu) {
        this.DskMenu = DskMenu;
    }
    public JMenuItem getMIAdm() {
        return MIAdm;
    }
    public void setMIAdm(JMenuItem MIAdm) {
        this.MIAdm = MIAdm;
    }
    public JMenuItem getMIAlumno() {
        return MIAlumno;
    }
    public void setMIAlumno(JMenuItem MIAlumno) {
        this.MIAlumno = MIAlumno;
    }
    public JMenuItem getMIProfesor() {
        return MIProfesor;
    }
    public void setMIProfesor(JMenuItem MIProfesor) {
        this.MIProfesor = MIProfesor;
    }
    public JMenu getMenuP() {
        return MenuAl;
    }
    public void setMenuP(JMenu MenuP) {
        this.MenuAl = MenuP;
    }
    public JMenu getMnMenu() {
        return MnMenu;
    }
    public void setMnMenu(JMenu MnMenu) {
        this.MnMenu = MnMenu;
    }
    public JCheckBoxMenuItem getjCheckBoxMenuItem1() {
        return jCheckBoxMenuItem1;
    }
    public void setjCheckBoxMenuItem1(JCheckBoxMenuItem jCheckBoxMenuItem1) {
        this.jCheckBoxMenuItem1 = jCheckBoxMenuItem1;
    }
    public JMenu getjMenu1() {
        return jMenu1;
    }
    public void setjMenu1(JMenu jMenu1) {
        this.jMenu1 = jMenu1;
    }
    public JMenuBar getjMenuBar1() {
        return jMenuBar1;
    }
    public void setjMenuBar1(JMenuBar jMenuBar1) {
        this.jMenuBar1 = jMenuBar1;
    }
    public JMenuItem getjMenuItem4() {
        return jMenuItem4;
    }
    public void setjMenuItem4(JMenuItem jMenuItem4) {
        this.jMenuItem4 = jMenuItem4;
    }
    public JMenuItem getJmencare() {
        return jmencare;
    }
    public void setJmencare(JMenuItem jmencare) {
        this.jmencare = jmencare;
    }
    public JMenuItem getJmisalir() {
        return jmisalir;
    }
    public void setJmisalir(JMenuItem jmisalir) {
        this.jmisalir = jmisalir;
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane DskMenu;
    private javax.swing.JMenuItem MIAdm;
    private javax.swing.JMenuItem MIAlumno;
    private javax.swing.JMenuItem MIDetRealiza;
    private javax.swing.JMenuItem MIDisciplina;
    private javax.swing.JMenuItem MIEnt;
    private javax.swing.JMenuItem MIOA;
    private javax.swing.JMenuItem MIProfesor;
    private javax.swing.JMenuItem MISede;
    private javax.swing.JMenu MenuAl;
    private javax.swing.JMenu MnMenu;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JToolBar.Separator jSeparator1;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JMenuItem jmencare;
    private javax.swing.JMenuItem jmisalir;
    // End of variables declaration//GEN-END:variables
}
