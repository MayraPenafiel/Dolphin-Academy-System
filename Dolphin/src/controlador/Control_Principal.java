/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import Modelo.ModeloAlumno;
import Modelo.ModeloDirector;
import Modelo.Modelo_Profesor;
import Vista.VistaInicioSesion;
import Vista.VistaPrincipal;
import javax.swing.JOptionPane;

/**
 *
 * @author MayraPeñafiel
 */

public class Control_Principal {
 
    //Atributos
    private VistaPrincipal vp;
    static String boton;
    
    
    //Constructores
    public Control_Principal() {
    }
    public Control_Principal(VistaPrincipal vp) {
        this.vp = vp;
        vp.setLocationRelativeTo(null);
        vp.setVisible(true);
    }
    
    //Controlar Eventos de la Vista PRincipal
    public void inicia_control() {
        vp.getBtnAdm().addActionListener(l->Iniciar_sesion("D"));
        vp.getBtnAlum().addActionListener(l->Iniciar_sesion("A"));
        vp.getBtnProf().addActionListener(l->Iniciar_sesion("P"));
        vp.getJbsalir().addActionListener(l->salidaPrograma());
    }
    
    public void salidaPrograma(){
        int i=JOptionPane.showConfirmDialog(null, "Realmente desea salir de Dolphin?", "Confirmar salida",
                JOptionPane.YES_NO_OPTION,
                JOptionPane.QUESTION_MESSAGE);
        if(i==0){
                System.exit(0);
        }
    }
    
    private void Iniciar_sesion(String rol_entidad){
           VistaInicioSesion vis =new VistaInicioSesion();
        if(rol_entidad.equals("D")){
            Control_InicioSesion c= new Control_InicioSesion (vis,new ModeloDirector());
            boton=rol_entidad;
            c.iniciaControlDire();
            vp.dispose();
        }else if(rol_entidad.equals("A")){
            Control_InicioSesion c= new Control_InicioSesion (vis,new ModeloAlumno());
            c.iniciaControlAlumno();
            vp.dispose();
            boton=rol_entidad;
        }else if(rol_entidad.equals("P")){
             Control_InicioSesion c= new Control_InicioSesion (vis,new Modelo_Profesor());
             boton=rol_entidad;
             c.iniciaControlProf();
             vp.dispose();
        }
    }
    
}
