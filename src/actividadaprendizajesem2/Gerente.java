/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package actividadaprendizajesem2;

/**
 *
 * @author Diesel
 */
class Gerente extends Empleado {
    public Gerente(String nombre, double salario) {
        super(nombre, salario);
    }
    
    @Override
    public double calcularPago() {
        return salario + 1000;
    }
}
