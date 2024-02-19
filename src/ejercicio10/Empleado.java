package ejercicio10;

public class Empleado {
    private String nombre;
    private int numeroEmpleado;
    private String numeroSeguridadSocial;

    public Empleado(String nombre, int numeroEmpleado, String numeroSeguridadSocial) {
        this.nombre = nombre;
        this.numeroEmpleado = numeroEmpleado;
        this.numeroSeguridadSocial = numeroSeguridadSocial;
    }

    public String getNombre() {
        return nombre;
    }

    public int getNumeroEmpleado() {
        return numeroEmpleado;
    }

    public String getNumeroSeguridadSocial() {
        return numeroSeguridadSocial;
    }
}
