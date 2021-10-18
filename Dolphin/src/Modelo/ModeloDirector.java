
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

    public ModeloDirector(String id_director, String direccion_sede, String contrasenia, String formacion) {
        super(id_director, direccion_sede, contrasenia, formacion);
    }

    public ModeloDirector(String id_director, String direccion_sede, String formacion, String contraseña, String cedula, String nombre, String apellido, String telefono, String direccion, String correo, Date fechanacimiento, String celular, int edad, String tipo_p) {
        super(id_director, direccion_sede, formacion, contraseña, cedula, nombre, apellido, telefono, direccion, correo, fechanacimiento, celular, edad, tipo_p);
    }
    
    
    public java.util.List<Director> listaDirectores(){
    
        try {
            String sql = "select * from director "; 
            ResultSet rs = con.consulta(sql);
            java.util.List<Director> lista = new ArrayList<Director>();
            while(rs.next()){
             Director d = new Director();
             
             d.setId_director(rs.getString("Id_Director"));
             d.setCedula(rs.getString("Cedula"));
             d.setNombre(rs.getString("Nombre"));
             d.setApellido(rs.getString("Apellido"));
             d.setDireccion(rs.getString("Direccion"));
             d.setTelefono(rs.getString("Telefono"));
             d.setCorreo(rs.getString("Correo"));
             d.setFechanacimiento(rs.getDate("F_Nacimiento"));
             d.setCelular(rs.getString("Celular"));
             
             //d.setContraseña(rs.getString("Contraseña"));
             d.setFormacion(rs.getString("formacion"));
             d.setDireccion_sede(rs.getString("COD_sede"));
             
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
            sql += "UPPER(Id_Director) like UPPER('%" +aguja+ "%') OR ";
            sql += "UPPER(Nombre) like UPPER('%" +aguja+ "%') OR ";
            sql += "UPPER(Apellido) like UPPER('%" +aguja+ "%')";
            ResultSet rs = con.consulta(sql);
            java.util.List<Director> lista = new ArrayList<Director>();
            try {
            while(rs.next()){
            Director d = new Director();
            d.setId_director(rs.getString("Id_Director"));
             d.setCedula(rs.getString("Cedula"));
             d.setNombre(rs.getString("Nombre"));
             d.setApellido(rs.getString("Apellido"));
             d.setDireccion(rs.getString("Direccion"));
             d.setTelefono(rs.getString("Telefono"));
             d.setCorreo(rs.getString("Correo"));
             d.setFechanacimiento(rs.getDate("F_Nacimiento"));
             d.setCelular(rs.getString("Celular"));
             //a.setEdad(Integer.parseInt(rs.getString("Edad")));
             d.setFormacion(rs.getString("formacion"));
             d.setDireccion_sede(rs.getString("COD_sede"));
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
        sql="INSERT INTO director(Id_Director,Cedula, Nombre,Apellido, Direccion, Telefono, Correo, F_Nacimiento,Celular,Contraseña,formacion,COD_sede)";
        sql+="VALUES('"+getId_director()+"','"+getCedula()+"','"+getNombre()+"','"+getApellido()+"','"+getDireccion()+"','"+getTelefono()+"','"+getCorreo()+"','"
                +getFechanacimiento()+"','"+getCelular()+"','"+getContraseña()+"','"+getFormacion()+"','"+getDireccion_sede()+"',)";
        return con.accion(sql);
        }  
        
        public boolean modificar(){
    String sql;
    
    sql = "UPDATE director ";
        sql += " SET Nombre = '" + getNombre()+ "'"
                + ", Apellido = '" + getApellido() + "'"
                + ", Cedula = '" + getCedula()+ "'"
                + ", Direccion = '" + getDireccion()+ "'"
                + ", Telefono = '" + getTelefono()+"'"
                + ", Correo = '" + getCorreo()+"'"
                + ", F_Nacimiento = '" + getFechanacimiento()+ "'"
                + ", Celular = '" + getCelular()+"'"
                + ", Contraseña = '" + getContraseña()+"'"
                + ", formacion = '" + getFormacion()+"'"
                + ", COD_sede = '" + getDireccion_sede()+"'"
                
                
                ;
                
        sql += " WHERE Id_Director= '" + getId_director()+"' ";
    return con.accion(sql);
    }

    public boolean eliminar() {
        String sql;
        sql = "DELETE FROM director ";
        sql += " WHERE Id_Director = '" + getId_director()+ "' ";
        return con.accion(sql);
    }
        
}
    
    
    
    
    
    
    

