package taller5;

import javax.swing.JOptionPane;

/**
 * Ejercicio 1 - Calculadora de propina (JOptionPane)
 *
 * El autograde invoca por reflexión:
 *   calcularPropina(double monto, double porcentaje)
 *   calcularTotal(double monto, double porcentaje)
 *
 * El main debe usar JOptionPane para interactuar con el usuario.
 */
public class Ejercicio1 {

    public static double calcularPropina(double monto, double porcentaje) {
        // TODO: retornar la propina = monto * porcentaje / 100
        return monto * porcentaje / 100;
    }

    public static double calcularTotal(double monto, double porcentaje) {
        // TODO: retornar monto + propina
        return monto + propina
    }

    public static void main(String[] args) {
        // TODO:
        // 1. Pedir monto con JOptionPane.showInputDialog
        String montoTexto = JOptionPane.showInputDialog("Ingrese el monto");
        // 2. Pedir porcentaje con JOptionPane.showInputDialog
         String porcentajeTexto = JOptionPane.showInputDialog("Ingrese el porcentaje de la propina");
        // 3. Convertir con Double.parseDouble
        double monto = Double.parseDouble(montoTexto);
double porcentaje = Double.parseDouble(porcentajeTexto);
        // 4. Calcular con los métodos de arriba
        double propina = calcularPropina(monto, porcentaje);
double Total = calcularTotal(monto, porcentaje);
        // 5. Mostrar con JOptionPane.showMessageDialog el formato EXACTO:
        //      Propina: $X.XX
        //      Total: $Y.YY
        String String.format("Propina, propina, propina total");
JOptionPane.showMessageDialog(null, mensaje);
    
    }
}
