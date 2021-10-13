
package Modelo;

import java.sql.Date;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import mvc.modelo.ConexionPG;

/**
 *
 * @author THALY
 */
public class ModeloDirector extends Director{
    private ConexionPG con = new ConexionPG();

    public ModeloDirector() {
    }

    public ModeloDirector(String id_director, String direccion_sede, String contrasenia, String formacion) {
        super(id_director, direccion_sede, contrasenia, formacion);
    }

    public ModeloDirector(String id_director, String direccion_sede, String formacion, String contraseña, String cedula, String nombre, String apellido, String telefono, String direccion, String correo, Date fechanacimiento, String cedular, int edad, String tipo_p) {
        super(id_director, direccion_sede, formacion, contraseña, cedula, nombre, apellido, telefono, direccion, correo, fechanacimiento, cedular, edad, tipo_p);
    }
    
    
    public java.util.List<Director> listaDirectores(){
    
        try {
            String sql = "select * from director "; 
            ResultSet rs = con.consulta(sql);
            java.util.List<Director> lista = new ArrayList<Director>();
            while(rs.next()){
             Director d = new Director();
             
             d.setId_director(rs.getString("Id"));
             d.setCedula(rs.getString("Cedula"));
             d.setNombre(rs.getString("Nombre"));
             d.setApellido(rs.getString("Apellido"));
             d.setDireccion(rs.getString("Direccion"));
             d.setTelefono(rs.getString("Telefono"));
             d.setCorreo(rs.getString("Correo"));
             d.setFechanacimiento(rs.getDate("F_nacimiento"));
             d.setCedular(rs.getString("Celular"));
             
             //d.setContraseña(rs.getString("Contraseña"));
             d.setFormacion(rs.getString("Formacion"));
             d.setDireccion_sede(rs.getString("direccion_sede"));
             
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
            sql += "UPPER(iddirector) like UPPER('%" +aguja+ "%') OR ";
            sql += "UPPER(nombre) like UPPER('%" +aguja+ "%') OR ";
            sql += "UPPER(apellido) like UPPER('%" +aguja+ "%')";
            ResultSet rs = con.consulta(sql);
            java.util.List<Director> lista = new ArrayList<Director>();
            try {
            while(rs.next()){
            Director d = new Director();
            d.setId_director(rs.getString("Id"));
             d.setCedula(rs.getString("Cedula"));
             d.setNombre(rs.getString("Nombre"));
             d.setApellido(rs.getString("Apellido"));
             d.setDireccion(rs.getString("Direccion"));
             d.setTelefono(rs.getString("Telefono"));
             d.setCorreo(rs.getString("Correo"));
             d.setFechanacimiento(rs.getDate("F_nacimiento"));
             d.setCedular(rs.getString("Celular"));
             //a.setEdad(Integer.parseInt(rs.getString("Edad")));
             d.setFormacion(rs.getString("Formacion"));
             d.setDireccion_sede(rs.getString("Nombre_sede"));
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
        sql="INSERT INTO director(id,cedula, nombre,apellido, direccion, telefono, correo, fecha_nacimiento,celular,contraseña,formacion,sede)";
        sql+="VALUES('"+getId_director()+"','"+getCedula()+"','"+getNombre()+"','"+getApellido()+"','"+getDireccion()+"','"+getTelefono()+"','"+getCorreo()+"','"
                +getFechanacimiento()+"','"+getCedular()+"','"+getContraseña()+"','"+getFormacion()+"','"+getDireccion_sede()+"',)";
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
                + ", fechanacimiento = '" + getFechanacimiento()+ "'"
                + ", celular = '" + getCedular()+"'"
                + ", ccontraseña = '" + getContraseña()+"'"
                + ", formacion = '" + getFormacion()+"'"
                + ", direccion_sede = '" + getDireccion_sede()+"'"
                
                
                ;
                
        sql += " WHERE id= '" + getId_director()+"' ";
    return con.accion(sql);
    }

       public boolean eliminar() {
        String sql;
        sql = "DELETE FROM director ";
        sql += " WHERE iddirector = '" + getId_director()+ "' ";
        return con.accion(sql);
    }
     
        
        
    }
    
    
    
    
    
    
    

