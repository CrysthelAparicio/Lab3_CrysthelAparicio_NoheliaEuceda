
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
public class Empresa {
    protected String nombre;
    protected String telefono;
    ArrayList<Proyecto> listaProyecto = new ArrayList();
    protected String correo;
    protected String contraseña;
    protected String descripcion;

    public Empresa() {
    }

    public Empresa(String nombre, String telefono, String correo, String contraseña, String descripcion) {
        this.nombre = nombre;
        this.telefono = telefono;
        this.correo = correo;
        this.contraseña = contraseña;
        this.descripcion = descripcion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public ArrayList<Proyecto> getListaProyecto() {
        return listaProyecto;
    }

    public void setListaProyecto(ArrayList<Proyecto> listaProyecto) {
        this.listaProyecto = listaProyecto;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @Override
    public String toString() {
        return "Empresa{" + "nombre=" + nombre + ", telefono=" + telefono + ", listaProyecto=" + listaProyecto + ", correo=" + correo + ", contrase\u00f1a=" + contraseña + ", descripcion=" + descripcion + '}';
    }
    
}
