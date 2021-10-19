/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import Modelo.clases_base.Entrenamiento;
import conexion.ConexionPG;
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author MayraPenafiel
 */

public class Modelo_Entrenamiento extends Entrenamiento{
    
    //Atributos
    private ConexionPG con=new ConexionPG();

    //Constructores
    public Modelo_Entrenamiento() {
    }
    public Modelo_Entrenamiento(String id_entrenamiento, String id_profesor, String id_disciplina, Date f_inicio, Date f_fin, String descripcion, String observaciones) {
        super(id_entrenamiento, id_profesor, id_disciplina, f_inicio, f_fin, descripcion, observaciones);
    }
    
    //Metodo Cargar Entrenamiento
    public List <Entrenamiento> listarEnt (){
       String sql = "select * from Entrenamiento";
       ResultSet rs= con.consulta(sql);
       List<Entrenamiento> lista=new ArrayList<>();
       try {
           while(rs.next()){
               Entrenamiento p= new Entrenamiento();
               p.setId_entrenamiento(rs.getString("id_entrenamiento"));//campos de la BD
               p.setId_profesor(rs.getString("id_profesor"));//campos de la BD
               p.setId_disciplina(rs.getString("id_disciplina"));//campos de la BD
               p.setDescripcion(rs.getString("descripcion"));//campos de la BD
               p.setObservaciones(rs.getString("Observaciones"));//campos de la BD
             
               //Extraer Fecha de Inicio
               DateTimeFormatter date=DateTimeFormatter.ofPattern("yyyy-MM-dd");
               LocalDate fecha_in=LocalDate.parse(rs.getDate("f_inicio").toString(), date);
               String f=""+fecha_in.getDayOfMonth()+ "-"+fecha_in.getMonth()+"-"+fecha_in.getYear();
               Date in = Date.valueOf(fecha_in.toString());
               p.setF_inicio(in);//campos de la BD

               //Extraer Fecha de Fin
               LocalDate fecha_fn=LocalDate.parse(rs.getDate("f_fin").toString(), date);
               String fn=""+fecha_fn.getDayOfMonth()+ "-"+fecha_fn.getMonth()+"-"+fecha_fn.getYear();
               Date fin= Date.valueOf(fecha_fn.toString());
               p.setF_fin(fin);//campos de la BD

               lista.add(p);
           }
           rs.close();
           return lista;
       } catch (SQLException ex) {
           Logger.getLogger(Modelo_Entrenamiento.class.getName()).log(Level.SEVERE, null, ex);
           return null;
       }
    }
    
    //Metodo Buscar 
    public List <Entrenamiento> listarEnt (String aguja){
       String sql = "select * from Entrenamiento WHERE ";
       sql+=" UPPER(id_entrenamiento) like UPPER('%"+aguja+"%') OR ";
       sql+=" UPPER(id_profesor) like UPPER('%"+aguja+"%') OR ";
       sql+=" UPPER(id_disciplina) like UPPER('%"+aguja+"%') OR";
       sql+=" UPPER (descripcion) like UPPER('%"+aguja+"%') ";
       ResultSet rs= con.consulta(sql);
       List<Entrenamiento> lista=new ArrayList<Entrenamiento>();
       try {
           while(rs.next()){
             Entrenamiento p= new Entrenamiento();
               p.setId_entrenamiento(rs.getString("id_entrenamiento"));//campos de la BD
               p.setId_profesor(rs.getString("id_profesor"));//campos de la BD
               p.setId_disciplina(rs.getString("id_disciplina"));//campos de la BD
               p.setDescripcion(rs.getString("descripcion"));//campos de la BD
               p.setObservaciones(rs.getString("observaciones"));//campos de la BD
             
               //Extraer Fecha de Inicio
               DateTimeFormatter date=DateTimeFormatter.ofPattern("yyyy-MM-dd");
               LocalDate fecha_in=LocalDate.parse(rs.getDate("f_inicio").toString(), date);
               String f=""+fecha_in.getDayOfMonth()+ "-"+fecha_in.getMonth()+"-"+fecha_in.getYear();
               Date in = Date.valueOf(fecha_in.toString());
               p.setF_inicio(in);//campos de la BD

               //Extraer Fecha de Fin
               LocalDate fecha_fn=LocalDate.parse(rs.getDate("f_fin").toString(), date);
               String fn=""+fecha_fn.getDayOfMonth()+ "-"+fecha_fn.getMonth()+"-"+fecha_fn.getYear();
               Date fin= Date.valueOf(fecha_fn.toString());
               p.setF_fin(fin);//campos de la BD

               lista.add(p);
           }
           rs.close();
           return lista;
       } catch (SQLException ex) {
           Logger.getLogger(Modelo_Entrenamiento.class.getName()).log(Level.SEVERE, null, ex);
           return null;
       }
    }
    
     //Metodo para guardar
    public boolean grabar(){
       String sql;
           sql="INSERT INTO Entrenamiento(id_entrenamiento,id_profesor,id_disciplina,f_inicio, f_fin,"
                   + "descripcion,observaciones) ";
           sql+=" VALUES ('"+getId_entrenamiento()+"','"+getId_profesor()+"','"+getId_disciplina()+"','"+
                   getF_inicio()+"','"+getF_fin()+"','"+getDescripcion()+"','"+getObservaciones()+"')";
       return con.accion(sql);
    }
   
    //Metodo Modificar
    public boolean modificar(){
        String sql;
        sql="UPDATE Entrenamiento ";
        sql+=" SET id_profesor = '"+getId_profesor()+"'"+", id_disciplina = '"+getId_disciplina()+"'"+
                ", f_inicio = '"+getF_inicio()+"'"+", f_fin = '"+getF_fin()+"'"+", descripcion = '"+getDescripcion()+"'"+
                ", observaciones = '"+getObservaciones()+"'";
        sql+=" WHERE id_entrenamiento = '"+getId_entrenamiento()+"' ";
       return con.accion(sql);
    }
    
    //Metodo para eliminar
    public boolean eliminar(){
        String sql;
        sql= "DELETE FROM Entrenamiento ";
        sql+=" WHERE id_entrenamiento = '"+getId_entrenamiento()+"' ";
        return con.accion(sql);
    }
    
}

