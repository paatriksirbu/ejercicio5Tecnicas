package ejercicio3;
import java.util.*;

public class Calificaciones {

    static ArrayList<Double> calificaciones = new ArrayList<>();


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

        if (calificaciones.isEmpty()) {
            System.out.println("No hay calificaciones para calcular la nota media");
            return;
        }

        double suma = 0;
        for (int i = 0; i < calificaciones.size(); i++) {
            suma += calificaciones.get(i);
        }
        double media = suma / calificaciones.size();
        System.out.printf("La nota media es: %.2f \n", media);
    }

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
