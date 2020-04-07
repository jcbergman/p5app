
package com.com470.p5app.service;

import java.util.List;
import org.assertj.core.util.Arrays;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;
@RunWith(Parameterized.class)
public class UtilidadesTest {
    
    @Parameters
    public static List<Object> datos() {
        //devolvera una lista
        return Arrays.asList(new Object[][]{
            {1, 2}, {3, 5}, {0, 4}, {1, 3}
        });
    }
    int v1;
    int v2;
//CONSTRUCTOR
    public UtilidadesTest(int valor1, int valor2) {
        v1 = valor1;
        v2 = valor2;
    }
    Utilidades utils = new Utilidades();
    
    @Test
    public void testSumaNumeros() {
        System.out.println("Los parametros son v1="+v1+" v2="+v2);
        int resultado = utils.sumaNumeros(v1, v2);
        assertEquals(v1+v2, resultado);
        
    }
    
}
