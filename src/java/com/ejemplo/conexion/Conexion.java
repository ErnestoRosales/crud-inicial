
package com.ejemplo.conexion;

import java.sql.Connection;
import java.sql.DriverManager;


/**
 *Clase que contendra la conexion a BD
 * @author Juan Anzora
 */
public class Conexion {
    private String usuario = "root";
    private String contra = "";
    private String url = "jdbc:mysql://localhost:3306/persona";
    private String driver = "com.mysql.jdbc.Driver";
    
    private Connection con ;

    public Connection getCon() {
        return con;
    }

    public void setCon(Connection con) {
        this.con = con;
    }
    
    public void conectar() throws Exception{
        try {
            //cuando verdadero 
            Class.forName(driver);
            con = DriverManager.getConnection(url,usuario,contra);
            System.out.println("Conexion Exitosa");
        } catch (Exception e) {
            //cuando sea falso mostrar un error
            System.out.println("Error en conexion a BD"+e);
        }
    }
  
    public void desconectar(){
        try {
            if (con != null) {
                if (con.isClosed() == false) {
                    con.close();
                }
            }
        } catch (Exception e) {
            System.out.println("Error en desconctar BD"+e);
        }
    }
    
}
