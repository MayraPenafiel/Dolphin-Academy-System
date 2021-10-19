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
import controlador.Control_InicioSesion;

/**
 *
 * @author MayraPeñafiel
 */

public class Control_Principal {
 
    //Atributos
    private VistaPrincipal vp;
    private VistaInicioSesion vis;
    public static String boton;
    
    //Constructores
    public Control_Principal() {
    }
    public Control_Principal(VistaPrincipal vp) {
        this.vp = vp;
        vp.setVisible(true);
    }
    
    //Controlar Eventos de la Vista PRincipal
    public void inicia_control() {
        vp.getBtnAdm().addActionListener(l->Iniciar_sesion("D"));
        vp.getBtnAlum().addActionListener(l->Iniciar_sesion("A"));
        vp.getBtnProf().addActionListener(l->Iniciar_sesion("P"));
    }
    
    private void Iniciar_sesion(String g){
        g=boton;
        vp.setVisible(true);
        VistaInicioSesion vis= new VistaInicioSesion();
        Control_InicioSesion c= new Control_InicioSesion(vis);
        c.iniciaControl();
    }
    
}
