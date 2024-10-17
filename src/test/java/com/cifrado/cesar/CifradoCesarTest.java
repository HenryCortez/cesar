package com.cifrado.cesar;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


public class CifradoCesarTest {
     @Test
    public void testCifrar() {
        CifradoCesar cesar = new CifradoCesar();
        String resultado = cesar.cifrar("Hola Mundo", 3);
        assertEquals("Krod Pxqgr", resultado); // Verificar si el cifrado es correcto
    }

    @Test
    public void testDescifrar() {
        CifradoCesar cesar = new CifradoCesar();
        String resultado = cesar.descifrar("Krod Pxqgr", 3);
        assertEquals("Hola Mundo", resultado); // Verificar si el descifrado es correcto
    }

    @Test
    public void testCifrarConSimbolos() {
        CifradoCesar cesar = new CifradoCesar();
        String resultado = cesar.cifrar("¡Hola, Mundo!", 5);
        assertEquals("¡Mtqf, Rzsit!", resultado); // Prueba con símbolos y caracteres especiales
    }

    @Test
    public void testCifrarConNumeros() {
        CifradoCesar cesar = new CifradoCesar();
        String resultado = cesar.cifrar("123 Hola", 1);
        assertEquals("123 Ipmb", resultado); // Verificar que los números no se cifran
    }
}
