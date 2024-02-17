package ejercicio3;
import java.util.*;

public class AnalisisDeCalificaciones {

    private static Calificaciones calificaciones = new Calificaciones();
    private static Scanner sc = new Scanner(System.in);

    // Método main

    public static void main(String[] args) {
        int opcion = 0;

        System.out.println("\nBienvenido al sistema de calificaciones");

        while (opcion !=5) {    // Mientras la opcion no sea 5, se ejecuta el menu

            System.out.println("\nIntroduzca su eleccion: (1-5)");
            System.out.println("1. Introducir calificaciones");
            System.out.println("2. Mostrar calificaciones");
            System.out.println("3. Mostrar calificaciones Ordenadas");
            System.out.println("4. Obtener nota media");
            System.out.println("5. Salir");

            opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion) {
                case 1:
                    Calificaciones.obtenerNota(sc);
                    break;
                case 2:
                    Calificaciones.mostrarCalificaciones();
                    break;
                case 3:
                    Calificaciones.mostrarCalificacionesOrdenadas();
                    break;
                case 4:
                    Calificaciones.obtenerMedia();
                    break;
                case 5:
                    System.out.println("Saliendo del sistema..." +
                            "\nHasta luego!");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Opcion no valida");
                    break;
            }

        } sc.close();

    }
}
