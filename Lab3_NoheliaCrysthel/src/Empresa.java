
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
    
    
    
}
