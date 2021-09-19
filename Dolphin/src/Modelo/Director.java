package Modelo;



import Modelo.Personal_administrativo;
import java.sql.Date;

public class Director extends Personal_administrativo{
    
    //Atributos
    private String id_director;
    private String cod_sede;

    //Contructores
    public Director() {
    }
    public Director(String id_director, String cod_sede) {
        this.id_director = id_director;
        this.cod_sede = cod_sede;
    }
    public Director(String id_director, String cod_sede, String formacion, String contraseña) {
        super(formacion, contraseña);
        this.id_director = id_director;
        this.cod_sede = cod_sede;
    }
    public Director(String id_director, String cod_sede, String formacion, String contraseña, String cedula, String nombre, String apellido, String telefono, String direccion, String correo, Date fechanacimiento, String cedular, int edad, String tipo_p) {
        super(formacion, contraseña, cedula, nombre, apellido, telefono, direccion, correo, fechanacimiento, cedular, edad, tipo_p);
        this.id_director = id_director;
        this.cod_sede = cod_sede;
    }

    //Metodos getters y setters
    public String getId_director() {
        return id_director;
    }
    public void setId_director(String id_director) {
        this.id_director = id_director;
    }
    public String getCod_sede() {
        return cod_sede;
    }
    public void setCod_sede(String cod_sede) {
        this.cod_sede = cod_sede;
    }

    //Metodo toString
    @Override
    public String toString() {
        return "Director{" + "id_director=" + id_director + ", cod_sede=" + cod_sede + '}';
    }
    
}
