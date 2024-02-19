package ejercicio10;
import java.util.HashMap;

public class RegistroEmpleados {

    private HashMap<String, Empleado> tablaNombre;
    private HashMap<Integer, Empleado> tablaNumEmpleado;
    private HashMap<String, Empleado> tablaNumSS;

    public RegistroEmpleados() {    // Constructor
        tablaNombre = new HashMap<String, Empleado>();
        tablaNumEmpleado = new HashMap<Integer, Empleado>();
        tablaNumSS = new HashMap<String, Empleado>();
    }
    // Agregar empleado a las tablas
    public void agregarEmpleado(Empleado empleado) {
        if (!tablaNombre.containsKey(empleado.getNombre()) &&
                !tablaNumEmpleado.containsKey(empleado.getNumeroEmpleado()) &&
                !tablaNumSS.containsKey(empleado.getNumeroSeguridadSocial())) {
                tablaNombre.put(empleado.getNombre(), empleado);
                tablaNumEmpleado.put(empleado.getNumeroEmpleado(), empleado);
                tablaNumSS.put(empleado.getNumeroSeguridadSocial(), empleado);
        }
    }
    public Empleado buscarPorNombre(String nombre) {
        return tablaNombre.get(nombre);
    }

    public Empleado buscarPorNumEmpleado(int numEmpleado) {
        return tablaNumEmpleado.get(numEmpleado);
    }

    public Empleado buscarPorNumSS(String numSS) {
        return tablaNumSS.get(numSS);
    }

}