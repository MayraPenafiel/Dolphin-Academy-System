/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import Modelo.ModeloDisciplina;
import Modelo.Modelo_Entrenamiento;
import Modelo.Modelo_Profesor;
import Modelo.clases_base.Disciplina;
import Modelo.clases_base.Entrenamiento;
import Modelo.clases_base.Profesor;
import Vista.VistaEntrenamiento;
import conexion.ConexionPG;
import java.awt.Toolkit;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.time.Instant;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Date;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author MayraPeñafiel
 */

public class Control_Entrenamiento {
    private Modelo_Entrenamiento modelo;
    private ModeloDisciplina m_dis;
    private Modelo_Profesor m_pro;
    private VistaEntrenamiento vista;
    DefaultTableModel tabla = new DefaultTableModel();
    private ConexionPG con=new ConexionPG();
    
     public Control_Entrenamiento(Modelo_Entrenamiento modelo, VistaEntrenamiento vista, ModeloDisciplina m_dis,Modelo_Profesor m_pro) {
        this.modelo = modelo;
        this.vista = vista;
        this.m_dis=m_dis;
        this.m_pro=m_pro;
         
        //INICIALIZAR ELEMENTOS.
        vista.setTitle("Menu Entrenamiento");
        vista.setVisible(true);
        cargarLista("");
     }

    public Control_Entrenamiento(Modelo_Entrenamiento modelo, VistaEntrenamiento vista) {
        this.modelo = modelo;
        this.vista = vista;
    }
     
     
     public void iniciaControl(){
        KeyListener kl=new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {
                //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void keyPressed(KeyEvent e) {
                //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void keyReleased(KeyEvent e) {
                //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
                cargarLista(vista.getTxtBuscarEnt().getText());
            }
        };
        
         KeyAdapter c1 = new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                char c = e.getKeyChar();
                if (Character.isDigit(c) || Character.isLetter(c)) {
                } else {
                    e.consume();
                    Toolkit.getDefaultToolkit().beep();
                }

                if (vista.getTxtCodEnt().getText().length() > 8) {
                    Toolkit.getDefaultToolkit().beep();
                    e.consume();
                }
            }
        };

        vista.getTxtCodEnt().addKeyListener(c1);

        KeyAdapter c2 = new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                char c = e.getKeyChar();
                if (Character.isLetter(c)) {
                } else {
                    e.consume();
                    Toolkit.getDefaultToolkit().beep();
                }

                if (vista.getTxtDescEnt().getText().length() > 20) {
                    Toolkit.getDefaultToolkit().beep();
                    e.consume();
                }
            }
        };
        vista.getTxtDescEnt().addKeyListener(c2);

        KeyAdapter c3 = new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                char c = e.getKeyChar();
                if (Character.isLetter(c)) {
                } else {
                    e.consume();
                    Toolkit.getDefaultToolkit().beep();
                }

                if (vista.getTxtObsEnt().getText().length() > 20) {
                    Toolkit.getDefaultToolkit().beep();
                    e.consume();
                }
            }
        };
        vista.getTxtObsEnt().addKeyListener(c3);

        //Controlar Eventos de la Vista Entrenamiento
        vista.getBtnListarJFEnt().addActionListener(l->cargarLista(""));
        vista.getBtnCrearJFEnt().addActionListener(l->abrir_dialogo(1));
        vista.getBtnEditarJFEnt().addActionListener(l->abrir_dialogo(2));
        vista.getBtnEliminarJFEnt().addActionListener(l->abrir_dialogo(3));
        
        //Controlar Eventos Dialogo Ingreso/modificar info
        vista.getBtnGuardarEnt().addActionListener(l->guardar_ent());
        vista.getBtnCancelarEnt().addActionListener(l->vista.getDgEntrenamientp().dispose());
       
        //Control Buscar
        vista.getTxtBuscarEnt().addKeyListener(kl);
        
        //Control eventos Dialogo Eliminar
        vista.getJbconfirmar2().addActionListener(l->confirmar());
        vista.getJbcancelardel().addActionListener(l->vista.getDgdelent2().dispose());
     }
     
     private void abrir_dialogo(int origen){
        vista.getDgEntrenamientp().setSize(600,400); 
        vista.getDgEntrenamientp().setLocationRelativeTo(vista); 
        if(origen==1){
           vista.getDgEntrenamientp().setTitle("Nuevo Registro"); 
           limpiar();cargar_combo_box();
           vista.getDgEntrenamientp().setVisible(true);
        }
        if(origen==2){ 
            vista.getDgEntrenamientp().setTitle("Editar Registro");
            limpiar();
            vista.getDgdelent2().setVisible(true);
            modificar_registro();
        }
        vista.getDgdelent2().setSize(450,300); 
        vista.getDgEntrenamientp().setLocationRelativeTo(vista); 
        if (origen==3){
            vista.getDgdelent2().setTitle("Eliminar Registro");
            vista.getDgdelent2().setVisible(true);
            eliminar_persona();
        }
    }
    
    //Metodo para Cargar Datos
    private void cargarLista(String aguja){
    //Carga datos a la vista.
        DefaultTableModel tablaMD;
        tablaMD = (DefaultTableModel)vista.getTbEntrenamiento().getModel();
        tablaMD.setNumRows(0);
        List<Entrenamiento> lista=modelo.listarEnt(aguja);
        lista.stream().forEach(ent->{
            tablaMD.addRow( new Object[]{ent.getId_entrenamiento(),ent.getId_profesor(),ent.getId_disciplina(),
                ent.getF_inicio(),ent.getF_fin(),ent.getDescripcion(),ent.getObservaciones()});
        });
    }
    
    //Metodo para llenar los combobox
    private void cargar_combo_box(){
        //Profesor
        DefaultComboBoxModel <String> jbpro = new DefaultComboBoxModel();
        List<Profesor> lpro=m_pro.listaProfesores();
        lpro.stream().forEach(d->{
            String[] profesor={d.getNombre()+" ",d.getApellido()};
            String[] pdis={d.getFormacion()};
            if(vista.getJcbdiscent().getSelectedItem().toString()==pdis.toString()){
                jbpro.addElement(profesor.toString());
            }
        });
        
        //Disciplina
        DefaultComboBoxModel <String> jbdis = new DefaultComboBoxModel();
        List<Disciplina> lista=m_dis.listaDisciplinas();
            lista.stream().forEach(d->{
            String[] disciplina={d.getId_disciplina()+" ",d.getNombre_d()};
            jbdis.addElement(disciplina.toString());
        });
    }
    
    //Metodo Guardar Entrenamiento
    private void guardar_ent(){
        String id=vista.getTxtCodEnt().getText();
        String descripcion=vista.getTxtDescEnt().getText();
        String observaciones=vista.getTxtObsEnt().getText();
            
        //Obtener Fecha de Inicio a partir del JCaledar
        Instant instant= vista.getDCFechaIniEnt().getDate().toInstant();
        ZoneId zid= ZoneId.of("America/Guayaquil");
        ZonedDateTime zdt=ZonedDateTime.ofInstant(instant, zid);
        java.sql.Date fi = java.sql.Date.valueOf(zdt.toLocalDate());
        
        //Obtener Fecha de Fin a partir del JCalendar
        Instant insta= vista.getDCFechaFinEnt().getDate().toInstant();
        ZoneId z= ZoneId.of("America/Guayaquil");
        ZonedDateTime zd=ZonedDateTime.ofInstant(insta, z);
        java.sql.Date fn = java.sql.Date.valueOf(zd.toLocalDate());
        
        //Obtener Datos desde un combobox
        
        //Disciplina
        String entd="";
        String dis=vista.getJcbdiscent().getSelectedItem().toString();
        List<Disciplina> comp=m_dis.listaDisciplinas();
        for (int i = 0; i < comp.size(); i++) {
            if(comp.get(i).getNombre_d()==dis){
                entd=comp.get(i).getId_disciplina();
            }else{
                System.out.println("Disciplina Inexistente");
            }
        }
        
        //Profesor
        String pro=vista.getJcbproent().getSelectedItem().toString();
        String entp="";
        List<Profesor> cop=m_pro.listaProfesores();
        for (int i = 0; i < comp.size(); i++) {
            String nom= cop.get(i).getNombre()+""+cop.get(i).getApellido();
            if(nom==pro){
                entp=cop.get(i).getId_Profesor();
            }else{
                System.out.println("Profesor Inexistente");
            }
        }
        
        //Setear Valores
        Modelo_Entrenamiento ent=new Modelo_Entrenamiento();
        ent.setId_entrenamiento(id);
        ent.setDescripcion(descripcion);
        ent.setF_fin(fn);
        ent.setF_inicio(fi);
        ent.setObservaciones(observaciones);
        ent.setId_disciplina(entd);
        ent.setId_profesor(entp);
        
        if("Nuevo Registro".equals(vista.getDgEntrenamientp().getTitle())){
            if(ent.grabar()){ 
                //limpiar();
                JOptionPane.showMessageDialog(vista, "Entrenamiento Creado Satisfactoriamente");
                vista.getDgEntrenamientp().dispose();
            }else{
                JOptionPane.showMessageDialog(vista, "Error");
            }
            limpiar();
        }   
            
        if("Editar Registro".equals(vista.getDgEntrenamientp().getTitle())){
            if(ent.modificar()){
                //limpiar();
                JOptionPane.showMessageDialog(vista, "Entrenamiento Modificado Satisfactoriamente");
                vista.getDgEntrenamientp().dispose();
            }else{
                JOptionPane.showMessageDialog(vista, "Error");
            }  
            limpiar();
        }   
    }
    
     private void modificar_registro(){
        int se=vista.getTbEntrenamiento().getSelectedRow();
        if (se>=0){
            cargarLista("");
            List<Entrenamiento> lista=modelo.listarEnt();
            for (int i = 0; i <lista.size(); i++) {
                 if(i==se){
                    String id=lista.get(i).getId_entrenamiento()+"";
                    String dis=lista.get(i).getId_disciplina()+"";
                    String pro=lista.get(i).getId_profesor()+"";
                    Date fn=lista.get(i).getF_fin();
                    Date fi=lista.get(i).getF_inicio();
                    String des=lista.get(i).getDescripcion()+"";
                    String obs=lista.get(i).getObservaciones()+"";
                    
                    vista.getTxtCodEnt().setText(id);
                    vista.getDCFechaIniEnt().setDate(fi);
                    vista.getDCFechaFinEnt().setDate(fn);
                    vista.getTxtDescEnt().setText(des);
                    vista.getTxtObsEnt().setText(obs);
                    
                    //Llenar Combobox de Profesor
                    DefaultComboBoxModel <String> jbpro = new DefaultComboBoxModel();
                    List<Profesor> mpro=m_pro.listaProfesores();
                    mpro.stream().forEach(d->{
                        String[] profesor={d.getId_Profesor()+""};
                        String[] n_p={d.getNombre()};
                        if(profesor.toString()==pro){
                            jbpro.addElement(n_p.toString());
                            vista.getJcbproent().setSelectedItem(n_p);
                        }else{
                            vista.getJcbproent().setSelectedItem(null);
                            System.out.println("Profesor Inexistente");
                        }
                    });
                    
                    //Llenar Combobox de Diciplina
                    DefaultComboBoxModel <String> jbdis = new DefaultComboBoxModel();
                    List<Disciplina> mdis=m_dis.listaDisciplinas();
                    mdis.stream().forEach(d->{
                        String[] disciplina={d.getId_disciplina()+""};
                        String[] n_d={d.getNombre_d()};
                        if(disciplina.toString()==dis){
                            jbdis.addElement(n_d.toString());
                            vista.getJcbdiscent().setSelectedItem(n_d);
                        }else{
                            vista.getJcbdiscent().setSelectedItem(null);
                            System.out.println("Disciplina Inexistente");
                        }
                    });
                 }
            }
         }else{
            JOptionPane.showMessageDialog(vista, "Seleccione una fila");
            vista.getDgEntrenamientp().setVisible(false);
        }
    }
    
    private void limpiar(){
        vista.getTxtCodEnt().setText("");
        vista.getTxtDescEnt().setText("");
        vista.getTxtObsEnt().setText("");
        //vista.getDcfechanacimiento().setDateFormatString("");
        vista.getDCFechaFinEnt().setDate(null);
        vista.getDCFechaIniEnt().setDate(null); 
        vista.getJcbdiscent().setSelectedIndex(0);
        vista.getJcbproent().setSelectedIndex(0);
    }  
    
    private void eliminar_persona(){
        int se=vista.getTbEntrenamiento().getSelectedRow();
        if (se>=0){
            cargarLista("");
            List<Entrenamiento> lista=modelo.listarEnt();
            for (int i = 0; i <lista.size(); i++) {
                 if(i==se){
                     vista.getTxtCodEnt().setText(lista.get(i).getId_entrenamiento()+"");
                    vista.getTxtDescEnt().setText(lista.get(i).getDescripcion());
                 }
            }
        }else{
             JOptionPane.showMessageDialog(vista, "Seleccione una fila");
            vista.getDgdelent2().setVisible(false);
        }
    }
    
    private void confirmar(){
        String id=vista.getTxtidel2().getText();
        Modelo_Entrenamiento ent=new Modelo_Entrenamiento();
        ent.setId_entrenamiento(id);
        if(ent.eliminar()){
            JOptionPane.showMessageDialog(vista, "Persona Eliminada Satisfactoriamente");
            vista.getDgdelent2().dispose();
            limpiar();
        }
    }
    
}
