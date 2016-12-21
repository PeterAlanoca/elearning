<%@page import="com.aprendizajeonline.model.DocenteModel"%>
<%@page import="com.aprendizajeonline.objetos.Docente"%>
<%@page import="com.aprendizajeonline.objetos.Tema"%>
<%@page import="com.aprendizajeonline.model.TemaModel"%>
<%@page import="com.aprendizajeonline.model.EstudianteModel"%>
<%@page import="com.aprendizajeonline.objetos.Estudiante"%>
<%@page import="java.util.List"%>
<% 
    int id = 0;
    String ci = "", nombre = "", paterno = "", materno = "", correo = "", celular = "", sexo = "", materia = ""; 
    String base_url = "http://localhost/AprendizajeOnLine/";
    Estudiante estudiante = null;
    EstudianteModel estudianteModel = new EstudianteModel();
    TemaModel temaModel = new TemaModel();
    List<Tema> temas = null;
    List<Tema> AuxTemas = null;
    Docente docente = null;
    DocenteModel docenteModel = new DocenteModel();
    
    if (session != null) {
        if (session.getAttribute("estudiante") != null) {
            int idEstudiante = Integer.parseInt((String) session.getAttribute("id_estudiante"));
            estudiante = estudianteModel.getId(idEstudiante);
            id = estudiante.getId();
            ci = estudiante.getCi();
            nombre = estudiante.getNombre();
            paterno = estudiante.getPaterno();
            materno = estudiante.getMaterno();
            correo = estudiante.getCorreo();
            celular = estudiante.getCelular();
            sexo = estudiante.getSexo();
            materia = estudiante.getMateria();
            temas = temaModel.getAllMateria(materia);
            AuxTemas = temas;
        } else {
            if(session.getAttribute("docente") != null){
                int idDocente = Integer.parseInt((String) session.getAttribute("id_docente"));
                docente = docenteModel.getId(idDocente);
                id = docente.getId();
                ci = docente.getCi();
                nombre = docente.getNombre();
                paterno = docente.getPaterno();
                materno = docente.getMaterno();
                correo = docente.getCorreo();
                sexo = docente.getSexo();
                materia = docente.getMateria();
                temas = temaModel.getAllMateria(materia);
                AuxTemas = temas;
            }else{            
                response.sendRedirect("index.jsp");
            }
	}
    }
    
    
%>

<%@ taglib prefix="core" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="es">

<head>
    <meta charset="utf-8">
    <link rel="icon" type="image/png" href="<%=base_url%>images/icon.png">
    <meta name="description" content="">
    <meta name="author" content="">
    <title>Aprendizaje en linea</title>
    <link href="http://maxcdn.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css" rel="stylesheet">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css" integrity="sha384-1q8mTJOASx8j1Au+a5WDVnPi2lkFfwwEAa8hDDdjZlpLegxhjVME1fgjWPGmkzs7" crossorigin="anonymous">
    <!--link rel="stylesheet" type="text/css" href="<%=base_url%>assets/bootstrap/css/bootstrap.css"-->
    <script src="<%=base_url%>assets/js/jquery-latest.min.js"></script>
    <script src="<%=base_url%>assets/js/jquery.backstretch.min.js"></script> 
    <link href="<%=base_url%>assets/star-rating/fileinput.css" media="all" rel="stylesheet" type="text/css" />
    <script src="<%=base_url%>assets/star-rating/fileinput.js" type="text/javascript"></script>
    <script src="<%=base_url%>assets/star-rating/es.js" type="text/javascript"></script>

    <style type="text/css">
        .btn-success {
            color: #fff;
            background-color: #902654;
            border-color: #902654;
        }
    </style>
   
</head>

<body>
    <nav class="navbar navbar-inverse navbar-default" style="border-radius: 0px;">
        <div class="container-fluid">
            <div class="navbar-header">
                <a class="navbar-brand" href="" style="margin-top:-7px">
                    <img alt="Brand" src="<%=base_url%>images/icon.png" width="34px" >
                </a>
            </div>
            <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
                <ul class="nav navbar-nav">
                    <li class="active"><a href="temas.jsp"><%=materia%> <span class="sr-only">(current)</span></a></li>
                </ul>
                <ul class="nav navbar-nav navbar-right">
                    <li class="dropdown">
                        <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false">
                            <i class="glyphicon glyphicon-user" style="font-size:16px"></i>
                            <%=nombre+" "+paterno+" "+materno%>
                            <span class="caret"></span>
                        </a>
                        <ul class="dropdown-menu">
                            <li><a href="perfilmain.jsp?id=<%=id%>"><span class="glyphicon glyphicon-user"></span> Perfil</a></li>
                            <li role="separator" class="divider"></li>
                            <li><a href="Logout"><span class="glyphicon glyphicon-off"></span>  Cerrar sesión</a></li>
                        </ul>
                    </li>
                </ul>
            </div>
        </div>
    </nav>

    <div class="container-fluid" style="padding:0px; margin-top:-20px;margin-bottom:20px">
        <div class="row-fuid" style="background-color:#902654; color:#f3e2e9;">
            <div class="container">
                <div class="row ">
                    <br>
                    <h1><%=materia%></h1>
                    <br>
                </div>
            </div>
        </div>
    </div>

    <div class="container-fluid" style="padding:0px;">
        <div class="row-fluid">
            <div class="col-md-3">
                <div class="row">
                    <div class="col-xs-12 col-md-12">
                        <div class="thumbnail">
                            <h4 style="color:#902654">NAVEGACIÓN</h4>
                            <a role="button" data-toggle="collapse" href="#participates" style="text-decoration: none;">
                                <h4 style="margin-left:30px; color:#902654">
                                    <i class="fa fa-users" aria-hidden="true"></i> 
                                    Participantes
                                </h4>
                            </a>
                            <div class="collapse" id="participates" style="margin-left:55px; color:#902654">
                            <%
                                List<Estudiante> estudiantes = estudianteModel.getMateria(materia);
                                for(Estudiante alumno: estudiantes){ 
                            %>
                                <a role="button" data-toggle="collapse" href="#estudiante<%=alumno.getId()%>" style="text-decoration: none;">
                                    <h4 style="color:#902654">
                                        <i class="glyphicon glyphicon-user" aria-hidden="true"></i>
                                <%=alumno.getNombre()+" "+alumno.getPaterno()+" "+alumno.getMaterno()%>
                                    </h4>
                                </a>
                                <div class="collapse" id="estudiante<%=alumno.getId()%>" style="margin-left:28px; color:#902654">
                                    <a href="perfil.jsp?id=<%=alumno.getId()%>" style="text-decoration: none; color:#902654"><h5>Ver perfil</h5></a>
                                </div>
                            <%
                                }
                            %>
                            </div>
                            <a role="button" data-toggle="collapse" href="#tema" style="text-decoration: none;">
                                <h4 style="margin-left:30px; color:#902654">
                                    <i class="glyphicon glyphicon-book" aria-hidden="true"></i> 
                                    Temas
                                </h4>
                            </a>
                            <div class="collapse" id="tema" style="margin-left:55px; color:#902654">
                                <%
                                    for(Tema tema: temas){ 
                                %>
                                <a href="tema.jsp?id=<%=tema.getId()%>" style="text-decoration: none; color:#902654">
                                    <h5>
                                        <span class="glyphicon glyphicon-asterisk"></span>
                                    <%=tema.getTitulo()%>
                                    </h5>
                                </a>
                                <%
                                    }
                                %>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
            <div class="col-md-6">
                <div class="row">
                    <div class="col-xs-12 col-md-12">
                        

                        <div class="thumbnail">
                            <%
                                String nombrep = "", correop = "", celularp = "", materiap = "";
                                int idperfil = Integer.parseInt(request.getParameter("id"));
                                
                                if(docente != null){
                                    Docente d = docenteModel.getId(idperfil);
                                    nombrep = "DOCENTE: "+d.getNombre()+" "+d.getPaterno()+" "+d.getMaterno();
                                    correop = d.getCorreo();
                                    celularp = "nn";
                                    materiap = d.getMateria();
                                } else {
                                    Estudiante e = estudianteModel.getId(idperfil);
                                    nombrep = "ESTUDIANTE: "+e.getNombre()+" "+e.getPaterno()+" "+e.getMaterno();
                                    correop = e.getCorreo();
                                    celularp = e.getCelular();
                                    materiap = e.getMateria();
                                }
                                
                            %>
                            <h4 style="color:#902654; "><%=nombrep.toUpperCase()%></h4>
                            <table style="margin-left: 30px">
                                <tr>
                                    <td>
                                        <h1 style="font-size:96px; color:#902654; "><i class="glyphicon glyphicon-user"></i></h1>
                                    </td>
                                    <td>
                                        <div style="margin-left:30px; color:#902654; ">
                                            <h4><span class="fa fa-envelope"></span> <%=correop%></h4>
                                            <h4><span class="fa fa-phone-square"></span> <%=celularp%></h4>
                                            <h4><span class="glyphicon glyphicon-book"></span> <%=materiap%></h4>
                                        </div>
                                    </td>
                                </tr>
                            </table>
                        </div>
                    </div>
                </div>
            </div>
            <div class="col-md-3">
                <div class="row">
                    <div class="col-xs-12 col-md-12">
                        <div class="thumbnail">
                            <h4 style="color:#902654">CALENDARIO</h4>
                            <center>
                                <table class="table table-bordered table-striped">
                                    <thead>
                                        <tr>
                                            <th style="color:#902654" colspan="7"><center>Diciembre 2016</center></th>
                                        </tr>
                                        <tr style="color:#902654">
                                            <th>L</th><th>M</th><th>M</th><th>J</th><th>V</th><th>S</th><th>D</th>
                                        </tr>
                                    </thead>
                                    <tbody>
                                        <tr>
                                            <td class="muted">28</td><td class="muted">29</td><td class="muted">30</td><td>1</td><td>2</td><td>3</td><td>4</td>
                                        </tr>
                                        <tr>
                                            <td><strong>5</strong></td><td>6</td><td>7</td><td>8</td><td>9</td><td>10</td><td>11</td>
                                        </tr>
                                        <tr>
                                            <td>12</td><td>13</td><td>14</td><td>15</td><td>16</td><td>17</td><td>18</td>
                                        </tr>
                                        <tr>
                                            <td>19</td><td>20</td><td>21</td><td>22</td><td>23</td><td>24</td><td>25</td>
                                        </tr>
                                        <tr>
                                            <td>26</td><td>27</td><td>28</td><td>29</td><td>30</td><td>31</td><td class="muted">1</td>
                                        </tr>
                                    </tbody>
                                </table>    
                            </center>
                        </div>
                        <br><br><br>
                    </div>
                </div>
            </div>
        </div>
    </div>

    <footer style="background-color:black;">
        <br>
        <center>
            <p style="color:#d1d4d4;">Aprendizaje en linea - 2016</p>
        </center>
        <br>
    </footer>
    
    <script src="<%=base_url%>assets/jquery/jquery.validate.js"></script>
    <script src="<%=base_url%>assets/js/validation/login.js"></script>
    <script src="<%=base_url%>assets/bootstrap/js/bootstrap.js"></script>
</body>

</html>
