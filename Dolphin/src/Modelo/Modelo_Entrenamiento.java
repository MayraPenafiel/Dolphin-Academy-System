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
               p.setId_entrenamiento(rs.getString("Id_Entrenamiento"));//campos de la BD
               p.setId_profesor(rs.getString("Id_Profesor"));//campos de la BD
               p.setId_disciplina(rs.getString("Id_Disciplina"));//campos de la BD
               p.setDescripcion(rs.getString("Descripcion"));//campos de la BD
               p.setObservaciones(rs.getString("Observaciones"));//campos de la BD
             
               //Extraer Fecha de Inicio
               DateTimeFormatter date=DateTimeFormatter.ofPattern("yyyy-MM-dd");
               LocalDate fecha_in=LocalDate.parse(rs.getDate("F_Inicio").toString(), date);
               String f=""+fecha_in.getDayOfMonth()+ "-"+fecha_in.getMonth()+"-"+fecha_in.getYear();
               Date in = Date.valueOf(fecha_in.toString());
               p.setF_inicio(in);//campos de la BD

               //Extraer Fecha de Fin
               LocalDate fecha_fn=LocalDate.parse(rs.getDate("F_Fin").toString(), date);
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
    
    //Metodo Buscar Personas
    public List <Entrenamiento> listarEnt (String aguja){
       String sql = "select * from Entrenamiento WHERE ";
       sql+=" UPPER(Id_Entrenamiento) like UPPER('%"+aguja+"%') OR ";
       sql+=" UPPER(Id_Profesor) like UPPER('%"+aguja+"%') OR ";
       sql+=" UPPER(Id_Disciplina) like UPPER('%"+aguja+"%') OR";
       sql+=" UPPER (Descripcion) like UPPER('%"+aguja+"%') ";
       ResultSet rs= con.consulta(sql);
       List<Entrenamiento> lista=new ArrayList<Entrenamiento>();
       try {
           while(rs.next()){
             Entrenamiento p= new Entrenamiento();
               p.setId_entrenamiento(rs.getString("Id_Entrenamiento"));//campos de la BD
               p.setId_profesor(rs.getString("Id_Profesor"));//campos de la BD
               p.setId_disciplina(rs.getString("Id_Disciplina"));//campos de la BD
               p.setDescripcion(rs.getString("Descripcion"));//campos de la BD
               p.setObservaciones(rs.getString("Observaciones"));//campos de la BD
             
               //Extraer Fecha de Inicio
               DateTimeFormatter date=DateTimeFormatter.ofPattern("yyyy-MM-dd");
               LocalDate fecha_in=LocalDate.parse(rs.getDate("F_Inicio").toString(), date);
               String f=""+fecha_in.getDayOfMonth()+ "-"+fecha_in.getMonth()+"-"+fecha_in.getYear();
               Date in = Date.valueOf(fecha_in.toString());
               p.setF_inicio(in);//campos de la BD

               //Extraer Fecha de Fin
               LocalDate fecha_fn=LocalDate.parse(rs.getDate("F_Fin").toString(), date);
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
           sql="INSERT INTO Entrenamiento(Id_Entrenamiento,Id_Profesor,Id_Disciplina,F_Inicio, F_fin,"
                   + "Descripcion,Observaciones) ";
           sql+=" VALUES ('"+getId_entrenamiento()+"','"+getId_profesor()+"','"+getId_disciplina()+"','"+
                   getF_inicio()+"','"+getF_fin()+"','"+getDescripcion()+"','"+getObservaciones()+"')";
       return con.accion(sql);
    }
   
    //Metodo Modificar
    public boolean modificar(){
        String sql;
        sql="UPDATE Entrenamiento ";
        sql+=" SET Id_Profesor = '"+getId_profesor()+"'"+", Id_Disciplina = '"+getId_disciplina()+"'"+
                ", F_inicio = '"+getF_inicio()+"'"+", F_fin = '"+getF_fin()+"'"+", Descripcion = '"+getDescripcion()+"'"+
                ", Observaciones = '"+getObservaciones()+"'";
        sql+=" WHERE Id_Entrenamiennto = '"+getId_entrenamiento()+"' ";
       return con.accion(sql);
    }
    
    //Metodo para eliminar
    public boolean eliminar(){
        String sql;
        sql= "DELETE FROM Entrenamiento ";
        sql+=" WHERE Id_Entrenamiento = '"+getId_entrenamiento()+"' ";
        return con.accion(sql);
    }
    
}

