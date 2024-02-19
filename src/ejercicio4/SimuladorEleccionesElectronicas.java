package ejercicio4;
import java.util.*;


public class SimuladorEleccionesElectronicas {

    // Metodo principal con menu donde se puede simular elecciones o salir del sistema
    public static void main(String[] args) {

        int opcion = 0;

        System.out.println("\nBienvenido al sistema de votaciones");

        while(opcion != 2) {    // Mientras la opcion no sea 2, se ejecuta el menu

            System.out.println("\nIntroduzca su eleccion: (1-2)");
            System.out.println("1. Simular elecciones");
            System.out.println("2. Salir");

            Scanner sc = new Scanner(System.in);
            opcion = sc.nextInt();
            sc.nextLine();
            // Se ejecuta la opcion seleccionada
            switch (opcion) {
                case 1:
                    VotacionElectronica votacion = new VotacionElectronica();
                    votacion.simularElecciones();
                    break;
                case 2:
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

