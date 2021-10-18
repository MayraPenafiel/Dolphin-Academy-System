
package Modelo;

import Modelo.clases_base.Alumno;
import java.awt.List;
import java.sql.Date;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import conexion.ConexionPG;

/**
 *
 * @author THALY
 */

public class ModeloAlumno extends Alumno{
    
    private ConexionPG con = new ConexionPG();

    public ModeloAlumno() {
        
    }

    public ModeloAlumno(String id_alumno, String categoria, String tipo, String disciplina, String entrenamiento) {
        super(id_alumno, categoria, tipo, disciplina, entrenamiento);
    }

    public ModeloAlumno(String id_alumno, String categoria, String tipo, String disciplina, String entrenamiento, String cedula, String nombre, String apellido, String telefono, String direccion, String correo, Date fechanacimiento, String celular, int edad, String tipo_p) {
        super(id_alumno, categoria, tipo, disciplina, entrenamiento, cedula, nombre, apellido, telefono, direccion, correo, fechanacimiento, celular, edad, tipo_p);
    }

    public java.util.List<Alumno> listaAlumnos(){
    
        try {
            String sql = "select * from alumno "; 
            ResultSet rs = con.consulta(sql);
            java.util.List<Alumno> lista = new ArrayList<Alumno>();
            while(rs.next()){
             Alumno a = new Alumno();
             a.setId_alumno(rs.getString("Id_Alumno"));
             a.setCategoria(rs.getString("Categoria"));
             a.setCedula(rs.getString("Cedula"));
             a.setNombre(rs.getString("Nombre"));
             a.setApellido(rs.getString("Apellido"));
             a.setDireccion(rs.getString("Direccion"));
             a.setTelefono(rs.getString("Telefono"));
             a.setCorreo(rs.getString("Correo"));
             a.setFechanacimiento(rs.getDate("F_Nacimiento"));
             a.setCelular(rs.getString("Celular"));
             //a.setEdad(Integer.parseInt(rs.getString("Edad")));
             a.setDisciplina(rs.getString("Disciplina"));
             a.setEntrenamiento(rs.getString("Entrenamiento"));
            lista.add(a);
            }
            rs.close();
            return lista;
        } catch (Exception e) {
            Logger.getLogger(ModeloAlumno.class.getName()).log(Level.SEVERE, null, e);
            return null;
        }
    }
    
    public java.util.List<Alumno> listaAlumno(String aguja){
    
        try {
            String sql = "select * from alumno WHERE ";
            sql += "UPPER(Id_Alumno) like UPPER('%" +aguja+ "%') OR ";
            sql += "UPPER(Nombre) like UPPER('%" +aguja+ "%') OR ";
            sql += "UPPER(Apellido) like UPPER('%" +aguja+ "%')";
            ResultSet rs = con.consulta(sql);
            java.util.List<Alumno> lista = new ArrayList<Alumno>();
            
            while(rs.next()){
            Alumno a = new Alumno();
            a.setId_alumno(rs.getString("Id_Alumno"));
            a.setCategoria(rs.getString("Categoria"));
             a.setCedula(rs.getString("Cedula"));
             a.setNombre(rs.getString("Nombre"));
             a.setApellido(rs.getString("Apellido"));
             a.setDireccion(rs.getString("Direccion"));
             a.setTelefono(rs.getString("Telefono"));
             a.setCorreo(rs.getString("Correo"));
             a.setFechanacimiento(rs.getDate("F_Nacimiento"));
             a.setCelular(rs.getString("Celular"));
             a.setEntrenamiento(rs.getString("Entrenamiento"));
             a.setDisciplina(rs.getString("Disciplina"));
            lista.add(a);
             }
            rs.close();
            return lista;
        } catch (Exception e) {
            Logger.getLogger(ModeloAlumno.class.getName()).log(Level.SEVERE, null, e);
           return null;
            
        }
        
    }
        public boolean grabar(){
        String sql;
        sql="INSERT INTO alumno(Id_Alumno,Categoria,Cedula, Nombre,Apellido, Direccion, Telefono, Correo, F_Nacimiento,Celular,Disciplina,Entrenamiento)";
        sql+="VALUES('"+getId_alumno()+"','"+getCategoria()+"','"+getCedula()+"','"+getNombre()+"','"+getApellido()+"','"+getDireccion()+"','"+getTelefono()+"','"+getCorreo()+"','"
                +getFechanacimiento()+"','"+getCelular()+"','"+getDisciplina()+"','"+getEntrenamiento()+"')";
        return con.accion(sql);
        }
    
    public boolean modificar(){
    String sql;
    
    sql = "UPDATE alumno ";
        sql += " SET C000ategoria = '" + getCategoria() + "'"
                + "Nombre = '" + getNombre() + "'"
                + ", Apellido = '" + getApellido() + "'"
                + ", Cedula = '" + getCedula()+ "'"
                + ", Direccion = '" + getDireccion()+ "'"
                + ", Telefono = '" + getTelefono()+"'"
                + ", Correo = '" + getCorreo()+"'"
                + ", F_Nacimiento = '" + getFechanacimiento()+ "'"
                + ", Celular = '" + getCelular()+"'"
                + ", Entrenamiento = '" + getEntrenamiento()+"'"
                + ", Disciplina = '" + getDisciplina()+"'"
                ;
                
        sql += " WHERE Id_Alumno= '" + getId_alumno() +"' ";
    return con.accion(sql);
    }
    
    public boolean eliminar() {
        String sql;
        sql = "DELETE FROM alumno ";
        sql += " WHERE Id_Alumno = '" + getId_alumno()+ "' ";
        return con.accion(sql);
    }
    
}  