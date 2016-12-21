<% 
    String base_url = "http://localhost/AprendizajeOnLine/";
    
    if(session.getAttribute("estudiante") != null && !session.getAttribute("estudiante").equals("")){
        response.sendRedirect("temas.jsp");
    } 
%>
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
        </div>
    </nav>

    <div class="container-fluid" style="padding:0px; margin-top:-20px">
        <div class="row-fuid" style="background-color:#902654; color:#f3e2e9;">
            <div class="container">
                <div class="row ">
                    <br>
                    <h1>Registro de estudiantes</h1>
                    <br>
                </div>
            </div>
        </div>
    </div>

    <div class="container">
        <div class="row">
            <div class="col-md-6 col-md-offset-3">
                <br><br><br>
                <form method="post" action="Registro">
                    <table class="table">
                        <tr>
                            <td style="border-top: 0px solid #ddd;">
                                <label for="carnet">Carnet</label>
                                <input type="text" class="form-control" id="carnet" name="carnet">
                            </td>
                            <td style="border-top: 0px solid #ddd;" colspan="2">
                                <label>Sexo</label></br>
                                <label class="radio-inline"><input type="radio" name="sexo" id="sexo" value="Hombre" checked>Hombre</label>
                                <label class="radio-inline"><input type="radio" name="sexo" id="sexo" value="Mujer">Mujer</label>
                            </td>
                        </tr>
                        <tr>
                            <td style="border-top: 0px solid #ddd;">
                                <label for="paterno">Paterno</label>
                                <input type="text" class="form-control" id="paterno" name="paterno">
                            </td>
                            <td style="border-top: 0px solid #ddd;">
                                <label for="materno">Materno</label>
                                <input type="text" class="form-control" id="materno" name="materno">
                            </td>
                            <td style="border-top: 0px solid #ddd;">
                                <label for="nombres">Nombres</label>
                                <input type="text" class="form-control" id="nombres" name="nombres">
                            </td>
                        </tr>
                        <tr>
                            <td style="border-top: 0px solid #ddd;">
                                <label for="celular">Celular</label>
                                <input type="text" class="form-control" id="celular" name="celular">
                            </td>
                            <td style="border-top: 0px solid #ddd;" colspan="2">
                                <label for="correo">Correo electrónico</label>
                                <input type="email" class="form-control" id="correo" name="correo">
                            </td>
                        </tr>
                        <tr>
                            <td style="border-top: 0px solid #ddd;" colspan="3">
                                <label for="materia">Seleccione la materia</label>
                                <select class="form-control" id="materia" name="materia">
                                    <option value="Matematica">Matemática</option>
                                    <option value="Fisica">Física</option>
                                    <option value="Quimica">Química</option>
                                </select>
                            </td>
                        </tr>
                        <tr>
                           <td style="border-top: 0px solid #ddd;" >
                               <button type="submit" class="btn btn-success btn-block">
                                   Enviar registro
                               </button>
                           </td> 
                        </tr>
                    </table>
                </form>
            </div>
        </div>
    </div>

    <br>

    

    

    

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
