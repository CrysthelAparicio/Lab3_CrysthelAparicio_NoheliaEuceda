
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
public class Marketing extends Freelance {

    ArrayList<Proyecto> proyectosComerciales = new ArrayList();
    private String redSocial;

    public Marketing() {
        super();
    }

    public Marketing(String redSocial, String nombre, String contraseña, int edad, char genero, double dinero, String ciudad, String telefono, String id, String correo) {
        super(nombre, contraseña, edad, genero, dinero, ciudad, telefono, id, correo);
        this.redSocial = redSocial;
    }

    public ArrayList<Proyecto> getProyectosComerciales() {
        return proyectosComerciales;
    }

    public void setProyectosComerciales(ArrayList<Proyecto> proyectosComerciales) {
        this.proyectosComerciales = proyectosComerciales;
    }

    public String getRedSocial() {
        return redSocial;
    }

    public void setRedSocial(String redSocial) {
        this.redSocial = redSocial;
    }

    @Override
    public String toString() {
        return "Marketing{" + "proyectosComerciales=" + proyectosComerciales + ", redSocial=" + redSocial + '}';
    }

}
