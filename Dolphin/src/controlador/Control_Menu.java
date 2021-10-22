/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import Vista.VistaMenu;
import Vista.VistaAlumno;
import Vista.VistaDetRealiza;
import Vista.VistaDirector;
import Vista.VistaDisciplina;
import Vista.VistaEncaRealiza;
import Vista.VistaEntrenamiento;
import Vista.VistaProfesor;
import Vista.VistaPrincipal;
import Vista.VistaSede;
import Modelo.ModeloAlumno;
import Modelo.ModeloDirector;
import Modelo.Modelo_Entrenamiento;
import Modelo.ModeloSede;
import Modelo.ModeloDisciplina;
import Modelo.Modelo_Profesor;
import Modelo.Modelo_Realiza_Det;
import Modelo.Modelo_Realiza_Enca;
import javax.swing.JFrame;

/**
 *
 * @author MayraPeñafiel
 */

public class Control_Menu {
    
    //Atributos
    private VistaMenu vm;
    private VistaProfesor vp;
    private VistaDirector vd;
    
    
    //Constructores
    public Control_Menu(VistaMenu vm) {
        this.vm = vm;
        vm.setExtendedState(JFrame.MAXIMIZED_BOTH);
        vm.setLocationRelativeTo(null);
        String h=Control_Principal.boton;
        if(h=="A"){
            System.out.println("A menu");
            vm.getMIAlumno().setText("Mi Informacion");
            vm.getMIAdm().setVisible(false);
            vm.getMIAdm().setEnabled(false);
            vm.getMIDisciplina().setVisible(true);
            vm.getMIEnt().setVisible(false);
            vm.getMISede().setVisible(false);
            vm.getMIDetRealiza().setVisible(false);
            //vm.getMIDisciplina().setEnabledfalse);
            vm.getMIEnt().setEnabled(false);
            vm.getMISede().setEnabled(false);
        }
        vm.getMIDetRealiza().setVisible(false);
    }
    public Control_Menu() {
    }
    
    public void iniciControl(){
        vm.getMIAlumno().addActionListener(l->abrir_ventana(1));
        vm.getMIProfesor().addActionListener(l->abrir_ventana(2));
        vm.getMIAdm().addActionListener(l->abrir_ventana(3));
        //vm.getMIDetRealiza().addActionListener(l->abrir_ventana(4));
        vm.getMIDisciplina().addActionListener(l->abrir_ventana(5));
        //vm.getJbencar().addActionListener(l->abrir_ventana(6));
        vm.getMIEnt().addActionListener(l->abrir_ventana(7));
        vm.getMISede().addActionListener(l->abrir_ventana(8));
        vm.getJbsalir().addActionListener(l->abrir_ventana(9));
        vm.getJbregresar().addActionListener(l-> regresar());
    }
    
    private void abrir_ventana(int op){
        if(op==1){
           VistaAlumno va = new VistaAlumno();
           ModeloAlumno md= new ModeloAlumno();
           vm.getDskMenu().add(va);
           ControlAlumno c=new ControlAlumno(md,va);
           c.iniciaControl();
           
           va.setVisible(true);
        }
        if(op==2){ 
            VistaProfesor vt= new VistaProfesor();
            Modelo_Profesor md= new Modelo_Profesor();
            vm.getDskMenu().add(vt);
            Control_Profesor c= new Control_Profesor(md, vt);
            c.iniciaControl();
        }
        if (op==3){
            VistaDirector vt= new VistaDirector();
            ModeloDirector md= new ModeloDirector();
            vm.getDskMenu().add(vt);
            ControlDirector c= new ControlDirector(md, vt);
            c.iniciaControl();
        }
        if(op==4){
            VistaDetRealiza vt= new VistaDetRealiza();
            Modelo_Realiza_Det md= new Modelo_Realiza_Det();
            //Control_Realiza c= new Control_Realiza(md, vt);
            //c.iniciaControl();
        }
        if(op==5){
            VistaDisciplina vt= new VistaDisciplina();
            ModeloDisciplina md= new ModeloDisciplina();
            vm.getDskMenu().add(vt);
            Control_Disciplina c= new Control_Disciplina(md, vt);
            c.iniciaControl();
        }
        if(op==6){
            VistaEncaRealiza vt= new VistaEncaRealiza();
            Modelo_Realiza_Enca md= new Modelo_Realiza_Enca();
            //Control_Realiza c= new Control_Realiza(md, vt);
            //c.iniciaControl();
        }
        if(op==7){
            VistaEntrenamiento vt= new VistaEntrenamiento();
            Modelo_Entrenamiento md= new Modelo_Entrenamiento();
            vm.getDskMenu().add(vt);
            Control_Entrenamiento c = new Control_Entrenamiento(md,vt);
            c.iniciaControl();
        }
        if(op==8){
            VistaSede vt= new VistaSede();
            ModeloSede md= new ModeloSede();
            ControlSede c= new ControlSede(md, vt);
            c.iniciarcontrol();
        }
        if(op==9){
            System.exit(0);
        }
    }
    public void regresar(){
        VistaPrincipal vp=new VistaPrincipal();
        Control_Principal control = new Control_Principal(vp);
        control.inicia_control();
        vm.dispose();
    }
    
}
