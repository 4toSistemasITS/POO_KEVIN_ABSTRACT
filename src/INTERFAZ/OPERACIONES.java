/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package INTERFAZ;

import java.util.Scanner;

/**
 *
 * @author alexis
 */
public class OPERACIONES implements FIGURA_GEOMETRICA{
    double calculo,calculo2,perimetro,area;

    @Override
    public void cuadrado() {
        Scanner sc=new Scanner(System.in);
        System.out.printf("\nCUADRADO\nIngrese valor del lado: ");
        calculo=sc.nextInt();
        perimetro=calculo*4;
        area = (int) Math.pow(calculo, 2);
        System.out.println("El perimetro es = "+perimetro+"\nEl area es = "+area);
    }

    @Override
    public void rectangulo() {
        Scanner sc=new Scanner(System.in);
        Scanner sc2=new Scanner(System.in);
        
        System.out.printf("\nRECTANGULO\nIngrese valor de la base: ");
        calculo=sc.nextInt();
        System.out.printf("\nIngrese valor de la altura: ");
        calculo2=sc2.nextInt();
        perimetro=(calculo+calculo2)*2;
        area = calculo*calculo2;
        System.out.println("El perimetro es = "+perimetro+"\nEl area es = "+area);
    }

    @Override
    public void triangulo() {
        Scanner sc=new Scanner(System.in);
        Scanner sc2=new Scanner(System.in);
        
        System.out.printf("\nTRIANGULO EQUILATERO\nIngrese valor de un lado: ");
        calculo=sc.nextInt();
        
        perimetro=calculo*3;
        area = 0.43301270189*(int) Math.pow(calculo, 2);
        area = Math.rint(area*100)/100;
        System.out.println("El perimetro es = "+perimetro+"\nEl area es = "+area);

    }  
}
