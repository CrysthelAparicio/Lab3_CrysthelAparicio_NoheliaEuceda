
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author COPECO -13
 */
public class Freelance extends Persona {

    private String nombre;
    private String contraseña;
    private int edad;
    private char genero;
    ArrayList<Empresa> empresas = new ArrayList();
    private double dinero;
    private String ciudad;
    private String telefono;

    public Freelance() {
        super();
    }

    public Freelance(String nombre, String contraseña, int edad, char genero, double dinero, String ciudad, String telefono, String id, String correo) {
        super(id, correo);
        this.nombre = nombre;
        this.contraseña = contraseña;
        this.edad = edad;
        this.genero = genero;
        this.dinero = dinero;
        this.ciudad = ciudad;
        this.telefono = telefono;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public char getGenero() {
        return genero;
    }

    public void setGenero(char genero) {
        this.genero = genero;
    }

    public ArrayList<Empresa> getEmpresas() {
        return empresas;
    }

    public void setEmpresas(ArrayList<Empresa> empresas) {
        this.empresas = empresas;
    }

    public double getDinero() {
        return dinero;
    }

    public void setDinero(double dinero) {
        this.dinero = dinero;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    @Override
    public String toString() {
        return "Freelance{" + "nombre=" + nombre + ", contrase\u00f1a=" + contraseña + ", edad=" + edad + ", genero=" + genero + ", empresas=" + empresas + ", dinero=" + dinero + ", ciudad=" + ciudad + ", telefono=" + telefono + '}';
    }

}
