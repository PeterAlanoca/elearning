package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("            <div class=\"collapse navbar-collapse\" id=\"bs-example-navbar-collapse-1\">\n");
      out.write("                <ul class=\"nav navbar-nav navbar-right\">\n");
      out.write("                    <li>\n");
      out.write("                        <a data-toggle=\"modal\" data-target=\"#modal-login\">\n");
      out.write("                            <span class=\"fa fa-user\"></span>\n");
      out.write("                            Iniciar Sesión \n");
      out.write("                        </a>\n");
      out.write("                    </li>\n");
      out.write("                </ul>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </nav>\n");
      out.write("\n");
      out.write("    <div class=\"container-fluid\" style=\"padding:0px; margin-top:-20px;\">\n");
      out.write("        <div class=\"row-fluid\">\n");
      out.write("            <div id=\"carousel-example-generic\" class=\"carousel slide\" data-ride=\"carousel\">\n");
      out.write("                <ol class=\"carousel-indicators\">\n");
      out.write("                    <li data-target=\"#carousel-example-generic\" data-slide-to=\"0\"></li>\n");
      out.write("                    <li data-target=\"#carousel-example-generic\" data-slide-to=\"1\" class=\"active\"></li>\n");
      out.write("                    <li data-target=\"#carousel-example-generic\" data-slide-to=\"2\"></li>\n");
      out.write("                </ol>\n");
      out.write("                <div class=\"carousel-inner\" role=\"listbox\">\n");
      out.write("                    <div class=\"item\">\n");
      out.write("                        <img  src=\"");
      out.print(base_url);
      out.write("images/bg1.jpg\" width=\"100%\">\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"item active\">\n");
      out.write("                        <img src=\"");
      out.print(base_url);
      out.write("images/bg2.jpg\" width=\"100%\">\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"item\">\n");
      out.write("                        <img src=\"");
      out.print(base_url);
      out.write("images/bg3.jpg\" width=\"100%\">\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <a class=\"left carousel-control\" href=\"#carousel-example-generic\" role=\"button\" data-slide=\"prev\">\n");
      out.write("                    <span class=\"glyphicon glyphicon-chevron-left\" aria-hidden=\"true\"></span>\n");
      out.write("                    <span class=\"sr-only\">Previous</span>\n");
      out.write("                </a>\n");
      out.write("                <a class=\"right carousel-control\" href=\"#carousel-example-generic\" role=\"button\" data-slide=\"next\">\n");
      out.write("                    <span class=\"glyphicon glyphicon-chevron-right\" aria-hidden=\"true\"></span>\n");
      out.write("                    <span class=\"sr-only\">Next</span>\n");
      out.write("                </a>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("    <div class=\"container\" style=\"margin-top:35px\">\n");
      out.write("        <div class=\"row\">\n");
      out.write("            <div class=\"col-md-4\">\n");
      out.write("                <div class=\"row\">\n");
      out.write("                    <div class=\"col-sm-12 col-md-12\">\n");
      out.write("                        <div class=\"thumbnail\" style=\"background-color:#eee\">\n");
      out.write("                            <div class=\"col-md-3\">\n");
      out.write("                                <center>\n");
      out.write("                                    <h1 style=\"font-size:28px; margin:0px;margin-top:20px;\">\n");
      out.write("                                        <span class=\"fa-stack fa-lg\" style=\"color:#5cb85c\">\n");
      out.write("                                            <i class=\"fa fa-circle fa-stack-2x\"></i>\n");
      out.write("                                            <i class=\"fa fa-superscript fa-stack-1x fa-inverse\"></i>\n");
      out.write("                                        </span>\n");
      out.write("                                    </h1>\n");
      out.write("                                </center>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"col-md-9\">\n");
      out.write("                                <h2>Matemática</h2>\n");
      out.write("                                <p>Es una ciencia formal partiendo de axiomas y siguiendo el razonamiento lógico.</p>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"caption col-md-offset-3\">\n");
      out.write("                                <form action=\"registro.jsp\">\n");
      out.write("                                    <button type=\"submit\" class=\"btn btn-success btn-block\">\n");
      out.write("                                        Registrarse\n");
      out.write("                                    </button>\n");
      out.write("                                </form>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("            <div class=\"col-md-4\">\n");
      out.write("                <div class=\"row\">\n");
      out.write("                    <div class=\"col-sm-12 col-md-12\">\n");
      out.write("                        <div class=\"thumbnail\" style=\"background-color:#eee\">\n");
      out.write("                            <div class=\"col-md-3\">\n");
      out.write("                                <center>\n");
      out.write("                                    <h1 style=\"font-size:28px; margin:0px;margin-top:20px;\">\n");
      out.write("                                        <span class=\"fa-stack fa-lg\" style=\"color:#5bc0de\">\n");
      out.write("                                            <i class=\"fa fa-circle fa-stack-2x\"></i>\n");
      out.write("                                            <i class=\"fa fa-bolt fa-stack-1x fa-inverse\"></i>\n");
      out.write("                                        </span>\n");
      out.write("                                    </h1>\n");
      out.write("                                </center>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"col-md-9\">\n");
      out.write("                                <h2>Física</h2>\n");
      out.write("                                <p>Es la ciencia natural que estudia las propiedades, el comportamiento de la energía y la materia.</p>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"caption col-md-offset-3\">\n");
      out.write("                                <form action=\"registro.jsp\">\n");
      out.write("                                    <button type=\"submit\" class=\"btn btn-info btn-block\">\n");
      out.write("                                        Registrarse\n");
      out.write("                                    </button>\n");
      out.write("                                </form>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("            <div class=\"col-md-4\">\n");
      out.write("                <div class=\"row\">\n");
      out.write("                    <div class=\"col-sm-12 col-md-12\">\n");
      out.write("                        <div class=\"thumbnail\" style=\"background-color:#eee\">\n");
      out.write("                            <div class=\"col-md-3\">\n");
      out.write("                                <center>\n");
      out.write("                                    <h1 style=\"font-size:28px; margin:0px;margin-top:20px;\">\n");
      out.write("                                        <span class=\"fa-stack fa-lg\" style=\"color:#f0ad4e\">\n");
      out.write("                                            <i class=\"fa fa-circle fa-stack-2x\"></i>\n");
      out.write("                                            <i class=\"fa fa-flask fa-stack-1x fa-inverse\"></i>\n");
      out.write("                                        </span>\n");
      out.write("                                    </h1>\n");
      out.write("                                </center>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"col-md-9\">\n");
      out.write("                                <h2>Química</h2>\n");
      out.write("                                <p>Estudia la composición, estructura y propiedades de la materia como los cambios que esta experimenta.</p>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"caption col-md-offset-3\">\n");
      out.write("                                <form action=\"registro.jsp\">\n");
      out.write("                                    <button type=\"submit\" class=\"btn btn-warning btn-block\">\n");
      out.write("                                        Registrarse\n");
      out.write("                                    </button>\n");
      out.write("                                </form>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("    <footer style=\"background-color:black;\">\n");
      out.write("        <br>\n");
      out.write("        <center>\n");
      out.write("            <p style=\"color:#d1d4d4;\">Aprendizaje en linea - 2016</p>\n");
      out.write("        </center>\n");
      out.write("        <br>\n");
      out.write("    </footer>\n");
      out.write("\n");
      out.write("<!-- Modal -->\n");
      out.write("<div class=\"modal fade\" id=\"modal-login\" tabindex=\"-1\" role=\"dialog\" aria-labelledby=\"myModalLabel\">\n");
      out.write("    <div class=\"modal-dialog modal-sm\" role=\"document\">\n");
      out.write("        <div class=\"modal-content\">\n");
      out.write("            <div class=\"modal-body\">\n");
      out.write("                <center>\n");
      out.write("                    <img src=\"");
      out.print(base_url);
      out.write("images/icon.png\" class=\"img-responsive\" width=\"100px\">\n");
      out.write("                </center>\n");
      out.write("                <form id=\"form1\" method=\"post\" action=\"Login\">\n");
      out.write("                    <h3 align=\"center\" class=\"sub-header-text\">Iniciar Sesión</h3>\n");
      out.write("                    <div class=\"form-group\">\n");
      out.write("                        <input type=\"correo\" class=\"form-control\" name=\"correo\" id=\"correo\" placeholder=\"Correo electrónico\">\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"form-group\">\n");
      out.write("                        <input type=\"password\" class=\"form-control\" name=\"ci\" id=\"ci\" placeholder=\"Contraseña\">\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"form-group\">\n");
      out.write("                        <input type=\"submit\" value=\"INGRESAR\" class=\"btn btn-default btn-block btn-success\">\n");
      out.write("                    </div>\n");
      out.write("                </form>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("    \n");
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
