package ejercicio3;
import java.util.*;

public class AnalisisDeCalificaciones {

    private static Calificaciones calificaciones = new Calificaciones();
    private static Scanner sc = new Scanner(System.in);


    public static void main(String[] args) {
        int opcion = 0;

        while (opcion !=4) {
            System.out.println("\nBienvenido al sistema de calificaciones");
            System.out.println("\nIntroduzca su eleccion: (1-4)");
            System.out.println("1. Introducir calificaciones");
            System.out.println("2. Mostrar calificaciones");
            System.out.println("3. Obtener nota media");
            System.out.println("4. Salir");

            opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion) {
                case 1:
                    Calificaciones.obtenerNota(sc);
                    break;
                case 2:
                    Calificaciones.obtenerMedia();
                    break;
                case 3:
                    Calificaciones.mostrarCalificaciones();
                    break;
                case 4:
                    System.out.println("Saliendo del sistema..." +
                            "\nHasta luego!");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Opcion no valida");
                    break;
            }

        }

    }
}
