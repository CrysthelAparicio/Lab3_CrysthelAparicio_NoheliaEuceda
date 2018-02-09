/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author COPECO -13
 */
public class Administrador extends Persona {

    private String usuario;
    private String contraseña;

    public Administrador() {
        super();
    }

    public Administrador(String usuario, String contraseña, String id, String correo) {
        super(id, correo);
        this.usuario = usuario;
        this.contraseña = contraseña;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    @Override
    public String toString() {
        return "Administrador{" + "usuario=" + usuario + ", contrase\u00f1a=" + contraseña + '}';
    }

}
