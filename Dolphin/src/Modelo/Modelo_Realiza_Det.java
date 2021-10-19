/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import Modelo.clases_base.Deta_Realiza;
import Modelo.clases_base.Entrenamiento;
import conexion.ConexionPG;
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author MayraPeñafiel
 */

public class Modelo_Realiza_Det extends Deta_Realiza {

    //Atributos
    private ConexionPG con=new ConexionPG();
    
    //Constructores
    public ConexionPG getCon() {
        return con;
    }
    public void setCon(ConexionPG con) {
        this.con = con;
    }
    
    //Metodo Cargar/Listar/Actualizar
    public List <Deta_Realiza> listarDR (){
       String sql = "select * from Deta_Realiza";
       ResultSet rs= con.consulta(sql);
       List<Deta_Realiza> lista=new ArrayList<>();
       try {
           while(rs.next()){
               Deta_Realiza p= new Deta_Realiza();
               p.setId_detalle(rs.getString("id_detalle"));//campos de la BD
               p.setId_enc(rs.getString("id_enc"));//campos de la BD
               p.setP_avanze(rs.getInt("p_avance"));
               p.setAsistencia(rs.getBoolean("asistencia"));
               
               //Extraer fecha de asistencia
               DateTimeFormatter date=DateTimeFormatter.ofPattern("yyyy-MM-dd");
               LocalDate fecha_in=LocalDate.parse(rs.getDate("f_asistencia").toString(), date);
               String f=""+fecha_in.getDayOfMonth()+ "-"+fecha_in.getMonth()+"-"+fecha_in.getYear();
               Date fa = Date.valueOf(fecha_in.toString());
               p.setF_asistencia(fa);//campos de la BD

               lista.add(p);
           }
           rs.close();
           return lista;
       } catch (SQLException ex) {
           Logger.getLogger(Modelo_Entrenamiento.class.getName()).log(Level.SEVERE, null, ex);
           return null;
       }
    }
    
    //Metodo Buscar 
    public List <Deta_Realiza> listarDR (String aguja){
       String sql = "select * from Deta_Realiza WHERE ";
       sql+=" UPPER(id_detalle) like UPPER('%"+aguja+"%') OR ";
       sql+=" UPPER(id_enc) like UPPER('%"+aguja+"%') OR ";
       sql+=" UPPER(p_avance) like UPPER('%"+aguja+"%') OR";
       sql+=" UPPER (f_asistencia) like UPPER('%"+aguja+"%') ";
       ResultSet rs= con.consulta(sql);
       List<Deta_Realiza> lista=new ArrayList<Deta_Realiza>();
       try {
           while(rs.next()){
               Deta_Realiza p= new Deta_Realiza();
               p.setId_detalle(rs.getString("id_detalle"));//campos de la BD
               p.setId_enc(rs.getString("id_enc"));//campos de la BD
               p.setP_avanze(rs.getInt("p_avance"));
               p.setAsistencia(rs.getBoolean("asistencia"));
               
               //Extraer fecha de asistencia
               DateTimeFormatter date=DateTimeFormatter.ofPattern("yyyy-MM-dd");
               LocalDate fecha_in=LocalDate.parse(rs.getDate("f_asistencia").toString(), date);
               String f=""+fecha_in.getDayOfMonth()+ "-"+fecha_in.getMonth()+"-"+fecha_in.getYear();
               Date fa = Date.valueOf(fecha_in.toString());
               p.setF_asistencia(fa);//campos de la BD

               lista.add(p);
           }
           rs.close();
           return lista;
       } catch (SQLException ex) {
           Logger.getLogger(Modelo_Entrenamiento.class.getName()).log(Level.SEVERE, null, ex);
           return null;
       }
    }
    
    // METODOS DE DE MANIPULACION DE DATOS
    
    //Metodo para guardar
    public boolean grabar(){
       String sql;
           sql="INSERT INTO Deta_Realiza(id_detalle,id_enc,f_asistencia, asistencia,p_avance) ";
           sql+=" VALUES ('"+getId_detalle()+"','"+getId_enc()+"','"+getF_asistencia()+"','"+isAsistencia()+"','"+getP_avanze()+"')";
       return con.accion(sql);
    }
   
    //Metodo Modificar
    public boolean modificar(){
        String sql;
        sql="UPDATE Deta_Realiza ";
        sql+=" SET id_enc = '"+getId_enc()+"'"+", f_asistencia = '"+getF_asistencia()+"', asistencia= '"+isAsistencia()+"', p_avance="
                +getP_avanze()+"' )";
        sql+=" WHERE id_detalle = '"+getId_detalle()+"' ";
       return con.accion(sql);
    }
    
    //Metodo para eliminar
    public boolean eliminar(){
        String sql;
        sql= "DELETE FROM Deta_Realiza ";
        sql+=" WHERE id_detalle = '"+getId_detalle()+"' ";
        return con.accion(sql);
    }
    
}
