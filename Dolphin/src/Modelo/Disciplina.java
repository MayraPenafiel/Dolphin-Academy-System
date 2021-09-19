package Modelo;




public class Disciplina {
    
    //Atributos
    private String id_disciplina;
    private String nombre_d;
    private String descripcion_d;
    private String observaciones;

    //Constructores
    public Disciplina() {
    }
    public Disciplina(String id_disciplina, String nombre_d, String descripcion_d, String observaciones) {
        this.id_disciplina = id_disciplina;
        this.nombre_d = nombre_d;
        this.descripcion_d = descripcion_d;
        this.observaciones = observaciones;
    }

    //Metodos setter y getter
    public String getId_disciplina() {
        return id_disciplina;
    }
    public void setId_disciplina(String id_disciplina) {
        this.id_disciplina = id_disciplina;
    }
    public String getNombre_d() {
        return nombre_d;
    }
    public void setNombre_d(String nombre_d) {
        this.nombre_d = nombre_d;
    }
    public String getDescripcion_d() {
        return descripcion_d;
    }
    public void setDescripcion_d(String descripcion_d) {
        this.descripcion_d = descripcion_d;
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
        return "Disciplina{" + "id_disciplina=" + id_disciplina + ", nombre_d=" + nombre_d + ", descripcion_d=" + descripcion_d + ", observaciones=" + observaciones + '}';
    }
    
}
