/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package INTERFAZ;

/**
 *
 * @author ITFNSR_4
 */
public class CUADRADO implements FIGURA_GEOMETRICA{

    @Override
    public double area() {
         return 16;  
    }

    @Override
    public double perimetro(int valor) {
        return 16*2;
    }
    
}
