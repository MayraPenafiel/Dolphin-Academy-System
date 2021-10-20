
package controlador;

import Modelo.ModeloSede;
import Modelo.clases_base.Sede;
import Vista.VistaSede;
import conexion.ConexionPG;
import java.awt.Toolkit;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.util.JRLoader;
import net.sf.jasperreports.view.JasperViewer;

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
        
            KeyAdapter c1 = new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                char c = e.getKeyChar();
                if (Character.isDigit(c) || Character.isLetter(c)) {
                } else {
                    e.consume();
                    Toolkit.getDefaultToolkit().beep();
                }

                if (vista.getTxtCodSede1().getText().length() > 8) {
                    Toolkit.getDefaultToolkit().beep();
                    e.consume();
                }
            }
        };

        vista.getTxtCodSede1().addKeyListener(c1);

        KeyAdapter c2 = new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                char c = e.getKeyChar();
                if (Character.isLetter(c)) {
                } else {
                    e.consume();
                    Toolkit.getDefaultToolkit().beep();
                }

                if (vista.getTxtNombreSede1().getText().length() > 20) {
                    Toolkit.getDefaultToolkit().beep();
                    e.consume();
                }
            }
        };
        vista.getTxtNombreSede1().addKeyListener(c2);

        KeyAdapter c3 = new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                char c = e.getKeyChar();
                if (Character.isLetter(c)) {
                } else {
                    e.consume();
                    Toolkit.getDefaultToolkit().beep();
                }

                if (vista.getTxtDirecSede1().getText().length() > 20) {
                    Toolkit.getDefaultToolkit().beep();
                    e.consume();
                }
            }
        };
        vista.getTxtDirecSede1().addKeyListener(c3);

        KeyAdapter c4 = new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                char c = e.getKeyChar();
                if (Character.isDigit(c)) {
                } else {
                    e.consume();
                    Toolkit.getDefaultToolkit().beep();
                }

                if (vista.getTxtTelfSede1().getText().length() > 10) {
                    Toolkit.getDefaultToolkit().beep();
                    e.consume();
                }
            }
        };

        vista.getTxtTelfSede1().addKeyListener(c4);

        KeyAdapter c5 = new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                char c = e.getKeyChar();
                if (Character.isDigit(c) || Character.isLetter(c)) {
                } else {
                    e.consume();
                    Toolkit.getDefaultToolkit().beep();
                }

                if (vista.getTxtCorreoS1().getText().length() > 10) {
                    Toolkit.getDefaultToolkit().beep();
                    e.consume();
                }
            }
        };

        vista.getTxtCorreoS1().addKeyListener(c5);

  
        


        vista.getBtnListarJFSede().addActionListener(l -> cargaLista(""));
        vista.getBtnCrearJFSede().addActionListener(l->abrir_dialogo(1));
        vista.getBtnEditarJFSede().addActionListener(l->abrir_dialogo(2));
        vista.getBtnEliminarJFSede().addActionListener(l->abrir_dialogo(3));
         //Controlar Eventos Dialogo Ingreso/modificar info
        vista.getBtnGuardarSede1().addActionListener(l->grabarSede());
        vista.getBtncancelareliminar_s().addActionListener(l->vista.getDgSede().dispose());
        //Control eventos Dialogo Eliminar
        vista.getBtnconfirmareliminar_s().addActionListener(l->confirmar());
        vista.getBtncancelareliminar_s().addActionListener(l->vista.getDgEliminarSede().dispose());
         //Imprimir
        vista.getBtnimprimirsede().addActionListener(l -> imprimirReporte());
        
    }
    
     //IMPRESION
    private void imprimirReporte(){
        
        ConexionPG conp= new ConexionPG();
        try {
            
            JasperReport jr=(JasperReport)JRLoader.loadObject(getClass().getResource("/reportes/Reporte_Sede.jasper"));

            
            JasperPrint jp=JasperFillManager.fillReport(jr, null,conp.getCon());
            JasperViewer jv=new JasperViewer(jp);
            
            jv.setVisible(true);
            
        } catch (JRException ex) {
            Logger.getLogger(ControlAlumno.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
         private void abrir_dialogo(int origen){
        vista.getDgSede().setSize(600,400); 
        vista.getDgSede().setLocationRelativeTo(vista); 
        if(origen==1){
           vista.getDgSede().setTitle("Nuevo Registro"); 
           limpiar();
           //cargar_combo_box();
           vista.getDgSede().setVisible(true);
        }
        if(origen==2){ 
            vista.getDgSede().setTitle("Editar Registro");
            limpiar();
            vista.getDgEliminarSede().setVisible(true);
            modificar();
        }
        vista.getDgEliminarSede().setSize(450,300); 
        vista.getDgSede().setLocationRelativeTo(vista); 
        if (origen==3){
            vista.getDgEliminarSede().setTitle("Eliminar Registro");
            vista.getDgEliminarSede().setVisible(true);
            eliminar();
        }
    }
    
     private void cargaLista(String aguja) {

        DefaultTableCellRenderer r = new DefaultTableCellRenderer();
        DefaultTableModel tableModel;
        tableModel = (DefaultTableModel) vista.getTdSede().getModel();
        tableModel.setNumRows(0);
        java.util.List<Sede> lista = modelo.listaSede(aguja);
        lista.stream().forEach(sd -> {

            String[] sede = {sd.getCod_sede(), sd.getNombre_s(), sd.getDireccion_s(), sd.getCorreo_s(), sd.getTelefono_s(),};

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
