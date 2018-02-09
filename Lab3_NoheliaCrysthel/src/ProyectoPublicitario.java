
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
public class ProyectoPublicitario extends Proyecto {

    private Freelance freelance;

    public ProyectoPublicitario() {
        super();
    }

    public ProyectoPublicitario(Freelance freelance, String nombre, String empresa, String precio, String estado, String descripcion, Date fechaInicio, Date fechaEntrega) {
        super(nombre, empresa, precio, estado, descripcion, fechaInicio, fechaEntrega);
        this.freelance = freelance;
    }

    public Freelance getFreelance() {
        return freelance;
    }

    public void setFreelance(Freelance freelance) {
        this.freelance = freelance;
    }

    @Override
    public String toString() {
        return "ProyectoPublicitario{" + "freelance=" + freelance + '}';
    }

}
