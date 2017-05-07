/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.susana.Entidades;

import com.susana.Entidades.Parte;
import java.sql.Date;

/**
 *
 * @author acer
 */


public class Viaje {
    
    private String usuario;
    private int idViaje;
    private double horaSalida;
    private double horaLlegada;
    private double totalHorasViaje;
    private String matricula;
   private Date fecha;
    
    
    //metodo total horas viajes (idViaje, usuario, fechaParte)?
    private Parte parte;
    private Vehiculo vehiculo;
    private Trabajador trabajador;

    public Viaje() {
    }

    public Viaje(String usuario, int idViaje, double horaSalida, double horaLlegada, double totalHorasViaje, String matricula, Date fecha, Parte parte, Vehiculo vehiculo, Trabajador trabajador) {
        this.usuario = usuario;
        this.idViaje = idViaje;
        this.horaSalida = horaSalida;
        this.horaLlegada = horaLlegada;
        this.totalHorasViaje = totalHorasViaje;
        this.matricula = matricula;
        this.fecha = fecha;
        this.parte = parte;
        this.vehiculo = vehiculo;
        this.trabajador = trabajador;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public int getIdViaje() {
        return idViaje;
    }

    public void setIdViaje(int idViaje) {
        this.idViaje = idViaje;
    }

    public double getHoraSalida() {
        return horaSalida;
    }

    public void setHoraSalida(double horaSalida) {
        this.horaSalida = horaSalida;
    }

    public double getHoraLlegada() {
        return horaLlegada;
    }

    public void setHoraLlegada(double horaLlegada) {
        this.horaLlegada = horaLlegada;
    }

    public double getTotalHorasViaje() {
        return totalHorasViaje;
    }

    public void setTotalHorasViaje(double totalHorasViaje) {
        this.totalHorasViaje = totalHorasViaje;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Parte getParte() {
        return parte;
    }

    public void setParte(Parte parte) {
        this.parte = parte;
    }

    public Vehiculo getVehiculo() {
        return vehiculo;
    }

    public void setVehiculo(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }

    public Trabajador getTrabajador() {
        return trabajador;
    }

    public void setTrabajador(Trabajador trabajador) {
        this.trabajador = trabajador;
    }

    
    
    
}
