/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cice.clases;

import java.util.Scanner;

/**
 *
 * @author cice
 */
public class Main {
    
    public static void main(String[] args) {
      
        //int suma;
        Scanner sc =new Scanner(System.in);
        System.out.println("Ingrese un número");
        int numero1=sc.nextInt();
        System.out.println("length " + args.length);
       int  suma = Calculadora.suma(numero1,Integer.parseInt(args[1]));
        System.out.println("El resultado es: " +suma);
        Calculadora cal =new Calculadora();
        System.out.println(cal.resta(4, 2));
    }
    
}
