/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author COPECO -13
 */
public class Ingreso {

    private String empresa;
    private String freelance;
    private double dinero;

    public Ingreso() {
    }

    public Ingreso(String empresa, String freelance, double dinero) {
        this.empresa = empresa;
        this.freelance = freelance;
        this.dinero = dinero;
    }

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    public String getFreelance() {
        return freelance;
    }

    public void setFreelance(String freelance) {
        this.freelance = freelance;
    }

    public double getDinero() {
        return dinero;
    }

    public void setDinero(double dinero) {
        this.dinero = dinero;
    }

    @Override
    public String toString() {
        return "Ingreso{" + "empresa=" + empresa + ", freelance=" + freelance + ", dinero=" + dinero + '}';
    }

}
