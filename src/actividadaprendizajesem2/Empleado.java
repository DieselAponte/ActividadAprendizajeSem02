/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package actividadaprendizajesem2;

/**
 *
 * @author Diesel
 */
class Empleado {
    protected String nombre;
    protected double salario;

    public Empleado(String nombre, double salario) {
        this.nombre = nombre;
        this.salario = salario;
    }
    
    public String getNombre() {
        return nombre;
    }
    
    public double calcularPago() {
        return salario;
    }
    
    
}

