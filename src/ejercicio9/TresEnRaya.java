package ejercicio9;

import java.util.Scanner;

public class TresEnRaya {

    public static void main(String[] args) {
        jugarTresEnRaya();
    }

    public static char[][] crearTablero(int filas, int columnas) {
        char[][] tablero = new char[filas][columnas];
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                tablero[i][j] = ' ';
            }
        }
        return tablero;
    }

    public static boolean hayGanador(char[][] tablero) {
        // Comprobar filas, columnas y diagonales
        for (int i = 0; i < 3; i++) {
            if (tablero[i][0] != ' ' && tablero[i][0] == tablero[i][1] && tablero[i][1] == tablero[i][2] ||
                    tablero[0][i] != ' ' && tablero[0][i] == tablero[1][i] && tablero[1][i] == tablero[2][i]) {
                return true;
            }
        }
        if (tablero[0][0] != ' ' && tablero[0][0] == tablero[1][1] && tablero[1][1] == tablero[2][2] ||
                tablero[0][2] != ' ' && tablero[0][2] == tablero[1][1] && tablero[1][1] == tablero[2][0]) {
            return true;
        }
        return false;
    }

    public static boolean hayEmpate(char[][] tablero) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (tablero[i][j] == ' ') {
                    return false;
                }
            }
        }
        return true;
    }

    public static void mostrarTablero(char[][] tablero) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(tablero[i][j]);
                if (j < 2) System.out.print("|");
            }
            System.out.println();
            if (i < 2) System.out.println("-+-+-");
        }
    }

    public static void realizarMovimiento(char[][] tablero, char jugadorActual) {
        Scanner scanner = new Scanner(System.in);
        int fila, columna;
        do {
            System.out.println("Jugador " + jugadorActual + ", ingrese fila y columna (0-2): ");
            fila = scanner.nextInt();
            columna = scanner.nextInt();
        } while (fila < 0 || fila > 2 || columna < 0 || columna > 2 || tablero[fila][columna] != ' ');

        tablero[fila][columna] = jugadorActual;
    }

    public static void cambiarJugador(char[] jugadorActual) {
        jugadorActual[0] = (jugadorActual[0] == 'X') ? 'O' : 'X';
    }

    public static void mostrarResultado(char[][] tablero) {
        if (hayGanador(tablero)) {
            cambiarJugador(new char[]{tablero[0][0]}); // Cambiar al jugador anterior
            System.out.println("El jugador " + tablero[0][0] + " gana!");
        } else if (hayEmpate(tablero)) {
            System.out.println("Es un empate!");
        }
    }

    public static void jugarTresEnRaya() {
        char[][] tablero = crearTablero(3, 3);
        char[] jugadorActual = {'X'};
        while (!hayGanador(tablero) && !hayEmpate(tablero)) {
            mostrarTablero(tablero);
            realizarMovimiento(tablero, jugadorActual[0]);
            if (hayGanador(tablero) || hayEmpate(tablero)) break;
            cambiarJugador(jugadorActual);
        }
        mostrarTablero(tablero);
        mostrarResultado(tablero);
    }
}
