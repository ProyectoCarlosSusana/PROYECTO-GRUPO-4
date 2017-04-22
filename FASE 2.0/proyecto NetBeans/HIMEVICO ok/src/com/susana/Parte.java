/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.susana;

/**
 *
 * @author acer
 */
public class Parte {
   private int kmPrincipio;
   private int kmFinal;
   private String fecha;
   private boolean estado;
   private int gastoGasoil;
   private int gastoAutopista;
   private int gastoDietas;
   private int gastosVarios;
   private String incidencias;
   private boolean validar;

    public Parte() {
    }

    public Parte(int kmPrincipio, int kmFinal, String fecha, boolean estado, int gastoGasoil, int gastoAutopista, int gastoDietas, int gastosVarios, String incidencias, boolean validar) {
        this.kmPrincipio = kmPrincipio;
        this.kmFinal = kmFinal;
        this.fecha = fecha;
        this.estado = estado;
        this.gastoGasoil = gastoGasoil;
        this.gastoAutopista = gastoAutopista;
        this.gastoDietas = gastoDietas;
        this.gastosVarios = gastosVarios;
        this.incidencias = incidencias;
        this.validar = validar;
    }
    
    //metodos listado partes, modificar parte, validar parte, listar partes abiertos, validar parte exceso, total horas parte?

    public int getKmPrincipio() {
        return kmPrincipio;
    }

    public void setKmPrincipio(int kmPrincipio) {
        this.kmPrincipio = kmPrincipio;
    }

    public int getKmFinal() {
        return kmFinal;
    }

    public void setKmFinal(int kmFinal) {
        this.kmFinal = kmFinal;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public boolean getEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public int getGastoGasoil() {
        return gastoGasoil;
    }

    public void setGastoGasoil(int gastoGasoil) {
        this.gastoGasoil = gastoGasoil;
    }

    public int getGastoAutopista() {
        return gastoAutopista;
    }

    public void setGastoAutopista(int gastoAutopista) {
        this.gastoAutopista = gastoAutopista;
    }

    public int getGastoDietas() {
        return gastoDietas;
    }

    public void setGastoDietas(int gastoDietas) {
        this.gastoDietas = gastoDietas;
    }

    public int getGastosVarios() {
        return gastosVarios;
    }

    public void setGastosVarios(int gastosVarios) {
        this.gastosVarios = gastosVarios;
    }

    public String getIncidencias() {
        return incidencias;
    }

    public void setIncidencias(String incidencias) {
        this.incidencias = incidencias;
    }

    public boolean isValidar() {
        return validar;
    }

    public void setValidar(boolean validar) {
        this.validar = validar;
    }
    
    
   
   
   
    
    
}
