package Modelo.clases_base;


import java.sql.Date;

public class Entrenamiento {
 
    //Atributos
    private String id_entrenamiento;
    private String id_profesor;
    private String id_disciplina;
    private Date f_inicio;
    private Date f_fin;
    private String descripcion;
    private String observaciones;

    //Constructores
    public Entrenamiento() {
    }
    public Entrenamiento(String id_entrenamiento, String id_profesor, String id_disciplina, Date f_inicio, Date f_fin, String descripcion, String observaciones) {
        this.id_entrenamiento = id_entrenamiento;
        this.id_profesor = id_profesor;
        this.id_disciplina = id_disciplina;
        this.f_inicio = f_inicio;
        this.f_fin = f_fin;
        this.descripcion = descripcion;
        this.observaciones = observaciones;
    }

    //Metodos getter y setter
    public String getId_entrenamiento() {
        return id_entrenamiento;
    }
    public void setId_entrenamiento(String id_entrenamiento) {
        this.id_entrenamiento = id_entrenamiento;
    }
    public String getId_profesor() {
        return id_profesor;
    }
    public void setId_profesor(String id_profesor) {
        this.id_profesor = id_profesor;
    }
    public String getId_disciplina() {
        return id_disciplina;
    }
    public void setId_disciplina(String id_disciplina) {
        this.id_disciplina = id_disciplina;
    }
    public Date getF_inicio() {
        return f_inicio;
    }
    public void setF_inicio(Date f_inicio) {
        this.f_inicio = f_inicio;
    }
    public Date getF_fin() {
        return f_fin;
    }
    public void setF_fin(Date f_fin) {
        this.f_fin = f_fin;
    }
    public String getDescripcion() {
        return descripcion;
    }
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    public String getObservaciones() {
        return observaciones;
    }
    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }
    
    //Metodo toString
    @Override
    public String toString() {
        return "Entrenamiento{" + "id_entrenamiento=" + id_entrenamiento + ", id_profesor=" + id_profesor + ", id_disciplina=" + id_disciplina + ", f_inicio=" + f_inicio + ", f_fin=" + f_fin + ", descripcion=" + descripcion + ", observaciones=" + observaciones + '}';
    }
    
}
