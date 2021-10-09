/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dolphin;

import Vista.VistaDisciplina;
import controlador.Control_Disciplina;
import modelo.Modelo_Disciplina;

/**
 *
 * @author User
 */
public class Dolphin {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Modelo_Disciplina modelo= new Modelo_Disciplina();
        VistaDisciplina vista =new VistaDisciplina();
        Control_Disciplina control= new Control_Disciplina(modelo, vista);
        control.iniciaControl();
    }
    
}
