package ejercicio7;

public class GeneradorMatricesAleatorias {
    public static void main(String[] args) {
        final int FILAS = 20;   // Declaración de filas y columnas de la matriz 20x30
        final int COLUMNAS = 30;

        int i, j;
        char[][] matriz = new char[FILAS][COLUMNAS];    // Declaración de la matriz

        for (i = 0; i < FILAS; i++) {   // Inicialización de la matriz con caracteres aleatorios
            for (j = 0; j < COLUMNAS; j++) {
                matriz[i][j] = (char) (Math.random() * 26 + 'A');
            }
        }

        for (i = 0; i < FILAS; i++) {   // Impresión de la matriz
            for (j = 0; j < COLUMNAS; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }
}
