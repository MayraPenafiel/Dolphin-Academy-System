package Modelo.clases_base;

import java.sql.Date;

public class Director extends Personal_administrativo{
    
    //Atributos
    private String id_director;
    private String sede;

    //Contructores
    public Director() {
    }
    public Director(String id_director, String sede, String formacion, String contraseña, String cedula, String nombre, String apellido, String telefono, String direccion, String correo, Date fechanacimiento, String cedular, int edad, String tipo_p) {
        super(formacion, contraseña, cedula, nombre, apellido, telefono, direccion, correo, fechanacimiento, cedular, edad, tipo_p);
        this.id_director = id_director;
        this.sede = sede;
    }
    public Director(String id_director, String sede) {
        this.id_director = id_director;
        this.sede = sede;
    }
    public Director(String id_director, String sede, String formacion, String contraseña) {
        super(formacion, contraseña);
        this.id_director = id_director;
        this.sede = sede;
    }
    
    //Metodos getters y setters
    public String getId_director() {
        return id_director;
    }
    public void setId_director(String id_director) {
        this.id_director = id_director;
    }
    public String getSede() {
        return sede;
    }
    public void setSede(String sede) {
        this.sede = sede;
    }

    //Metodo toString
    @Override
    public String toString() {
        return "Director{" + "id_director=" + id_director + ", sede=" + sede + '}';
    }
    
}
