/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica1;

/**
 *
 * @author shant
 */
public class Cliente extends PersonalCprincipal {
    
    private int sueldo;
    private String rol;

    public Cliente(String nombre, String apellido, int edad, String sexo, String direccion, int tel, String fechaNacimiento, String cedula, int sueldo, String rol) {
        super(nombre, apellido, edad, sexo, direccion, tel, fechaNacimiento, cedula);
        this.sueldo = sueldo;
        this.rol = rol;
        
    }
    
      
    public void ContactarRepresentante(){
        System.out.println("Para contactar al representante");
    }
    
    public void SolicitarInformacion(){
        System.out.println("Para solicitar informacion");
    }
}
