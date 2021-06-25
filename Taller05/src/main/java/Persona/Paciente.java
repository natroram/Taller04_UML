/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Persona;

import Receta.Receta;
import Sistema_Hospitalario.HistoriaClinica;
import java.util.Date;

/**
 *
 * @author Lizbeth
 */
public class Paciente extends Persona{
    protected String email;
    protected Receta receta;
    protected HistoriaClinica historiaClinica;
    
    public Paciente(String usuario, String clave, String nombre, String apellido, String cedula, String direccion, Date fechaNac, String email) {
        super(usuario, clave, nombre, apellido, cedula, direccion, fechaNac);
        this.email=email;
    }
    
    public void solicitarCita(){
        
    }
    
}
