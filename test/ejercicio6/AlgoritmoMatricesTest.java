package ejercicio6;

import org.junit.jupiter.api.Assertions;

import static org.junit.jupiter.api.Assertions.*;

class AlgoritmoMatricesTest {

    @org.junit.jupiter.api.Test
    public void testLlenarMatriz() {
        // Preparación
        int[][] matrizEsperada = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15, 16}
        };

        int[][] matrizReal = new int[4][4];


        AlgoritmoMatrices.llenarMatriz(matrizReal);

        Assertions.assertArrayEquals(matrizEsperada, matrizReal);
    }
}
