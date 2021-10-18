package Modelo.clases_base;


import java.sql.Date;

public class Profesor extends Personal_administrativo{
    
    //Atributos
    private String Id_Profesor;
    
    //Constructores
    public Profesor() {
    }
    public Profesor(String Id_Profesor) {
        this.Id_Profesor = Id_Profesor;
    }
    public Profesor(String Id_Profesor, String formacion, String contraseña) {
        super(formacion, contraseña);
        this.Id_Profesor = Id_Profesor;
    }
    public Profesor(String Id_Profesor, String formacion, String contraseña, String cedula, String nombre, String apellido, String telefono, String direccion, String correo, Date fechanacimiento, String cedular, int edad, String tipo_p) {
        super(formacion, contraseña, cedula, nombre, apellido, telefono, direccion, correo, fechanacimiento, cedular, edad, tipo_p);
        this.Id_Profesor = Id_Profesor;
    }

    //Metodos getter y setter
    public String getId_Profesor() {
        return Id_Profesor;
    }
    public void setId_Profesor(String Id_Profesor) {
        this.Id_Profesor = Id_Profesor;
    }
    
    //Metodo toString
    @Override
    public String toString() {
        return "Profesor{" + "Id_Profesor=" + Id_Profesor + '}';
    }
        
}
