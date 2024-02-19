package ejercicio10;

public class SistemaBusquedaEmpleados {
    public static void main(String[] args) {
        RegistroEmpleados registro = new RegistroEmpleados();

        // Crear y agregar empleados al registro
        registro.agregarEmpleado(new Empleado("Patrik Sirbu", 1, "SSN123"));
        registro.agregarEmpleado(new Empleado("Pedro Tapia", 2, "SSN456"));
        registro.agregarEmpleado(new Empleado("Cristina Alvarez", 3, "SSN789"));

        // Buscar empleados por nombre, número de empleado y número de SS
        System.out.println("Buscar por nombre: Patrik Sirbu");
        Empleado resultadoNombre = registro.buscarPorNombre("Patrik Sirbu");
        if (resultadoNombre != null) {
            System.out.println("Encontrado: " + resultadoNombre.getNombre());
        } else {
            System.out.println("Empleado no encontrado");
        }

        System.out.println("Buscar por número de empleado: 2");
        Empleado resultadoNumEmpleado = registro.buscarPorNumEmpleado(2);
        if (resultadoNumEmpleado != null) {
            System.out.println("Encontrado: " + resultadoNumEmpleado.getNombre());
        } else {
            System.out.println("Empleado no encontrado");
        }

        System.out.println("Buscar por número de SS: SSN789");
        Empleado resultadoNumSS = registro.buscarPorNumSS("SSN789");
        if (resultadoNumSS != null) {
            System.out.println("Encontrado: " + resultadoNumSS.getNombre());
        } else {
            System.out.println("Empleado no encontrado");
        }
    }
}

