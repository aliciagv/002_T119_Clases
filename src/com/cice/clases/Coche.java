/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cice.clases;

import java.util.Date;

/**
 *
 * @author cice
 */
public  class Coche {
    
    //atributos o variables
    private String modelo;
    private String color;
    private String matricula;
    private String bastidor;
    private int potencia;
    private Date fechaMatriculacion;
    private boolean esAndando;
    private boolean esEncendido;
    
    
    // constructora OHL
    
    public Coche(){}
    
    public Coche(String modelo, String color, String matricula, String bastidor, int potencia, Date fechaMatriculacion){
     this.modelo=modelo;
     this.color=color;
     this.matricula=matricula;
     this.bastidor=bastidor;
     this.potencia=potencia;
     this.fechaMatriculacion=fechaMatriculacion;
     
    }
    
    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getBastidor() {
        return bastidor;
    }

    public void setBastidor(String bastidor) {
        this.bastidor = bastidor;
    }

    public int getPotencia() {
        return potencia;
    }

    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }

    public Date getFechaMatriculacion() {
        return fechaMatriculacion;
    }

    public void setFechaMatriculacion(Date fechaMatriculacion) {
        this.fechaMatriculacion = fechaMatriculacion;
    }

    public boolean isEsAndando() {
        return esAndando;
    }

    public void setEsAndando(boolean esAndando) {
        this.esAndando = esAndando;
    }

    public boolean isEsEncendido() {
        return esEncendido;
    }

    public void setEsEncendido(boolean esEncendido) {
        this.esEncendido = esEncendido;
    }
    
    //funciones
    void acelerar(){
        System.out.println("Estoy acelerando");
        
    
        
    }
    
    void frenar(){
        System.out.println("Estoy frenando");
        
    
    }
    
    void arrancar(){
        System.out.println("Estoy arrancando");
    }
    
    void apagar(){
        System.out.println("Ya me apago...");

    }
    
    
    
}
