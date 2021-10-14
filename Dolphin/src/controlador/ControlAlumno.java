package controlador;

import Modelo.clases_base.Alumno;
import Modelo.ModeloAlumno;
import Vista.VistaAlumno;
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

/**
 *
 * @author THALY
 */
public class ControlAlumno {

    private ModeloAlumno modelo;
    private VistaAlumno vista;
    DefaultTableModel tabla = new  DefaultTableModel();
     private ConexionPG con = new ConexionPG();
     
    public ControlAlumno(ModeloAlumno modelo, VistaAlumno vista) {
        this.modelo = modelo;
        this.vista = vista;

        // solamente inicializar elementos
        vista.setTitle("ALUMNO");
        //vista.getLblmensaje().setText("Bienvenido Sistema 1.0");
        vista.setVisible(true);
        cargaLista("");
    }

    public void iniciaControl() {
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
                cargaLista(vista.getTxtBuscarAlmn().getText());
            }
        };

        vista.getBtnListarJFAlmn().addActionListener(l -> cargaLista(""));
        
    }

    private void cargaLista(String aguja) {

        DefaultTableCellRenderer r = new DefaultTableCellRenderer();
        DefaultTableModel tableModel;
        tableModel = (DefaultTableModel) vista.getTbAlumno().getModel();
        tableModel.setNumRows(0);
        java.util.List<Alumno> lista = modelo.listaAlumno(aguja);
        lista.stream().forEach(a -> {

            String[] alumno = {a.getId_alumno(), a.getCedula(), a.getNombre(), a.getApellido(),
                a.getDireccion(), a.getTelefono(), a.getCelular(), a.getCategoria(), a.getDisciplina(), a.getEntrenamiento()};

        });
    }

    private void grabaAlumno() {
        String idalumno = vista.getTxtCodAlmn().getText();
        String cedula = vista.getTxtCedulaAlmn().getText();
        String nombre = vista.getTxtNombreAlumn().getText();
        String apellido = vista.getTxtApeAlmn().getText();
        String direccion = vista.getTxtDireccionAlmn().getText();
        String telefono = vista.getTxtTelfAlmn().getText();
        String correo = vista.getTxtEmailAlmn().getText();
        String celular = vista.getTxtCelularAlmn().getText();
        String categoria = vista.getCbxCategoriaAlmn().getSelectedItem().toString();
        String disciplina = vista.getCbxdisciplina().getSelectedItem().toString();
        String entrenamiento = vista.getCbxentrenamiento().getSelectedItem().toString();

        Instant instante = vista.getDCAlumn().getDate().toInstant();
        ZoneId zi = ZoneId.of("America/Guayaquil");
        ZonedDateTime zdt = ZonedDateTime.ofInstant(instante, zi);
        java.sql.Date fecha = java.sql.Date.valueOf(zdt.toLocalDate());

        ModeloAlumno alumno = new ModeloAlumno();
        alumno.setId_alumno(idalumno);
        alumno.setNombre(nombre);
        alumno.setApellido(apellido);
        alumno.setCedula(cedula);
        alumno.setCelular(celular);
        alumno.setDireccion(direccion);
        alumno.setTelefono(telefono);
        alumno.setCorreo(correo);
        alumno.setFechanacimiento((java.sql.Date) fecha);
        alumno.setDisciplina(disciplina);
        alumno.setEntrenamiento(entrenamiento);
        alumno.setCategoria(categoria);

        if (alumno.grabar()) {
            JOptionPane.showMessageDialog(vista, "alumno creado satisfactoriamente");
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

    private void limpiar() {
        vista.getTxtCodAlmn().setText("");
        vista.getTxtNombreAlumn().setText("");
        vista.getTxtApeAlmn().setText("");
        vista.getTxtTelfAlmn().setText("");
        vista.getTxtCedulaAlmn().setText("");
        vista.getTxtDireccionAlmn().setText("");
        vista.getTxtTelfAlmn().setText("");
        vista.getTxtCelularAlmn().setText("");

    }

    private void eliminar() {
        int se = vista.getTbAlumno().getSelectedRow();
        if (se >= 0) {
            cargaLista("");
            java.util.List<Alumno> lista = modelo.listaAlumnos();
            for (int i = 0; i < lista.size(); i++) {
                if (i == se) {
                    vista.getTxteliminarid().setText(lista.get(i).getId_alumno() + "");
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
        ModeloAlumno persona = new ModeloAlumno();
        persona.setId_alumno(id);
        if (persona.eliminar()) {
            JOptionPane.showMessageDialog(vista, "Eliminado");
            vista.getDlgEliminar().dispose();
            limpiar();
        }
    }

    private void modificar(){
        int se=vista.getTbAlumno().getSelectedRow();
        if (se>=0){
            cargaLista("");
            java.util.List<Alumno> lista=modelo.listaAlumnos();
            for (int i = 0; i <lista.size(); i++) {
                 if(i==se){
                    String id=lista.get(i).getId_alumno()+"";
                    String ca = lista.get(i).getCategoria()+"";
                    String ce=lista.get(i).getCedula()+"";
                    String nom=lista.get(i).getNombre()+"";
                    String ape=lista.get(i).getApellido()+"";
                    String di=lista.get(i).getDireccion()+"";
                    String tel=lista.get(i).getTelefono()+"";
                    String co=lista.get(i).getCorreo()+"";
                    Date f=lista.get(i).getFechanacimiento();
                    String cel=lista.get(i).getCelular()+"";
                    String dis=lista.get(i).getDisciplina()+"";
                    String en=lista.get(i).getEntrenamiento()+"";
                    
                    vista.getTxtCodAlmn().setText(id);
                    vista.getCbxCategoriaAlmn().setSelectedItem(ape);
                    vista.getTxtCedulaAlmn().setText(ce);
                    vista.getTxtNombreAlumn().setText(nom);
                    vista.getTxtApeAlmn().setText(ape);
                    vista.getTxtDireccionAlmn().setText(di);
                    vista.getTxtTelfAlmn().setText(tel);
                    vista.getTxtEmailAlmn().setText(co);
                    vista.getDCAlumn().setDate(f);
                    vista.getTxtCelularAlmn().setText(cel);
                    vista.getCbxdisciplina().setSelectedItem(dis);
                    vista.getCbxentrenamiento().setSelectedItem(en);
                 }
            }
         }else{
            JOptionPane.showMessageDialog(vista, "Seleccione");
            vista.getDgAlumno().setVisible(false);
        }
    }
 
}
