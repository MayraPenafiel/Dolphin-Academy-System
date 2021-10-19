/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import Modelo.Modelo_Realiza_Enca;
import Modelo.Modelo_Realiza_Det;
import Vista.VistaDetRealiza;
import Vista.VistaEncaRealiza;
import javax.swing.table.DefaultTableColumnModel;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author MayraPeñafiel
 */
public class Control_Realiza {
     private Modelo_Realiza_Enca mre;
     private Modelo_Realiza_Det mrd;
     private VistaEncaRealiza ver;
     private VistaDetRealiza vdr;
     
     DefaultTableModel modelo1 = new DefaultTableModel();
     DefaultTableModel modelo2 = new DefaultTableModel();

    public Control_Realiza(Modelo_Realiza_Enca mre, Modelo_Realiza_Det mrd, VistaEncaRealiza ver, VistaDetRealiza vdr) {
        this.mre = mre;
        this.mrd = mrd;
        this.ver = ver;
        this.vdr = vdr;
        
        ver.setTitle("realiza");
        ver.setVisible(true);
       
        
    }
     
     
     
     
     
     
    
}
