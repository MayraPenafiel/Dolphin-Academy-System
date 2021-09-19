package Modelo;



import Modelo.Persona;
import java.sql.Date;

public class Alumno extends Persona{

    //Atributos
    private String id_alumno;
    private String categoria;
    private String tipo;

    //Constructores
    public Alumno() {
    }
    public Alumno(String id_alumno, String categoria, String tipo) {
        this.id_alumno = id_alumno;
        this.categoria = categoria;
        this.tipo = tipo;
    }
    public Alumno(String id_alumno, String categoria, String tipo, String cedula, String nombre, String apellido, String telefono, String direccion, String correo, Date fechanacimiento, String cedular, int edad, String tipo_p) {
        super(cedula, nombre, apellido, telefono, direccion, correo, fechanacimiento, cedular, edad, tipo_p);
        this.id_alumno = id_alumno;
        this.categoria = categoria;
        this.tipo = tipo;
    }

    //Metodos Getter y setter
    public String getId_alumno() {
        return id_alumno;
    }
    public void setId_alumno(String id_alumno) {
        this.id_alumno = id_alumno;
    }
    public String getCategoria() {
        return categoria;
    }
    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }
    public String getTipo() {
        return tipo;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
   
    //Metodo toString
    @Override
    public String toString() {
        return "Alumno{" + "id_alumno=" + id_alumno + ", categoria=" + categoria + ", tipo=" + tipo + '}';
    }
    
}
