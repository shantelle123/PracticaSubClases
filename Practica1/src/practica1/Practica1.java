/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica1;
import java.util.Scanner;

/**
 *
 * @author shant
 */
public class Practica1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner lectura= new Scanner (System.in);
        int opcion;
        
        System.out.println("1. Solicitar Permiso");
        System.out.println("2. Reportar Horas Extras");
        System.out.println("3. Contactar Representante");
        System.out.println("4. Solicitar Informacion");
        
        
        System.out.println("selecciona opcion");
        opcion = lectura.nextInt();
        
        
        Empleado Empleado_p = new Empleado ("diogenes", "cruz", 55, "masculino", "cambolla", 80984709, "17 de septiembre", "909/9087/87", 30000, "secretario");
        Cliente Cliente_p=new Cliente("Damanio", "perez", 23, "masculino", "peralta", 12132131, "12 de noviembre", "122/2323/23", 21000, "cliente");
        
        
        switch (opcion){
            case 1:
                Empleado_p.SolicitudPermiso();
            break;
            
            case 2:
                Empleado_p.ReporteHorasExtra();
           break;
           
            case 3:
                Cliente_p.ContactarRepresentante();
            break;
          
            case 4:
                Cliente_p.SolicitarInformacion();
            break;
            default:
            break;
            
       
            
        }
        
        
    }
    
}
