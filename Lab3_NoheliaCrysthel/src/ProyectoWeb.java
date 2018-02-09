
import java.util.Date;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author COPECO -13
 */
public class ProyectoWeb extends Proyecto {

    private DesarrolloWeb desarrolladorWeb;

    public ProyectoWeb() {
        super();
    }

    public ProyectoWeb(DesarrolloWeb desarrolladorWeb, String nombre, String empresa, String precio, String estado, String descripcion, Date fechaInicio, Date fechaEntrega) {
        super(nombre, empresa, precio, estado, descripcion, fechaInicio, fechaEntrega);
        this.desarrolladorWeb = desarrolladorWeb;
    }

    public DesarrolloWeb getDesarrolladorWeb() {
        return desarrolladorWeb;
    }

    public void setDesarrolladorWeb(DesarrolloWeb desarrolladorWeb) {
        this.desarrolladorWeb = desarrolladorWeb;
    }

    @Override
    public String toString() {
        return "ProyectoWeb{" + "desarrolladorWeb=" + desarrolladorWeb + '}';
    }

}
