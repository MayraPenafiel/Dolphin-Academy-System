/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import conexion.ConexionPG;
import Modelo.clases_base.Enca_Realiza;
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

public class Modelo_Realiza_Enca extends Enca_Realiza {
    
    //Atributos
    private ConexionPG con=new ConexionPG();

    //Constructores
    public Modelo_Realiza_Enca() {
    }
    public Modelo_Realiza_Enca(String id_encaR, String id_entren, String id_alum) {
        super(id_encaR, id_entren, id_alum);
    }
    
    //Metodo Cargar/Listar/Actualizar
    public List <Enca_Realiza> listarER (){
       String sql = "select * from Enca_Realiza";
       ResultSet rs= con.consulta(sql);
       List<Enca_Realiza> lista=new ArrayList<>();
       try {
           while(rs.next()){
               Enca_Realiza p= new Enca_Realiza();
               p.setId_encaR(rs.getString("Id_encaR"));//campos de la BD
               p.setId_entren(rs.getString("Id_Entren"));//campos de la BD
               p.setId_alum(rs.getString("Id_Alum"));//campos de la BD
               lista.add(p);
           }
           rs.close();
           return lista;
       } catch (SQLException ex) {
           Logger.getLogger(Modelo_Entrenamiento.class.getName()).log(Level.SEVERE, null, ex);
           return null;
       }
    }
       
     //Metodo buscar
     public List <Enca_Realiza> listarER (String aguja){
       String sql = "select * from Enca_Realiza WHERE ";
       sql+=" UPPER(Id_encaR) like UPPER('%"+aguja+"%') OR ";
       sql+=" UPPER(Id_Entren) like UPPER('%"+aguja+"%') OR ";
       sql+=" UPPER(Id_Alum) like UPPER('%"+aguja+"%') ";
       ResultSet rs= con.consulta(sql);
       List<Enca_Realiza> lista=new ArrayList<Enca_Realiza>();
       try {
           while(rs.next()){
                Enca_Realiza p= new Enca_Realiza();
                p.setId_encaR(rs.getString("Id_encaR"));//campos de la BD
                p.setId_entren(rs.getString("Id_Entren"));//campos de la BD
                p.setId_alum(rs.getString("Id_Alum"));//campos de la BD
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
           sql="INSERT INTO Enca_Realiza(Id_encaR,Id_Entren,Id_Alum) ";
           sql+=" VALUES ('"+getId_encaR()+"','"+getId_entren()+"','"+getId_alum()+"')";
       return con.accion(sql);
    }
   
    //Metodo Modificar
    public boolean modificar(){
        String sql;
        sql="UPDATE Enca_Realiza ";
        sql+=" SET Id_Entren = '"+getId_entren()+"'"+", Id_Alum = '"+getId_alum()+"'";
        sql+=" WHERE Id_encaR = '"+getId_encaR()+"' ";
       return con.accion(sql);
    }
    
    //Metodo para eliminar
    public boolean eliminar(){
        String sql;
        sql= "DELETE FROM Enca_Realiza ";
        sql+=" WHERE Id_encaR = '"+getId_encaR()+"' ";
        return con.accion(sql);
    }
}
