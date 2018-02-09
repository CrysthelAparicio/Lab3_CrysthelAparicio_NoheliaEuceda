
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
public class Contador {

    ArrayList<Proyecto> proyectosComerciales = new ArrayList();
    private String universidad;
    private boolean EstadoInscripcion;
    String hobbies;

    public Contador() {
    }

    public Contador(String universidad, boolean EstadoInscripcion, String hobbies) {
        this.universidad = universidad;
        this.EstadoInscripcion = EstadoInscripcion;
        this.hobbies = hobbies;
    }

    public ArrayList<Proyecto> getProyectosComerciales() {
        return proyectosComerciales;
    }

    public void setProyectosComerciales(ArrayList<Proyecto> proyectosComerciales) {
        this.proyectosComerciales = proyectosComerciales;
    }

    public String getUniversidad() {
        return universidad;
    }

    public void setUniversidad(String universidad) {
        this.universidad = universidad;
    }

    public boolean isEstadoInscripcion() {
        return EstadoInscripcion;
    }

    public void setEstadoInscripcion(boolean EstadoInscripcion) {
        this.EstadoInscripcion = EstadoInscripcion;
    }

    public String getHobbies() {
        return hobbies;
    }

    public void setHobbies(String hobbies) {
        this.hobbies = hobbies;
    }

    @Override
    public String toString() {
        return "Contador{" + "proyectosComerciales=" + proyectosComerciales + ", universidad=" + universidad + ", EstadoInscripcion=" + EstadoInscripcion + ", hobbies=" + hobbies + '}';
    }

}
