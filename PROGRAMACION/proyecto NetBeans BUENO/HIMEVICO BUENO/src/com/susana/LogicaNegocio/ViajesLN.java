/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.susana.LogicaNegocio;

import com.susana.DAO.*;
import com.susana.Entidades.Parte;
import java.sql.Date;
import java.sql.Time;

/**
 *
 * @author acer
 */
public class ViajesLN {
    ViajesDAO vdao =new ViajesDAO();
    
    public void insertarDatos (Parte p){
        vdao.insertarDatos(p);    
    }
    public void actualizarDatos (Parte p){
        vdao.actualizarDatos(p);
    }
    public void borrarDatos (Parte p){
        vdao.borrarDatos(p);
    }
    public void listarDatos (Parte p){
        vdao.listarDatos(p);
    }    

   /* public String getSumaHorasViajes(String fechaParte) {
        Date fp=Date.valueOf(fechaParte);
        Time t=vdao.sumarHoras(fp);
        return t.toString();
    }
    */
    
}
