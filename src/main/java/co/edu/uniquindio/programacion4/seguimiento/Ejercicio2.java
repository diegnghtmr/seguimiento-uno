package co.edu.uniquindio.programacion4.seguimiento;

/*
* Implemente un programa usando backtracking para resolver el siguiente problema:
* Dado un conjunto de números sin repetición, genere todas las permutaciones posibles de esos números.
* Por ejemplo, para el conjunto [1, 2, 3], el programa debe generar:
* [1, 2, 3] [1, 3, 2] [2, 1, 3] [2, 3, 1] [3, 1, 2] [3, 2, 1]
 */

public class Ejercicio2 {

    public static void main(String[] args) {
        int[] conjunto = {1, 2, 3};
        permutar(conjunto, 0);
    }

    // Función principal para generar permutaciones a partir de una posición dada (indice)
    private static void permutar(int[] arreglo, int indice) {
        if (indice == arreglo.length) {
            imprimirArreglo(arreglo, 0);
            System.out.println();
        } else {
            permutarRecursivo(arreglo, indice, indice);
        }
    }

    // Función auxiliar que simula la iteración desde 'i' hasta el final del arreglo
    private static void permutarRecursivo(int[] arreglo, int indice, int i) {
        if (i < arreglo.length) {
            intercambiar(arreglo, indice, i);
            permutar(arreglo, indice + 1);
            intercambiar(arreglo, indice, i);
            permutarRecursivo(arreglo, indice, i + 1);
        }
    }

    // Método auxiliar para intercambiar dos elementos en el arreglo
    private static void intercambiar(int[] arreglo, int i, int j) {
        int temp = arreglo[i];
        arreglo[i] = arreglo[j];
        arreglo[j] = temp;
    }

    private static void imprimirArreglo(int[] arreglo, int indice) {
        if (indice < arreglo.length) {
            System.out.print(arreglo[indice] + " ");
            imprimirArreglo(arreglo, indice + 1);
        }
    }
}
