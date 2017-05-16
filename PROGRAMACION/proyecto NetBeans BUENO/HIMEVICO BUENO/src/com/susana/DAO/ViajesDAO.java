/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.susana.DAO;

import com.susana.Entidades.Viaje;
import com.susana.GUI.Login;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Time;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import oracle.jdbc.OracleTypes;

/**
 *
 * @author acer
 */
public class ViajesDAO {

    ConexionTest conexion = new ConexionTest();
//GESTIONA EN LA BASE DE DATOS TODO LO REFERENTE A VIAJES, SEPARANDO EL CÓDIGO POR RESPONSABILIDADES

    public Integer insertarDatos(Viaje v) throws ClassNotFoundException {
        Connection cxn = null;
        PreparedStatement sentencia = null;
        Integer resp = null;
        try {
            ConexionTest.conectar();
            cxn = conexion.getConexion();
            String sql = "INSERT INTO  VIAJE  VALUES (?, ?, ?, ?, ?, ?, ?)";
            sentencia = cxn.prepareStatement(sql);
     //    sentencia = cxn.prepareStatement(sql, new String[]{"ID_VIAJE"});

       //     sentencia.setNull(1, java.sql.Types.INTEGER);
            //conversión tipo para que la base de datos lo entienda.
            sentencia.setString(1, null);
            sentencia.setDate(2, Date.valueOf(v.getFecha()));
            sentencia.setTime(3, Time.valueOf(v.getHoraSalida()));
            sentencia.setTime(4, Time.valueOf(v.getHoraLlegada()));
            sentencia.setString(5, v.getMatricula());
            sentencia.setInt(6, v.getNumParte());
            sentencia.setString(7, v.getUsuario());
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
        }
        return resp;
    }

    public void actualizarDatos(Viaje v) throws ClassNotFoundException {
        Connection cxn = null;
        PreparedStatement sentencia = null;
        boolean resp = true;
        try {
            ConexionTest.conectar();
            cxn = conexion.getConexion();
            String sql = "UPDATE VIAJE SET HORA_SALIDA = ?, HORA_LLEGADA = ?,"
                    + " VEHICULO_MATRICULA = ?, PARTE_NUM_PARTE=?,"
                    + " USUARIO=?, FECHA=? WHERE ID_VIAJE=?";
            sentencia = cxn.prepareStatement(sql);

            //conversión tipo para que la base de datos lo entienda. 
            sentencia.setTime(1, Time.valueOf(v.getHoraSalida()));
            sentencia.setTime(2, Time.valueOf(v.getHoraLlegada()));
            sentencia.setString(3, v.getMatricula());
            sentencia.setInt(4, v.getNumParte());
            sentencia.setString(5, v.getUsuario());
            sentencia.setDate(6, Date.valueOf(v.getFecha()));
            sentencia.setInt(7, v.getIdViaje());

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

    public void borrarDatos(Viaje v) throws ClassNotFoundException {
        Connection cxn = null;
        PreparedStatement sentencia = null;
        boolean resp = true;
        try {
            ConexionTest.conectar();
            cxn = conexion.getConexion();
            //cxn.setAutoCommit(false);
            String sql = "DELETE FROM VIAJE WHERE ID_VIAJE = ? ";
            sentencia = cxn.prepareStatement(sql);

            sentencia.setInt(1, v.getIdViaje());
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

    public List<Viaje> listarDatos(Viaje v) throws ClassNotFoundException {
        Connection cxn = null;
        CallableStatement sql = null;
        List<Viaje> resp = new ArrayList<Viaje>();

        try {
            ConexionTest.conectar();
            cxn = conexion.getConexion();
            //cxn.setAutoCommit(false);
            sql = cxn.prepareCall("{call LISTARVIAJES(?,?)}");

            sql.setInt(1, v.getNumParte());
            sql.registerOutParameter(2, OracleTypes.CURSOR);
            
            boolean filas = sql.execute();

            ResultSet resul = (ResultSet) sql.getObject(2);
            while (resul.next()) {

                Viaje vj = new Viaje();
                vj.setUsuario(resul.getString(7));

                vj.setIdViaje(Integer.parseInt(resul.getString(1)));
                vj.setNumParte(Integer.parseInt(resul.getString(6)));
                vj.setHoraSalida(resul.getTime(2).toLocalTime());
                vj.setHoraLlegada(resul.getTime(3).toLocalTime());
                vj.setMatricula(resul.getString(4));
                vj.setFecha(resul.getDate(8).toLocalDate());
                vj.setTotalHorasViaje(resul.getLong(5));

                resp.add(vj);
            }

            resul.close();
            sql.close();
            cxn.close();

        } catch (SQLException ex) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
        }
        return resp;
    }

    /**
     * operacion suma horas, fechas
     */
    public long sumarHorasParte(LocalDate fechaParte) {
        Connection cxn = null;
        PreparedStatement sentencia = null;
        long resp = 0;
        try {
            ConexionTest.conectar();
            cxn = conexion.getConexion();
            //cxn.setAutoCommit(false);
            String sql = "SELECT sum(Hora_llegada-Hora_salida) as HorasTotales from viaje where PARTE_fecha=?";

            sentencia = cxn.prepareStatement(sql);

            sentencia.setDate(1, Date.valueOf(fechaParte));

            ResultSet resul = sentencia.executeQuery();
            if (resul == null) {
                System.out.println("Me devuelve nulo");
            } else {
                resul.next();
                resp = resul.getLong(1);
                System.out.println("Me devuelve" + resul.getDouble(1));
            }
            sentencia.close();
            cxn.close(); //conexion.desconectar();

        } catch (SQLException ex) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ViajesDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return resp;
    }
}
