/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.susana.LogicaNegocio;

import com.susana.DAO.*;
import com.susana.Entidades.Parte;
import com.susana.Entidades.Viaje;
import java.sql.Date;
import java.sql.Time;
import java.time.LocalDate;
import java.util.List;

/**
 *
 * @author acer
 */
//GESTIONA TODO LO REFERENTE A LINEA DE NEGOCIO DE VIAJES, SEPARANDO EL CÓDIGO POR RESPONSABILIDADES
//TODO: VIAJES
public class ViajesLN {
    ViajesDAO vdao =new ViajesDAO();
    

    public String getSumaHorasViajes(LocalDate fechaParte) {
        long t=vdao.sumarHorasParte(fechaParte);
        return String.valueOf(t);
    }
    

    public Integer insertarDatos(Viaje v) throws ClassNotFoundException {
        return vdao.insertarDatos(v);
    }

    public void actualizarDatos(Viaje v) throws ClassNotFoundException {
        vdao.actualizarDatos(v);
    }
    public void borrarDatos (Viaje v) throws ClassNotFoundException{
        vdao.borrarDatos(v);
    }
    public List<Viaje> listarDatos (Viaje v) throws ClassNotFoundException{
        return vdao.listarDatos(v);
    }    
    
}
