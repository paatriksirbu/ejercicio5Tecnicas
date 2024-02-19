package ejercicio4;
import java.util.*;
import java.util.HashMap;
import java.util.Map;


public class GestorVotos {  // Clase que gestiona los votos

    private Map<Integer, Voto> votos;   // Mapa que almacena los votos

    public GestorVotos(){
        this.votos = new HashMap<>();
    }

    public void registrarVoto(int codigoCandidato){ // Metodo para registrar un voto

            if (votos.containsKey(codigoCandidato)) {
                votos.get(codigoCandidato).incrementarCantidad();
            } else{
                votos.put(codigoCandidato, new Voto(codigoCandidato));
            }
    }

    public void mostrarVotos(){ // Metodo para mostrar los votos registrados
        if (votos.isEmpty()) {
            System.out.println("No se han registrado votos");
            return;
        }

        for (Voto voto : votos.values()) {
            System.out.println("Candidato: " + voto.getCodigoCandidato() + "," +  " Cantidad: " + voto.getCantidad());
        }
    }
}
