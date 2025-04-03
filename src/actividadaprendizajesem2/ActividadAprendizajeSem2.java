/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package actividadaprendizajesem2;

// Separación de la persistencia (SRP)
class RepositorioEmpleado {
    public void guardarEnBaseDeDatos(Empleado empleado) {
        System.out.println("Guardando empleado " + empleado.getNombre() + " en la base de datos...");
    }
}

// Separación de la generación de reportes (SRP)
class ReporteEmpleado {
    public void generarReporte(Empleado empleado) {
        System.out.println("Generando reporte para el empleado " + empleado.getNombre() + "...");
    }
}

public class ActividadAprendizajeSem2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Empleado gerente = new Gerente("Juan", 5000.12);
        Empleado desarrollador = new Desarrollador("Ana", 3000);
        Empleado practicante = new Practicante("Luis", 1000);

        SistemaGestionEmpleados sistema = new SistemaGestionEmpleados();
        sistema.procesarEmpleado(gerente);
        sistema.procesarEmpleado(desarrollador);
        sistema.procesarEmpleado(practicante);       
    }
}
