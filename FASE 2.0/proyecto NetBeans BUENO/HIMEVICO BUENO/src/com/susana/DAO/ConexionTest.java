/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.susana.DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author acer
 */
public class ConexionTest {

    private static Connection conexion;

    public static void conectar() throws ClassNotFoundException {
        try {
            Class.forName("java.sql.DriverManager");
            conexion = DriverManager.getConnection("jdbc:oracle:thin:@10.10.10.9:1521:db12102", "system", "oracle");
       //conexion.setAutoCommit(true);
        } catch (SQLException ex) {
            Logger.getLogger(ConexionTest.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static Connection getConexion() {
        return conexion;
    }

    public static void desconectar() throws SQLException {
        conexion.close();

    }

}
