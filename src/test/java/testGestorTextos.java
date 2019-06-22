/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import gestorArchivos.GestorTextos;
import java.io.IOException;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;

/**
 *
 * @author nadie
 */
public class testGestorTextos {

    private GestorTextos gestor;

    @Before
    public void setUp() {
        gestor = new GestorTextos();
    }

    /**
     * Prueba el método leerTexto1 con un archivo que no existe.
     *
     * @throws IOException
     */
    @Test
    public void testTexto1() throws IOException {
        String resultado = gestor.leerTexto1("noExisto.txt");
        String resultadoEsperado = "nada";
        assertEquals(resultadoEsperado, resultado);
    }

    /**
     * Prueba el método leerTexto1 con un archivo que no existe.
     *
     * @throws IOException
     */
    @Test
    public void testTexto2() throws IOException {
        String resultado = gestor.leerTexto2("nada.txt");
        String resultadoEsperado = "nada";
        assertEquals(resultadoEsperado, resultado);
    }
}
