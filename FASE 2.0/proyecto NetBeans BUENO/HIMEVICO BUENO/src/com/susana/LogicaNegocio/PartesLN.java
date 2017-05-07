/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.susana.LogicaNegocio;

import com.susana.DAO.*;
import com.susana.Entidades.Parte;

/**
 *
 * @author acer
 */
public class PartesLN {
    PartesDAO pdao =new PartesDAO();
    
    public void insertarDatos (Parte p){
        pdao.insertarDatos(p);    
    }
    public void actualizarDatos (Parte p){
        pdao.actualizarDatos(p);
    }
    public void borrarDatos (Parte p){
        pdao.borrarDatos(p);
    }
    public void listarDatos (Parte p){
        pdao.listarDatos(p);
    }    

  /*  public String getSumaHorasViajes(String fechaParte) {
        ViajesLN vln= new ViajesLN();
        return vln.getSumaHorasViajes(fechaParte);
    }
    */
}
