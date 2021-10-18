/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

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
        vp.getBtnAdm().addActionListener(l -> Iniciar_sesion("D"));
        vp.getBtnAlum().addActionListener(l->Iniciar_sesion("A"));
        vp.getBtnProf().addActionListener(l->Iniciar_sesion("P"));
        vp.getJbsalir().addActionListener(l->salidaPrograma());
    }
    
    private void Iniciar_sesion(String g){
        boton=g;
        vp.setVisible(true);
        VistaInicioSesion vis =new VistaInicioSesion();
        Control_InicioSesion c= new Control_InicioSesion (vis);
        c.iniciaControl();
    }

    public void salidaPrograma(){
        int i=JOptionPane.showConfirmDialog(null, "Realmente desea salir de Dolphin?", "Confirmar salida",
                JOptionPane.YES_NO_OPTION,
                JOptionPane.QUESTION_MESSAGE);
        if(i==0){
                System.exit(0);
        }
    }
    
}
