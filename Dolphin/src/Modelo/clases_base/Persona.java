package Modelo.clases_base;




import java.sql.Date;

public class Persona {
    
    //Atributos
    private String cedula;
    private String nombre;
    private String apellido;
    private String telefono;
    private String direccion;
    private String correo;
    private Date fechanacimiento;
    private String celular;
    private int edad;
    private String tipo_p;

    //Constructores
    public Persona() {
    }
    public Persona(String cedula, String nombre, String apellido, String telefono, String direccion, String correo, Date fechanacimiento, String celular, int edad, String tipo_p) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.apellido = apellido;
        this.telefono = telefono;
        this.direccion = direccion;
        this.correo = correo;
        this.fechanacimiento = fechanacimiento;
        this.celular = celular;
        this.edad = edad;
        this.tipo_p = tipo_p;
    }

    //Metodos Getter y setter
        public String getCedula() {
        return cedula;
    }
    public void setCedula(String cedula) {
        this.cedula = cedula;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getApellido() {
        return apellido;
    }
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    public String getTelefono() {
        return telefono;
    }
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    public String getDireccion() {
        return direccion;
    }
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    public String getCorreo() {
        return correo;
    }
    public void setCorreo(String correo) {
        this.correo = correo;
    }
    public Date getFechanacimiento() {
        return fechanacimiento;
    }
    public void setFechanacimiento(Date fechanacimiento) {
        this.fechanacimiento = fechanacimiento;
    }
    public String getCelular() {
        return celular;
    }
    public void setCelular(String cedular) {
        this.celular = cedular;
    }
    public int getEdad() {
        return edad;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }
     public String getTipo_p() {
        return tipo_p;
    }
    public void setTipo_p(String tipo_p) {
        this.tipo_p = tipo_p;
    }

    //Metodo toString
    @Override
    public String toString() {
        return "Persona{" + "cedula=" + cedula + ", nombre=" + nombre + ", apellido=" + apellido 
                + ", telefono=" + telefono + ", direccion=" + direccion + ", correo=" + correo 
                + ", fechanacimiento=" + fechanacimiento + ", celular=" + celular + ", edad=" + edad + 
                ", tipo_p=" + tipo_p + '}';
    }
    
}
