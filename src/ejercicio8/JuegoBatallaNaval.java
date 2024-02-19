package ejercicio8;
import java.util.Random;
import java.util.Scanner;

public class JuegoBatallaNaval{
    // Juego de Batalla Naval
    public static void main(String[] args) {
        jugarBatallaNaval();
    }

    public static char[][] crearTablero(int filas, int columnas) { // Crear tablero
        char[][] tablero = new char[filas][columnas];
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                tablero[i][j] = ' ';
            }
        }
        return tablero;
    }

    public static int[] elegirUbicaciónAleatoria(char[][] tablero) {    // Elegir ubicación aleatoria
        Random rand = new Random();
        int fila = rand.nextInt(tablero.length);
        int columna = rand.nextInt(tablero[0].length);
        return new int[]{fila, columna};
    }

    public static int[] obtenerIntento() {  // Obtener intento del usuario
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese fila (0-3): ");
        int fila = scanner.nextInt();
        System.out.print("Ingrese columna (0-3): ");
        int columna = scanner.nextInt();
        return new int[]{fila, columna};
    }

    public static void marcarAgua(char[][] tablero, int[] intento) {
        tablero[intento[0]][intento[1]] = 'A'; // A de Agua
    }

    public static void marcarTocadoYHundido(char[][] tablero, int[] intento) {
        tablero[intento[0]][intento[1]] = 'X'; // X de Tocado y hundido
    }

    public static void mostrarTablero(char[][] tablero) {   //Imprimimos tablero
        for (int i = 0; i < tablero.length; i++) {
            for (int j = 0; j < tablero[i].length; j++) {
                System.out.print(tablero[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void jugarBatallaNaval() {    // Jugar Batalla Naval
        char[][] tablero = crearTablero(4, 4);
        int[] ubicación_barco = elegirUbicaciónAleatoria(tablero);
        int[] intento;

        do {
            intento = obtenerIntento();
            if (intento[0] == ubicación_barco[0] && intento[1] == ubicación_barco[1]) {
                marcarTocadoYHundido(tablero, intento);
                mostrarTablero(tablero);
                System.out.println("Tocado y hundido - Ha ganado");
                break;
            } else {
                marcarAgua(tablero, intento);
                mostrarTablero(tablero);
            }
        } while (true);
    }
}
