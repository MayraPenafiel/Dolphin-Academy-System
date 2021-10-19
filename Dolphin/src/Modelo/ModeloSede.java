
package Modelo;

import Modelo.clases_base.Sede;
import Modelo.clases_base.OfertaAcademica;
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

    public ModeloSede() {
    }
    public ModeloSede(String cod_sede, String nombre_s, String direccion_s, String correo_s, String telefono_s) {
        super(cod_sede, nombre_s, direccion_s, correo_s, telefono_s);
    }
    
    public java.util.List<Sede> listaSede(){
        try {
            String sql = "select * from sede, ofertaacademica where sede.Cod_sede=ofertaacademica.id_sede ";
            ResultSet rs = con.consulta(sql);
            java.util.List<Sede> lista = new ArrayList<Sede>();
            while(rs.next()){
                Sede sd = new Sede();
                sd.setCod_sede(rs.getString("cod_sede"));
                sd.setNombre_s(rs.getString("nombre_s"));
                sd.setDireccion_s(rs.getString("direccion_s"));
                sd.setCorreo_s(rs.getString("correo_s"));
                sd.setTelefono_s(rs.getString("telefono_s"));
                //Datos de oferta academica
                sd.setId_OA(rs.getString("id_oa"));
                sd.setId_disciplina(rs.getString("id_disciplina"));
                sd.setCapacidad(rs.getInt("capacidad"));
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
            String sql = "select * from sede";
            sql += "UPPER(cod_sede) like UPPER('%" +aguja+ "%') OR ";
            sql += "UPPER(nombre_s) like UPPER('%" +aguja+ "%') OR";
            sql += "UPPER(direccion_s) like UPPER('%" +aguja+ "%') OR";
            sql += "UPPER(correo_s) like UPPER('%" +aguja+ "%') OR";
            sql += "UPPER(telefono_s) like UPPER('%" +aguja+ "%') ";
            ResultSet rs = con.consulta(sql);
            java.util.List<Sede> lista = new ArrayList<Sede>();
            while(rs.next()){
                Sede sd = new Sede();
                sd.setCod_sede(rs.getString("cod_sede"));
                sd.setNombre_s(rs.getString("nombre_s"));
                sd.setDireccion_s(rs.getString("direccion_a"));
                sd.setCorreo_s(rs.getString("correo_s"));
                sd.setTelefono_s(rs.getString("telefono_s"));
                // Datos de oferta Academica
                sd.setId_OA(rs.getString("id_oa"));
                sd.setId_disciplina(rs.getString("id_disciplina"));
                sd.setCapacidad(rs.getInt("capacidad"));
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
        sql += " SET nombre_S = '" + getNombre_s() + "'"
                + ", direccion_s = '" + getDireccion_s() + "'"
                + ", correo_s = '" + getCorreo_s() +"'"
                + ", telefono_s = '" + getTelefono_s()+ "'"
                ;
        sql += " WHERE cod_sede = '" + getCod_sede()+"' ";
    return con.accion(sql);
    }
    
    public boolean eliminar() {
        String sql;
        sql = "DELETE FROM sede ";
        sql += " WHERE cod_sede = '" + getCod_sede()+ "' ";
        return con.accion(sql);
    }
    
}
