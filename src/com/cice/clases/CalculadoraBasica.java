/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cice.clases;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Alicia
 */
public class CalculadoraBasica {

    Scanner sc = new Scanner(System.in);
    int numA=0;
    int numB=0;
    //Funciones
    //1 Mostrar menu
    //2 Sumar
    //3 Restar
    //4 Multiplicar
    //5 Dividir
    public void mostrarMenu() {
        int opcion = 0;
        System.out.println("CALCULADORA BÁSICA");
        System.out.println("===================");
        do {
            System.out.println("1. Sumar");
            System.out.println("2. Restar");
            System.out.println("3. Multiplicar");
            System.out.println("4. Dividir");
            System.out.println("0. Salir");
            System.out.println("===================");
            System.out.print("Elige una opción ");
            try {
            opcion = sc.nextInt();
            
            switch (opcion) {
                case 1:
                    sumar();
                    break;
                case 2:
                    restar();
                    break;
                case 3:
                    multiplicar();
                    break;
                case 4:
                    dividir();
                    break;

                default:
                    if (opcion==0){
                        System.out.println("Adios");
                    } else {
                    System.out.println("La opción seleccionada no es válida");
                    }
            }
            } catch (InputMismatchException ime){
                System.out.println("Debe de introducir un número");
                sc.next();
                opcion=1;
            }

        } while (opcion != 0);
    }
    
    public void pedirDatos(){
        
         System.out.print("Introduce el primer número: ");
         numA=sc.nextInt();
         System.out.print("Introduce el segundo número: ");
         numB=sc.nextInt();
    
    }
    public void sumar() {
         pedirDatos();
         System.out.println("El resultado de la suma es:"+ (numA+numB));
    }
    public void restar(){
         pedirDatos();
         System.out.println("El resultado de la resta es: "+ (numA-numB));
        
    }
    
       public void multiplicar(){
         pedirDatos();
         System.out.println("El resultado de la multiplicación es: "+ (numA*numB));
        
    }
        
       public void dividir(){
        pedirDatos();
        System.out.println("El resultado de la división es: "+ (numA/numB));
        
    }
}
