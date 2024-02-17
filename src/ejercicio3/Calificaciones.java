package ejercicio3;
import java.util.*;

// Clase Calificaciones
public class Calificaciones {


    static ArrayList<Double> calificaciones = new ArrayList<>();

// Método para obtener la nota, donde solo se anaden las notas validas
    public static void obtenerNota(Scanner sc){
        char respuesta;

        do {
            System.out.println("Introduzca la calificación (0-10)");
            double nota = sc.nextDouble();
            sc.nextLine();
            calificaciones.add(nota);
            if (nota >= 0 && nota <= 10) {
                System.out.println("La calificación es: " + nota);
            } else {
                System.out.println("La calificación no es válida");
            }
            System.out.println("Desea introducir otra calificación? (y/n)");
            respuesta = sc.next().toLowerCase().charAt(0);
        } while (respuesta == 'y');
    }
    public static void obtenerMedia() {
        // Si no hay calificaciones, se imprime un mensaje y se retorna
        if (calificaciones.isEmpty()) {
            System.out.println("No hay calificaciones para calcular la nota media");
            return;
        }
        // Se suman todas las calificaciones del array
        double suma = 0;
        for (int i = 0; i < calificaciones.size(); i++) {
            suma += calificaciones.get(i);
        }
        // Se calcula la media dividiendo la suma entre el numero de calificaciones
        double media = suma / calificaciones.size();
        System.out.printf("La nota media es: %.2f \n", media);  // Se imprime la media con dos decimales
    }
    // Método para mostrar las calificaciones
    public static void mostrarCalificaciones() {
        if (calificaciones.isEmpty()) {
            System.out.println("No hay calificaciones para mostrar");
            return;
        }
        System.out.println("Las calificaciones son: ");
        for (int i = 0; i < calificaciones.size(); i++) {
            System.out.println(calificaciones.get(i));
        }
    }
    // Método para mostrar las calificaciones ordenadas
    public static void mostrarCalificacionesOrdenadas() {
        if (calificaciones.isEmpty()) {
            System.out.println("No hay calificaciones para mostrar");
            return;
        }
        Collections.sort(calificaciones);
        System.out.println("Las calificaciones ordenadas de menor a mayor son: ");
        for (int i = 0; i < calificaciones.size(); i++) {
            System.out.println(calificaciones.get(i));
        }
    }



}
