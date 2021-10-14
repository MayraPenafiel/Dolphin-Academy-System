/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import Vista.VistaInicioSesion;
import Vista.VistaPrincipal;

/**
 *
 * @author MayraPeñafiel
 */

public class Control_Principal { 
 
    //Atributos
    private VistaPrincipal vp;
    
    //Constructores
    public Control_Principal() {
    }
    public Control_Principal(VistaPrincipal vp) {
        this.vp = vp;
        vp.setVisible(true);
    }
    
    //Controlar Eventos de la Vista PRincipal
    public void inicia_control() {
        vp.getBtnAdm().addActionListener(l->Iniciar_sesion());
        vp.getBtnAlum().addActionListener(l->Iniciar_sesion());
        vp.getBtnProf().addActionListener(l->Iniciar_sesion());
    }
    
    private void Iniciar_sesion(){
        vp.setVisible(true);
        VistaInicioSesion vis =new VistaInicioSesion();
        //vis.setVisible(true);
        Control_InicioSesion c= new Control_InicioSesion (vis);
        c.iniciaControl();
    }

    
}
