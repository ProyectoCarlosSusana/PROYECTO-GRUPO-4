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
import java.sql.ResultSet;
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
    public Integer insertarDatos(Parte p) {
        Connection cxn = null;
        PreparedStatement sentencia = null;
        Integer resp = null;
        try {
            ConexionTest.conectar();
            cxn = conexion.getConexion();
            //cxn.setAutoCommit(false);
            String sql = "INSERT INTO  PARTE( NUM_PARTE, TRABAJADOR_USUARIO,  FECHA,  ESTADO, "
                    + "KM_PRINCIPIO, KM_FINAL,  GASTO_GASOIL, GASTO_AUTOPISTA,"
                    + "GASTO_DIETAS, GASTOS_VARIOS,  INCIDENCIAS, VALIDADO,   EXCESO "
                    + ") VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
            sentencia = cxn.prepareStatement(sql, new String[]{"NUM_PARTE"});
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

                ResultSet rs = sentencia.getGeneratedKeys();
                while (rs.next()) {
                    resp = rs.getInt(1);
                }
            } else {
                resp = null;
            }
            sentencia.close();
            cxn.close();

        } catch (SQLException ex) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(PartesDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return resp;
    }
//TODO: UPDATE PARA ADMINISTRADOR ES modificarlo todo si no está validado
    //UPDATE PARA EL TRANSPORTISTA ES PONER EL ESTADO COMO CERRADO

    public void actualizarDatos(Parte p) {
        Connection cxn = null;
        PreparedStatement sentencia = null;
        boolean resp = true;
        try {
            ConexionTest.conectar();
            cxn = conexion.getConexion();
            String sql = "UPDATE PARTE SET TRABAJADOR_USUARIO = ?, ESTADO = ?, KM_PRINCIPIO = ?, KM_FINAL = ?,GASTO_GASOIL=?,"
                    + " GASTO_AUTOPISTA=?, GASTO_DIETAS=?, GASTOS_VARIOS=?,"
                    + " INCIDENCIAS=?, VALIDADO=?, EXCESO=?  WHERE NUM_PARTE=?";
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
            sentencia.setInt(12, p.getNumParte());
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
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(PartesDAO.class.getName()).log(Level.SEVERE, null, ex);
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
    public void borrarParteCerrado(Parte p) {
        Connection cxn = null;
        PreparedStatement sentencia = null;
        boolean resp = true;
        try {
            /*
              String sql = "DELETE FROM CENTRO WHERE NOMBRE=?";
            PreparedStatement sentencia = conexion.prepareStatement(sql);
            sentencia.setString(1, jTextField1inserNombreCentro.getText());
             */
            ConexionTest.conectar();
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
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(PartesDAO.class.getName()).log(Level.SEVERE, null, ex);
        }

    }    //TODO: SELECT

    public void listarDatos(Parte p) {
        Connection cxn = null;
        PreparedStatement sentencia = null;
        boolean resp = true;
        try {
            ConexionTest.conectar();
            cxn = conexion.getConexion();
            //cxn.setAutoCommit(false);
            String sql = "select NUM_PARTE, TRABAJADOR_USUARIO,  FECHA,  ESTADO, "
                    + "KM_PRINCIPIO, KM_FINAL,  GASTO_GASOIL, GASTO_AUTOPISTA,"
                    + "GASTO_DIETAS, GASTOS_VARIOS,  INCIDENCIAS, VALIDADO,   EXCESO "
                    + " from PARTE where ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
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
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(PartesDAO.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public void borrarDatos(Parte p) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public Parte listarParteAbierto(Parte p) {
        Connection cxn = null;
        PreparedStatement sentencia = null;
        Parte resp = null;
        try {
            ConexionTest.conectar();
            cxn = conexion.getConexion();
            //cxn.setAutoCommit(false);
            String sql = "select NUM_PARTE, TRABAJADOR_USUARIO,  FECHA,  ESTADO, "
                    + "KM_PRINCIPIO, KM_FINAL,  GASTO_GASOIL, GASTO_AUTOPISTA,"
                    + "GASTO_DIETAS, GASTOS_VARIOS,  INCIDENCIAS, VALIDADO,   EXCESO "
                    + " from PARTE where TRABAJADOR_USUARIO=? and rownum<=1 order by NUM_PARTE DESC";
            sentencia = cxn.prepareStatement(sql);
            sentencia.setString(1, p.getUsuario());

            ResultSet rs = sentencia.executeQuery();
            if (rs != null) {
                rs.next();
                resp=new Parte();
                resp.setNumParte(rs.getInt(1));
                resp.setUsuario(rs.getString(2));
                resp.setFecha(rs.getDate(3));
                resp.setEstado(rs.getString(4));
                resp.setKmPrincipio(rs.getDouble(5));
                resp.setKmFinal(rs.getDouble(6));
                resp.setGastoGasoil(rs.getDouble(7));
                resp.setGastoAutopista(rs.getDouble(8));
                resp.setGastoDietas(rs.getDouble(9));
                resp.setGastosVarios(rs.getDouble(10));
                resp.setIncidencias(rs.getString(11));
                resp.setValidar(rs.getString(12));
                resp.setExceso(rs.getDouble(13));
            } else {
                resp = null;
            }
            sentencia.close();
            cxn.close();

        } catch (SQLException ex) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(PartesDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return resp;
    }

}
