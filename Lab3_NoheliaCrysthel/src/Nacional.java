/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author COPECO -13
 */
public class Nacional extends Empresa {

    private String depto;
    private String municipio;
    private String ciudad;
    private String mision;
    private String vision;

    public Nacional() {
        super();
    }
//<<<<<<< HEAD
    
//=======

    public Nacional(String depto, String municipio, String ciudad, String mision, String vision, String nombre, String telefono, String correo, String contraseña, String descripcion) {
        super(nombre, telefono, correo, contraseña, descripcion);
        this.depto = depto;
        this.municipio = municipio;
        this.ciudad = ciudad;
        this.mision = mision;
        this.vision = vision;
    }

//>>>>>>> b3cdcbe0da37713a257b32c9df7bcc26af638640
    public String getDepto() {
        return depto;
    }

    public void setDepto(String depto) {
        this.depto = depto;
    }

    public String getMunicipio() {
        return municipio;
    }

    public void setMunicipio(String municipio) {
        this.municipio = municipio;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getMision() {
        return mision;
    }

    public void setMision(String mision) {
        this.mision = mision;
    }

    public String getVision() {
        return vision;
    }

    public void setVision(String vision) {
        this.vision = vision;
    }

    @Override
    public String toString() {
        return "Nacional{" + "depto=" + depto + ", municipio=" + municipio + ", ciudad=" + ciudad + ", mision=" + mision + ", vision=" + vision + '}';
    }

}
