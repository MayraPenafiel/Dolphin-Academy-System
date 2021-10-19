
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
                sd.setCod_sede(rs.getString("Cod_sede"));
                sd.setNombre_s(rs.getString("Nombre_S"));
                sd.setDireccion_s(rs.getString("Direccion_S"));
                sd.setCorreo_s(rs.getString("Correo_S"));
                sd.setTelefono_s(rs.getString("Telefono_S"));
                //Datos de oferta academica
                sd.setId_OA(rs.getString("id_OA"));
                sd.setId_disciplina(rs.getString("id_disciplina"));
                sd.setCapacidad(rs.getInt("Capacidad"));
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
            sql += "UPPER(Cod_sede) like UPPER('%" +aguja+ "%') OR ";
            sql += "UPPER(Nombre_S) like UPPER('%" +aguja+ "%') OR";
            sql += "UPPER(Direccion_S) like UPPER('%" +aguja+ "%') OR";
            sql += "UPPER(Correo_S) like UPPER('%" +aguja+ "%') OR";
            sql += "UPPER(Telefono_S) like UPPER('%" +aguja+ "%') ";
            ResultSet rs = con.consulta(sql);
            java.util.List<Sede> lista = new ArrayList<Sede>();
            while(rs.next()){
                Sede sd = new Sede();
                sd.setCod_sede(rs.getString("Cod_sede"));
                sd.setNombre_s(rs.getString("Nombre_S"));
                sd.setDireccion_s(rs.getString("Direccion_S"));
                sd.setCorreo_s(rs.getString("Correo_S"));
                sd.setTelefono_s(rs.getString("Telefono_S"));
                // Datos de oferta Academica
                sd.setId_OA(rs.getString("id_OA"));
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
        sql="INSERT INTO sede(Cod_sede,Nombre_S,Direccion_S,Correo_S,Telefono_s)";
        sql+="VALUES('"+getCod_sede()+"','"+getNombre_s()+ "','"+getDireccion_s()+"','"+getCorreo_s()+"','"+getTelefono_s()+"')";
        return con.accion(sql);
    }
    
    
    public boolean modificar(){
        String sql;
        sql = "UPDATE sede ";
        sql += " SET Nombre_S = '" + getNombre_s() + "'"
                + ", Direccion_S = '" + getDireccion_s() + "'"
                + ", Correo_S = '" + getCorreo_s() +"'"
                + ", Telefono_S = '" + getTelefono_s()+ "'"
                ;
        sql += " WHERE Cod_sede = '" + getCod_sede()+"' ";
    return con.accion(sql);
    }
    
    public boolean eliminar() {
        String sql;
        sql = "DELETE FROM sede ";
        sql += " WHERE cod_sede = '" + getCod_sede()+ "' ";
        return con.accion(sql);
    }
    
}
