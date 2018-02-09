
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
public class MediosAudioVisuales extends Freelance {

    ArrayList<Proyecto> proyectospubli = new ArrayList();
    private String nombreMarca;
    private String modeloCamara;

    public MediosAudioVisuales() {
        super();
    }

    public MediosAudioVisuales(String nombreMarca, String modeloCamara, String nombre, String contraseña, int edad, char genero, double dinero, String ciudad, String telefono, String id, String correo) {
        super(nombre, contraseña, edad, genero, dinero, ciudad, telefono, id, correo);
        this.nombreMarca = nombreMarca;
        this.modeloCamara = modeloCamara;
    }

    public ArrayList<Proyecto> getProyectospubli() {
        return proyectospubli;
    }

    public void setProyectospubli(ArrayList<Proyecto> proyectospubli) {
        this.proyectospubli = proyectospubli;
    }

    public String getNombreMarca() {
        return nombreMarca;
    }

    public void setNombreMarca(String nombreMarca) {
        this.nombreMarca = nombreMarca;
    }

    public String getModeloCamara() {
        return modeloCamara;
    }

    public void setModeloCamara(String modeloCamara) {
        this.modeloCamara = modeloCamara;
    }

    @Override
    public String toString() {
        return "MediosAudioVisuales{" + "proyectospubli=" + proyectospubli + ", nombreMarca=" + nombreMarca + ", modeloCamara=" + modeloCamara + '}';
    }

}
