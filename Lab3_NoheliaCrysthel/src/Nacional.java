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
