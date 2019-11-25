package com.ejemplo.modelo;

import com.ejemplo.conexion.Conexion;
import java.sql.*;
import java.util.*;

/**
 *Clase de ogica del negocio (CRUD)
 * @author Juan Anzora
 */
public class PersonaCrud extends Conexion{
    PreparedStatement pre; //preparacion de consulta sql
    ResultSet res; //resultado de la sql
    
    public List<Persona>mostrar(){
        List<Persona> listaPersona = new ArrayList<>();
        try {
            this.conectar();
            String sql = "select * from ejemplo";
            pre = this.getCon().prepareStatement(sql);
            res = pre.executeQuery();
            while (res.next()) {                
                Persona p = new Persona();
                p.setId(res.getInt("id"));
                p.setNombre(res.getString("nombre"));
                p.setApellido(res.getString("apellido"));
                listaPersona.add(p);
            }
        } catch (Exception e) {
            System.out.println("Error en mostrar de crud");
        }
        return listaPersona;
    }
    
    //create
    public void agregar(Persona p){
        try {
            this.conectar();
            String sql ="INSERT INTO ejemplo (id, nombre, apellido) VALUES (?,?,?)";
            pre = this.getCon().prepareStatement(sql);
            pre.setInt(1, p.getId());
            pre.setString(2, p.getNombre());
            pre.setString(3, p.getApellido());
            pre.executeUpdate();
        } catch (Exception e) {
            System.out.println("Error en guardar CRUD"+e);
        }
    }
    
    public void modificar(Persona p){
        try {
            this.conectar();
            String sql ="update ejemplo set nombre=?, apellido=? where id=?";
            pre = this.getCon().prepareStatement(sql);
            pre.setString(1, p.getNombre());
            pre.setString(2,p.getApellido() );
            pre.setInt(3, p.getId());
            pre.executeUpdate();
        } catch (Exception e) {
            System.out.println("Error en modificar CRUD"+e);
        }
    }
    
    public void eliminar(Persona p){
        try {
            this.conectar();
            String sql ="delete from ejemplo where id=?";
            pre = this.getCon().prepareStatement(sql);
            pre.setInt(1, p.getId());
            pre.executeUpdate();
        } catch (Exception e) {
            System.out.println("Error en eliminar CRUD"+e);
        }
    }
    
    public int contar(Object obj){
        int cont = 0;
        try {
            this.conectar();
            String sql ="select count(*) cantidad from ejemplo";
            pre = this.getCon().prepareCall(sql);
            res = pre.executeQuery();
            while(res.next()){
                cont = res.getInt("cantidad")+1;
            }
        } catch (Exception e) {
        }
        return cont;
    }
    
  
                                                                    
}
