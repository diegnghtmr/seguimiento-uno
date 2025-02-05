package co.edu.uniquindio.programacion4.seguimiento;
import java.util.Scanner;

/*
 * Escriba una función recursiva que calcule la suma de los primeros n números naturales ingresados
 * por el usuario. Por ejemplo, si el usuario ingresa 5, el programa debe devolver 15 (1 + 2 + 3 + 4 + 5).
 */

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner lectura = new Scanner (System.in);
        System.out.print("Ingrese un número: ");
        int n = lectura.nextInt();

        System.out.println("La suma es: " + sumarNaturales(n));
    }

    public static int sumarNaturales(int n) {
        if (n == 0) {
            return 0;
        } else {
            return n + sumarNaturales(n - 1);
        }
    }
}
