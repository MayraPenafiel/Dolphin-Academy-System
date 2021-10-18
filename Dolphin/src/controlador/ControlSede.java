
package controlador;

import Modelo.ModeloSede;
import Modelo.clases_base.Sede;
import Vista.VistaSede;
import conexion.ConexionPG;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author HP
 */
public class ControlSede {
    
    private ModeloSede modelo;
    private VistaSede vista;
    DefaultTableModel tabla = new  DefaultTableModel();
     private ConexionPG con = new ConexionPG();
     
    public ControlSede(ModeloSede modelo, VistaSede vista) {
        this.modelo = modelo;
        this.vista = vista;

        // solamente inicializar elementos
        vista.setTitle("Sede");
        //vista.getLblmensaje().setText("Bienvenido Sistema 1.0");
        vista.setVisible(true);
        cargaLista(""); //Crear metodo en esta clase
        
    }
    
    public void iniciarcontrol(){
        KeyListener kl= new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {
//                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void keyPressed(KeyEvent e) {
//                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void keyReleased(KeyEvent e) {
//                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
                  cargaLista(vista.getTxtBuscarSede().getText());
            }
        };
        vista.getBtnListarJFSede().addActionListener(l -> cargaLista(""));
    }
    
     private void cargaLista(String aguja) {

        DefaultTableCellRenderer r = new DefaultTableCellRenderer();
        DefaultTableModel tableModel;
        tableModel = (DefaultTableModel) vista.getTdSede().getModel();
        tableModel.setNumRows(0);
        java.util.List<Sede> lista = modelo.listaSede(aguja);
        lista.stream().forEach(sd -> {

            String[] sede = {sd.getCod_sede(), sd.getNombre_s(), sd.getDireccion_s(), sd.getCorreo_s(), sd.getTelefono_s()};

        });
    }

    private void grabarSede(){
        String Cod_sede = vista.getTxtCodSede1().getText();
        String nombre_s = vista.getTxtNombreSede1().getText();
        String direccion_s = vista.getTxtDirecSede1().getText();
        String correo_s = vista.getTxtCorreoS1().getText();
        String telefono_s = vista.getTxtTelfSede1().getText();
        
        ModeloSede sede = new ModeloSede();
        sede.setCod_sede(Cod_sede);
        sede.setNombre_s(nombre_s);
        sede.setDireccion_s(direccion_s);
        sede.setCorreo_s(correo_s);
        sede.setTelefono_s(telefono_s);
        
        
        if (sede.grabar()) {
            JOptionPane.showMessageDialog(vista, "Sede creada satisfactoriamente");
        } else {
            JOptionPane.showMessageDialog(vista, "ERROR");
        }
    }
    
    
     private void limpiar() {
        vista.getTxtCodSede1().setText("");
        vista.getTxtNombreSede1().setText("");
        vista.getTxtDirecSede1().setText("");
        vista.getTxtCorreoS1().setText("");
        vista.getTxtTelfSede1().setText("");
    }

    private void eliminar() {
        int se = vista.getTdSede().getSelectedRow();
        if (se >= 0) {
            cargaLista("");
            java.util.List<Sede> lista = modelo.listaSede();
            for (int i = 0; i < lista.size(); i++) {
                if (i == se) {
                    vista.getTxteliminarcodSede().setText(lista.get(i).getCod_sede() + "");
                    vista.getTxteliminarnombre_s().setText(lista.get(i).getNombre_s());
                }
            }
        } else {
            JOptionPane.showMessageDialog(vista, "Seleccione la fila que desea eliminar");
            vista.getDgEliminarSede().setVisible(false);
        }
    }
    
    
    private void confirmar() {
        String cod_s = vista.getTxteliminarcodSede().getText();
        ModeloSede sede = new ModeloSede();
        sede.setCod_sede(cod_s);
        if (sede.eliminar()) {
            JOptionPane.showMessageDialog(vista, "Eliminado");
            vista.getDgSede().dispose();
            limpiar();
        }
    }

    private void modificar(){
        int se=vista.getTdSede().getSelectedRow();
        if (se>=0){
            cargaLista("");
            java.util.List<Sede> lista=modelo.listaSede();
            for (int i = 0; i <lista.size(); i++) {
                 if(i==se){
                    String cod_sede=lista.get(i).getCod_sede()+"";
                    String nombre_s=lista.get(i).getNombre_s()+"";
                    String direccion_s=lista.get(i).getDireccion_s()+"";
                     String co_s=lista.get(i).getCorreo_s()+"";
                    String tel_s=lista.get(i).getTelefono_s()+"";
                   
                    
                    vista.getTxtCodSede1().setText(cod_sede);
                    vista.getCbxDirectorSede().setSelectedItem(cod_sede);
                    vista.getTxtNombreSede1().setText(nombre_s);
                    vista.getTxtDirecSede1().setText(direccion_s);
                    vista.getTxtCorreoS1().setText(co_s);
                    vista.getTxtTelfSede1().setText(tel_s);
                    
                 }
            }
         }else{
            JOptionPane.showMessageDialog(vista, "Seleccione");
            vista.getDgSede().setVisible(false);
        }
    }
    
    
    
}
