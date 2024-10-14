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
public class  Empleado extends PersonalCprincipal{
    
    private String papel;
    private int sueldo;
    
    public Empleado(String nombre, String apellido, int edad, String sexo, String direccion, int tel, String fechaNacimiento, String cedula, int sueldo, String papel) {
        super(nombre, apellido, edad, sexo, direccion, tel, fechaNacimiento, cedula);
        this.sueldo = sueldo;
        this.papel = papel;
   }

    public void SolicitudPermiso(){
        System.out.println("Para solicitar permiso marque al 809-947-9028");
    }
    
    public void ReporteHorasExtra(){
        System.out.println("Para obtener un reporte de las horas extra marque al 809-802-9220");
    }
}
