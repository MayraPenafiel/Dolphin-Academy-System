package Modelo.clases_base;




public class Enca_Realiza {
    
    //Atributos
    private String id_encaR;
    private String id_entren;
    private String id_alum;

    //Constructores
    public Enca_Realiza() {
    }
    public Enca_Realiza(String id_encaR, String id_entren, String id_alum) {
        this.id_encaR = id_encaR;
        this.id_entren = id_entren;
        this.id_alum = id_alum;
    }

    //Metodos getter y setter
    public String getId_encaR() {
        return id_encaR;
    }
    public void setId_encaR(String id_encaR) {
        this.id_encaR = id_encaR;
    }
    public String getId_entren() {
        return id_entren;
    }
    public void setId_entren(String id_entren) {
        this.id_entren = id_entren;
    }
    public String getId_alum() {
        return id_alum;
    }
    public void setId_alum(String id_alum) {
        this.id_alum = id_alum;
    }
    
    //Metodo toString
    @Override
    public String toString() {
        return "Enca_Realiza{" + "id_encaR=" + id_encaR + ", id_entren=" + id_entren + ", id_alum=" + id_alum + '}';
    }
    
}
