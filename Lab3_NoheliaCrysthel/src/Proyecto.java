
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
public class Proyecto {

    protected String nombre;
    protected String empresa;
    protected String precio;
    protected String estado;
    protected String descripcion;
    protected Date fechaInicio;
    protected Date fechaEntrega;

    public Proyecto() {
    }

    public Proyecto(String nombre, String empresa, String precio, String estado, String descripcion, Date fechaInicio, Date fechaEntrega) {
        this.nombre = nombre;
        this.empresa = empresa;
        this.precio = precio;
        this.estado = estado;
        this.descripcion = descripcion;
        this.fechaInicio = fechaInicio;
        this.fechaEntrega = fechaEntrega;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    public String getPrecio() {
        return precio;
    }

    public void setPrecio(String precio) {
        this.precio = precio;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Date getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(Date fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public Date getFechaEntrega() {
        return fechaEntrega;
    }

    public void setFechaEntrega(Date fechaEntrega) {
        this.fechaEntrega = fechaEntrega;
    }

    @Override
    public String toString() {
        return "Proyecto{" + "nombre=" + nombre + ", empresa=" + empresa + ", precio=" + precio + ", estado=" + estado + ", descripcion=" + descripcion + ", fechaInicio=" + fechaInicio + ", fechaEntrega=" + fechaEntrega + '}';
    }

}
