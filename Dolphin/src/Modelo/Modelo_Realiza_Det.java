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
               p.setId_detalle(rs.getString("Id_detalle"));//campos de la BD
               p.setId_enc(rs.getString("id_Enc"));//campos de la BD
               p.setP_avanze(rs.getInt("P_Avance"));
               p.setAsistencia(rs.getBoolean("Asistencia"));
               
               //Extraer fecha de asistencia
               DateTimeFormatter date=DateTimeFormatter.ofPattern("yyyy-MM-dd");
               LocalDate fecha_in=LocalDate.parse(rs.getDate("F_Asistencia").toString(), date);
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
       sql+=" UPPER(Id_detalle) like UPPER('%"+aguja+"%') OR ";
       sql+=" UPPER(id_Enc) like UPPER('%"+aguja+"%') OR ";
       sql+=" UPPER(P_Avance) like UPPER('%"+aguja+"%') OR";
       sql+=" UPPER (F_Asistencia) like UPPER('%"+aguja+"%') ";
       ResultSet rs= con.consulta(sql);
       List<Deta_Realiza> lista=new ArrayList<Deta_Realiza>();
       try {
           while(rs.next()){
               Deta_Realiza p= new Deta_Realiza();
               p.setId_detalle(rs.getString("Id_detalle"));//campos de la BD
               p.setId_enc(rs.getString("id_Enc"));//campos de la BD
               p.setP_avanze(rs.getInt("P_Avance"));
               p.setAsistencia(rs.getBoolean("Asistencia"));
               
               //Extraer fecha de asistencia
               DateTimeFormatter date=DateTimeFormatter.ofPattern("yyyy-MM-dd");
               LocalDate fecha_in=LocalDate.parse(rs.getDate("F_Asistencia").toString(), date);
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
           sql="INSERT INTO Deta_Realiza(Id_detalle,id_Enc,F_Asistencia, Asistencia,P_Avance) ";
           sql+=" VALUES ('"+getId_detalle()+"','"+getId_enc()+"','"+getF_asistencia()+"','"+isAsistencia()+"','"+getP_avanze()+"')";
       return con.accion(sql);
    }
   
    //Metodo Modificar
    public boolean modificar(){
        String sql;
        sql="UPDATE Deta_Realiza ";
        sql+=" SET id_Enc = '"+getId_enc()+"'"+", F_Asistencia = '"+getF_asistencia()+"', Asistencia= '"+isAsistencia()+"', P_Avance="
                +getP_avanze()+"' )";
        sql+=" WHERE Id_detalle = '"+getId_detalle()+"' ";
       return con.accion(sql);
    }
    
    //Metodo para eliminar
    public boolean eliminar(){
        String sql;
        sql= "DELETE FROM Deta_Realiza ";
        sql+=" WHERE Id_detale = '"+getId_detalle()+"' ";
        return con.accion(sql);
    }
    
}
