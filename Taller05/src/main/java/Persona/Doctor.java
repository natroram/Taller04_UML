/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Persona;

import Receta.Receta;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Lizbeth
 */
public class Doctor extends Persona {
    protected ArrayList<Receta> listaReceetas;
    protected int regDoctor;
    protected String especialidad;
    
    public Doctor(int regDoctor, String especialidad, String usuario, String clave, String nombre, String apellido, String cedula, String direccion, Date fechaNac) {
        super(usuario, clave, nombre, apellido, cedula, direccion, fechaNac);
        this.regDoctor = regDoctor;
        this.especialidad = especialidad;
    }
    
    public void recetar(){    
    }
    
    public void agegarPlanNut(){   
    }
    
    public void imprimirReceta(){ 
    }
    
    public void registrarSecretaria(){
    }
}
