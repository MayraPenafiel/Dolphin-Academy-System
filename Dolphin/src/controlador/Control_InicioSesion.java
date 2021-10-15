/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import Modelo.ModeloAlumno;
import Modelo.ModeloDirector;
import Modelo.Modelo_Profesor;
import Modelo.clases_base.Alumno;
import Modelo.clases_base.Director;
import Modelo.clases_base.Profesor;
import Vista.VistaInicioSesion;
import Vista.VistaMenu;
import Vista.VistaPrincipal;
import java.util.List;
import javax.swing.JInternalFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author MayraPeñafiel
 */

public class Control_InicioSesion{
   private ModeloAlumno modal;
   private Modelo_Profesor modpro;
   private ModeloDirector moddir;
   private Control_Principal cp;
   private VistaInicioSesion vista;
   private VistaPrincipal vp;

   //Constructores
    public Control_InicioSesion(ModeloAlumno modal, Modelo_Profesor modpro, ModeloDirector moddir, VistaInicioSesion vista, VistaPrincipal vp) {
        this.modal = modal;
        this.modpro = modpro;
        this.moddir = moddir;
        this.vista = vista;
        this.vp=vp;
        //INICIALIZAR ELEMENTOS.
        //vista.setTitle("Iniciar Sesion");
        vista.setVisible(true);
        
//        if(vp.getBtnAlum().isSelected()){
//            vista.getJlbpass().setEnabled(false);
//            vista.getJlbpass().setVisible(false);
//            vista.getJlbuser().setText("Clave de Acceso");
//            vista.getPwfcontraseña().setEnabled(false);
//            vista.getPwfcontraseña().setVisible(false);
//        }
    }
    public Control_InicioSesion(VistaInicioSesion vis) {
        this.vista=vis;
        vista.setVisible(true);
    }
    
    //Controlar Eventos de la Vista IiciarSesion
    public void iniciaControl(){
        vista.getBtnIngresar().addActionListener(l->llamar_boton());
        vista.getJbcancelar().addActionListener(l->vista.dispose());
     }
    
    private void llamar_boton(){
        if(vp.getBtnProf().isSelected()){
            comp_pro();
            
        }
        if(vp.getBtnAdm().isSelected()){ 
            comp_dir();
        }
        if (vp.getBtnAlum().isSelected()){
            comp_al();
        }
    }
     
    //metodos para comparar datos ingresados
    
    //Profesor
    public void comp_pro(){
        String usuario=vista.getTxtNombreUser().getText();
        List<Profesor> lpro=modpro.listaProfesores();
         for (int i = 0; i <lpro.size(); i++) {
            if(lpro.get(i).getId_Profesor()==usuario){
                char ty[]=lpro.get(i).getContraseña().toCharArray();;
                if(vista.getPwfcontraseña().getPassword()==ty){
                    JOptionPane.showMessageDialog(null, "Inicio de sesion Exitoso");
                }
            }
        } 
    }
    
    //Director
    public void comp_dir(){
        String usuario=vista.getTxtNombreUser().getText();
        List<Director> ldir=moddir.listaDirectores();
         for (int i = 0; i <ldir.size(); i++) {
            if(ldir.get(i).getId_director()==usuario){
                char ty[]=ldir.get(i).getContraseña().toCharArray();;
                if(vista.getPwfcontraseña().getPassword()==ty){
                    JOptionPane.showMessageDialog(null, "Inicio de sesion Exitoso");
                    VistaMenu menu=new VistaMenu();
                    menu.setVisible(true);
                }
            }
        } 
    }
    
    //Alumno
    public void comp_al(){
        String usuario=vista.getTxtNombreUser().getText();
        List<Alumno> lal=modal.listaAlumnos();
         for (int i = 0; i <lal.size(); i++) {
            if(lal.get(i).getId_alumno()==usuario){
                    JOptionPane.showMessageDialog(null, "Inicio de sesion Exitoso");
                    VistaMenu menu=new VistaMenu();
                    menu.setVisible(true);
            }
         }
    }
    
    public void botonalumo() {
        if (vp.getBtnAlum().isSelected()) {
            vista.getJlbpass().setEnabled(false);
            vista.getJlbpass().setVisible(false);
            vista.getJlbuser().setText("Clave de Acceso");
            vista.getPwfcontraseña().setEnabled(false);
            vista.getPwfcontraseña().setVisible(false);
        }
    }
    
 }
    
    
        
     
   
   

