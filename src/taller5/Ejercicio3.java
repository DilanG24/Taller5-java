package taller5;

import javax.swing.JOptionPane;

/**
 * Ejercicio 3 - Área y perímetro de un rectángulo (JOptionPane)
 *
 * El autograde invoca por reflexión:
 *   calcularArea(double base, double altura)
 *   calcularPerimetro(double base, double altura)
 */
public class Ejercicio3 {

    public static double calcularArea(double base, double altura) {
        // TODO: retornar base * altura
        return base * altura;
    }

    public static double calcularPerimetro(double base, double altura) {
        // TODO: retornar 2 * (base + altura)
        return 2 * (base + altura);
    }

    public static void main(String[] args) {
        // TODO:
       
        // 1. Pedir base y altura con JOptionPane.showInputDialog
        String entradaBase = JOptionPane.showInputDialog("Ingrese la base:");
double base = Double.parseDouble(entradaBase);

String entradaAltura = JOptionPane.showInputDialog("Ingrese la altura:");
double altura = Double.parseDouble(entradaAltura);
      
        // 2. Mostrar con JOptionPane.showMessageDialog EXACTO:
        //      Área: X.XX
        //      Perímetro: Y.YY
        double area = calcularArea(base, altura);
double perimetro = calcularPerimetro(base, altura);

JOptionPane.showMessageDialog(null,
        String.format("Área: %.2f%nPerímetro: %.2f", area, perimetro));
    }
}
