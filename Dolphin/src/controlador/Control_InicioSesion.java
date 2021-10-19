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
   private VistaInicioSesion vista;

   //Constructores
    public Control_InicioSesion() {
    }
    public Control_InicioSesion(VistaInicioSesion vista) {
        vista.setVisible(true);
        String h=Control_Principal.boton.toString();
        vista.setLocationRelativeTo(null);
        if(h=="A"){
            vista.getJlbpass().setEnabled(false);
            vista.getJlbpass().setVisible(false);
            vista.getJlbuser().setText("Clave de Acceso");
            vista.getPwfcontraseña().setEnabled(false);
            vista.getPwfcontraseña().setVisible(false);
        }
    }
    
    //Controlar Eventos de la Vista IiciarSesion
    public void iniciaControl(){
        vista.getBtnIngresar().addActionListener(l->llamar_comp());
        vista.getJbcancelar().addActionListener(l->vista.dispose());
     }
    private void llamar_comp(){
        String h=Control_Principal.boton.toString();
        if(h=="P"){
           comp_pro();
        }
        if(h=="D"){ 
            comp_dir();
        }
        if (h=="A"){
            comp_al();
        }
    }
    //metodos para comparar datos ingresados
    //Profesor
    public void comp_pro(){
        String usuario=vista.getTxtNombreUser().getText();
        Modelo_Profesor mdpro=new Modelo_Profesor();
        java.util.List<Profesor> lpro = mdpro.listaProfesores();
         for (int i = 0; i <lpro.size(); i++) {
            if(lpro.get(i).getId_Profesor().toString()==usuario){
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
        ModeloDirector moddir = new ModeloDirector();
        List<Director> ldir= moddir.listaDirectores();
         for (int i = 0; i <ldir.size(); i++) {
            if(ldir.get(i).getId_director().toString()==usuario){
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
        ModeloAlumno modal= new ModeloAlumno();
        List<Alumno> lal=modal.listaAlumnos();
         for (int i = 0; i <lal.size(); i++) {
            if(lal.get(i).getId_alumno().toString()==usuario){
                    JOptionPane.showMessageDialog(null, "Inicio de sesion Exitoso");
                    VistaMenu menu=new VistaMenu();
                    menu.setVisible(true);
            }
         }
    } 
    
    //Metodo Regresar 
    public void regresar(){
        Control_Principal control = new Control_Principal(new VistaPrincipal());
        control.inicia_control();
        vista.dispose();
    }
    
 }

