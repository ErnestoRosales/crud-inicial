package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.ArrayList;
import java.util.AbstractList;
import java.util.List;
import com.ejemplo.modelo.Persona;
import com.ejemplo.modelo.PersonaCrud;

public final class Index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css\" integrity=\"sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm\" crossorigin=\"anonymous\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("        <script Language=\"JavaScript\">\n");
      out.write("            function cargar(i, n, a) {\n");
      out.write("                document.frmDatos.txtId.value = i;\n");
      out.write("                document.frmDatos.txtNombre.value = n;\n");
      out.write("                document.frmDatos.txtApellido.value = a;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("        </script>\n");
      out.write("        ");

            if (request.getAttribute("valor") != null) {
      out.write("\n");
      out.write("        <script>\n");
      out.write("            alert('");
      out.print( request.getAttribute("valor"));
      out.write("')\n");
      out.write("        </script>\n");
      out.write("        ");
}
        
      out.write("\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        ");

            PersonaCrud pc = new PersonaCrud();
        
      out.write("\n");
      out.write("        \n");
      out.write("        <br>\n");
      out.write("        <form action=\"Operaciones\" method=\"Post\"  name=\"frmDatos\">\n");
      out.write("            <div class=\"container\">\n");
      out.write("                <div class=\"form-group row\">\n");
      out.write("                    <label for=\"txtId\" class=\"col-xs-3 col-form-label mr-5\">Id</label>\n");
      out.write("                    <td>  \n");
      out.write("                        ");

                            PersonaCrud obj = new PersonaCrud();
                            Object n = obj.contar(obj);
                        
      out.write("\n");
      out.write("                    </td>  \n");
      out.write("                    <div class=\"col-xs-9\">\n");
      out.write("                        <input type=\"text\" class=\"form-control\" id=\"txtId\" name=\"txtId\" value=\"");
      out.print(n);
      out.write("\">\n");
      out.write("                    </div>\n");
      out.write("                </div>  \n");
      out.write("                <div class=\"form-group row\">\n");
      out.write("                    <label for=\"txtNombre\" class=\"col-xs-3 col-form-label mr-1\">Nombre</label>\n");
      out.write("                    <div class=\"col-xs-9\">\n");
      out.write("                        <input type=\"text\" class=\"form-control\" id=\"txtNombre\" name=\"txtNombre\">\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"form-group row\">\n");
      out.write("                    <label for=\"txtApellido\" class=\"col-xs-3 col-form-label mr-1\">Apellido</label>\n");
      out.write("                    <div class=\"col-xs-9\">\n");
      out.write("                        <input type=\"text\" class=\"form-control\" id=\"txtApellido\" name=\"txtApellido\">\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"form-group row\">\n");
      out.write("                    <div class=\"offset-xs-3 col-xs-9\"> \n");
      out.write("                        <td colspan=\"2\">\n");
      out.write("                            <input type=\"submit\" class=\"btn btn-success\" value=\"Agregar\" name=\"btnAgregar\">\n");
      out.write("                            <input type=\"submit\" class=\"btn btn-warning\" value=\"Modificar\" name=\"btnModificar\">\n");
      out.write("                            <input type=\"submit\" class=\"btn btn-danger\" value=\"Eliminar\" name=\"btnEliminar\">\n");
      out.write("                        </td>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </form>\n");
      out.write("\n");
      out.write("\n");
      out.write("        <br><br><br>\n");
      out.write("        <table border=\"1\" class=\"table table-hover\">\n");
      out.write("            <thead>\n");
      out.write("                <tr class=\"thead-dark\">\n");
      out.write("                    <th>ID</th>\n");
      out.write("                    <th>Nombre</th>\n");
      out.write("                    <th>Apellido</th>\n");
      out.write("                    <th>Operaciones</th>\n");
      out.write("                </tr>\n");
      out.write("            </thead>\n");
      out.write("            <tbody>\n");
      out.write("                ");


                    List<Persona> lp = pc.mostrar();
                    for (Persona valorPersona : lp) {
                
      out.write("\n");
      out.write("                <tr>\n");
      out.write("                    <td>");
      out.print(valorPersona.getId());
      out.write("</td>\n");
      out.write("                    <td>");
      out.print(valorPersona.getNombre());
      out.write(" </td>\n");
      out.write("                    <td>");
      out.print(valorPersona.getApellido());
      out.write("</td>\n");
      out.write("                    <td>\n");
      out.write("                        <a href=\"javascript:cargar(");
      out.print(valorPersona.getId());
      out.write(",\n");
      out.write("                           '");
      out.print(valorPersona.getNombre());
      out.write("',\n");
      out.write("                           '");
      out.print(valorPersona.getApellido());
      out.write("')\">Seleccionar</a>\n");
      out.write("\n");
      out.write("                    </td>\n");
      out.write("                </tr>\n");
      out.write("                ");

                    }
                
      out.write("\n");
      out.write("            </tbody>\n");
      out.write("        </table>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
