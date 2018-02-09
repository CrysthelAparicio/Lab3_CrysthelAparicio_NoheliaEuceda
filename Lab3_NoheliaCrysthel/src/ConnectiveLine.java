
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
public class ConnectiveLine {

    ArrayList<Empresa> empresas = new ArrayList();
    ArrayList<Persona> persona = new ArrayList();
    ArrayList<Ingreso> proyectospubli = new ArrayList();

    public ConnectiveLine() {
    }

    public ArrayList<Empresa> getEmpresas() {
        return empresas;
    }

    public void setEmpresas(ArrayList<Empresa> empresas) {
        this.empresas = empresas;
    }

    public ArrayList<Persona> getPersona() {
        return persona;
    }

    public void setPersona(ArrayList<Persona> persona) {
        this.persona = persona;
    }

    public ArrayList<Ingreso> getProyectospubli() {
        return proyectospubli;
    }

    public void setProyectospubli(ArrayList<Ingreso> proyectospubli) {
        this.proyectospubli = proyectospubli;
    }

    @Override
    public String toString() {
        return "ConnectiveLine{" + "empresas=" + empresas + ", persona=" + persona + ", proyectospubli=" + proyectospubli + '}';
    }

}
