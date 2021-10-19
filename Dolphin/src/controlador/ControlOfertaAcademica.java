
package controlador;

import Modelo.ModeloOfertaAcademica;
import Modelo.clases_base.OfertaAcademica;
import Vista.VistaSede;
import conexion.ConexionPG;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author HP
 */

public class ControlOfertaAcademica {
//    
//    private Modelo.ModeloOfertaAcademica modelo;
//    private VistaSede vista;
//    
//    DefaultTableModel tabla = new  DefaultTableModel();
//     private ConexionPG con = new ConexionPG();
//     
//    public ControlOfertaAcademica(ModeloOfertaAcademica modelo, VistaSede sed) {
//        this.modelo = modelo;
//    }
//    
//    public void iniciarcontrol(){
//        KeyListener kl= new KeyListener() {
//            @Override
//            public void keyTyped(KeyEvent e) {
//            }
//
//            @Override
//            public void keyPressed(KeyEvent e) {
//            }
//
//            @Override
//            public void keyReleased(KeyEvent e) {
//                //cargaLista(vista.getTxtBuscarOA().getText());
//            }
//        };
//    }
//    
//    private void cargaLista(String aguja) {
//        ModeloOfertaAcademica moa= new ModeloOfertaAcademica();
//        java.util.List<OfertaAcademica> lista = moa.listaOfertaAcademica("");
//        lista.stream().forEach(oa -> {
//            String[] Ofertaacademica = {oa.getId_disciplina(), oa.getId_sede(), oa.getCapacidad()+""};
//
//        });
//    }
//    
//     private void grabarOfertaAcademica(){
//        String id_disciplina = vista.getTxtCodSede1().getText();
//        String id_sede = vista.getTxtCodSede1().getText();
//        String capacidad = vista.getTxtCapOA1().getText();
//        
//        ModeloOfertaAcademica OA = new ModeloOfertaAcademica();
//        OA.setId_disciplina(id_disciplina);
//        OA.setId_sede(id_sede);
//        OA.setCapacidad(0);
//        
//        
//        if (OA.grabar()) {
//            JOptionPane.showMessageDialog(vista, "Oferta creada satisfactoriamente");
//        } else {
//            JOptionPane.showMessageDialog(vista, "ERROR");
//        }
//    }
//     
//     private void limpiar() {
//        vista.getTxtDiscOA1().setText("");
//        vista.getTxtCodOA1().setText("");
//        vista.getTxtCapOA1().setText("");
//    }
//
//    private void eliminar() {
//        int ofe = vista.getTbOA().getSelectedRow();
//        if (ofe >= 0) {
//            cargaLista("");
//            java.util.List<OfertaAcademica> lista = modelo.listaOfertaAcademica();
//            for (int i = 0; i < lista.size(); i++) {
//                if (i == ofe) {
//                    vista.getTxteliminarcod_OA().setText(lista.get(i).getId_disciplina()+ "");
//                }
//            }
//        } else {
//            JOptionPane.showMessageDialog(vista, "Seleccione la fila que desea eliminar");
//            vista.getDgElimOfertaAcd().setVisible(false);
//        }
//    }
//    
//    private void confirmar() {
//        String cod_oa = vista.getTxteliminarcod_OA().getText();
//        ModeloOfertaAcademica OfertaAcademica = new ModeloOfertaAcademica();
//        OfertaAcademica.setId_disciplina(cod_oa);
//        if (OfertaAcademica.eliminar()) {
//            JOptionPane.showMessageDialog(vista, "Eliminado");
//            vista.getDgElimOfertaAcd().dispose();
//            limpiar();
//        }
//    }
//    private void Combobox(){
//        
//    }
//     private void modificar(){
//        int se=vista.getTbOA().getSelectedRow();
//        if (se>=0){
//            cargaLista("");
//            java.util.List<OfertaAcademica> lista=modelo.listaOfertaAcademica();
//            for (int i = 0; i <lista.size(); i++) {
//                 if(i==se){
//                    String id_dis=lista.get(i).getId_disciplina()+"";
//                    String id_s=lista.get(i).getId_sede()+"";
//                    String capacidad=lista.get(i).getCapacidad()+"";
//                   
//                    
//                    vista.getTxtDiscOA1().setText(id_dis);
//                    vista.getTxtCapOA1().setText(capacidad);
//                    vista.getTxtCodOA1().setText(id_s);
//                    
//                 }
//            }
//         }else{
//            JOptionPane.showMessageDialog(vista, "Seleccione");
//            vista.getDgOfertaAcd().setVisible(false);
//        }
//    }
//    
}
