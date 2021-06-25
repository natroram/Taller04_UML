/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Persona;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Lizbeth
 */
public class Administrador extends Persona{
    public ArrayList<Persona> listaUsuarios;
    
    public Administrador(String usuario, String clave, String nombre, String apellido, String cedula, String direccion, Date fechaNac) {
        super(usuario, clave, nombre, apellido, cedula, direccion, fechaNac);
    }
    
    public void registrarUsuario(){
        Date fecha = new Date(1998,12,4);
        Persona p = new Persona("Lizz25","OnePiece525 ","Lizbeth","Peña","0985871695","19 y El Oro",fecha);
        listaUsuarios.add(p);
    }
    
    public void asignarRol(Persona p){
        
    }
    
}
