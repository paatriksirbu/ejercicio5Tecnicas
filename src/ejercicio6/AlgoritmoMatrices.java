package ejercicio6;
import java.util.*;


public class AlgoritmoMatrices {
    public static void main(String[] args) {
        //Algoritmo para llenar una matriz de 4x4 y sumar sus elementos

        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el número de filas de la matriz: ");
        int filas = sc.nextInt();
        System.out.println("Ingrese el número de columnas de la matriz: ");
        int columnas = sc.nextInt();

        int[][] matriz = new int[filas][columnas];

        llenarMatriz(matriz);

        System.out.println("La matriz es: ");
        imprimirMatriz(matriz);

        System.out.println("La suma de los elementos de la matriz es: " + sumaMatriz(matriz));
    }

    public static void llenarMatriz(int[][] matriz) {
        //Llena la matriz con números del 1 al 16

        Scanner sc = new Scanner(System.in);
        int numero;
        for (int j = 0; j < matriz.length; j++) {   //Muestra primero las columnas porque el número de columnas es el número de elementos de la matriz
            for (int i = 0; i < matriz[j].length; i++) {

                do {
                    System.out.println("Ingrese el valor de la posición [" + i + "][" + j + "]");
                    numero = sc.nextInt();
                    if (numero < 1 || numero > 16) {
                        System.out.println("El número debe estar entre 1 y 16");
                    }
                } while (numero < 1 || numero > 16);
                matriz[i][j] = numero;
            }

        }
    }

    public static void imprimirMatriz(int[][] matriz) { //Recorre la matriz y la imprime
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static int sumaMatriz(int[][] matriz) {  //Recorre la matriz y suma sus elementos
        int suma = 0;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                suma += matriz[i][j];
            }
        }
        return suma;
    }
}
