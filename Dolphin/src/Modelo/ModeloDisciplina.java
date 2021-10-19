/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import conexion.ConexionPG;
import Modelo.clases_base.Disciplina;

public class ModeloDisciplina extends Disciplina {
    ConexionPG con=new ConexionPG();

    public ModeloDisciplina() {
    }

    public ModeloDisciplina(String id_disciplina, String nombre_d, String descripcion_d, String observaciones) {
        super(id_disciplina, nombre_d, descripcion_d, observaciones);
    }
    
     public List<Disciplina> listaDisciplinas(){
        try {
            String sql="select id_disciplina, nombre_d, descripcion_d, observaciones from disciplina ";
            ResultSet rs=con.consulta(sql);
            List<Disciplina> ld= new ArrayList <>();
            while(rs.next()){
                Disciplina dis= new Disciplina();
                dis.setId_disciplina(rs.getString("id_disciplina"));
                dis.setNombre_d(rs.getString("nombre_d"));
                dis.setDescripcion_d(rs.getString("descripcion_d"));
                dis.setObservaciones(rs.getString("observaciones"));
                ld.add(dis);
            }
          rs.close();
          return ld;
        } catch (SQLException ex) {
            Logger.getLogger(ModeloDisciplina.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }
     
     public List<Disciplina> listaDisciplinas(String aguja){
        try {
            String sql="select * from disciplina WHERE ";
            sql+=" UPPER(nombre_d) like UPPER('%"+aguja+"%') OR ";
            sql+=" UPPER(id_disciplina) like UPPER('%"+aguja+"%')";
            ResultSet rs=con.consulta(sql);
            List<Disciplina> ld= new ArrayList<>();
            while(rs.next()){
                Disciplina dis= new Disciplina();
                dis.setId_disciplina(rs.getString("id_disciplina"));
                dis.setNombre_d(rs.getString("nombre_d"));
                dis.setDescripcion_d(rs.getString("descripcion_d"));
                dis.setObservaciones(rs.getString("observaciones"));
                ld.add(dis);
            }
          rs.close();
          return ld;
        } catch (SQLException ex) {
            Logger.getLogger(ModeloDisciplina.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }
    
    public boolean grabar() {
        String sql;
        sql= "INSERT INTO disciplina(id_disciplina, nombre_d, descripcion_d, observaciones) ";
        sql+= " VALUES ('" + getId_disciplina()+ "','" + getNombre_d()+ "','" + getDescripcion_d()+ "','"+getObservaciones()+"')";
        return con.accion(sql);
    }
    
    public boolean editarDisciplina(){
        String sql="UPDATE disciplina SET nombre_d='"+getNombre_d()+"', descripcion_d='"+getDescripcion_d()+"', observaciones='"+getObservaciones()+"'";
        return con.accion(sql);
    }
   
    public boolean eliminarDisciplina(){
        String sql="DELETE FROM disciplina WHERE id_disciplina='"+getId_disciplina()+"'";
         return con.accion(sql);
    }

}