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
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableColumnModel;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author MayraPeñafiel
 */
public class Control_Realiza {
//     private Modelo_Realiza_Enca mre;
//     private Modelo_Realiza_Det mrd;
//     private VistaEncaRealiza ver;
//     private VistaDetRealiza vdr;
//     
//     DefaultTableModel modelo1 = new DefaultTableModel();
//     DefaultTableModel modelo2 = new DefaultTableModel();
//
//    public Control_Realiza(Modelo_Realiza_Enca mre, Modelo_Realiza_Det mrd, VistaEncaRealiza ver, VistaDetRealiza vdr) {
//        this.mre = mre;
//        this.mrd = mrd;
//        this.ver = ver;
//        this.vdr = vdr;
//        
//        ver.setTitle("Asistencia");
//        ver.setVisible(true);
//        
//    }
//
//    public Control_Realiza() {
//    }
    
//    public void iniciaControl(){
//        KeyListener kl = new KeyListener(){
//            @Override
//            public void keyTyped(KeyEvent e) {
//                //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//            }
//
//            @Override
//            public void keyPressed(KeyEvent e) {
//                //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//            }
//
//            @Override
//            public void keyReleased(KeyEvent e) {
//                //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//                //cargaLista(vista.getTxtBuscar().getText());
//                cargaLista(vdr.getTxtBuscarDetR().getText()); 
//            }
//        };
//        
//        //Controlar los eventos de la vista
//        vista.getBtnlistar().addActionListener(l -> cargaLista(""));
//        vista.getBtncrear().addActionListener(l -> cargarDialogo(1));
//        vista.getBtneditar().addActionListener(l -> cargarDialogo(2));
//        vista.getBtnaceptar().addActionListener(l -> grabarDisciplina());
//        vista.getBtneliminar().addActionListener(l -> eliminarDisciplina());
//        vista.getBtncancelar().addActionListener(l -> vista.getDgDisciplina().dispose());
//        vista.getJbregresar().addActionListener(l->regresar());
//        //controlador buscar
//        vista.getTxtbuscard().addKeyListener(kl);
//        //Imprimir
//        vista.getBtnimprimirdisciplina().addActionListener(l -> imprimirReporte());
//    }
//    
//    private void cargarDialogo(int origen){
//        vista.getDgDisciplina().setSize(600,500);
//        vista.getDgDisciplina().setLocationRelativeTo(vista);
//        if(origen==1){
//            vista.getDgDisciplina().setTitle("Crear Disciplina");
//            vista.getBtnaceptar().addActionListener(l->grabarDisciplina());
//             vista.getDgDisciplina().setVisible(true);
//        }else{
//             if(vista.getTbldisciplina().getSelectedRow()==-1){
//            JOptionPane.showMessageDialog(vista,"Debe seleccionar una fila,Intente de nuevo");
//              }else{
//                   vista.getDgDisciplina().setTitle("Editar Disciplina");
//                   vista.getBtnaceptar().addActionListener(l->editarDisciplina());
//                   cargarDatos();
//                    vista.getDgDisciplina().setVisible(true);
//             }
//   
//        }
       
    }
     
     
     
     
    
