
package com.com470.p5app.service;


public class Utilidades {
    public String concatenar(String uno,String dos,String tres){
        if (uno!=null && dos!=null && tres!=null) {
            return uno.concat(" ").concat(dos).concat(" ").concat(tres);
        }
        return null;
    }
    public int sumaNumeros(int a, int b){
    return a+b;
    }
}
