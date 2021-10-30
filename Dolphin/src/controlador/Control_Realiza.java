/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import Modelo.ModeloAlumno;
import Modelo.Modelo_Realiza_Enca;
import Modelo.Modelo_Realiza_Det;
import Modelo.clases_base.Alumno;
import Modelo.clases_base.Deta_Realiza;
import Modelo.clases_base.Enca_Realiza;
import Vista.VistaDetRealiza;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.sql.Date;
import java.time.Instant;
import java.time.LocalDate;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import static jdk.nashorn.internal.runtime.Debug.id;
/**
 *
 * @author MayraPeñafiel
 */
public class Control_Realiza {
//     private Modelo_Realiza_Enca mre;
//     private Modelo_Realiza_Det mrd;
//     //private VistaEncaRealiza ver;
//     private VistaDetRealiza vdr;
//     
//     DefaultTableModel modelo1 = new DefaultTableModel();
//     DefaultTableModel modelo2 = new DefaultTableModel();
//
//    public Control_Realiza(Modelo_Realiza_Enca mre, Modelo_Realiza_Det mrd, VistaDetRealiza vdr) {
//        this.mre = mre;
//        this.mrd = mrd;
//        this.vdr = vdr;
//        vdr.setTitle("Asistencia");
//        vdr.setVisible(true);
//        cargarLista("");
//    }
//
//    public Control_Realiza() {
//    }
//    
//    public void iniciaControl(){
//        KeyListener kl = new KeyListener(){
//            @Override
//            public void keyTyped(KeyEvent e) {
//                //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//            }
//            @Override
//            public void keyPressed(KeyEvent e) {
//                //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//            }
//            @Override
//            public void keyReleased(KeyEvent e) {
//                //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//                //cargaLista(vista.getTxtBuscar().getText());
//                cargaLista(vdr.getTxtBuscarDetR().getText()); 
//            }
//        };
//        
//        //Controlar los eventos de la vista
//        vdr.getBtnActAsisJF().addActionListener(l -> cargarLista(""));
//        vdr.getBtnAddAsisJF().addActionListener(l -> cargarDialogo(1));
//        vdr.getBtnEditAsisJF().addActionListener(l -> cargarDialogo(2));
//        vdr.getBtnGuardarDetR().addActionListener(l -> grabarDisciplina());
//        vdr.getBtnDelJF().addActionListener(l -> eliminarDisciplina());
//        vdr.getBtncancelDetR().addActionListener(l -> vdr.getDgDisciplina().dispose());
//        vdr.getJbregresar().addActionListener(l->regresar());
//        //controlador buscar
//        vdr.getTxtBuscarDetR().addKeyListener(kl);
//        //Imprimir
//        vdr.getBtnPrintAsisJF().addActionListener(l -> imprimirReporte());
//    }
//    
//    private void cargarDialogo(int origen){
//        vdr.getDgDetalleRealiza().setSize(600,500);
//        vdr.getDgDetalleRealiza().setLocationRelativeTo(vdr);
//        if(origen==1){
//            cargar_combo_box();
//            vdr.getDgDetalleRealiza().setTitle("Añadir Asistencia ");
//            vdr.getBtnGuardarDetR().addActionListener(l->grabarDisciplina());
//            vdr.getDgDetalleRealiza().setVisible(true);
//        }else{
//            if(origen==2){
//                vdr.getDgDetalleRealiza().setTitle("Editar Disciplina");
//                vdr.getBtnGuardarDetR().addActionListener(l->editarDisciplina());
//                vdr.getDgDetalleRealiza().setVisible(true);
//                modificar_registro();
//             }
//        }
//    }
//       
//    //Metodo para Cargar Datos
//    private void cargarLista(String aguja){
//        DefaultTableModel tablaMD;
//        tablaMD = (DefaultTableModel)vdr.getTbDetalleR().getModel();
//        tablaMD.setNumRows(0);
//        ModeloAlumno mdal= new ModeloAlumno();
//        List<Alumno> listalum=mdal.listaAlumnos();
//        listalum.stream().forEach(al->{
//            List <Deta_Realiza> listadet=mrd.listarDR(aguja);
//            listadet.stream().forEach(det->{
//                List<Enca_Realiza> listaenc=mre.listarER();
//                listaenc.stream().forEach(enc->{
//                    if(det.getId_enc()==enc.getId_encaR()){
//                        if(enc.getId_alum()==al.getId_alumno()){
//                            String a=al.getNombre()+al.getApellido();
//                            tablaMD.addRow(new Object[]{a,det.getF_asistencia(),det.isAsistencia(),det.getP_avanze() });
//                        }else{
//                            System.out.println("El alumno no esta registrado en un entrenamiento");
//                        }
//                     }else{
//                        System.out.println("No se encuentra el entrenamiento");
//                     }
//                });
//            });                
//        });            
//    }
//    
//    //Metodo para cargar Combobox
//    private void cargar_combo_box(){
//        //Encabezado
//        DefaultComboBoxModel <String> jbpro = new DefaultComboBoxModel();
//        List<Enca_Realiza> lenc=mre.listarER();
//        lenc.stream().forEach(e->{
//                jbpro.addElement(e.getId_encaR());
//                vdr.getCbxERenDetR().setModel(jbpro);
//        });
//    }
//    
//    private void modificar_as(){
//        Modelo_Realiza_Enca me= new Modelo_Realiza_Enca();
//        Modelo_Realiza_Det md= new Modelo_Realiza_Det();
//        TableModel op=vdr.getTbDetalleR().getModel();
//        int col=vdr.getTbDetalleR().getColumnCount();
//        int fil=vdr.getTbDetalleR().getRowCount();
//        List<Deta_Realiza> datos= new ArrayList();
//        for (int i = 0; i < fil; i++) {
//            String al,as,av,id,id_d="";
//            Date f;
//            id_d=op.getValueAt(i, 1).toString();
//            id=op.getValueAt(i, 0).toString();
//            al=op.getValueAt(i, 2).toString();
//            as=op.getValueAt(i, 4).toString();
//            av=op.getValueAt(i, 5).toString();
//            DateTimeFormatter date=DateTimeFormatter.ofPattern("yyyy-MM-dd");
//            LocalDate fecha_n=LocalDate.parse(op.getValueAt(i, 1).toString(), date);
//            Date g = Date.valueOf(fecha_n.toString());
//            ModeloAlumno ma= new ModeloAlumno();
//            List <Alumno> alist=ma.listaAlumnos();
//            alist.stream().forEach(p->{
//                String ko= {p.getId_alumno()};
//                if(ko==op.getValueAt(i,1).toString()){
//                
//                }
//            
//                
//            });
//        }
//            
//        //Obtener Fecha de Inicio a partir del JCaledar
//        Instant instant= vdr.getDCFechaAsis().getDate().toInstant();
//        ZoneId zid= ZoneId.of("America/Guayaquil");
//        ZonedDateTime zdt=ZonedDateTime.ofInstant(instant, zid);
//        java.sql.Date f = java.sql.Date.valueOf(zdt.toLocalDate());
//        
//        //Obtener Datos desde un combobox
//        String enc="";
//        String dis=vdr.getCbxERenDetR().getSelectedItem().toString();
//        List<Enca_Realiza> comp=mre.listarER();
//        for (int i = 0; i < comp.size(); i++) {
//            if(comp.get(i).getId_encaR()==dis){
//                enc=comp.get(i).getId_encaR();
//            }else{
//                System.out.println("Disciplina Inexistente");
//            }
//        }
//        
//        //Setear Valores
//        
//        me.setId_encaR(enc); md.setId_enc(id);
//        if(as=="X" || as=="x"){
//            md.setAsistencia(true); 
//        }else{
//            md.setAsistencia(false);
//        }
//        
//        
//        if("Nuevo Registro".equals(vista.getDgEntrenamientp().getTitle())){
//            if(ent.grabar()){ 
//                //limpiar();
//                JOptionPane.showMessageDialog(vista, "Entrenamiento Creado Satisfactoriamente");
//                vista.getDgEntrenamientp().dispose();
//            }else{
//                JOptionPane.showMessageDialog(vista, "Error");
//            }
//            limpiar();
//        }   
//            
//        if("Editar Registro".equals(vista.getDgEntrenamientp().getTitle())){
//            if(ent.modificar()){
//                //limpiar();
//                JOptionPane.showMessageDialog(vista, "Entrenamiento Modificado Satisfactoriamente");
//                vista.getDgEntrenamientp().dispose();
//            }else{
//                JOptionPane.showMessageDialog(vista, "Error");
//            }  
//            limpiar();
//        }   
//    }
    
}
     
     
     
     
    
