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
    public Control_InicioSesion(VistaInicioSesion vis,ModeloAlumno modal) {
        this.vista=vis;
        vista.setVisible(true);
        vista.setLocationRelativeTo(null);
        this.modal = modal;
        //_________________
       iniciaControlAlumno();
       //________________
        vista.getPwfcontraseña().setVisible(false);
        vista.getJlbpass().setVisible(false);
        String h=Control_Principal.boton;
        System.out.println(h);
    }
    
     public Control_InicioSesion(VistaInicioSesion vis,ModeloDirector moddir) {
        this.vista=vis;
        vista.setVisible(true);
         this.moddir = moddir;
        vista.setLocationRelativeTo(null);
        //_________________
        iniciaControlDire();
        String h=Control_Principal.boton;
        System.out.println(h);
    }
      
     public Control_InicioSesion(VistaInicioSesion vis,Modelo_Profesor modpro) {
        this.vista=vis;
        this.modpro = modpro;
        vista.setVisible(true);
        vista.setLocationRelativeTo(null);
        //_________________
        iniciaControlProf();
        String h=Control_Principal.boton;
        System.out.println(h);
    }
    
    //Controlar Eventos de la Vista IiciarSesion
    public void iniciaControlAlumno(){
        vista.getBtnIngresar().addActionListener(l->comp_al());
        vista.getJbcancelar().addActionListener(l->regresar());
     }
    
     public void iniciaControlProf(){
        vista.getBtnIngresar().addActionListener(l->comp_pro());
        vista.getJbcancelar().addActionListener(l->regresar());
     }
    
     public void iniciaControlDire(){
        vista.getBtnIngresar().addActionListener(l->comp_dir());
        vista.getJbcancelar().addActionListener(l->regresar());
     }
     
    
    public void regresar(){
        Control_Principal control = new Control_Principal(new VistaPrincipal());
        control.inicia_control();
        vista.dispose();
    }
    
    //metodos para comparar datos ingresados
    //Profesor
    public void comp_pro(){
        Modelo_Profesor mdpro = new Modelo_Profesor();
        String usuario=vista.getTxtNombreUser().getText();
        java.util.List<Profesor> lpro = mdpro.listaProfesores();
         for (int i = 0; i <lpro.size(); i++) {
            if(vista.getTxtNombreUser().getText()==usuario){
                char ty[]=lpro.get(i).getContraseña().toCharArray();;
                if(vista.getPwfcontraseña().getPassword()==ty){
                    JOptionPane.showMessageDialog(null, "Inicio de sesion Exitoso");
                }
            }
        } 
    }
    
    //Director
    public void comp_dir(){
        ModeloDirector moddir = new ModeloDirector();
        String usuario=vista.getTxtNombreUser().getText();
        List<Director> ldir= moddir.listaDirectores();
         for (int i = 0; i <ldir.size(); i++) {
            if(vista.getTxtNombreUser().getText()==usuario){
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
        ModeloAlumno modal = new ModeloAlumno();
        String usuario=vista.getTxtNombreUser().getText();
        List<Alumno> lal=modal.listaAlumnos();
         for (int i = 0; i <lal.size(); i++) {
            if(vista.getTxtNombreUser().getText()==usuario){
                    JOptionPane.showMessageDialog(null, "Inicio de sesion Exitoso");
                    VistaMenu menu=new VistaMenu();
                    menu.setVisible(true);
            }
         }
    } 
    
    
    
    
 }

