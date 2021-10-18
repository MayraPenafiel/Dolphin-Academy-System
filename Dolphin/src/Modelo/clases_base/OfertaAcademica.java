package Modelo.clases_base;


public class OfertaAcademica {
    
    //Atributos
    private String id_disciplina;
    private String id_sede;
    private int capacidad;

    //Constructores
    public OfertaAcademica() {
    }
    public OfertaAcademica(String id_disciplina, String id_sede, int capacidad) {
        this.id_disciplina = id_disciplina;
        this.id_sede = id_sede;
        this.capacidad = capacidad;
    }

    //Metodos getter y setter
    public String getId_disciplina() {
        return id_disciplina;
    }
    public void setId_disciplina(String id_disciplina) {
        this.id_disciplina = id_disciplina;
    }
    public String getId_sede() {
        return id_sede;
    }
    public void setId_sede(String id_sede) {
        this.id_sede = id_sede;
    }
    public int getCapacidad() {
        return capacidad;
    }
    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    //Metodo toString
    @Override
    public String toString() {
        return "OfertaAcademica{" + "id_disciplina=" + id_disciplina + ", id_sede=" + id_sede + ", capacidad=" + capacidad + '}';
    }
    
}
