
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
public class DiseñadorGrafico extends Freelance {

    ArrayList<Proyecto> proyectospubli = new ArrayList();
    private String Universidad;
    String hobbies;

    public DiseñadorGrafico() {
        super();
    }

    public DiseñadorGrafico(String Universidad, String hobbies, String nombre, String contraseña, int edad, char genero, double dinero, String ciudad, String telefono, String id, String correo) {
        super(nombre, contraseña, edad, genero, dinero, ciudad, telefono, id, correo);
        this.Universidad = Universidad;
        this.hobbies = hobbies;
    }

    public ArrayList<Proyecto> getProyectospubli() {
        return proyectospubli;
    }

    public void setProyectospubli(ArrayList<Proyecto> proyectospubli) {
        this.proyectospubli = proyectospubli;
    }

    public String getUniversidad() {
        return Universidad;
    }

    public void setUniversidad(String Universidad) {
        this.Universidad = Universidad;
    }

    public String getHobbies() {
        return hobbies;
    }

    public void setHobbies(String hobbies) {
        this.hobbies = hobbies;
    }

    @Override
    public String toString() {
        return "Dise\u00f1adorGrafico{" + "proyectospubli=" + proyectospubli + ", Universidad=" + Universidad + ", hobbies=" + hobbies + '}';
    }

}
