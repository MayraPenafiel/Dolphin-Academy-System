package Modelo.clases_base;


public class Sede extends OfertaAcademica{
    
    //Atributos
    private String cod_sede;
    private String nombre_s;
    private String direccion_s;
    private String correo_s;
    private String telefono_s;
    //Atributos Oferta Academica
    private String id_disciplina;
    private String id_sede;
    private int capacidad;
    private String id_OA;

    //Constructores
    public Sede() {
    }
    public Sede(String cod_sede, String nombre_s, String direccion_s, String correo_s, String telefono_s) {
        this.cod_sede = cod_sede;
        this.nombre_s = nombre_s;
        this.direccion_s = direccion_s;
        this.correo_s = correo_s;
        this.telefono_s = telefono_s;
    }

    //Metodos getter y setter
    public String getCod_sede() {
        return cod_sede;
    }
    public void setCod_sede(String cod_sede) {
        this.cod_sede = cod_sede;
    }
    public String getNombre_s() {
        return nombre_s;
    }
    public void setNombre_s(String nombre_s) {
        this.nombre_s = nombre_s;
    }
    public String getDireccion_s() {
        return direccion_s;
    }
    public void setDireccion_s(String direccion_s) {
        this.direccion_s = direccion_s;
    }
    public String getCorreo_s() {
        return correo_s;
    }
    public void setCorreo_s(String correo_s) {
        this.correo_s = correo_s;
    }
    public String getTelefono_s() {
        return telefono_s;
    }
    public void setTelefono_s(String telefono_s) {
        this.telefono_s = telefono_s;
    }
    
    //Metodo toString 
    @Override
    public String toString() {
        return "Sede{" + "cod_sede=" + cod_sede + ", nombre_s=" + nombre_s + ", direccion_s=" + direccion_s + ", correo_s=" + correo_s + ", telefono_s=" + telefono_s + '}';
    }
    
}
