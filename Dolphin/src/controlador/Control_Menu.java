/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import Modelo.ModeloAlumno;
import Modelo.ModeloDirector;
import Modelo.Modelo_Profesor;
import Vista.VistaAlumno;
import Vista.VistaDirector;
import Vista.VistaMenu;
import Vista.VistaProfesor;

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
    }
    public Control_Menu() {
    }
    
    public void inicia_control(){
        
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
            ModeloAlumno mdal= new ModeloAlumno();
            VistaAlumno val=new VistaAlumno();
           vm.getDskMenu().add(val);
           ControlAlumno c= new ControlAlumno(mdal,val);
           c.iniciaControl();
        }
        if(op==1){
            ModeloAlumno mdal= new ModeloAlumno();
            VistaAlumno val=new VistaAlumno();
           vm.getDskMenu().add(val);
           ControlAlumno c= new ControlAlumno(mdal,val);
           c.iniciaControl();
        }
        if(op==1){
           ModeloAlumno mdal= new ModeloAlumno();
            VistaAlumno val=new VistaAlumno();
           vm.getDskMenu().add(val);
           ControlAlumno c= new ControlAlumno(mdal,val);
           c.iniciaControl();
        }
        if(op==1){
            ModeloAlumno mdal= new ModeloAlumno();
            VistaAlumno val=new VistaAlumno();
           vm.getDskMenu().add(val);
           ControlAlumno c= new ControlAlumno(mdal,val);
           c.iniciaControl();
        }
        if(op==1){
            ModeloAlumno mdal= new ModeloAlumno();
            VistaAlumno val=new VistaAlumno();
           vm.getDskMenu().add(val);
           ControlAlumno c= new ControlAlumno(mdal,val);
           c.iniciaControl();
        }
        if(op==1){
            ModeloAlumno mdal= new ModeloAlumno();
            VistaAlumno val=new VistaAlumno();
           vm.getDskMenu().add(val);
           ControlAlumno c= new ControlAlumno(mdal,val);
           c.iniciaControl();
        }
        if(op==1){
            ModeloAlumno mdal= new ModeloAlumno();
            VistaAlumno val=new VistaAlumno();
           vm.getDskMenu().add(val);
           ControlAlumno c= new ControlAlumno(mdal,val);
           c.iniciaControl();
        }
        
    }
    
}
