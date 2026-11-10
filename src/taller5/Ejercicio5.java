package taller5;

import javax.swing.JOptionPane;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

/**
 * Ejercicio 5 - Clase Estudiante + JOptionPane + BufferedReader
 *
 * El main usa la clase Estudiante (Ejercicio5 combina ambas formas de E/S):
 *  - nombre y edad con JOptionPane
 *  - notas con BufferedReader
 */
public class Ejercicio5 {

    public static void main(String[] args) throws IOException {
        // TODO:
        // 1. Pedir nombre con JOptionPane.showInputDialog
        String nombre = JOptionPane.showInputDialog("Ingrese el nombre:");

        // 2. Pedir edad con JOptionPane.showInputDialog + Integer.parseInt
        String entradaEdad = JOptionPane.showInputDialog("Ingrese la edad:");
int edad = Integer.parseInt(entradaEdad);
        // 3. Leer tres notas con BufferedReader + Double.parseDouble
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

System.out.print("Ingrese la primera nota: ");
double n1 = Double.parseDouble(br.readLine());

System.out.print("Ingrese la segunda nota: ");
double n2 = Double.parseDouble(br.readLine());

System.out.print("Ingrese la tercera nota: ");
double n3 = Double.parseDouble(br.readLine());
        // 4. Crear objeto Estudiante con el constructor
        Estudiante estudiante = new Estudiante(nombre, edad, n1, n2, n3);
        // 5. Mostrar con JOptionPane.showMessageDialog EXACTO:
        //      Nombre: [nombre]
        //      Edad: [edad]
        //      Promedio: X.XX
        JOptionPane.showMessageDialog(null,
        String.format("Nombre: %s%nEdad: %d%nPromedio: %.2f",
                nombre, edad, estudiante.calcularPromedio()));
    }
}
