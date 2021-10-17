/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import Modelo.ModeloAlumno;
import Modelo.ModeloDirector;
import Modelo.ModeloOfertaAcademica;
import Modelo.ModeloSede;
import Modelo.Modelo_Entrenamiento;
import Modelo.Modelo_Profesor;
import Modelo.Modelo_Realiza;
import Vista.VistaAlumno;
import Vista.VistaDetRealiza;
import Vista.VistaDirector;
import Vista.VistaDisciplina;
import Vista.VistaEncaRealiza;
import Vista.VistaEntrenamiento;
import Vista.VistaMenu;
import Vista.VistaOfertaAc;
import Vista.VistaPrincipal;
import Vista.VistaProfesor;
import Vista.VistaSede;
import modelo.Modelo_Disciplina;

/**
 *
 * @author MayraPeñafiel
 */

public class Control_Menu {
    //Atributos
    private VistaMenu vm;
    
    //Constructores
    public Control_Menu(VistaMenu vm) {
        this.vm = vm;
        String b=Control_Principal.boton;
        if(b=="A"){
            vm.getMIAdm().setEnabled(false);vm.getMIAdm().setVisible(false);
            vm.getMIOA().setEnabled(false);vm.getMIOA().setVisible(false);
            vm.getMISede().setEnabled(false);vm.getMISede().setVisible(false);
            vm.getMIDisciplina().setEnabled(false);vm.getMIDisciplina().setVisible(false);
        }
    }
    public Control_Menu() {
    }
    
    public void inicia_control(){
        vm.getMIAlumno().addActionListener(l-> abrir_ventana(1));
        vm.getMIProfesor().addActionListener(l->abrir_ventana(2));
        vm.getMIAdm().addActionListener(l->abrir_ventana(3));
        vm.getMIDetRealiza().addActionListener(l->abrir_ventana(4));
        vm.getMIDisciplina().addActionListener(l->abrir_ventana(5));
        vm.getJmencare().addActionListener(l->abrir_ventana(6));
        vm.getMIEnt().addActionListener(l->abrir_ventana(7));
        vm.getMIOA().addActionListener(l->abrir_ventana(8));
        vm.getMISede().addActionListener(l->abrir_ventana(9));
        vm.getJmisalir().addActionListener(l->abrir_ventana(10));
    }
    
    public void abrir_ventana(int op){
        if(op==1){
            ModeloAlumno mdal= new ModeloAlumno();
            VistaAlumno val=new VistaAlumno();
           vm.getDskMenu().add(val);
           ControlAlumno c= new ControlAlumno(mdal,val);
           c.iniciaControl();
        }
        if(op==2){
           Modelo_Profesor mprof= new Modelo_Profesor();
           VistaProfesor vpro=new VistaProfesor();
           vm.getDskMenu().add(vpro);
           Control_Profesor c= new Control_Profesor(mprof,vpro);
           c.iniciaControl();
        }
        if(op==3){
           ModeloDirector mdir= new ModeloDirector();
           VistaDirector vdir=new VistaDirector();
           vm.getDskMenu().add(vdir);
           ControlDirector c= new ControlDirector(mdir,vdir);
           c.iniciaControl();
        }
        if(op==4){
            Modelo_Realiza mdal= new Modelo_Realiza();
            VistaDetRealiza val=new VistaDetRealiza();
           vm.getDskMenu().add(val);
           //Control_Realiza c= new Control_Realiza(mdal,val);
           //c.iniciaControl();
        }
        if(op==5){
           Modelo_Disciplina mdal= new Modelo_Disciplina();
           VistaDisciplina val=new VistaDisciplina();
           vm.getDskMenu().add(val);
           Control_Disciplina c= new Control_Disciplina(mdal,val);
           c.iniciaControl();
        }
        if(op==6){
           Modelo_Realiza mdal= new Modelo_Realiza();
           VistaEncaRealiza val=new VistaEncaRealiza();
           vm.getDskMenu().add(val);
           //Control_Realiza c= new Control_Realiza(mdal,val);
           //c.iniciaControl();
        }
        if(op==7){
           Modelo_Entrenamiento mdal= new Modelo_Entrenamiento();
           VistaEntrenamiento val=new VistaEntrenamiento();
           vm.getDskMenu().add(val);
           Control_Entrenamiento c= new Control_Entrenamiento(mdal,val);
           c.iniciaControl();
        }
        if(op==8){
           ModeloOfertaAcademica mdal= new ModeloOfertaAcademica();
           VistaOfertaAc val=new VistaOfertaAc();
           vm.getDskMenu().add(val);
           ControlOfertaAcademica c= new ControlOfertaAcademica(mdal,val);
           c.iniciarcontrol();
        }
        if(op==9){
            ModeloSede mdal= new ModeloSede();
            VistaSede val=new VistaSede();
           vm.getDskMenu().add(val);
           ControlSede c= new ControlSede (mdal,val);
           c.iniciarcontrol();
        }
        if(op==10){
            vm.dispose();
            VistaPrincipal vp=new VistaPrincipal();
            Control_Principal c=new Control_Principal(vp);
            c.inicia_control();
        }
    }
    
}
