/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ejemplo.controlador;

import com.ejemplo.modelo.Persona;
import com.ejemplo.modelo.PersonaCrud;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Juan Anzora
 */
public class Operaciones extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PersonaCrud pc = new PersonaCrud();
        Persona p = new Persona();
        String val = "";//retornar un mensaje
        RequestDispatcher rd = null;
        try {
            p.setId(Integer.parseInt(request.getParameter("txtId")));
            p.setNombre(request.getParameter("txtNombre"));
            p.setApellido(request.getParameter("txtApellido"));
            System.out.println(p);
            if (request.getParameter("btnAgregar") != null) {
                pc.agregar(p);
                val ="Datos Agregados";
            }
            if(request.getParameter("btnModificar") != null){
                pc.modificar(p);
                val="Datos Modificados";
            }
            if(request.getParameter("btnEliminar")!= null){
                pc.eliminar(p);
                val="Datos Eliminados";
            }
            rd = request.getRequestDispatcher("Index.jsp");
            request.setAttribute("valor", val);
        } catch (Exception e) {
            System.out.println("Error en el servlet");
            request.setAttribute("error", e);
        }
        rd.forward(request, response);
        
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
