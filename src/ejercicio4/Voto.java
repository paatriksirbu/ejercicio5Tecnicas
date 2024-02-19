package ejercicio4;

public class Voto { // Clase que representa un voto
    private int codigoCandidato;
    private int cantidad;

    public Voto(int codigoCandidato) {
        this.codigoCandidato = codigoCandidato;
        this.cantidad = 1;
    }

    public int getCodigoCandidato() {
        return codigoCandidato;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void incrementarCantidad() { // Metodo para incrementar la cantidad de votos
        cantidad++;
    }
}
