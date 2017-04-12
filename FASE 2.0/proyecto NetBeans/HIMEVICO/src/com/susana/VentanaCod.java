/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.susana;

import static java.lang.ProcessBuilder.Redirect.from;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import static javax.swing.text.html.HTML.Tag.SELECT;
import oracle.jdbc.OracleTypes;

/**
 *
 * @author acer
 */


    /**
     * @return the principal
     */

  

    /**
     * @param principal the principal to set
     */

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            Connection conexion = DriverManager.getConnection("jdbc:oracle:thin:@10.10.10.9:1521:db12102", "system", "oracle");

            Statement sentencia = conexion.createStatement();

            ResultSet resul = sentencia.executeQuery("SELECT nombre from TRABAJADOR");

            while (resul.next()) {
                System.out.println(resul.getString(1));

            }
            resul.close();
            sentencia.close();
            conexion.close();
        } catch (ClassNotFoundException cn) {
            cn.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        try {
            Class.forName("java.sql.DriverManager");
            Connection conexion = DriverManager.getConnection("jdbc:oracle:thin:@10.10.10.9:1521:db12102", "system", "oracle");
            Statement sentencia = conexion.createStatement();

            CallableStatement sql = conexion.prepareCall("{call LISTACENTROS(?)}");

            sql.registerOutParameter(1, OracleTypes.CURSOR);
            sql.execute();

            ResultSet resul = (ResultSet) sql.getObject(1);

            while (resul.next()) {
                System.out.println(resul.getString(1) + " " + resul.getString(2));
            }
            resul.close();
            sentencia.close();
            conexion.close();
        } catch (ClassNotFoundException cn) {
            cn.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }
}
