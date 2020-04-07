
package com.com470.p5app.service;

import java.util.List;
import org.assertj.core.util.Arrays;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;

@RunWith(Parameterized.class)
public class UtilidadesDosTest {
    
    @Parameterized.Parameters
    public static List<Object> datos() {
        //devolvera una lista
        return Arrays.asList(new Object[][]{
            {"a","b","c"},{"d","e","f"},{"g","h","i"}
        });
    }
    //USO DE ANOTACIONES
    @Parameter(0)
    public String valor1;
    @Parameter(1)
    public String valor2;
    @Parameter(2)
    public String valor3;
    Utilidades utils = new Utilidades();
    
    @Test
    public void testConcatenar() {
        System.out.println("Ejecucion son:"+valor1+" "+valor2+" "+valor3);
        String resultado = utils.concatenar(valor1, valor2, valor3);
        assertEquals(valor1+" "+valor2+" "+valor3, resultado);
    }
}
