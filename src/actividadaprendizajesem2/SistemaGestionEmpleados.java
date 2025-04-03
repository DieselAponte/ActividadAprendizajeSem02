/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package actividadaprendizajesem2;

/**
 *
 * @author Diesel
 */
class SistemaGestionEmpleados {
    private RepositorioEmpleado repositorio = new RepositorioEmpleado();
    private ReporteEmpleado reporte = new ReporteEmpleado();

    public void procesarEmpleado(Empleado empleado) {
        double pago = empleado.calcularPago();
        System.out.println("Pago calculado: " + pago);
        repositorio.guardarEnBaseDeDatos(empleado);
        reporte.generarReporte(empleado);
    }
}