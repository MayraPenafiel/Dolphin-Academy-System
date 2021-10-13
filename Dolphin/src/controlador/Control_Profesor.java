
package controlador;

import Modelo.Director;
import Modelo.Modelo_Profesor;
import Modelo.Profesor;
import Vista.VistaProfesor;
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
import mvc.modelo.ConexionPG;


public class Control_Profesor{
    private Modelo_Profesor modelo;
    private VistaProfesor vista;
     DefaultTableModel tabla = new  DefaultTableModel();
     private ConexionPG con = new ConexionPG();

    public Control_Profesor(Modelo_Profesor modelo, VistaProfesor vista) {
        this.modelo = modelo;
        this.vista = vista;
        
        vista.setTitle("PROFESOR");
        vista.setVisible(true);
        cargaLista("");
    }
    
    public void iniciaControl(){
    
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
                cargaLista(vista.getTxtBuscarProf().getText());
            }
        };
        vista.getBtnListarJFProf().addActionListener(l -> cargaLista(""));
    }
    
    private void cargaLista(String aguja){
        
        DefaultTableCellRenderer r = new DefaultTableCellRenderer();
        DefaultTableModel tableModel;
        tableModel = (DefaultTableModel) vista.getTbProfesor().getModel();
        tableModel.setNumRows(0);
        java.util.List<Profesor> lista = modelo.listaProfesores(aguja);
        lista.stream().forEach(p ->{
        
            tableModel.addRow(new Object[]{ p.getId_Profesor(),p.getCedula(),p.getNombre(),p.getApellido(),p.getDireccion(),p.getTelefono(),p.getCorreo(),
            p.getFechanacimiento(),p.getCedular(),p.getFormacion()});
                    
        
        });
    }
    
    private void grabaDirector(){
    String idprofesor = vista.getTxtCodProf().getText();
    String cedula = vista.getTxtCedulaProf().getText();
    String nombre = vista.getTxtNombreProf().getText();
    String apellido = vista.getTxtApeProf().getText();
    String direccion = vista.getTxtDireccionProf().getText();
    String telefono = vista.getTxtTelfProf().getText();
    String correo = vista.getTxtEmailProf().getText();
    //String fechanacimiento = vista.
    String celular = vista.getTxtCelularProf().getText();
    String formacion = vista.getTxtFormacionProf().getText();
  
    Instant instante = vista.getDCProf().getDate().toInstant();
    ZoneId zi = ZoneId.of("America/Guayaquil");
    ZonedDateTime zdt = ZonedDateTime.ofInstant(instante, zi);
    java.sql.Date fecha = java.sql.Date.valueOf(zdt.toLocalDate());

    Modelo_Profesor profesor = new Modelo_Profesor();
    profesor.setId_Profesor(idprofesor);
    profesor.setCedula(cedula);
    profesor.setNombre(nombre);
    profesor.setApellido(apellido);
    profesor.setDireccion(direccion);
    profesor.setTelefono(telefono);
    profesor.setCorreo(correo);
    profesor.setCedular(celular);
    profesor.setContraseña("");
    
        if (profesor.grabar()) {
            JOptionPane.showMessageDialog(vista, "Profesor creado satisfactoriamente");
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
    vista.getTxtCodProf().setText("");
    vista.getTxtCedulaProf().setText("");
    vista.getTxtNombreProf().setText("");
    vista.getTxtApeProf().setText("");
    vista.getTxtDireccionProf().setText("");
    vista.getTxtTelfProf().setText("");
    vista.getTxtEmailProf().setText("");
    vista.getTxtCelularProf().setText("");
    vista.getTxtFormacionProf().setText("");

    }
    
    private void eliminar() {
        int se = vista.getTbProfesor().getSelectedRow();
        if (se >= 0) {
            cargaLista("");
            java.util.List<Profesor> lista = modelo.listaProfesores();
            for (int i = 0; i < lista.size(); i++) {
                if (i == se) {
                    vista.getTxteliminarid().setText(lista.get(i).getId_Profesor()+ "");
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
        Modelo_Profesor persona = new Modelo_Profesor();
        persona.setId_Profesor(id);
        if (persona.eliminar()) {
            JOptionPane.showMessageDialog(vista, "Eliminado");
            vista.getDlgEliminar().dispose();
            limpiar();
        }
    }
    
    
    
     private void modificar(){
        int se=vista.getTbProfesor().getSelectedRow();
        if (se>=0){
            cargaLista("");
            java.util.List<Profesor> lista=modelo.listaProfesores();
            for (int i = 0; i <lista.size(); i++) {
                 if(i==se){
                    String id=lista.get(i).getId_Profesor()+"";
                    String ce=lista.get(i).getCedula()+"";
                    String nom=lista.get(i).getNombre()+"";
                    String ape=lista.get(i).getApellido()+"";
                    String di=lista.get(i).getDireccion()+"";
                    String tel=lista.get(i).getTelefono()+"";
                    String co=lista.get(i).getCorreo()+"";
                    Date f=lista.get(i).getFechanacimiento();
                    String cel=lista.get(i).getCedular()+"";
                    String con=lista.get(i).getContraseña()+"";
                    String fo = lista.get(i).getFormacion()+"";

                    
                    vista.getTxtCodProf().setText(id);
                    vista.getTxtCedulaProf().setText(ce);
                    vista.getTxtNombreProf().setText(nom);
                    vista.getTxtApeProf().setText(ape);
                    vista.getTxtDireccionProf().setText(di);
                    vista.getTxtTelfProf().setText(tel);
                    vista.getTxtEmailProf().setText(co);
                    vista.getDCProf().setDate(f);
                    vista.getTxtCelularProf().setText(cel);
                    vista.getTxtContraseñaProf().setText(con);
                    vista.getTxtFormacionProf().setText(fo);
                    
                    
                    
                 }
            }
         }else{
            JOptionPane.showMessageDialog(vista, "Seleccione");
            vista.getDgProfesor().setVisible(false);
        }
    }
 
    
    
}
