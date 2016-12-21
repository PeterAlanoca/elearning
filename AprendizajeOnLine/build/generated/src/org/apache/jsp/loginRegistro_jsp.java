package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class loginRegistro_jsp extends org.apache.jasper.runtime.HttpJspBase
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

 
    String base_url = "http://localhost/AprendizajeOnLine/";
    
    if(session.getAttribute("estudiante") != null && !session.getAttribute("estudiante").equals("")){
        response.sendRedirect("temas.jsp");
    } 

      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"es\">\n");
      out.write("\n");
      out.write("<head>\n");
      out.write("    <meta charset=\"utf-8\">\n");
      out.write("    <link rel=\"icon\" type=\"image/png\" href=\"");
      out.print(base_url);
      out.write("images/icon.png\">\n");
      out.write("    <meta name=\"description\" content=\"\">\n");
      out.write("    <meta name=\"author\" content=\"\">\n");
      out.write("    <title>Aprendizaje en linea</title>\n");
      out.write("    <link href=\"http://maxcdn.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css\" rel=\"stylesheet\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css\" integrity=\"sha384-1q8mTJOASx8j1Au+a5WDVnPi2lkFfwwEAa8hDDdjZlpLegxhjVME1fgjWPGmkzs7\" crossorigin=\"anonymous\">\n");
      out.write("    <!--link rel=\"stylesheet\" type=\"text/css\" href=\"");
      out.print(base_url);
      out.write("assets/bootstrap/css/bootstrap.css\"-->\n");
      out.write("    <script src=\"");
      out.print(base_url);
      out.write("assets/js/jquery-latest.min.js\"></script>\n");
      out.write("    <script src=\"");
      out.print(base_url);
      out.write("assets/js/jquery.backstretch.min.js\"></script> \n");
      out.write("    <style type=\"text/css\">\n");
      out.write("        .btn-success {\n");
      out.write("            color: #fff;\n");
      out.write("            background-color: #902654;\n");
      out.write("            border-color: #902654;\n");
      out.write("        }\n");
      out.write("    </style>\n");
      out.write("</head>\n");
      out.write("\n");
      out.write("<body>\n");
      out.write("    <nav class=\"navbar navbar-inverse navbar-default\" style=\"border-radius: 0px;\">\n");
      out.write("        <div class=\"container-fluid\">\n");
      out.write("            <div class=\"navbar-header\">\n");
      out.write("                <a class=\"navbar-brand\" href=\"\" style=\"margin-top:-7px\">\n");
      out.write("                    <img alt=\"Brand\" src=\"");
      out.print(base_url);
      out.write("images/icon.png\" width=\"34px\" >\n");
      out.write("                </a>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </nav>\n");
      out.write("\n");
      out.write("    <div class=\"container-fluid\" style=\"padding:0px; margin-top:-20px\">\n");
      out.write("        <div class=\"row-fuid\" style=\"background-color:#902654; color:#f3e2e9;\">\n");
      out.write("            <div class=\"container\">\n");
      out.write("                <div class=\"row \">\n");
      out.write("                    <br>\n");
      out.write("                    <h1>Inicio de sesión</h1>\n");
      out.write("                    <br>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("    <div class=\"container\">\n");
      out.write("        <div class=\"row\">\n");
      out.write("            <div class=\"col-md-4 col-md-offset-4\">\n");
      out.write("                <br><br><br>\n");
      out.write("                <center>\n");
      out.write("                    <img alt=\"Brand\" src=\"");
      out.print(base_url);
      out.write("images/icon.png\" width=\"100px\">\n");
      out.write("                </center>\n");
      out.write("                <br>\n");
      out.write("                <form method=\"post\" action=\"Login\">\n");
      out.write("                    <div class=\"form-group\">\n");
      out.write("                        <input type=\"email\" id=\"correo\" name=\"correo\" class=\"form-control\" placeholder=\"Correo electrónico\" >\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"form-group\">\n");
      out.write("                        <input type=\"password\" id=\"ci\" name=\"ci\" class=\"form-control\" placeholder=\"Contraseña\" >\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"form-group\">\n");
      out.write("                        <button type=\"submit\" class=\"btn btn-success btn-block\">Ingresar</button>\n");
      out.write("                    </div>\n");
      out.write("                </form>\n");
      out.write("                <br><br><br><br><br>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("    <br>\n");
      out.write("    <footer style=\"background-color:black;\">\n");
      out.write("        <br>\n");
      out.write("        <center>\n");
      out.write("            <p style=\"color:#d1d4d4;\">Aprendizaje en linea - 2016</p>\n");
      out.write("        </center>\n");
      out.write("        <br>\n");
      out.write("    </footer>\n");
      out.write("    <script src=\"");
      out.print(base_url);
      out.write("assets/jquery/jquery.validate.js\"></script>\n");
      out.write("    <script src=\"");
      out.print(base_url);
      out.write("assets/js/validation/login.js\"></script>\n");
      out.write("    <script src=\"");
      out.print(base_url);
      out.write("assets/bootstrap/js/bootstrap.js\"></script>\n");
      out.write("</body>\n");
      out.write("\n");
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
