/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package actividadaprendizajesem2;

/**
 *
 * @author Diesel
 */
class Practicante extends Empleado {
    public Practicante(String nombre, double salario) {
        super(nombre, salario);
    }
    
    @Override
    public double calcularPago() {
        return salario * 0.5;
    }
}