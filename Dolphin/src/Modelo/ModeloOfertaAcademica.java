
package Modelo;


import Modelo.clases_base.OfertaAcademica;
import conexion.ConexionPG;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author HP
 */
public class ModeloOfertaAcademica extends OfertaAcademica{
    
    private ConexionPG con = new ConexionPG();

    //Constructores
    public ModeloOfertaAcademica() {
    }
    public ModeloOfertaAcademica(String id_OA,String id_disciplina, String id_sede, int capacidad) {
        super(id_OA,id_disciplina, id_sede, capacidad);
    }

    //Metodo Cargar/Listar/Actualizar
    public java.util.List<OfertaAcademica> listaOfertaAcademica(){
        try {
            String sql = "select * from ofertaacademica "; 
            ResultSet rs = con.consulta(sql);
            java.util.List<OfertaAcademica> lista = new ArrayList<OfertaAcademica>();
            while(rs.next()){
                OfertaAcademica oa = new OfertaAcademica();
                oa.setId_OA(rs.getString("id_OA"));
                oa.setId_disciplina(rs.getString("id_disciplina"));
                oa.setId_sede(rs.getString("id_sede"));
                oa.setCapacidad(rs.getInt("capacidad"));
                lista.add(oa);
            }
            rs.close();
            return lista;
        } catch (Exception e) {
            Logger.getLogger(ModeloAlumno.class.getName()).log(Level.SEVERE, null, e);
            return null;
        }
    }
    
    //Metodo Buscar
    public java.util.List<OfertaAcademica> listaOfertaAcademica(String aguja){
        try {
            String sql = "select * from ofertacademica WHERE ";
            sql += "UPPER(id_disciplina) like UPPER('%" +aguja+ "%') OR ";
            sql += "UPPER(id_sede) like UPPER('%" +aguja+ "%') OR ";
            sql += "UPPER(capacidad) like UPPER('%" +aguja+ "%')";
            ResultSet rs = con.consulta(sql);
            java.util.List<OfertaAcademica> lista = new ArrayList<OfertaAcademica>();
            while(rs.next()){
                OfertaAcademica oa = new OfertaAcademica();
                oa.setId_OA(rs.getString("id_OA"));
                oa.setId_disciplina(rs.getString("id_disciplina"));
                oa.setId_sede(rs.getString("id_sede"));
                oa.setCapacidad(rs.getInt("capacidad"));
                lista.add(oa);
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
        sql="INSERT INTO ofertacademica(id_OA,id_disciplina,id_sede,capacidad)";
        sql+="VALUES('"+getId_OA()+"','"+getId_disciplina()+"','"+getId_sede()+ "','"+getCapacidad()+"')";
        return con.accion(sql);
    }
    
    //Metodo Editar/Modificar
    public boolean modificar(){
        String sql;
        sql = "UPDATE ofertaacademica ";
        sql += " SET id_disciplina = '" + getId_disciplina() + "'"
            + "id_sede = '" + getId_sede() + "'"
            + ", capacidad = '" + getCapacidad() + "'"
            ;
        sql += " WHERE id_OA= '" + getId_OA()+"' ";
        return con.accion(sql);
    }
    
    //Metodo Eliminar/Remover/Borrar
    public boolean eliminar() {
        String sql;
        sql = "DELETE FROM ofertaacademica";
        sql += " WHERE id_OA = '" + getId_OA()+ "' ";
        return con.accion(sql);
    }
    
}
