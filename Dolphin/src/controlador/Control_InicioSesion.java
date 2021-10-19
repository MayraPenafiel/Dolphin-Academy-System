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
        String h=Control_Principal.boton;
        System.out.println(h);
    }
      
     public Control_InicioSesion(VistaInicioSesion vis,Modelo_Profesor modpro) {
        this.vista=vis;
        this.modpro = modpro;
        vista.setVisible(true);
        vista.setLocationRelativeTo(null);
        //_________________
        String h=Control_Principal.boton;
        System.out.println(h);
    }
    
    //Controlar Eventos de la Vista IiciarSesion
    public void iniciaControlAlumno(){
        String h=Control_Principal.boton;
        h="A";
        if(h=="A"){
            vista.getBtnIngresar().addActionListener(l->comp_al());
            vista.getJbcancelar().addActionListener(l->regresar());
        }
     }
    
     public void iniciaControlProf(){
        String h=Control_Principal.boton;
         if(h=="P"){
            vista.getBtnIngresar().addActionListener(l->comp_pro());
            vista.getJbcancelar().addActionListener(l->regresar());
        }
     }
    
     public void iniciaControlDire(){
       String h=Control_Principal.boton;
       if(h=="D"){
            vista.getBtnIngresar().addActionListener(l->comp_dir());
            vista.getJbcancelar().addActionListener(l->regresar());
       }
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
         lpro.stream().forEach(p ->{
            if(p.getId_Profesor().equalsIgnoreCase(usuario)){
                String pass= new String(vista.getPwfcontraseña().getPassword());
                if(pass.equalsIgnoreCase(p.getContraseña())){
                    JOptionPane.showMessageDialog(null, "Inicio de sesion Exitoso");
                    VistaMenu menu=new VistaMenu();
                    Control_Menu c= new Control_Menu(menu);
                    c.iniciControl();
                    menu.setVisible(true);
                }else{
                    System.out.println("No existe Pass P");
                }
            }else{
                    System.out.println("No existe Usuario P");
             }
        }); 
    }
    
    //Director
    public void comp_dir(){
        ModeloDirector moddir = new ModeloDirector();
        String usuario=vista.getTxtNombreUser().getText();
        List<Director> ldir= moddir.listaDirectores();
         ldir.stream().forEach(d ->{
            if(d.getId_director().equalsIgnoreCase(usuario)){
                String pass= new String(vista.getPwfcontraseña().getPassword());
                if(pass==d.getContraseña()){
                    JOptionPane.showMessageDialog(null, "Inicio de sesion Exitoso");
                    VistaMenu menu=new VistaMenu();
                    Control_Menu c= new Control_Menu(menu);
                    c.iniciControl();
                    menu.setVisible(true);
                }else{
                    System.out.println("No existe Pass D");
                }
            }else{
                    System.out.println("No existe Usuario D");
            }
        }); 
                vista.dispose();

    }
    
    //Alumno
    public void comp_al(){
        ModeloAlumno modal = new ModeloAlumno();
        String usuario=vista.getTxtNombreUser().getText();
        List<Alumno> lal=modal.listaAlumnos();
         lal.stream().forEach(a->{
            if(usuario.equalsIgnoreCase(a.getId_alumno())){
                System.out.println(a.getId_alumno());
                JOptionPane.showMessageDialog(null, "Inicio de sesion Exitoso");
                    VistaMenu menu=new VistaMenu();
                    Control_Menu c= new Control_Menu(menu);
                    c.iniciControl();
                    menu.setVisible(true);
            }else{
                 //JOptionPane.showMessageDialog(null, "Usuario no encontrado");
            }
         });
                vista.dispose();

    } 
    
 }

