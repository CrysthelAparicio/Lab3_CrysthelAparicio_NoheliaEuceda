
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
public class DesarrolloWeb extends Freelance {

    private String lenguajeProgra;
    private String Universidad;
    private String Idioma;
    ArrayList<Proyecto> proyectosweb = new ArrayList();

    public DesarrolloWeb() {
        super();
    }
    
    public DesarrolloWeb(String lenguajeProgra, String Universidad, String Idioma, String nombre, String contraseña, int edad, char genero, double dinero, String ciudad, String telefono, String id, String correo) {
        super(nombre, contraseña, edad, genero, dinero, ciudad, telefono, id, correo);
        this.lenguajeProgra = lenguajeProgra;
        this.Universidad = Universidad;
        this.Idioma = Idioma;
    }


    public String getLenguajeProgra() {
        return lenguajeProgra;
    }

    public void setLenguajeProgra(String lenguajeProgra) {
        this.lenguajeProgra = lenguajeProgra;
    }

    public String getUniversidad() {
        return Universidad;
    }

    public void setUniversidad(String Universidad) {
        this.Universidad = Universidad;
    }

    public String getIdioma() {
        return Idioma;
    }

    public void setIdioma(String Idioma) {
        this.Idioma = Idioma;
    }

    public ArrayList<Proyecto> getProyectosweb() {
        return proyectosweb;
    }

    public void setProyectosweb(ArrayList<Proyecto> proyectosweb) {
        this.proyectosweb = proyectosweb;
    }

    @Override
    public String toString() {
        return "DesarrolloWeb{" + "lenguajeProgra=" + lenguajeProgra + ", Universidad=" + Universidad + ", Idioma=" + Idioma + ", proyectosweb=" + proyectosweb + '}';
    }

}
