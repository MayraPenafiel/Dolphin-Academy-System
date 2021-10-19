
package controlador;

import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.AbstractTableModel;
import javax.swing.table.DefaultTableModel;
import Modelo.clases_base.Disciplina;
import modelo.Modelo_Disciplina;
import Vista.VistaDisciplina;
import Vista.VistaMenu;
import conexion.ConexionPG;
import java.awt.Toolkit;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.logging.Level;
import java.util.logging.Logger;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.util.JRLoader;
import net.sf.jasperreports.view.JasperViewer;


public class Control_Disciplina {
    private Modelo_Disciplina modelo;
    private VistaDisciplina vista;

    public Control_Disciplina(Modelo_Disciplina modelo, VistaDisciplina vista) {
        this.modelo = modelo;
        this.vista = vista;
        vista.setTitle("CRUD DISCIPLINAS");
        vista.setVisible(true);
        cargaLista();
    }
    
       public void iniciaControl(){
        KeyListener kl = new KeyListener(){
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
                //cargaLista(vista.getTxtBuscar().getText());
                cargaLista(vista.getTxtbuscard().getText()); 
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

                if (vista.getTxtcodigo().getText().length() > 8) {
                    Toolkit.getDefaultToolkit().beep();
                    e.consume();
                }
            }
        };

        vista.getTxtcodigo().addKeyListener(c1);

        KeyAdapter c2 = new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                char c = e.getKeyChar();
                if (Character.isLetter(c)) {
                } else {
                    e.consume();
                    Toolkit.getDefaultToolkit().beep();
                }

                if (vista.getTxtnombred().getText().length() > 20) {
                    Toolkit.getDefaultToolkit().beep();
                    e.consume();
                }
            }
        };
        vista.getTxtnombred().addKeyListener(c2);

        KeyAdapter c3 = new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                char c = e.getKeyChar();
                if (Character.isLetter(c)) {
                } else {
                    e.consume();
                    Toolkit.getDefaultToolkit().beep();
                }

                if (vista.getTxtdescripciond().getText().length() > 20) {
                    Toolkit.getDefaultToolkit().beep();
                    e.consume();
                }
            }
        };
        vista.getTxtdescripciond().addKeyListener(c3);

        KeyAdapter c4 = new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                char c = e.getKeyChar();
                if (Character.isLetter(c)) {
                } else {
                    e.consume();
                    Toolkit.getDefaultToolkit().beep();
                }

                if (vista.getTxtdescripciond().getText().length() > 10) {
                    Toolkit.getDefaultToolkit().beep();
                    e.consume();
                }
            }
        };

        vista.getTxtdescripciond().addKeyListener(c4);


        
        
        //Controlar los eventos de la vista
        vista.getBtnlistar().addActionListener(l -> cargaLista(""));
        vista.getBtncrear().addActionListener(l -> cargarDialogo(1));
        vista.getBtneditar().addActionListener(l -> cargarDialogo(2));
        vista.getBtnaceptar().addActionListener(l -> grabarDisciplina());
        vista.getBtneliminar().addActionListener(l -> eliminarDisciplina());
        vista.getBtncancelar().addActionListener(l -> regresar());
        //vista.getBtnregresarmenu().addActionListener(l->regresarMenu());
//    
//    
        //controlador buscar
        vista.getTxtbuscard().addKeyListener(kl);
        //Imprimir
        vista.getBtnimprimirdisciplina().addActionListener(l -> imprimirReporte());
//    
//    
//    
//    
    }
       
     //IMPRESION
    private void imprimirReporte() {

        ConexionPG conp = new ConexionPG();
        try {

            JasperReport jr = (JasperReport) JRLoader.loadObject(getClass().getResource("/reportes/Reporte_Disciplina.jasper"));

            JasperPrint jp = JasperFillManager.fillReport(jr, null, conp.getCon());
            JasperViewer jv = new JasperViewer(jp);

            jv.setVisible(true);

        } catch (JRException ex) {
            Logger.getLogger(ControlAlumno.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

       private void cargarDialogo(int origen){
        vista.getDgDisciplina().setSize(600,500);
        vista.getDgDisciplina().setLocationRelativeTo(vista);
        if(origen==1){
            vista.getDgDisciplina().setTitle("Crear Disciplina");
            vista.getBtnaceptar().addActionListener(l->grabarDisciplina());
             vista.getDgDisciplina().setVisible(true);
        }else{
             if(vista.getTbldisciplina().getSelectedRow()==-1){
            JOptionPane.showMessageDialog(vista,"Debe seleccionar una fila,Intente de nuevo");
              }else{
                   vista.getDgDisciplina().setTitle("Editar Disciplina");
                   vista.getBtnaceptar().addActionListener(l->editarDisciplina());
                   cargarDatos();
                    vista.getDgDisciplina().setVisible(true);
             }
   
        }
       
    }
       
       private void limpiar(){
        vista.getTxtcodigo().setText("");
        vista.getTxtnombred().setText("");
        vista.getTxtdescripciond().setText("");
        vista.getTxtobservacionesd().setText("");
       
                
        
    }
    
  private void cargaLista(){
    //Acciones necesarios para extraer los datos MODELO Y Mostrar en la Vista
        DefaultTableModel tblModel; //Estructura JTbable
        tblModel=(DefaultTableModel)vista.getTbldisciplina().getModel();
        tblModel.setNumRows(0);
        List<Disciplina> lista=modelo.listaDisciplinas();
        lista.stream().forEach(d->{
        String[] disciplina={d.getId_disciplina(),d.getNombre_d(),d.getDescripcion_d(),d.getObservaciones()+""};
        tblModel.addRow(disciplina);
        });
    }
    
    private void cargaLista(String aguja){
    //Acciones necesarios para extraer los datos MODELO Y Mostrar en la Vista
        DefaultTableModel tblModel; //Estructura JTbable
        tblModel=(DefaultTableModel)vista.getTbldisciplina().getModel();
        tblModel.setNumRows(0);
        List<Disciplina> lista=modelo.listaDisciplinas(aguja);
        lista.stream().forEach(d->{
        String[] disciplina={d.getId_disciplina(),d.getNombre_d(),d.getDescripcion_d(),d.getObservaciones()+""};
        tblModel.addRow(disciplina);
        });
    }

    
   
    private void grabarDisciplina(){
        String id_disciplina = vista.getTxtcodigo().getText();
        String nombre_d = vista.getTxtnombred().getText();
        String descripcion_d = vista.getTxtdescripciond().getText();
        String observaciones = vista.getTxtobservacionesd().getText();
        
        
        
        Modelo_Disciplina disciplina = new Modelo_Disciplina();
        disciplina.setId_disciplina(descripcion_d);
        disciplina.setNombre_d(nombre_d);
        disciplina.setDescripcion_d(descripcion_d);
        disciplina.setObservaciones(observaciones);
        
        
       if(disciplina.grabar()){
           JOptionPane.showMessageDialog(vista, "Disciplina Creada Satisfactoriamente");
           vista.getDgDisciplina().setVisible(false);
            limpiar();
            cargaLista();
       }else{
           JOptionPane.showMessageDialog(vista, "Error");
       }
    }
    
      private void eliminarDisciplina(){
         AbstractTableModel tblmodel=(AbstractTableModel) vista.getTbldisciplina().getModel();
        JTable tabla=vista.getTbldisciplina();
        if(vista.getTbldisciplina().getSelectedRow()==-1){
            JOptionPane.showMessageDialog(vista.getTbldisciplina(),"Debe seleccionar una fila,Intente de nuevo");
            cargaLista();
        }else{
             Modelo_Disciplina model1=new Modelo_Disciplina(tblmodel.getValueAt(tabla.getSelectedRow(),0)+"",null,null,null);
            if( model1.eliminarDisciplina()){
                 JOptionPane.showMessageDialog(vista, "Disciplina Eliminada Satisfactoriamente");
                 cargaLista();
            }else{
                JOptionPane.showMessageDialog(vista, "Error");
            }
             
             
             
        }
    }
      
      //Cargar los datos de la persona al editar en el dialogo
      private void cargarDatos(){
        AbstractTableModel tblmodel= (AbstractTableModel) this.vista.getTbldisciplina().getModel();
        JTable tabla=this.vista.getTbldisciplina();
        
       
        List<Disciplina> l1= modelo.listaDisciplinas(tblmodel.getValueAt(tabla.getSelectedRow(), 0)+"");
        
        vista.getTxtcodigo().setText(l1.get(0).getId_disciplina());
        vista.getTxtnombred().setText(l1.get(0).getNombre_d());
        vista.getTxtdescripciond().setText(l1.get(0).getDescripcion_d());
        vista.getTxtobservacionesd().setText(l1.get(0).getObservaciones());

      }
      
    private void editarDisciplina(){

        Modelo_Disciplina disciplina = new Modelo_Disciplina();
        disciplina.setId_disciplina(vista.getTxtcodigo().getText()+"");
        disciplina.setNombre_d(vista.getTxtnombred().getText()+"");
        disciplina.setDescripcion_d(vista.getTxtdescripciond().getText()+"");
      
        disciplina.setObservaciones(vista.getTxtobservacionesd().getText()+"");
        
        if(disciplina.editarDisciplina()){
           JOptionPane.showMessageDialog(vista, "Disciplina Editada Satisfactoriamente");
             vista.getDgDisciplina().setVisible(false);
            limpiar();
            cargaLista();
       }else{
           JOptionPane.showMessageDialog(vista, "Error");
       }
    }
    
    public void regresar(){
        Modelo_Disciplina mo=new Modelo_Disciplina();
        VistaDisciplina vd = new VistaDisciplina();
        Control_Disciplina control = new Control_Disciplina(mo,vd);
        control.iniciaControl();
        vista.dispose();
    }
//     public void regresarMenu(){
//        VistaMenu vm = new VistaMenu();
//        //Control_Menu control = new Control_Menu(vm);
//        control.inicia_control();
//        vista.dispose();
//    }
    
    
    
    
}
