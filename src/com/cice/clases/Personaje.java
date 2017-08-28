/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cice.clases;

/**
 *
 * @author Alicia
 */
public class Personaje {
    String nombre;
    int vida;
    boolean haceMagia;
    
    public void saludar(){
        System.out.println("Hola me llamo "+ nombre);
    }
    public void caminar(){
        System.out.println("Estoy caminando");
    }
    public void detenerse(){
        System.out.println("Ok, me detengo...");
    }
    public void correr(){
        System.out.println("Voy corriendo!!..");
    }
    public void saltar(){
        System.out.println("Que alto salto!!..");
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public boolean isHaceMagia() {
        return haceMagia;
    }

    public void setHaceMagia(boolean haceMagia) {
        this.haceMagia = haceMagia;
    }
    
}
