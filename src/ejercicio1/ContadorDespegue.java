package ejercicio1;
import java.util.*;

public class ContadorDespegue {

    public static void main(String[] args) {

        System.out.println("Esta listo para iniciar el despegue? (y/n)");
        char respuesta = 'y'; //Variable para almacenar la respuesta del usuario
        Scanner sc = new Scanner(System.in); //Se crea un objeto Scanner para leer la respuesta del usuario
        respuesta = sc.next().charAt(0); //Se lee la respuesta del usuario
        if (respuesta == 'y') { //Si la respuesta es 'y' se ejecuta el metodo cuentaAtrasLanzamiento
            cuentaAtrasLanzamiento();
        } else {
            System.out.println("Despegue cancelado");
        }
    }
    public static void cuentaAtrasLanzamiento() {
        for (int i = 10; i > 0; i--) {  //Bucle for para hacer una cuenta regresiva
            System.out.println(i);
        }
        System.out.println("Despegue!");
    }
}


