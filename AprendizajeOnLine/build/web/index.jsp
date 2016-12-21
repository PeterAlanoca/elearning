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
                <ul class="nav navbar-nav navbar-right">
                    <li>
                        <a data-toggle="modal" data-target="#modal-login">
                            <span class="fa fa-user"></span>
                            Iniciar Sesión 
                        </a>
                    </li>
                </ul>
            </div>
        </div>
    </nav>

    <div class="container-fluid" style="padding:0px; margin-top:-20px;">
        <div class="row-fluid">
            <div id="carousel-example-generic" class="carousel slide" data-ride="carousel">
                <ol class="carousel-indicators">
                    <li data-target="#carousel-example-generic" data-slide-to="0"></li>
                    <li data-target="#carousel-example-generic" data-slide-to="1" class="active"></li>
                    <li data-target="#carousel-example-generic" data-slide-to="2"></li>
                </ol>
                <div class="carousel-inner" role="listbox">
                    <div class="item">
                        <img  src="<%=base_url%>images/bg1.jpg" width="100%">
                    </div>
                    <div class="item active">
                        <img src="<%=base_url%>images/bg2.jpg" width="100%">
                    </div>
                    <div class="item">
                        <img src="<%=base_url%>images/bg3.jpg" width="100%">
                    </div>
                </div>
                <a class="left carousel-control" href="#carousel-example-generic" role="button" data-slide="prev">
                    <span class="glyphicon glyphicon-chevron-left" aria-hidden="true"></span>
                    <span class="sr-only">Previous</span>
                </a>
                <a class="right carousel-control" href="#carousel-example-generic" role="button" data-slide="next">
                    <span class="glyphicon glyphicon-chevron-right" aria-hidden="true"></span>
                    <span class="sr-only">Next</span>
                </a>
            </div>
        </div>
    </div>

    <div class="container" style="margin-top:35px">
        <div class="row">
            <div class="col-md-4">
                <div class="row">
                    <div class="col-sm-12 col-md-12">
                        <div class="thumbnail" style="background-color:#eee">
                            <div class="col-md-3">
                                <center>
                                    <h1 style="font-size:28px; margin:0px;margin-top:20px;">
                                        <span class="fa-stack fa-lg" style="color:#5cb85c">
                                            <i class="fa fa-circle fa-stack-2x"></i>
                                            <i class="fa fa-superscript fa-stack-1x fa-inverse"></i>
                                        </span>
                                    </h1>
                                </center>
                            </div>
                            <div class="col-md-9">
                                <h2>Matemática</h2>
                                <p>Es una ciencia formal partiendo de axiomas y siguiendo el razonamiento lógico.</p>
                            </div>
                            <div class="caption col-md-offset-3">
                                <form action="registro.jsp">
                                    <button type="submit" class="btn btn-success btn-block">
                                        Registrarse
                                    </button>
                                </form>
                            </div>
                        </div>
                    </div>
                </div>
            </div>

            <div class="col-md-4">
                <div class="row">
                    <div class="col-sm-12 col-md-12">
                        <div class="thumbnail" style="background-color:#eee">
                            <div class="col-md-3">
                                <center>
                                    <h1 style="font-size:28px; margin:0px;margin-top:20px;">
                                        <span class="fa-stack fa-lg" style="color:#5bc0de">
                                            <i class="fa fa-circle fa-stack-2x"></i>
                                            <i class="fa fa-bolt fa-stack-1x fa-inverse"></i>
                                        </span>
                                    </h1>
                                </center>
                            </div>
                            <div class="col-md-9">
                                <h2>Física</h2>
                                <p>Es la ciencia natural que estudia las propiedades, el comportamiento de la energía y la materia.</p>
                            </div>
                            <div class="caption col-md-offset-3">
                                <form action="registro.jsp">
                                    <button type="submit" class="btn btn-info btn-block">
                                        Registrarse
                                    </button>
                                </form>
                            </div>
                        </div>
                    </div>
                </div>
            </div>

            <div class="col-md-4">
                <div class="row">
                    <div class="col-sm-12 col-md-12">
                        <div class="thumbnail" style="background-color:#eee">
                            <div class="col-md-3">
                                <center>
                                    <h1 style="font-size:28px; margin:0px;margin-top:20px;">
                                        <span class="fa-stack fa-lg" style="color:#f0ad4e">
                                            <i class="fa fa-circle fa-stack-2x"></i>
                                            <i class="fa fa-flask fa-stack-1x fa-inverse"></i>
                                        </span>
                                    </h1>
                                </center>
                            </div>
                            <div class="col-md-9">
                                <h2>Química</h2>
                                <p>Estudia la composición, estructura y propiedades de la materia como los cambios que esta experimenta.</p>
                            </div>
                            <div class="caption col-md-offset-3">
                                <form action="registro.jsp">
                                    <button type="submit" class="btn btn-warning btn-block">
                                        Registrarse
                                    </button>
                                </form>
                            </div>
                        </div>
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

<!-- Modal -->
<div class="modal fade" id="modal-login" tabindex="-1" role="dialog" aria-labelledby="myModalLabel">
    <div class="modal-dialog modal-sm" role="document">
        <div class="modal-content">
            <div class="modal-body">
                <center>
                    <img src="<%=base_url%>images/icon.png" class="img-responsive" width="100px">
                </center>
                <form id="form1" method="post" action="Login">
                    <h3 align="center" class="sub-header-text">Iniciar Sesión</h3>
                    <div class="form-group">
                        <input type="text" class="form-control" name="correo" id="correo" placeholder="Correo electrónico">
                    </div>
                    <div class="form-group">
                        <input type="password" class="form-control" name="ci" id="ci" placeholder="Contraseña">
                    </div>
                    <div class="form-group">
                        <input type="submit" value="INGRESAR" class="btn btn-default btn-block btn-success">
                    </div>
                </form>
        </div>
    </div>
</div>

    
    <script src="<%=base_url%>assets/jquery/jquery.validate.js"></script>
    <script src="<%=base_url%>assets/js/validation/login.js"></script>
    <script src="<%=base_url%>assets/bootstrap/js/bootstrap.js"></script>
</body>

</html>
