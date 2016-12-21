<% 
    String base_url = "http://localhost/AprendizajeOnLine/";
    
    if((session.getAttribute("estudiante") != null && !session.getAttribute("estudiante").equals(""))
            || (session.getAttribute("docente") != null && !session.getAttribute("docente").equals(""))){
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
                    <h1>Cuenta registrada ya puede iniciar sesión.</h1>
                    <br>
                </div>
            </div>
        </div>
    </div>

    <div class="container">
        <div class="row">
            <div class="col-md-4 col-md-offset-4">
                <br><br><br>
                <center>
                    <img alt="Brand" src="<%=base_url%>images/icon.png" width="100px">
                </center>
                <br>
                <form method="post" action="Login">
                    <div class="form-group">
                        <input type="email" id="correo" name="correo" class="form-control" placeholder="Correo electrónico" >
                    </div>
                    <div class="form-group">
                        <input type="password" id="ci" name="ci" class="form-control" placeholder="Contraseña" >
                    </div>
                    <div class="form-group">
                        <button type="submit" class="btn btn-success btn-block">Ingresar</button>
                    </div>
                </form>
                <br><br><br><br><br>
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
