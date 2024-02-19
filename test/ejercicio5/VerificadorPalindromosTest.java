package ejercicio5;

import static org.junit.jupiter.api.Assertions.*;

class VerificadorPalindromosTest {

    @org.junit.jupiter.api.Test
     void Test(){
        VerificadorPalindromos verificador = new VerificadorPalindromos();
        assertTrue(verificador.esPalindromo("oso"));
        assertTrue(verificador.esPalindromo("reconocer"));
        assertFalse(verificador.esPalindromo("anita lava la tina"));
        assertFalse(verificador.esPalindromo("hola"));
        assertFalse(verificador.esPalindromo("mundo"));
    }

}