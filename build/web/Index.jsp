<%-- 
    Document   : Index
    Created on : 11-02-2019, 04:35:22 PM
    Author     : Juan Anzora
--%>

<%@page import="java.util.ArrayList"%>
<%@page import="java.util.AbstractList"%>
<%@page import="java.util.List"%>
<%@page import="com.ejemplo.modelo.Persona"%>
<%@page import="com.ejemplo.modelo.PersonaCrud"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
        <title>JSP Page</title>
        <script Language="JavaScript">
            function cargar(i, n, a) {
                document.frmDatos.txtId.value = i;
                document.frmDatos.txtNombre.value = n;
                document.frmDatos.txtApellido.value = a;
            }

        </script>
        <%
            if (request.getAttribute("valor") != null) {%>
        <script>
            alert('<%= request.getAttribute("valor")%>')
        </script>
        <%}
        %>
    </head>
    <body>
        <%
            PersonaCrud pc = new PersonaCrud();
        %>
        
        <br>
        <form action="Operaciones" method="Post"  name="frmDatos">
            <div class="container">
                <div class="form-group row">
                    <label for="txtId" class="col-xs-3 col-form-label mr-5">Id</label>
                    <td>  
                        <%
                            PersonaCrud obj = new PersonaCrud();
                            Object n = obj.contar(obj);
                        %>
                    </td>  
                    <div class="col-xs-9">
                        <input type="text" class="form-control" id="txtId" name="txtId" value="<%=n%>">
                    </div>
                </div>  
                <div class="form-group row">
                    <label for="txtNombre" class="col-xs-3 col-form-label mr-1">Nombre</label>
                    <div class="col-xs-9">
                        <input type="text" class="form-control" id="txtNombre" name="txtNombre">
                    </div>
                </div>
                <div class="form-group row">
                    <label for="txtApellido" class="col-xs-3 col-form-label mr-1">Apellido</label>
                    <div class="col-xs-9">
                        <input type="text" class="form-control" id="txtApellido" name="txtApellido">
                    </div>
                </div>
                <div class="form-group row">
                    <div class="offset-xs-3 col-xs-9"> 
                        <td colspan="2">
                            <input type="submit" class="btn btn-success" value="Agregar" name="btnAgregar">
                            <input type="submit" class="btn btn-warning" value="Modificar" name="btnModificar">
                            <input type="submit" class="btn btn-danger" value="Eliminar" name="btnEliminar">
                        </td>
                    </div>
                </div>
            </div>
        </form>


        <br><br><br>
        <table border="1" class="table table-hover">
            <thead>
                <tr class="thead-dark">
                    <th>ID</th>
                    <th>Nombre</th>
                    <th>Apellido</th>
                    <th>Operaciones</th>
                </tr>
            </thead>
            <tbody>
                <%

                    List<Persona> lp = pc.mostrar();
                    for (Persona valorPersona : lp) {
                %>
                <tr>
                    <td><%=valorPersona.getId()%></td>
                    <td><%=valorPersona.getNombre()%> </td>
                    <td><%=valorPersona.getApellido()%></td>
                    <td>
                        <a href="javascript:cargar(<%=valorPersona.getId()%>,
                           '<%=valorPersona.getNombre()%>',
                           '<%=valorPersona.getApellido()%>')">Seleccionar</a>

                    </td>
                </tr>
                <%
                    }
                %>
            </tbody>
        </table>
    </body>
</html>
