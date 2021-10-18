
package Modelo;

import Modelo.clases_base.Profesor;
import java.sql.Date;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import conexion.ConexionPG;

public class Modelo_Profesor extends Profesor {
    
    //Atributos
    ConexionPG con = new ConexionPG();

    //Constructores
    public Modelo_Profesor() {
    }
    public Modelo_Profesor(String Id_Profesor, String formacion, String contraseña) {
        super(Id_Profesor, formacion, contraseña);
    }
    public Modelo_Profesor(String Id_Profesor, String formacion, String contraseña, String cedula, String nombre, String apellido, String telefono, String direccion, String correo, Date fechanacimiento, String celular, int edad, String tipo_p) {
        super(Id_Profesor,formacion, contraseña, cedula, nombre, apellido, telefono, direccion, correo, fechanacimiento, celular, edad, tipo_p);
    }

    //Metodo Cargar/Listar/Actualizar
    public java.util.List<Profesor> listaProfesores(){
        try {
            String sql = "select * from profesor "; 
            ResultSet rs = con.consulta(sql);
            java.util.List<Profesor> listap = new ArrayList<Profesor>();
            while(rs.next()){
                Profesor p = new Profesor();
                p.setId_Profesor(rs.getString("Id_Profesor"));
                p.setCedula(rs.getString("Cedula"));
                p.setNombre(rs.getString("Nombre"));
                p.setApellido(rs.getString("Apellido"));
                p.setDireccion(rs.getString("Direccion"));
                p.setTelefono(rs.getString("Telefono"));
                p.setCorreo(rs.getString("Correo"));
                p.setFechanacimiento(rs.getDate("F_Nacimiento"));
                p.setCelular(rs.getString("Celular"));
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
    
    //Metodo Buscar
     public java.util.List<Profesor> listaProfesores(String aguja){
            String sql = "select * from profesor WHERE ";
            sql += "UPPER(Id_Profesor) like UPPER('%" +aguja+ "%') OR ";
            sql += "UPPER(Nombre) like UPPER('%" +aguja+ "%') OR ";
            sql += "UPPER(Apellido) like UPPER('%" +aguja+ "%')";
            ResultSet rs = con.consulta(sql);
            java.util.List<Profesor> listap = new ArrayList<Profesor>();
            try {
            while(rs.next()){
                Profesor p = new Profesor();
                p.setId_Profesor(rs.getString("Id_Profesor"));
                p.setCedula(rs.getString("Cedula"));
                p.setNombre(rs.getString("Nombre"));
                p.setApellido(rs.getString("Apellido"));
                p.setDireccion(rs.getString("Direccion"));
                p.setTelefono(rs.getString("Telefono"));
                p.setCorreo(rs.getString("Correo"));
                p.setFechanacimiento(rs.getDate("F_Nacimiento"));
                p.setCelular(rs.getString("Celular"));
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
     
     // METODOS DE DE MANIPULACION DE DATOS
     
     //Metodo Guardar/Grabar
     public boolean grabar(){
        String sql;
        sql="INSERT INTO profesor(Id_Profesor,Cedula, Nombre,Apellido, Direccion, Telefono, Correo, F_Nacimiento,Celular,formacion,contraseña)";
        sql+="VALUES('"+getId_Profesor()+"','"+getCedula()+"','"+getNombre()+"','"+getApellido()+"','"+getDireccion()+"','"+getTelefono()+"','"+getCorreo()+"','"
                +getFechanacimiento()+"','"+getCelular()+"','"+getFormacion()+"','"+getContraseña()+"')";
        return con.accion(sql);
     }  
        
     //Metodo Modificar/Editar
     public boolean modificar(){
        String sql;
        sql = "UPDATE profesor ";
        sql += " SET Nombre = '" + getNombre()+ "'"
                + ", Apellido = '" + getApellido() + "'"
                + ", Cedula = '" + getCedula()+ "'"
                + ", Direccion = '" + getDireccion()+ "'"
                + ", Telefono = '" + getTelefono()+"'"
                + ", Correo = '" + getCorreo()+"'"
                + ", F_Nacimiento = '" + getFechanacimiento()+ "'"
                + ", Celular = '" + getCelular()+"'"
                + ", formacion = '" + getFormacion()+"'"
                +", contraseña = '"+getContraseña()+"'"
                ;
        sql += " WHERE Id_Profesor= '" + getId_Profesor()+"' ";
    return con.accion(sql);
    }

    //Metodo Eliminar/Remover/Borrar 
    public boolean eliminar() {
        String sql;
        sql = "DELETE FROM profesor ";
        sql += " WHERE Id_Profesor = '" + getId_Profesor()+ "' ";
        return con.accion(sql);
    }

}
