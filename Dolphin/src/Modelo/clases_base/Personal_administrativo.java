package Modelo.clases_base;



import Modelo.clases_base.Persona;
import java.sql.Date;
import java.util.Objects;

public class Personal_administrativo extends Persona{
    
    //Atributos
    private String formacion;
    private String contraseña;

    //Constructores
    public Personal_administrativo() {
    }
    public Personal_administrativo(String formacion, String contraseña) {
        this.formacion = formacion;
        this.contraseña = contraseña;
    }
    public Personal_administrativo(String formacion, String contraseña, String cedula, String nombre, String apellido, String telefono, String direccion, String correo, Date fechanacimiento, String cedular, int edad, String tipo_p) {
        super(cedula, nombre, apellido, telefono, direccion, correo, fechanacimiento, cedular, edad, tipo_p);
        this.formacion = formacion;
        this.contraseña = contraseña;
    }

    //Metodos getter y setter
    public String getFormacion() {
        return formacion;
    }
    public void setFormacion(String formacion) {
        this.formacion = formacion;
    }
    public String getContraseña() {
        return contraseña;
    }
    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    //Metodo toString
    @Override
    public String toString() {
        return "Administradores{" + "formacion=" + formacion + ", contraseña=" + contraseña + '}';
    }
}
//contrase\u00f1a