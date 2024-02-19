package ejercicio2;

import java.util.HashMap;
import java.util.Scanner;

public class AnalizadorFrecuenciaCaracteres {

    public static void main(String[] args) {
        analizarFrecuenciaCaracteres();
    }

    public static void analizarFrecuenciaCaracteres() {
        Scanner scanner = new Scanner(System.in);
        HashMap<Character, Integer> frecuencias = new HashMap<>();

        System.out.println("Ingrese el texto:");
        String texto = scanner.nextLine();

        for (char caracter : texto.toCharArray()) {
            frecuencias.put(caracter, frecuencias.getOrDefault(caracter, 0) + 1);
        }

        System.out.println("Frecuencias de caracteres:");
        for (char caracter : frecuencias.keySet()) {
            System.out.println(caracter + ": " + frecuencias.get(caracter));
        }
    }
}
