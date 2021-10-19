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
            String sql="select Id_Disciplina, Nombre_D, Descripcion_D, Observaciones from disciplina ";
            ResultSet rs=con.consulta(sql);
            List<Disciplina> ld= new ArrayList <>();
            while(rs.next()){
                Disciplina dis= new Disciplina();
                dis.setId_disciplina(rs.getString("Id_Disciplina"));
                dis.setNombre_d(rs.getString("Nombre_D"));
                dis.setDescripcion_d(rs.getString("Descripcion_D"));
                dis.setObservaciones(rs.getString("Observaciones"));
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
            sql+=" UPPER(Nombre_D) like UPPER('%"+aguja+"%') OR ";
            sql+=" UPPER(Id_Disciplina) like UPPER('%"+aguja+"%')";
            ResultSet rs=con.consulta(sql);
            List<Disciplina> ld= new ArrayList<>();
            while(rs.next()){
                Disciplina dis= new Disciplina();
                dis.setId_disciplina(rs.getString("Id_Disciplina"));
                dis.setNombre_d(rs.getString("Nombre_D"));
                dis.setDescripcion_d(rs.getString("Descripcion_D"));
                dis.setObservaciones(rs.getString("Observaciones"));
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
        sql= "INSERT INTO disciplina(Id_Disciplina, Nombre_D, Descripcion_D, Observaciones) ";
        sql+= " VALUES ('" + getId_disciplina()+ "','" + getNombre_d()+ "','" + getDescripcion_d()+ "','"+getObservaciones()+"')";
        return con.accion(sql);
    }
    
    public boolean editarDisciplina(){
        String sql="UPDATE disciplina SET Nombre_D='"+getNombre_d()+"', Descripcion_D='"+getDescripcion_d()+"', Observaciones='"+getObservaciones()+"'";
        return con.accion(sql);
    }
   
    public boolean eliminarDisciplina(){
        String sql="DELETE FROM disciplina WHERE Id_Disciplina='"+getId_disciplina()+"'";
         return con.accion(sql);
    }

}