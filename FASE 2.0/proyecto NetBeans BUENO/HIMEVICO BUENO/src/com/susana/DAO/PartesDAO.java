/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.susana.DAO;

import com.susana.Entidades.Parte;
import com.susana.GUI.Login;
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
    public void insertarDatos(Parte p) {
        Connection cxn = null;
        PreparedStatement sentencia = null;
        boolean resp = true;
        try {

            cxn = conexion.getConexion();
            //cxn.setAutoCommit(false);
            String sql = "INSERT INTO  PARTE( NUM_PARTE, TRABAJADOR_USUARIO,  FECHA,  ESTADO, "
                    + "KM_PRINCIPIO, KM_FINAL,  GASTO_GASOIL, GASTO_AUTOPISTA,"
                    + "GASTO_DIETAS, GASTOS_VARIOS,  INCIDENCIAS, VALIDADO,   EXCESO "
                    + ") VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
            sentencia = cxn.prepareStatement(sql);
            sentencia.setString(1, null);
            sentencia.setString(2, p.getUsuario());
            sentencia.setDate(3, p.getFecha());
            sentencia.setString(4, p.getEstado());
            sentencia.setDouble(5, p.getKmPrincipio());
            sentencia.setDouble(6, p.getKmFinal());
            sentencia.setDouble(7, p.getGastoGasoil());
            sentencia.setDouble(8, p.getGastoAutopista());
            sentencia.setDouble(9, p.getGastoDietas());
            sentencia.setDouble(10, p.getGastosVarios());
            sentencia.setString(11, p.getIncidencias());
            sentencia.setString(12, p.getValidar());
            sentencia.setDouble(13, p.getExceso());
            int filas = sentencia.executeUpdate();
            if (filas == 1) {
                resp = true;
            } else {
                resp = false;
            }
            sentencia.close();
            cxn.close();

        } catch (SQLException ex) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
//TODO: UPDATE PARA ADMINISTRADOR ES modificarlo todo si no está validado
    //UPDATE PARA EL TRANSPORTISTA ES PONER EL ESTADO COMO CERRADO

    public void actualizarDatos(Parte p) {
        Connection cxn = null;
        PreparedStatement sentencia = null;
        boolean resp = true;
        try {
            /*
            "INSERT INTO  PARTE( NUM_PARTE, TRABAJADOR_USUARIO,  FECHA,  ESTADO, "
                    + "KM_PRINCIPIO, KM_FINAL,  GASTO_GASOIL, GASTO_AUTOPISTA,"
                    + "GASTO_DIETAS, GASTOS_VARIOS,  INCIDENCIAS, VALIDADO,   EXCESO "
                    + ") VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
             */
            cxn = conexion.getConexion();
            String sql = "UPDATE PARTE SET TRABAJADOR_USUARIO = ?, ESTADO = ?, KM_PRINCIPIO = ?, KM_FINAL = ?,GASTO_GASOIL=?,"
                    + " GASTO_AUTOPISTA=?, GASTO_DIETAS=?, GASTOS_VARIOS=?,"
                    + " INCIDENCIAS=?, VALIDADO=?, EXCESO=?  WHERE VALIDADO=?";
            sentencia = cxn.prepareStatement(sql);
            sentencia.setString(1, p.getUsuario());
            sentencia.setString(2, p.getEstado());
            sentencia.setDouble(3, p.getKmPrincipio());
            sentencia.setDouble(4, p.getKmFinal());
            sentencia.setDouble(5, p.getGastoGasoil());
            sentencia.setDouble(6, p.getGastoAutopista());
            sentencia.setDouble(7, p.getGastoDietas());
            sentencia.setDouble(8, p.getGastosVarios());
            sentencia.setString(9, p.getIncidencias());
            sentencia.setString(10, p.getValidar());
            sentencia.setDouble(11, p.getExceso());
            sentencia.setString(12, "NO");
            int filas = sentencia.executeUpdate();
            if (filas == 1) {
                resp = true;
            } else {
                resp = false;
            }
            sentencia.close();
            cxn.close();

        } catch (SQLException ex) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    //cxn.setAutoCommit(false);
    /*   String sql = "UPDATE INTO  PARTE( TRABAJADOR_USUARIO,  FECHA,  ESTADO, "
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
        } */

    //TODO: DELETE
    public void borrarDatos(Parte p) {
        Connection cxn = null;
        PreparedStatement sentencia = null;
        boolean resp = true;
        try {
            /*
              String sql = "DELETE FROM CENTRO WHERE NOMBRE=?";
            PreparedStatement sentencia = conexion.prepareStatement(sql);
            sentencia.setString(1, jTextField1inserNombreCentro.getText());
             */

            cxn = conexion.getConexion();
            //cxn.setAutoCommit(false);
            String sql = "DELETE FROM PARTE WHERE NUM_PARTE = ? AND ESTADO = ?; ";
            sentencia = cxn.prepareStatement(sql);
            sentencia.setInt(1, p.getNumParte());
            sentencia.setString(2, "CERRADO");
            sentencia.setString(2, p.getEstado());
            sentencia.setDouble(3, p.getKmPrincipio());
            sentencia.setDouble(4, p.getKmFinal());
            sentencia.setDouble(5, p.getGastoGasoil());
            sentencia.setDouble(6, p.getGastoAutopista());
            sentencia.setDouble(7, p.getGastoDietas());
            sentencia.setDouble(8, p.getGastosVarios());
            sentencia.setString(9, p.getIncidencias());
            sentencia.setString(10, p.getValidar());
            sentencia.setDouble(11, p.getExceso());
            sentencia.setString(12, "NO");
            int filas = sentencia.executeUpdate();
            if (filas == 1) {
                resp = true;
            } else {
                resp = false;
            }
            sentencia.close();
            cxn.close();

        } catch (SQLException ex) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
        }

    }    //TODO: SELECT

    public void listarDatos(Parte p) {
 Connection cxn = null;
        PreparedStatement sentencia = null;
        boolean resp = true;
        try {

            cxn = conexion.getConexion();
            //cxn.setAutoCommit(false);
            String sql = "select INTO  PARTE( NUM_PARTE, TRABAJADOR_USUARIO,  FECHA,  ESTADO, "
                    + "KM_PRINCIPIO, KM_FINAL,  GASTO_GASOIL, GASTO_AUTOPISTA,"
                    + "GASTO_DIETAS, GASTOS_VARIOS,  INCIDENCIAS, VALIDADO,   EXCESO "
                    + ") VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
            sentencia = cxn.prepareStatement(sql);
            sentencia.setString(1, null);
            sentencia.setString(2, p.getUsuario());
            sentencia.setDate(3, p.getFecha());
            sentencia.setString(4, p.getEstado());
            sentencia.setDouble(5, p.getKmPrincipio());
            sentencia.setDouble(6, p.getKmFinal());
            sentencia.setDouble(7, p.getGastoGasoil());
            sentencia.setDouble(8, p.getGastoAutopista());
            sentencia.setDouble(9, p.getGastoDietas());
            sentencia.setDouble(10, p.getGastosVarios());
            sentencia.setString(11, p.getIncidencias());
            sentencia.setString(12, p.getValidar());
            sentencia.setDouble(13, p.getExceso());
            int filas = sentencia.executeUpdate();
            if (filas == 1) {
                resp = true;
            } else {
                resp = false;
            }
            sentencia.close();
            cxn.close();

        } catch (SQLException ex) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
    

}
