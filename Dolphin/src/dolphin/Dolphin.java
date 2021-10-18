
package dolphin;

import Vista.VistaPrincipal;
import controlador.Control_Principal;

/**
 *
 * @author MayraPeñafiel
 */

public class Dolphin {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        VistaPrincipal prin=new VistaPrincipal();
        Control_Principal control = new Control_Principal(prin);
        control.inicia_control();
    }
    
}
