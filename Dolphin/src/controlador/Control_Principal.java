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
import java.awt.event.ActionListener;

/**
 *
 * @author MayraPeñafiel
 */

public class Control_Principal {
 
    //Atributos
    private VistaPrincipal vp;
    private VistaInicioSesion vis;
    
    //Constructores
    public Control_Principal() {
    }
    public Control_Principal(VistaPrincipal vp) {
        this.vp = vp;
    }
    
    //Controlar Eventos de la Vista PRincipal
    public void inicia_control() {
        vp.getBtnAdm().addActionListener(l->vp.setVisible(true));
        vp.getBtnAdm().addActionListener(l->vp.setVisible(true));
        
    }
    private void crudPersonas(){
        vp.setVisible(true);
        ModeloAlumno mal= new ModeloAlumno();
        Modelo_Profesor mpro= new Modelo_Profesor();
        ModeloDirector mdir = new ModeloDirector();
        Control_InicioSesion c= new Control_InicioSesion(mal,mpro,mdir,vis,vp);
        c.iniciaControl();
    }
    
}
