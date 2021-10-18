package Modelo.clases_base;

import java.sql.Date;

public class Deta_Realiza {
    
    //Atributos
    private String id_detalle;
    private String id_enc;
    private Date f_asistencia;
    private boolean asistencia;
    private int p_avanze;

    //Constructores
    public Deta_Realiza() {
    }
    public Deta_Realiza(String id_detalle, String id_enc, Date f_asistencia, boolean asistencia, int p_avanze) {
        this.id_detalle = id_detalle;
        this.id_enc = id_enc;
        this.f_asistencia = f_asistencia;
        this.asistencia = asistencia;
        this.p_avanze = p_avanze;
    }

    //Metodos getter y setter
    public String getId_detalle() {
        return id_detalle;
    }
    public void setId_detalle(String id_detalle) {
        this.id_detalle = id_detalle;
    }
    public String getId_enc() {
        return id_enc;
    }
    public void setId_enc(String id_enc) {
        this.id_enc = id_enc;
    }
    public Date getF_asistencia() {
        return f_asistencia;
    }
    public void setF_asistencia(Date f_asistencia) {
        this.f_asistencia = f_asistencia;
    }
    public boolean isAsistencia() {
        return asistencia;
    }
    public void setAsistencia(boolean asistencia) {
        this.asistencia = asistencia;
    }
    public int getP_avanze() {
        return p_avanze;
    }
    public void setP_avanze(int p_avanze) {
        this.p_avanze = p_avanze;
    }
    
    //Metodo toString
    @Override
    public String toString() {
        return "Deta_Realiza{" + "id_detalle=" + id_detalle + ", id_enc=" + id_enc + ", f_asistencia=" + f_asistencia + ", asistencia=" + asistencia + ", p_avanze=" + p_avanze + '}';
    }
       
}
