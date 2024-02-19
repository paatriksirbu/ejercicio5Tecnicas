package ejercicio5;
import java.util.*;

public class VerificadorPalindromos {
    // Metodo principal que recie una palabra y verifica si es palindromo

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese una palabra: ");
        String palabra = sc.nextLine();
        if (esPalindromo(palabra)) {
            System.out.println("La palabra es palindromo");
        } else {
            System.out.println("La palabra no es palindromo");
        }

    }

    // Metodo que determina si la palabra es palindromo o no comparando los caracteres de la palabra de adelante hacia atras y viceversa.
    public static boolean esPalindromo(String palabra) {
        int i = 0;
        int j = palabra.length() - 1;
        while (i < j) {
            if (palabra.charAt(i) != palabra.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}
