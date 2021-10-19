
package controlador;

import Modelo.clases_base.Alumno;
import Modelo.clases_base.Director;
import Modelo.ModeloDirector;
import Vista.VistaDirector;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.sql.Date;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.time.LocalDate;
import java.time.Period;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import conexion.ConexionPG;
import java.awt.Toolkit;
import java.awt.event.KeyAdapter;
import java.util.logging.Level;
import java.util.logging.Logger;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.util.JRLoader;
import net.sf.jasperreports.view.JasperViewer;

/**
 *
 * @author THALY
 */
public class ControlDirector {
    private ModeloDirector modelo;
    private VistaDirector vista;
     DefaultTableModel tabla = new  DefaultTableModel();
     private ConexionPG con = new ConexionPG();

    public ControlDirector(ModeloDirector modelo, VistaDirector vista) {
        this.modelo = modelo;
        this.vista = vista;
        
        vista.setTitle("DIRECTOR");
        vista.setVisible(true);
        cargaLista("");
    }
    
    public void iniciaControl(){
        String h=Control_Principal.boton;
        if(h=="P"){
            
            vista.getBtnCrearDirec().setVisible(false);
            vista.getBtnEditarJFDirec().setVisible(false);
            vista.getBtnEliminarJFDirec().setVisible(false);
            
        }
        KeyListener kl = new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {
                //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void keyPressed(KeyEvent e) {
                //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void keyReleased(KeyEvent e) {
                //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
                cargaLista(vista.getTxtBuscarDirec().getText());
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

                if (vista.getTxtCodDirec().getText().length() > 8) {
                    Toolkit.getDefaultToolkit().beep();
                    e.consume();
                }
            }
        };

        vista.getTxtCodDirec().addKeyListener(c1);

        KeyAdapter c2 = new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                char c = e.getKeyChar();
                if (Character.isLetter(c)) {
                } else {
                    e.consume();
                    Toolkit.getDefaultToolkit().beep();
                }

                if (vista.getTxtNombreDirec().getText().length() > 20) {
                    Toolkit.getDefaultToolkit().beep();
                    e.consume();
                }
            }
        };
        vista.getTxtNombreDirec().addKeyListener(c2);

        KeyAdapter c3 = new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                char c = e.getKeyChar();
                if (Character.isLetter(c)) {
                } else {
                    e.consume();
                    Toolkit.getDefaultToolkit().beep();
                }

                if (vista.getTxtApeDirec().getText().length() > 20) {
                    Toolkit.getDefaultToolkit().beep();
                    e.consume();
                }
            }
        };
        vista.getTxtApeDirec().addKeyListener(c3);

        KeyAdapter c4 = new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                char c = e.getKeyChar();
                if (Character.isDigit(c)) {
                } else {
                    e.consume();
                    Toolkit.getDefaultToolkit().beep();
                }

                if (vista.getTxtTelfDirec().getText().length() > 10) {
                    Toolkit.getDefaultToolkit().beep();
                    e.consume();
                }
            }
        };

        vista.getTxtTelfDirec().addKeyListener(c4);

        KeyAdapter c5 = new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                char c = e.getKeyChar();
                if (Character.isDigit(c)) {
                } else {
                    e.consume();
                    Toolkit.getDefaultToolkit().beep();
                }

                if (vista.getTxtCelularDirec().getText().length() > 10) {
                    Toolkit.getDefaultToolkit().beep();
                    e.consume();
                }
            }
        };

        vista.getTxtCelularDirec().addKeyListener(c5);

        KeyAdapter c6 = new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                char c = e.getKeyChar();
                if (Character.isLetter(c)) {
                } else {
                    e.consume();
                    Toolkit.getDefaultToolkit().beep();
                }

                if (vista.getTxtDireccionDirec().getText().length() > 50) {
                    Toolkit.getDefaultToolkit().beep();
                    e.consume();
                }
            }
        };
        vista.getTxtDireccionDirec().addKeyListener(c6);

        KeyAdapter c7 = new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                char c = e.getKeyChar();
                if (Character.isDigit(c)) {
                } else {
                    e.consume();
                    Toolkit.getDefaultToolkit().beep();
                }

                if (vista.getTxtCedulaDirec().getText().length() > 10) {
                    Toolkit.getDefaultToolkit().beep();
                    e.consume();
                }
            }
        };

        vista.getTxtCedulaDirec().addKeyListener(c7);
        
        vista.getBtnListarJFDirec().addActionListener(l -> cargaLista(""));
         vista.getBtnCrearDirec().addActionListener(l->abrir_dialogo(1));
        vista.getBtnEditarJFDirec().addActionListener(l->abrir_dialogo(2));
        vista.getBtnEliminarJFDirec().addActionListener(l->abrir_dialogo(3));
        
        
        vista.getBtnGuardarDirec().addActionListener(l->grabaDirector());
        vista.getBtnCrearDirec().addActionListener(l->vista.getDgDirector().dispose());
        vista.getBtnconfirmareliminar().addActionListener(l-> confirmar());
        vista.getBtncancelareliminar().addActionListener(l-> vista.getDlgEliminar().dispose());
        
        vista.getTxtBuscarDirec().addKeyListener(kl);
         //Imprimir
        vista.getBtnimprimirdire().addActionListener(l -> imprimirReporte());
    }
    
    //IMPRESION
    private void imprimirReporte(){
        
        ConexionPG conp= new ConexionPG();
        try {
            
            JasperReport jr=(JasperReport)JRLoader.loadObject(getClass().getResource("/reportes/Reporte_Directores.jasper"));
            JasperPrint jp=JasperFillManager.fillReport(jr, null,conp.getCon());
            JasperViewer jv=new JasperViewer(jp);
            
            jv.setVisible(true);
            
        } catch (JRException ex) {
            Logger.getLogger(ControlAlumno.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    private void abrir_dialogo(int origen){
        vista.getDgDirector().setSize(600,400); 
        vista.getDgDirector().setLocationRelativeTo(vista); 
        if(origen==1){
           vista.getDgDirector().setTitle("Nuevo Registro"); 
           limpiar();
           vista.getDgDirector().setVisible(true);
        }
        if(origen==2){ 
            vista.getDgDirector().setTitle("Editar Registro");
            limpiar();
            vista.getDgDirector().setVisible(true);
            modificar();
        }
        vista.getDlgEliminar().setSize(450,300); 
        vista.getDlgEliminar().setLocationRelativeTo(vista); 
        if (origen==3){
            vista.getDlgEliminar().setTitle("Eliminar Registro");
            vista.getDlgEliminar().setVisible(true);
            eliminar();
        }
    }
    
    
    private void cargaLista(String aguja){
        DefaultTableCellRenderer r = new DefaultTableCellRenderer();
        DefaultTableModel tableModel;
        tableModel = (DefaultTableModel) vista.getTbDirector().getModel();
        tableModel.setNumRows(0);
        java.util.List<Director> lista = modelo.listaDirectores(aguja);
        lista.stream().forEach(d ->{
            tableModel.addRow(new Object[]{ d.getId_director(),d.getCedula(),d.getNombre(),d.getApellido(),d.getDireccion(),d.getTelefono(),d.getCorreo(),
            d.getFechanacimiento(),d.getCelular(),d.getFormacion(),d.getSede()});
        });
    }
    
    private void grabaDirector(){
        String iddirector = vista.getTxtCodDirec().getText();
        String cedula = vista.getTxtCedulaDirec().getText();
        String nombre = vista.getTxtNombreDirec().getText();
        String apellido = vista.getTxtApeDirec().getText();
        String direccion = vista.getTxtDireccionDirec().getText();
        String telefono = vista.getTxtTelfDirec().getText();
        String correo = vista.getTxtEmailDirec().getText();
        //String fechanacimiento = vista.
        String celular = vista.getTxtCelularDirec().getText();
        String contrasenia = vista.getTxtcontraseña().getText();
        String formacion = vista.getTxtformacion().getText();
        String sede = vista.getTxtdireccion_sede().getText();

        Instant instante = vista.getDCDirec().getDate().toInstant();
        ZoneId zi = ZoneId.of("America/Guayaquil");
        ZonedDateTime zdt = ZonedDateTime.ofInstant(instante, zi);
        java.sql.Date fecha = java.sql.Date.valueOf(zdt.toLocalDate());

        ModeloDirector director = new ModeloDirector();
        director.setId_director(iddirector);
        director.setCedula(cedula);
        director.setNombre(nombre);
        director.setApellido(apellido);
        director.setDireccion(direccion);
        director.setTelefono(telefono);
        director.setCorreo(correo);
        director.setCelular(celular);
        director.setContraseña(contrasenia);
        director.setSede(sede);
        director.setFormacion(formacion);
        director.setFechanacimiento(fecha);
    
        if (director.grabar()) {
            JOptionPane.showMessageDialog(vista, "director creado satisfactoriamente");
        } else {
            JOptionPane.showMessageDialog(vista, "ERROR");
        }
    
    }
    
     
    public String Edad(java.util.Date F_Nacimiento) {

        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
        String fecha = formato.format(F_Nacimiento);

        String fechanacimiento[] = fecha.split("/");
        int anio = Integer.parseInt(fechanacimiento[2]);
        int mes = Integer.parseInt(fechanacimiento[1]);
        int dia = Integer.parseInt(fechanacimiento[0]);
        LocalDate nacimiento = LocalDate.of(anio, mes, dia);
        LocalDate actual = LocalDate.now();
        Period d = Period.between(nacimiento, actual);
        long edad = d.getYears();
        return String.valueOf(edad);
    }
    
    
    private void limpiar(){
        vista.getTxtCodDirec().setText("");
        vista.getTxtCedulaDirec().setText("");
        vista.getTxtNombreDirec().setText("");
        vista.getTxtApeDirec().setText("");
        vista.getTxtDireccionDirec().setText("");
        vista.getTxtTelfDirec().setText("");
        vista.getTxtEmailDirec().setText("");
        vista.getTxtCelularDirec().setText("");
        vista.getTxtcontraseña().setText("");
        vista.getTxtformacion().setText("");
        vista.getTxtdireccion_sede().setText("");
    }
    
    private void eliminar() {
        int se = vista.getTbDirector().getSelectedRow();
        if (se >= 0) {
            cargaLista("");
            java.util.List<Director> lista = modelo.listaDirectores();
            for (int i = 0; i < lista.size(); i++) {
                if (i == se) {
                    vista.getTxteliminarid().setText(lista.get(i).getId_director()+ "");
                    vista.getTxteliminarnombre().setText(lista.get(i).getNombre() + " " + lista.get(i).getApellido());
                }
            }
        } else {
            JOptionPane.showMessageDialog(vista, "Seleccione la fila que desea eliminar");
            vista.getDlgEliminar().setVisible(false);
        }
    }
    
    private void confirmar() {
        String id = vista.getTxteliminarid().getText();
        ModeloDirector persona = new ModeloDirector();
        persona.setId_director(id);
        if (persona.eliminar()) {
            JOptionPane.showMessageDialog(vista, "Eliminado Exitosamente");
            vista.getDlgEliminar().dispose();
            limpiar();
        }
    }
    
    
     private void modificar(){
        int se=vista.getTbDirector().getSelectedRow();
        if (se>=0){
            cargaLista("");
            java.util.List<Director> lista=modelo.listaDirectores();
            for (int i = 0; i <lista.size(); i++) {
                 if(i==se){
                    String id=lista.get(i).getId_director()+"";
                    String ce=lista.get(i).getCedula()+"";
                    String nom=lista.get(i).getNombre()+"";
                    String ape=lista.get(i).getApellido()+"";
                    String di=lista.get(i).getDireccion()+"";
                    String tel=lista.get(i).getTelefono()+"";
                    String co=lista.get(i).getCorreo()+"";
                    Date f=lista.get(i).getFechanacimiento();
                    String cel=lista.get(i).getCelular()+"";
                    String con=lista.get(i).getContraseña()+"";
                    String fo = lista.get(i).getFormacion()+"";
                    String sede = lista.get(i).getSede()+"";
                    
                    vista.getTxtCodDirec().setText(id);
                    vista.getTxtCedulaDirec().setText(ce);
                    vista.getTxtNombreDirec().setText(nom);
                    vista.getTxtApeDirec().setText(ape);
                    vista.getTxtDireccionDirec().setText(di);
                    vista.getTxtTelfDirec().setText(tel);
                    vista.getTxtEmailDirec().setText(co);
                    vista.getDCDirec().setDate(f);
                    vista.getTxtCelularDirec().setText(cel);
                    vista.getTxtcontraseña().setText(con);
                    vista.getTxtformacion().setText(fo);
                    vista.getTxtdireccion_sede().setText(sede);
                 }
            }
         }else{
            JOptionPane.showMessageDialog(vista, "Seleccione");
            vista.getDgDirector().setVisible(false);
        }
    }
    
}
