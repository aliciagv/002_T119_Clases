/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cice.principal;

import com.cice.clases.Personaje;

/**
 *
 * @author Alicia
 */
public class PrincipalPersonaje {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Personaje personaje= new Personaje();
        personaje.setNombre("Alfred");
        personaje.saludar();
        
        personaje.caminar();
        personaje.correr();
        personaje.detenerse();
        personaje.saltar();
    }
    
}
