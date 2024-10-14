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
public class PersonalCprincipal {
    
    public String Nombre;
    public  String Apellido;
     public  int Edad;
    public  String Sexo;
    public String Direccion;
    public int Tel;
   public String FechaNacimiento;
    public String Cedula;
   
    
   
    
     public PersonalCprincipal(String nombre, String apellido, int edad, String sexo, String direccion, int Tel,String fechaNacimiento, String cedula) {
        this.Nombre = nombre;
        this.Apellido = apellido;
        this.Edad= edad;
        this.Sexo= sexo;
        this.Direccion= direccion;
        this.Tel = Tel;
        this.FechaNacimiento= fechaNacimiento;
        this.Cedula=  cedula;
        
     }
}
