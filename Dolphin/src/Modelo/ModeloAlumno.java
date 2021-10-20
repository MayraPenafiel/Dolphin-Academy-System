
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
            //String sql = "select a.id_alumno,a.categoria, a.Cedula, a.Nombre,a.Apellido, a.Direccion, a.Telefono, a.Correo, a.F_Nacimiento, a.Celular from alumno a inner join enca_realiza e on e.id_alumno = a.id_alumno inner join entrenamiento n on n.id_Entren = e.id_Entren";
            String sql = "select * from alumno "; 
            ResultSet rs = con.consulta(sql);
            java.util.List<Alumno> lista = new ArrayList<Alumno>();
            while(rs.next()){
                Alumno a = new Alumno();
                a.setId_alumno(rs.getString("id_alumno"));
                a.setCategoria(rs.getString("categoria"));
                a.setCedula(rs.getString("cedula"));
                a.setNombre(rs.getString("nombre"));
                a.setApellido(rs.getString("apellido"));
                a.setDireccion(rs.getString("direccion"));
                a.setTelefono(rs.getString("telefono"));
                a.setCorreo(rs.getString("correo"));
                a.setFechanacimiento(rs.getDate("f_nacimiento"));
                a.setCelular(rs.getString("celular"));
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
            sql += "UPPER(id_alumno) like UPPER('%" +aguja+ "%') OR ";
            sql += "UPPER(nombre) like UPPER('%" +aguja+ "%') OR ";
            sql += "UPPER(apellido) like UPPER('%" +aguja+ "%') ";
            ResultSet rs = con.consulta(sql);
            java.util.List<Alumno> lista = new ArrayList<Alumno>();
            while(rs.next()){
                Alumno a = new Alumno();
                a.setId_alumno(rs.getString("id_alumno"));
                a.setCategoria(rs.getString("categoria"));
                a.setCedula(rs.getString("cedula"));
                a.setNombre(rs.getString("nombre"));
                a.setApellido(rs.getString("apellido"));
                a.setDireccion(rs.getString("direccion"));
                a.setTelefono(rs.getString("telefono"));
                a.setCorreo(rs.getString("correo"));
                a.setFechanacimiento(rs.getDate("f_nacimiento"));
                a.setCelular(rs.getString("celular"));
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
        sql="INSERT INTO alumno(id_alumno,categoria,cedula, nombre,apellido, direccion, telefono, correo, f_nacimiento,celular)";
        sql+="VALUES('"+getId_alumno()+"','"+getCategoria()+ "','"+getCategoria()+"','"+getCedula()+"','"+getNombre()+"','"+getApellido()+"','"+getDireccion()+"','"+getTelefono()+"','"+getCorreo()+"','"
                +getFechanacimiento()+"','"+getCelular()+"')";
        return con.accion(sql);
        }
    
    public boolean modificar(){
    String sql;
    
    sql = "UPDATE alumno ";
        sql += " SET categoria = '" + getCategoria() + "'"
                + ", nombre = '" + getNombre() + "'"
                + ", apellido = '" + getApellido() + "'"
                + ", cedula = '" + getCedula()+ "'"
                + ", direccion = '" + getDireccion()+ "'"
                + ", telefono = '" + getTelefono()+"'"
                + ", correo = '" + getCorreo()+"'"
                + ", f_nacimiento = '" + getFechanacimiento()+ "'"
                + ", celular = '" + getCelular()+"'"
                ;
        sql += " WHERE id_alumno= '" + getId_alumno() +"' ";
    return con.accion(sql);
    }
    
    public boolean eliminar() {
        String sql;
        sql = "DELETE FROM alumno ";
        sql += " WHERE id_alumno = '" + getId_alumno()+ "' ";
        return con.accion(sql);
    }
    
}  