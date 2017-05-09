/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.susana.GUI;

import com.susana.Entidades.Administrativo;
import com.susana.Entidades.Trabajador;
import com.susana.Entidades.Transportista;
import com.toedter.calendar.JDateChooser;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.text.BadLocationException;
import javax.swing.text.Document;
import oracle.jdbc.OracleTypes;
import java.awt.event.FocusEvent;

/**
 *
 * @author acer
 */
public class VentanaGestiónUsuarios1 extends javax.swing.JFrame {

    Trabajador t;

    /**
     * Creates new form VentanaGestiónUsuarios
     */
    public VentanaGestiónUsuarios1() {
        initComponents();
        jTextField1inserDni.requestFocus();
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton2 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextPane2Trabajadores = new javax.swing.JTextPane();
        jButton3untrabajador = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jTextField1inserDni = new javax.swing.JTextField();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTextPane4unTrabaj = new javax.swing.JTextPane();
        jButton1 = new javax.swing.JButton();
        jTextField1dni = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTextField1nombre = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jTextField1apellido1 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jTextField1apellido2 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jTextField1Calle = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jTextField1portal = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jTextField1Mano = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jTextField1Categoria = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jTextField1piso = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jTextField1CentroUsu = new javax.swing.JTextField();
        jButton3Atras = new javax.swing.JButton();
        jButton3exit = new javax.swing.JButton();
        jButton3borrarTrab = new javax.swing.JButton();
        jButton3NuevoTrab = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jTextField1Usuario = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jTextField2Contrase = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jTextField1Salario = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jTextField1TelEmpresa = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        jTextField1TelPersonal = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        jDateChooser1FechaNac = new com.toedter.calendar.JDateChooser();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton2.setText("Listado trabajadores");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 11, 730, -1));

        jScrollPane2.setViewportView(jTextPane2Trabajadores);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 48, 730, 170));

        jButton3untrabajador.setText("Buscar trabajador");
        jButton3untrabajador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3untrabajadorActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3untrabajador, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 60, 240, -1));

        jLabel1.setText("    Introducir DNI para borrar o actualizar trabajador");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 10, 250, -1));

        jTextField1inserDni.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jTextField1inserDni.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextField1inserDniFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextField1inserDniFocusLost(evt);
            }
        });
        jTextField1inserDni.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1inserDniActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField1inserDni, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 30, 240, 25));

        jScrollPane4.setViewportView(jTextPane4unTrabaj);

        getContentPane().add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(771, 89, 240, 100));

        jButton1.setText("Actualizar trabajador");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 230, 240, -1));

        jTextField1dni.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1dniActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField1dni, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 250, 131, -1));

        jLabel2.setText("DNI");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 230, -1, -1));

        jLabel4.setText("Nombre");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 280, -1, -1));
        getContentPane().add(jTextField1nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 300, 131, -1));

        jLabel5.setText("Apellido 1");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 330, -1, -1));
        getContentPane().add(jTextField1apellido1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 350, 260, -1));

        jLabel6.setText("Apellido 2");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 330, -1, -1));
        getContentPane().add(jTextField1apellido2, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 350, 290, -1));

        jLabel7.setText("Calle");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 380, -1, -1));
        getContentPane().add(jTextField1Calle, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 400, 330, -1));

        jLabel8.setText("Portal");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 380, -1, -1));
        getContentPane().add(jTextField1portal, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 400, 50, -1));

        jLabel9.setText("Mano");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 380, -1, -1));
        getContentPane().add(jTextField1Mano, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 400, 60, -1));

        jLabel10.setText("Categoría");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 230, -1, -1));
        getContentPane().add(jTextField1Categoria, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 250, 152, -1));

        jLabel11.setText("Piso");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 380, -1, -1));
        getContentPane().add(jTextField1piso, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 400, 60, -1));

        jLabel12.setText("Centro");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 230, -1, -1));
        getContentPane().add(jTextField1CentroUsu, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 250, 70, -1));

        jButton3Atras.setText("Volver atrás");
        jButton3Atras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3AtrasActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3Atras, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 370, -1, -1));

        jButton3exit.setText("Salir");
        jButton3exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3exitActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3exit, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 410, 90, -1));

        jButton3borrarTrab.setText("Borrar trabajador");
        jButton3borrarTrab.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3borrarTrabActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3borrarTrab, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 200, 240, -1));

        jButton3NuevoTrab.setText("Nuevo trabajador");
        jButton3NuevoTrab.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3NuevoTrabActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3NuevoTrab, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 260, 240, -1));

        jLabel3.setText("Usuario");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 280, -1, -1));
        getContentPane().add(jTextField1Usuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 300, 150, -1));

        jLabel13.setText("Contraseña");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 280, -1, -1));
        getContentPane().add(jTextField2Contrase, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 300, 180, -1));

        jLabel14.setText("Salario");
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 220, 40, 30));
        getContentPane().add(jTextField1Salario, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 250, 150, -1));

        jLabel15.setText("Teléfono Empresa");
        getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 230, -1, -1));
        getContentPane().add(jTextField1TelEmpresa, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 250, 150, -1));

        jLabel16.setText("Teléfono Personal");
        getContentPane().add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 280, -1, -1));
        getContentPane().add(jTextField1TelPersonal, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 300, 150, -1));

        jLabel17.setText("Fecha nacimiento");
        getContentPane().add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 330, -1, -1));
        getContentPane().add(jDateChooser1FechaNac, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 350, 150, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        try {
            Class.forName("java.sql.DriverManager");
            Connection conexion = DriverManager.getConnection("jdbc:oracle:thin:@10.10.10.9:1521:db12102", "system", "oracle");

            Statement sentencia = conexion.createStatement();

            CallableStatement sql = conexion.prepareCall("{call LISTATRABAJADORES(?)}");
            sql.registerOutParameter(1, OracleTypes.CURSOR);
            sql.execute();

            ResultSet resul = (ResultSet) sql.getObject(1);
            Document otroDocumento = jTextPane2Trabajadores.getStyledDocument();
            while (resul.next()) {
                try {
                    otroDocumento.insertString(otroDocumento.getLength(),
                            resul.getString(1) + " / " + resul.getString(2) + " / " + resul.getString(3) + " / " + resul.getString(4) + " / " + resul.getString(5) + " / " + resul.getString(6) + " / " + resul.getString(7) + " / " + resul.getString(8) + " / " + resul.getString(9) + " / " + resul.getString(10) + "\n", null);

                } catch (BadLocationException ble) {
                    ble.printStackTrace();
                }
            }
            resul.close();
            sentencia.close();
            conexion.close();
        } catch (ClassNotFoundException cn) {
            cn.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3untrabajadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3untrabajadorActionPerformed

        try {
            Class.forName("java.sql.DriverManager");
            Connection conexion = DriverManager.getConnection("jdbc:oracle:thin:@10.10.10.9:1521:db12102", "system", "oracle");

            Statement sentencia = conexion.createStatement();
            String dni = jTextField1inserDni.getText();

            CallableStatement sql = conexion.prepareCall("{call LISTARUNTRABAJADOR(?, ?)}");
            sql.registerOutParameter(2, OracleTypes.CURSOR);
            sql.setString(1, dni);
            sql.execute();

            ResultSet resul = (ResultSet) sql.getObject(2);
            Document otroDocumento = jTextPane4unTrabaj.getStyledDocument();
            while (resul.next()) {
                try {
                    if ("TRANSPORTISTA".equalsIgnoreCase(resul.getString(9))) {
                        t = new Transportista();
                    } else {
                        t = new Administrativo();
                    }
                    t.setDni(resul.getString(1));
                    t.setNombre(resul.getString(2));
                    t.setApellido1(resul.getString(3));
                    t.setApellido2(resul.getString(4));
                    t.setCalle(resul.getString(5));
                    t.setPortal(resul.getString(6));
                    t.setPiso(resul.getString(7));
                    t.setMano(resul.getString(8));
                    t.setCategoria(resul.getString(9));
                    t.setCentro(Integer.parseInt(resul.getString(10)));
                    t.setTelefonoEmpresa(resul.getString(11));
                    t.setTelefonoPersonal(resul.getString(12));
                    t.setSalario(resul.getDouble(13));
                    t.setFecha(resul.getDate(14));

                    otroDocumento.insertString(otroDocumento.getLength(),
                            
                            "DNI: " + t.getDni() + "\n" + "NOMBRE: " + t.getNombre() + "\n" + "PRIMER APELLIDO: " + t.getApellido1()
                            + "\n" + "SEGUNDO APELLIDO: " + t.getApellido2() + "\n" + "DIRECCIÓN: " + t.getCalle()
                            + " , " + t.getPortal() + " - " + t.getPiso()
                            + "  " + t.getMano() + "\n" + "CATEGORÍA: " + t.getCategoria() + "\n" + "CENTRO AL QUE PERTENECE: " + t.getCentro()
                            + "TEL. EMPRESA: " + t.getTelefonoEmpresa()
                            + "TEL. PERSONAL: " + t.getTelefonoPersonal() + "SALARIO: " + t.getSalario()
                            + "FECHA NACIMIENTO: " + t.getFecha() + "\n", null);

                    jTextField1dni.setText(t.getDni());
                    jTextField1nombre.setText(t.getNombre());
                    jTextField1apellido1.setText(t.getApellido1());
                    jTextField1apellido2.setText(t.getApellido2());
                    jTextField1Calle.setText(t.getCalle());
                    jTextField1portal.setText(t.getPortal());
                    jTextField1piso.setText(t.getPiso());
                    jTextField1Mano.setText(t.getMano());
                    jTextField1Categoria.setText(t.getCategoria());
                    jTextField1CentroUsu.setText(t.getCentro().toString());
                    jTextField1TelEmpresa.setText(t.getTelefonoEmpresa());
                    jTextField1TelPersonal.setText(t.getTelefonoPersonal());
                    Double sal = t.getSalario();
                    String salar = sal.toString();
                    jTextField1Salario.setText(salar);
                    jDateChooser1FechaNac.setDate(t.getFecha());

                    if (jTextPane4unTrabaj.getText().length() == 0) {
                        JOptionPane.showMessageDialog(this, "trabajador inexistente con los datos indicados");
                    }

                } catch (BadLocationException ble) {
                    ble.printStackTrace();

                }

            }

            resul.close();
            sentencia.close();
            conexion.close();

        } catch (ClassNotFoundException cn) {
            cn.printStackTrace();

        } catch (SQLException e) {
            e.printStackTrace();

        }
        //fuente: aprenderaprogramar.com/foros/index.php?topic=1235.0
        if (jTextPane4unTrabaj.getText().length() == 0) {
            JOptionPane.showMessageDialog(this, "trabajador inexistente con los datos indicados");
        }
    }//GEN-LAST:event_jButton3untrabajadorActionPerformed

    private void jTextField1inserDniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1inserDniActionPerformed

    }//GEN-LAST:event_jTextField1inserDniActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try {
            Class.forName("java.sql.DriverManager");
            Connection conexion = DriverManager.getConnection("jdbc:oracle:thin:@10.10.10.9:1521:db12102", "system", "oracle");

            
            String sql = "UPDATE TRABAJADOR SET DNI = ?, NOMBRE = ?, APELLIDO_1 = ?, APELLIDO_2 = ?,CALLE=?,"
                    + " PORTAL=?, PISO=?, MANO=?, CATEGORIA=?, CENTRO_ID=?,"
                    + " TELEFONO_EMPRESA=?, TELEFONO_PERSONAL=?, SALARIO=?, FECHA_NACIMIENTO=? WHERE DNI=?";
            PreparedStatement sentencia = conexion.prepareStatement(sql);
            sentencia.setString(1, jTextField1dni.getText());
            sentencia.setString(2, jTextField1nombre.getText());
            sentencia.setString(3, jTextField1apellido1.getText());
            sentencia.setString(4, jTextField1apellido2.getText());
            sentencia.setString(5, jTextField1Calle.getText());
            sentencia.setString(6, jTextField1portal.getText());
            sentencia.setString(7, jTextField1piso.getText());
            sentencia.setString(8, jTextField1Mano.getText());
            sentencia.setString(9, jTextField1Categoria.getText());
            sentencia.setInt(10, Integer.parseInt(jTextField1CentroUsu.getText()));
            sentencia.setString(11, jTextField1TelEmpresa.getText());
            sentencia.setString(12, jTextField1TelPersonal.getText());
            sentencia.setDouble(13, Double.parseDouble(jTextField1Salario.getText()));
            java.util.Date ff = jDateChooser1FechaNac.getDate();
            java.sql.Date fech = new java.sql.Date(ff.getTime());
            sentencia.setDate(14, fech);
            sentencia.setString(15, t.getDni());

            int filas = sentencia.executeUpdate();
            if (filas == 1) {
                JOptionPane.showMessageDialog(this, "Datos trabajador actualizados");
                jTextField1dni.setText("");
                jTextField1nombre.setText("");
                jTextField1apellido1.setText("");
                jTextField1apellido2.setText("");
                jTextField1Calle.setText("");
                jTextField1portal.setText("");
                jTextField1piso.setText("");
                jTextField1Mano.setText("");
                jTextField1Categoria.setText("");
                jTextField1CentroUsu.setText("");
                jTextField1TelEmpresa.setText("");
                jTextField1TelPersonal.setText("");
                jTextField1Salario.setText(null);
                jDateChooser1FechaNac.setDate(null);
                jTextPane4unTrabaj.setText("");
                jTextField1inserDni.setText("");
                jTextPane2Trabajadores.setText("");
            }

            sentencia.close();
            conexion.close();
        } catch (ClassNotFoundException cn) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, cn);
        } catch (SQLException ex) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
        }    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3AtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3AtrasActionPerformed
        VentanaAdministrador va = new VentanaAdministrador();
        va.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton3AtrasActionPerformed

    private void jButton3exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3exitActionPerformed
System.exit(0);    }//GEN-LAST:event_jButton3exitActionPerformed

    private void jButton3borrarTrabActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3borrarTrabActionPerformed
        try {
            Class.forName("java.sql.DriverManager");
            Connection conexion = DriverManager.getConnection("jdbc:oracle:thin:@10.10.10.9:1521:db12102", "system", "oracle");
//clicando sobre el boton borrar trabajador, aprovecha el trabajador insertado en la búsqueda para borrarlo
            String sql = "DELETE FROM TRABAJADOR WHERE DNI=?";
            PreparedStatement sentencia = conexion.prepareStatement(sql);
            sentencia.setString(1, jTextField1inserDni.getText());

            int filas = sentencia.executeUpdate();
            if (filas == 1) {
                JOptionPane.showMessageDialog(this, "Datos trabajador borrados");
            } else {
                JOptionPane.showMessageDialog(this, "Indique DNI");

            }
            sentencia.close();
            conexion.close();
        } catch (ClassNotFoundException cn) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, cn);
        } catch (SQLException ex) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
        }
        if (jTextPane4unTrabaj.getText().length() == 0) {
            JOptionPane.showMessageDialog(this, "trabajador inexistente con los datos indicados");

        }       }//GEN-LAST:event_jButton3borrarTrabActionPerformed

    private void jTextField1dniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1dniActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1dniActionPerformed

    private void jButton3NuevoTrabActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3NuevoTrabActionPerformed

        try {
            Class.forName("java.sql.DriverManager");
            Connection conexion = DriverManager.getConnection("jdbc:oracle:thin:@10.10.10.9:1521:db12102", "system", "oracle");
//DNI, NOMBRE, APELLIDO_1, APELLIDO_2, CALLE, PORTAL, PISO, MANO, CATEGORIA, CENTRO_ID

            String sql = "INSERT INTO  TRABAJADOR( DNI, NOMBRE, APELLIDO_1, "
                    + "APELLIDO_2, CALLE, PORTAL, PISO, MANO, CATEGORIA, "
                    + "CENTRO_ID, USUARIO, CONTRASENA, TELEFONO_EMPRESA, TELEFONO_PERSONAL, SALARIO, FECHA_NACIMIENTO) VALUES (?, ?, ?, ?, ?, ?,?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
            PreparedStatement sentencia = conexion.prepareStatement(sql);
            sentencia.setString(1, jTextField1dni.getText());
            sentencia.setString(2, jTextField1nombre.getText());
            sentencia.setString(3, jTextField1apellido1.getText());
            sentencia.setString(4, jTextField1apellido2.getText());
            sentencia.setString(5, jTextField1Calle.getText());
            sentencia.setString(6, jTextField1portal.getText());
            sentencia.setString(7, jTextField1piso.getText());
            sentencia.setString(8, jTextField1Mano.getText());
            sentencia.setString(9, jTextField1Categoria.getText());
            sentencia.setInt(10, Integer.parseInt(jTextField1CentroUsu.getText()));
            sentencia.setString(11, jTextField1Usuario.getText());
            sentencia.setString(12, jTextField2Contrase.getText());
            sentencia.setString(13, jTextField1TelEmpresa.getText());
            sentencia.setString(14, jTextField1TelPersonal.getText());
            sentencia.setDouble(15, Double.parseDouble(jTextField1Salario.getText()));
            java.util.Date ff = jDateChooser1FechaNac.getDate();
            java.sql.Date fech = new java.sql.Date(ff.getTime());
            sentencia.setDate(16, fech);

         //   sentencia.execute();
   int filas = sentencia.executeUpdate();
            if (filas == 1) {
                JOptionPane.showMessageDialog(this, "Trabajador creado");
            } else {
                JOptionPane.showMessageDialog(this, "Error datos, introduzca datos correctos");

            }
            sentencia.close();
            conexion.close();
         
        } catch (ClassNotFoundException cn) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, cn);
              JOptionPane.showMessageDialog(this, "Error datos, introduzca datos correctos");
        } catch (SQLException ex) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
              JOptionPane.showMessageDialog(this, "Error datos, introduzca datos correctos");
        }

    }//GEN-LAST:event_jButton3NuevoTrabActionPerformed

    private void jTextField1inserDniFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField1inserDniFocusGained

    }//GEN-LAST:event_jTextField1inserDniFocusGained

    private void jTextField1inserDniFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField1inserDniFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1inserDniFocusLost

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(VentanaGestiónUsuarios1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaGestiónUsuarios1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaGestiónUsuarios1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaGestiónUsuarios1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaGestiónUsuarios1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3Atras;
    private javax.swing.JButton jButton3NuevoTrab;
    private javax.swing.JButton jButton3borrarTrab;
    private javax.swing.JButton jButton3exit;
    private javax.swing.JButton jButton3untrabajador;
    private com.toedter.calendar.JDateChooser jDateChooser1FechaNac;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTextField jTextField1Calle;
    private javax.swing.JTextField jTextField1Categoria;
    private javax.swing.JTextField jTextField1CentroUsu;
    private javax.swing.JTextField jTextField1Mano;
    private javax.swing.JTextField jTextField1Salario;
    private javax.swing.JTextField jTextField1TelEmpresa;
    private javax.swing.JTextField jTextField1TelPersonal;
    private javax.swing.JTextField jTextField1Usuario;
    private javax.swing.JTextField jTextField1apellido1;
    private javax.swing.JTextField jTextField1apellido2;
    private javax.swing.JTextField jTextField1dni;
    private javax.swing.JTextField jTextField1inserDni;
    private javax.swing.JTextField jTextField1nombre;
    private javax.swing.JTextField jTextField1piso;
    private javax.swing.JTextField jTextField1portal;
    private javax.swing.JTextField jTextField2Contrase;
    private javax.swing.JTextPane jTextPane2Trabajadores;
    private javax.swing.JTextPane jTextPane4unTrabaj;
    // End of variables declaration//GEN-END:variables
}
