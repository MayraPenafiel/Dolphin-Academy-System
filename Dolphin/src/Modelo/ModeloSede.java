package Modelo;

import Modelo.clases_base.Sede;
import conexion.ConexionPG;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author HP
 */

public class ModeloSede extends Sede{
    
    //Atributos
    private ConexionPG con = new ConexionPG();

    //Constructores
    public ModeloSede() {
    }
    public ModeloSede(String cod_sede, String nombre_s, String direccion_s, String correo_s, String telefono_s) {
        super(cod_sede, nombre_s, direccion_s, correo_s, telefono_s);
    }
    
    //Metodo Cargar/Listar/Actualizar
    public java.util.List<Sede> listaSede(){
        try {
            String sql = "select * from sede "; 
            ResultSet rs = con.consulta(sql);
            java.util.List<Sede> lista = new ArrayList<Sede>();
            while(rs.next()){
                Sede sd = new Sede();
                sd.setCod_sede(rs.getString("Cod_sede"));
                sd.setNombre_s(rs.getString("Nombre_S"));
                sd.setDireccion_s(rs.getString("Direccion_S"));
                sd.setCorreo_s(rs.getString("Correo_S"));
                sd.setTelefono_s(rs.getString("Telefono_S"));
                lista.add(sd);
            }
            rs.close();
            return lista;
        } catch (Exception e) {
            Logger.getLogger(ModeloAlumno.class.getName()).log(Level.SEVERE, null, e);
            return null;
        }
    }
    
    //Metodo Buscar
    public java.util.List<Sede> listaSede(String aguja){
        try {
            String sql = "select * from sede WHERE ";
            sql += "UPPER(Cod_sede) like UPPER('%" +aguja+ "%') OR ";
            sql += "UPPER(Nombre_S) like UPPER('%" +aguja+ "%') OR ";
            sql += "UPPER(Direccion_S) like UPPER('%" +aguja+ "%') OR ";
            sql += "UPPER(Correo_S) like UPPER('%" +aguja+ "%') ";
            ResultSet rs = con.consulta(sql);
            java.util.List<Sede> lista = new ArrayList<Sede>();
            while(rs.next()){
                Sede sd = new Sede();
                sd.setCod_sede(rs.getString("Cod_sede"));
                sd.setNombre_s(rs.getString("Nombre_S"));
                sd.setDireccion_s(rs.getString("Direccion_S"));
                sd.setCorreo_s(rs.getString("Correo_S"));
                sd.setTelefono_s(rs.getString("Telefono_S"));
                lista.add(sd);
             }
            rs.close();
            return lista;
        } catch (Exception e) {
            Logger.getLogger(ModeloAlumno.class.getName()).log(Level.SEVERE, null, e);
           return null;
        }
    }
      
    // METODOS DE DE MANIPULACION DE DATOS
    
    //Metodo Guardar/Grabar
    public boolean grabar(){
        String sql;
        sql="INSERT INTO sede(Cod_sede,Nombre_S,Direccion_S,Correo_S,Telefono_S)";
        sql+="VALUES('"+getCod_sede()+"','"+getNombre_s()+ "','"+getDireccion_s()+"','"+getCorreo_s()+"','"+getTelefono_s()+"')";
        return con.accion(sql);
    }

    //Metodo Modificar/Editar
    public boolean modificar(){
    String sql;
    sql = "UPDATE sede ";
        sql += " SET Cod_sede = '" + getCod_sede() + "'"
                + " Nombre_S = '" + getNombre_s() + "'"
                + ", Direccion_S = '" + getDireccion_s() + "'"
                + ", Correo_S = '" + getCorreo_s() +"'"
                + ", Telefono_S = '" + getTelefono_s()+ "'"
                ;
        sql += " WHERE Cod_sede= '" + getCod_sede()+"' ";
    return con.accion(sql);
    }
    
    //Metodo Eliminar/Borrar/Remover
    public boolean eliminar() {
        String sql;
        sql = "DELETE FROM sede ";
        sql += " WHERE Cod_sede = '" + getCod_sede()+ "' ";
        return con.accion(sql);
    }
    
}
