package ejercicio4;
import java.util.*;

public class VotacionElectronica {
    private final int codigoEspecial = 68753421;
    private GestorVotos gestorVotos = new GestorVotos();

    // Metodo para simular elecciones
    public void simularElecciones(){
        Scanner sc = new Scanner(System.in);
        int codigoCandidato;

        System.out.println("Introduzca el código de candidato: (Introduzca " + codigoEspecial + " para finalizar)");
        while(true){
            try {   // Se captura la excepcion en caso de que el usuario introduzca un valor no numerico
                codigoCandidato = sc.nextInt();
                if (codigoCandidato == codigoEspecial) {
                    break;
                }
                gestorVotos.registrarVoto(codigoCandidato);
                gestorVotos.mostrarVotos();
            } catch (InputMismatchException e) {
                System.out.println("El código de candidato debe ser un número entero");
                sc.next();
            }
        }

    }
}

