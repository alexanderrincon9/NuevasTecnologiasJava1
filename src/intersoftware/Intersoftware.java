/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package intersoftware;

import paquete1.Empleado;

/**
 *
 * @author 505
 */
public class Intersoftware {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int edad = 50;
        
        //usar mi clase
        
        Empleado empleado = new Empleado();
        System.out.println("nombre: "+empleado.nombre);
         /*empleado.nombre = "Benito Tocamelas";
         System.out.println("nombre: "+empleado.nombre);
         empleado.cedula = 98713479;
         System.out.println("cedula: "+empleado.cedula);
         */ 
          
          
        Empleado pachito = new Empleado("Pacho");
        System.out.println("nombre: "+pachito.nombre);
        
        Empleado objeto3 = new Empleado("Benito","98713479",4000000,"calle 107 # 107-82");
        System.out.println("Nombre: "+objeto3.nombre);
         System.out.println("Cedula: "+objeto3.cedula);
          System.out.println("Salario: "+objeto3.salario);
           System.out.println("Direccion: "+objeto3.direccion);
      
        
    }
    
}
