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
    
    private ConexionPG con = new ConexionPG();
    public List<Sede> lista;

    public ModeloSede() {
    }

    public ModeloSede(String cod_sede, String nombre_s, String direccion_s, String correo_s, String telefono_s) {
        super(cod_sede, nombre_s, direccion_s, correo_s, telefono_s);
    }
    
    
    public java.util.List<Sede> listaSede(){
    
        try {
            String sql = "select * from alumno "; 
            ResultSet rs = con.consulta(sql);
            java.util.List<Sede> lista = new ArrayList<Sede>();
            while(rs.next()){
             Sede sd = new Sede();
             sd.setCod_sede(rs.getString("cod_sede"));
             sd.setNombre_s(rs.getString("nomnbre_s"));
             sd.setDireccion_s(rs.getString("direccion_s"));
             sd.setCorreo_s(rs.getString("correo_s"));
             sd.setTelefono_s(rs.getString("telefono_s"));
            lista.add(sd);
            }
             
            rs.close();
            return lista;
        } catch (Exception e) {
            Logger.getLogger(ModeloAlumno.class.getName()).log(Level.SEVERE, null, e);
            return null;
        }
    }
    
    
    
    public java.util.List<Sede> listaSede(String aguja){
    
        try {
            String sql = "select * from sede WHERE ";
            sql += "UPPER(cod_sede) like UPPER('%" +aguja+ "%') OR ";
            sql += "UPPER(nombre_s) like UPPER('%" +aguja+ "%')";
            ResultSet rs = con.consulta(sql);
            java.util.List<Sede> lista = new ArrayList<Sede>();
            
            while(rs.next()){
            Sede sd = new Sede();
            sd.setCod_sede(rs.getString("cod_sede"));
             sd.setNombre_s(rs.getString("nomnbre_s"));
             sd.setDireccion_s(rs.getString("direccion_s"));
             sd.setCorreo_s(rs.getString("correo_s"));
             sd.setTelefono_s(rs.getString("telefono_s"));
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
    
    public boolean grabar(){
        String sql;
        sql="INSERT INTO sede(cod_sede,nombre_s,direccion_s,correo_s,telefono_s)";
        sql+="VALUES('"+getCod_sede()+"','"+getNombre_s()+ "','"+getDireccion_s()+"','"+getCorreo_s()+"','"+getTelefono_s()+"')";
        return con.accion(sql);
        }
    
    public boolean modificar(){
    String sql;
    
    sql = "UPDATE sede ";
        sql += " SET cod_sede = '" + getCod_sede() + "'"
                + "nombre_s = '" + getNombre_s() + "'"
                + ", direccion_s = '" + getDireccion_s() + "'"
                + ", correo_s = '" + getCorreo_s() +"'"
                + ", telefono_s = '" + getTelefono_s()+ "'"
                
                ;
                
        sql += " WHERE id= '" + getCod_sede()+"' ";
    return con.accion(sql);
    }
    
    
    public boolean eliminar() {
        String sql;
        sql = "DELETE FROM sede ";
        sql += " WHERE cod_sede = '" + getCod_sede()+ "' ";
        return con.accion(sql);
    }
    
}
