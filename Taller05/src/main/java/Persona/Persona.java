/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Persona;

import java.util.Date;

/**
 *
 * @author Lizbeth
 */
public class Persona {
    protected String usuario;
    protected String clave;
    protected String nombre;
    protected String apellido;
    protected String cedula;
    protected String direccion;
    protected Date fechaNac;

    public Persona(String usuario, String clave, String nombre, String apellido, String cedula, String direccion, Date fechaNac) {
        this.usuario = usuario;
        this.clave = clave;
        this.nombre = nombre;
        this.apellido = apellido;
        this.cedula = cedula;
        this.direccion = direccion;
        this.fechaNac = fechaNac;
    }

    public boolean logIn() {
        return this.clave.equals(clave) && this.usuario.equals(usuario);
    }
    
    public boolean logOut() {
        if(logIn()==true){
            this.clave=null;
            this.usuario=null;
            return true;
        }else{
            return false;
        }
    }
}
