/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.susana.DAO;

import com.susana.Entidades.Parte;
import com.susana.Login;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author acer
 */
public class PartesDAO {
    ConexionTest conexion = new ConexionTest();
    
    
    //TODO: INSERT
    public void insertarDatos (Parte p){
        Connection cxn=null;
        PreparedStatement sentencia=null;
        boolean resp=true;
        try {
            
            cxn = conexion.getConexion();
            //cxn.setAutoCommit(false);
            String sql = "INSERT INTO  PARTE( TRABAJADOR_USUARIO,  FECHA,  ESTADO, "
                    + "KM_PRINCIPIO, KM_FINAL,  GASTO_GASOIL, GASTO_AUTOPISTA,"
                    + "GASTO_DIETAS, GASTOS_VARIOS,  INCIDENCIAS, VALIDADO,   EXCESO "
                    + ") VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
            sentencia = cxn.prepareStatement(sql);
            sentencia.setString(1, p.getUsuario());
            sentencia.setDate(2, p.getFecha());
            sentencia.setString(3, p.getEstado());
            sentencia.setDouble(4, p.getKmPrincipio());
            sentencia.setDouble(5, p.getKmFinal());
            sentencia.setDouble(6, p.getGastoGasoil());
            sentencia.setDouble(7, p.getGastoAutopista());
            sentencia.setDouble(8, p.getGastoDietas());
            sentencia.setDouble(9, p.getGastosVarios());
            sentencia.setString(10, p.getIncidencias());
            sentencia.setString(11, p.getValidar());
            sentencia.setDouble(12, p.getExceso());
            int filas = sentencia.executeUpdate();
            if (filas == 1) {
                resp=true;
            } else {
                resp=false;
            }
            sentencia.close();
            cxn.close();
         
        } catch (SQLException ex) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
        } 
    
    }
//TODO: UPDATE PARA ADMINISTRADOR ES PONER VALIDADO A SI O NO
    //UPDATE PARA EL TRANSPORTISTA ES PONER EL ESTADO COMO CERRADO
    public void actualizarDatos (Parte p){
    Connection cxn=null;
        PreparedStatement sentencia=null;
        boolean resp=true;
        try {
            
            cxn = conexion.getConexion();
            //cxn.setAutoCommit(false);
            String sql = "UPDATE INTO  PARTE( TRABAJADOR_USUARIO,  FECHA,  ESTADO, "
                    + "KM_PRINCIPIO, KM_FINAL,  GASTO_GASOIL, GASTO_AUTOPISTA,"
                    + "GASTO_DIETAS, GASTOS_VARIOS,  INCIDENCIAS, VALIDADO,   EXCESO "
                    + ") VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
            sentencia = cxn.prepareStatement(sql);
            sentencia.setString(1, p.getUsuario());
            sentencia.setDate(2, p.getFecha());
            sentencia.setString(3, p.getEstado());
            sentencia.setDouble(4, p.getKmPrincipio());
            sentencia.setDouble(5, p.getKmFinal());
            sentencia.setDouble(6, p.getGastoGasoil());
            sentencia.setDouble(7, p.getGastoAutopista());
            sentencia.setDouble(8, p.getGastoDietas());
            sentencia.setDouble(9, p.getGastosVarios());
            sentencia.setString(10, p.getIncidencias());
            sentencia.setString(11, p.getValidar());
            sentencia.setDouble(12, p.getExceso());
            int filas = sentencia.executeUpdate();
            if (filas == 1) {
                resp=true;
            } else {
                resp=false;
            }
            sentencia.close();
            cxn.close();
         
        } catch (SQLException ex) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
        } 
        
        
    
    }    //TODO: DELETE
public void borrarDatos (Parte p){
    Connection cxn=null;
        PreparedStatement sentencia=null;
        boolean resp=true;
        try {
            
            cxn = conexion.getConexion();
            //cxn.setAutoCommit(false);
            String sql = "DELETE FROM PARTE( TRABAJADOR_USUARIO,  FECHA,  ESTADO, "
                    + "KM_PRINCIPIO, KM_FINAL,  GASTO_GASOIL, GASTO_AUTOPISTA,"
                    + "GASTO_DIETAS, GASTOS_VARIOS,  INCIDENCIAS, VALIDADO,   EXCESO "
                    + ") VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
            sentencia = cxn.prepareStatement(sql);
            sentencia.setString(1, p.getUsuario());
            sentencia.setDate(2, p.getFecha());
            sentencia.setString(3, p.getEstado());
            sentencia.setDouble(4, p.getKmPrincipio());
            sentencia.setDouble(5, p.getKmFinal());
            sentencia.setDouble(6, p.getGastoGasoil());
            sentencia.setDouble(7, p.getGastoAutopista());
            sentencia.setDouble(8, p.getGastoDietas());
            sentencia.setDouble(9, p.getGastosVarios());
            sentencia.setString(10, p.getIncidencias());
            sentencia.setString(11, p.getValidar());
            sentencia.setDouble(12, p.getExceso());
            int filas = sentencia.executeUpdate();
            if (filas == 1) {
                resp=true;
            } else {
                resp=false;
            }
            sentencia.close();
            cxn.close();
         
        } catch (SQLException ex) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
        } 
        
        
    
    }    //TODO: SELECT
public void listarDatos (Parte p){
    
        
        
    
    }    
    
}
