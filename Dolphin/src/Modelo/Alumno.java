package Modelo;

import Modelo.Persona;
import java.sql.Date;

public class Alumno extends Persona{

    //Atributos
    private String id_alumno;
    private String categoria;
    private String tipo;
    private String disciplina;
    private String entrenamiento;

    //Constructores
    
    public Alumno(){
    
    }

    public Alumno(String id_alumno, String categoria, String tipo, String disciplina, String entrenamiento) {
        this.id_alumno = id_alumno;
        this.categoria = categoria;
        this.tipo = tipo;
        this.disciplina = disciplina;
        this.entrenamiento = entrenamiento;
    }

    public Alumno(String id_alumno, String categoria, String tipo, String disciplina, String entrenamiento, String cedula, String nombre, String apellido, String telefono, String direccion, String correo, Date fechanacimiento, String cedular, int edad, String tipo_p) {
        super(cedula, nombre, apellido, telefono, direccion, correo, fechanacimiento, cedular, edad, tipo_p);
        this.id_alumno = id_alumno;
        this.categoria = categoria;
        this.tipo = tipo;
        this.disciplina = disciplina;
        this.entrenamiento = entrenamiento;
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

    public String getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(String disciplina) {
        this.disciplina = disciplina;
    }

    public String getEntrenamiento() {
        return entrenamiento;
    }

    public void setEntrenamiento(String entrenamiento) {
        this.entrenamiento = entrenamiento;
    }

    //Metodo toString
    @Override
    public String toString() {
        return "Alumno{" + "id_alumno=" + id_alumno + ", categoria=" + categoria + ", tipo=" + tipo + ", disciplina=" + categoria +", entrenamiento=" + entrenamiento +  '}';
    }
    
}
