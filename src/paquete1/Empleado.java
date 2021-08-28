/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete1;

/**
 *
 * @author 505
 */
public class Empleado {
    
    // atributos = datos = variables
    
   public String nombre;
   public String cedula;
   public int salario;
   public String direccion;
   
   
   // metodos = acciones = funciones

    public Empleado() {
    }

    public Empleado(String nombre) {
        this.nombre = nombre;
    }

    public Empleado(String nombre, String cedula, int salario, String direccion) {
        this.nombre = nombre;
        this.cedula = cedula;
        this.salario = salario;
        this.direccion = direccion;
    }
   
   
    
}
