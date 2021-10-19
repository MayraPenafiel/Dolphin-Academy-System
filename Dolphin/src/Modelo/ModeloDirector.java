
package Modelo;

import Modelo.clases_base.Director;
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

public class ModeloDirector extends Director{
    private ConexionPG con = new ConexionPG();

    public ModeloDirector() {
    }

    public ModeloDirector(String id_director, String sede, String contrasenia, String formacion) {
        super(id_director, sede, contrasenia, formacion);
    }

    public ModeloDirector(String id_director, String sede, String formacion, String contraseña, String cedula, String nombre, String apellido, String telefono, String direccion, String correo, Date fechanacimiento, String celular, int edad, String tipo_p) {
        super(id_director, sede, formacion, contraseña, cedula, nombre, apellido, telefono, direccion, correo, fechanacimiento, celular, edad, tipo_p);
    }
    
    public java.util.List<Director> listaDirectores(){
        try {
            String sql = "select * from director "; 
            ResultSet rs = con.consulta(sql);
            java.util.List<Director> lista = new ArrayList<Director>();
            while(rs.next()){
                Director d = new Director();
                d.setId_director(rs.getString("id_director"));
                d.setCedula(rs.getString("cedula"));
                d.setNombre(rs.getString("nombre"));
                d.setApellido(rs.getString("apellido"));
                d.setDireccion(rs.getString("direccion"));
                d.setTelefono(rs.getString("telefono"));
                d.setCorreo(rs.getString("correo"));
                d.setFechanacimiento(rs.getDate("f_nacimiento"));
                d.setCelular(rs.getString("celular"));
                d.setContraseña(rs.getString("contraseña"));
                d.setFormacion(rs.getString("formacion"));
                d.setSede(rs.getString("sede"));
                lista.add(d);
            }
            rs.close();
            return lista;
        } catch (Exception e) {
            Logger.getLogger(ModeloDirector.class.getName()).log(Level.SEVERE, null, e);
            return null;
        }
    }
    
    public java.util.List<Director> listaDirectores(String aguja){
            String sql = "select * from director WHERE ";
            sql += "UPPER(id_director) like UPPER('%" +aguja+ "%') OR ";
            sql += "UPPER(nombre) like UPPER('%" +aguja+ "%') OR ";
            sql += "UPPER(apellido) like UPPER('%" +aguja+ "%') ";
            ResultSet rs = con.consulta(sql);
            java.util.List<Director> lista = new ArrayList<Director>();
            try {
            while(rs.next()){
                Director d = new Director();
                d.setId_director(rs.getString("id_director"));
                d.setCedula(rs.getString("cedula"));
                d.setNombre(rs.getString("nombre"));
                d.setApellido(rs.getString("apellido"));
                d.setDireccion(rs.getString("direccion"));
                d.setTelefono(rs.getString("telefono"));
                d.setCorreo(rs.getString("correo"));
                d.setFechanacimiento(rs.getDate("f_nacimiento"));
                d.setCelular(rs.getString("celular"));
                d.setFormacion(rs.getString("formacion"));
                d.setContraseña(rs.getString("contraseña"));
                d.setSede(rs.getString("sede"));
                lista.add(d);
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
        sql="INSERT INTO director(id_director,cedula,nombre,apellido,direccion,telefono,correo, f_nacimiento,celular,contraseña,formacion,sede)";
        sql+="VALUES('"+getId_director()+"','"+getCedula()+"','"+getNombre()+"','"+getApellido()+"','"+getDireccion()+"','"+getTelefono()+"','"+getCorreo()+"','"
                +getFechanacimiento()+"','"+getCelular()+"','"+getContraseña()+"','"+getFormacion()+"','"+getSede()+"',)";
        return con.accion(sql);
    }  
        
    public boolean modificar(){
        String sql;
        sql = "UPDATE director ";
        sql += " SET nombre = '" + getNombre()+ "'"
                + ", apellido = '" + getApellido() + "'"
                + ", cedula = '" + getCedula()+ "'"
                + ", direccion = '" + getDireccion()+ "'"
                + ", telefono = '" + getTelefono()+"'"
                + ", correo = '" + getCorreo()+"'"
                + ", f_nacimiento = '" + getFechanacimiento()+ "'"
                + ", celular = '" + getCelular()+"'"
                + ", contraseña = '" + getContraseña()+"'"
                + ", formacion = '" + getFormacion()+"'"
                + ", sede = '" + getSede()+"'"
                ;
        sql += " WHERE id_director= '" + getId_director()+"' ";
        return con.accion(sql);
    }

    public boolean eliminar() {
        String sql;
        sql = "DELETE FROM director ";
        sql += " WHERE id_director = '" + getId_director()+ "' ";
        return con.accion(sql);
    }
        
}
    
    
    
    
    
    
    

