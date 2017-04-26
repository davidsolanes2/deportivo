<%-- 
    Document   : template12
    Created on : 26-abr-2017, 16:41:36
    Author     : david
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Centro Deportivo</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link href="../css/bootstrap.min.css" rel="stylesheet" type="text/css"/>
        <link href="../css/bootstrap-theme.min.css" rel="stylesheet" type="text/css"/>
        <link href="../css/main.css" rel="stylesheet" type="text/css"/>
        <link href="../css/deportivo.css" rel="stylesheet" type="text/css"/>
    </head>
    <body id="relleno">
        <nav class="titulo">
            <p align="center">Datos Usuario</p>
        </nav>
        <div>
            <form action="newdate" method="POST">
                <table class="form">
                    
                </table>
            </form>
            <br><br>
            <div class="botonera">
                <input type="submit" value="Guardar" class="btn btn-primary">
            </div>
        </div>
        <hr>
        <div align="center">
            <table>
                <tr>
                    <td id="boton_9">
                        <form action="main01.jsp" method="post">
                            <input type="submit" value="Anterior"/>
                        </form>
                    </td>
                </tr>
            </table>
        </div>
    </body>
</html>
