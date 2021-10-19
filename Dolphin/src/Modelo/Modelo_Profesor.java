
package Modelo;

import Modelo.clases_base.Profesor;
import java.sql.Date;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import conexion.ConexionPG;

public class Modelo_Profesor extends Profesor {

    ConexionPG con = new ConexionPG();

    public Modelo_Profesor() {
    }

    public Modelo_Profesor(String Id_Profesor, String formacion, String contraseña) {
        super(Id_Profesor, formacion, contraseña);
    }

    public Modelo_Profesor(String Id_Profesor, String formacion, String contraseña, String cedula, String nombre, String apellido, String telefono, String direccion, String correo, Date fechanacimiento, String celular, int edad, String tipo_p) {
        super(Id_Profesor,formacion, contraseña, cedula, nombre, apellido, telefono, direccion, correo, fechanacimiento, celular, edad, tipo_p);
    }
    
    public java.util.List<Profesor> listaProfesores(){
        try {
            String sql = "select * from profesor "; 
            ResultSet rs = con.consulta(sql);
            java.util.List<Profesor> listap = new ArrayList<Profesor>();
            while(rs.next()){
                Profesor p = new Profesor();
                p.setId_Profesor(rs.getString("id_profesor"));
                p.setCedula(rs.getString("cedula"));
                p.setNombre(rs.getString("nombre"));
                p.setApellido(rs.getString("apellido"));
                p.setDireccion(rs.getString("direccion"));
                p.setTelefono(rs.getString("telefono"));
                p.setCorreo(rs.getString("correo"));
                p.setFechanacimiento(rs.getDate("f_nacimiento"));
                p.setCelular(rs.getString("celular"));
                p.setFormacion(rs.getString("formacion"));
                p.setContraseña(rs.getString("contraseña"));
                listap.add(p);
            }
            rs.close();
            return listap;
        } catch (Exception e) {
            Logger.getLogger(ModeloDirector.class.getName()).log(Level.SEVERE, null, e);
            return null;
        }
    }
    
     public java.util.List<Profesor> listaProfesores(String aguja){
            String sql = "select * from profesor WHERE ";
            sql += "UPPER(id_profesor) like UPPER('%" +aguja+ "%') OR ";
            sql += "UPPER(nombre) like UPPER('%" +aguja+ "%') OR ";
            sql += "UPPER(apellido) like UPPER('%" +aguja+ "%')";
            ResultSet rs = con.consulta(sql);
            java.util.List<Profesor> listap = new ArrayList<Profesor>();
            try {
                while(rs.next()){
                    Profesor p = new Profesor();
                    p.setId_Profesor(rs.getString("id_profesor"));
                    p.setCedula(rs.getString("cedula"));
                    p.setNombre(rs.getString("nombre"));
                    p.setApellido(rs.getString("apellido"));
                    p.setDireccion(rs.getString("direccion"));
                    p.setTelefono(rs.getString("telefono"));
                    p.setCorreo(rs.getString("correo"));
                    p.setFechanacimiento(rs.getDate("f_nacimiento"));
                    p.setCelular(rs.getString("celular"));
                    p.setFormacion(rs.getString("formacion"));
                    p.setContraseña(rs.getString("contraseña"));
                    listap.add(p);
                }
                rs.close();
                return listap;
            } catch (Exception e) {
                Logger.getLogger(ModeloAlumno.class.getName()).log(Level.SEVERE, null, e);
                return null;
            }
        }
     
      public boolean grabar(){
        String sql;
        sql="INSERT INTO profesor (id_profesor,cedula, nombre,apellido, direccion, telefono, correo, f_nacimiento,celular,formacion,contraseña)";
        sql+="VALUES('"+getId_Profesor()+"','"+getCedula()+"','"+getNombre()+"','"+getApellido()+"','"+getDireccion()+"','"+getTelefono()+"','"+getCorreo()+"','"
                +getFechanacimiento()+"','"+getCelular()+"','"+getFormacion()+"','"+getContraseña()+"')";
        return con.accion(sql);
      }  
 
      public boolean modificar(){
        String sql;
        sql = "UPDATE profesor ";
        sql += " SET nombre = '" + getNombre()+ "'"
                + ", apellido = '" + getApellido() + "'"
                + ", cedula = '" + getCedula()+ "'"
                + ", direccion = '" + getDireccion()+ "'"
                + ", telefono = '" + getTelefono()+"'"
                + ", correo = '" + getCorreo()+"'"
                + ", f_nacimiento = '" + getFechanacimiento()+ "'"
                + ", celular = '" + getCelular()+"'"
                + ", formacion = '" + getFormacion()+"'"
                +", contraseña = '"+getContraseña()+"'"
                ;
        sql += " WHERE id_profesor= '" + getId_Profesor()+"' ";
    return con.accion(sql);
    }

       public boolean eliminar() {
        String sql;
        sql = "DELETE FROM profesor ";
        sql += " WHERE id_profesor = '" + getId_Profesor()+ "' ";
        return con.accion(sql);
    }
    

}
