<%-- 
    Document   : template04
    Created on : 20-abr-2017, 19:46:02
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
            <p align="center">Actividades</p>
        </nav>
        <div>
            <form action="newdate" method="POST">
                <table class="form">
                    <tr>
                        <td>Actividad :</td>
                        <td><input type="text" name="idactividad"> Fecha :
                            <input type="date" name="fecha"> <span style="margin-left: 45px; margin-right: 10px;">Descripcion :</span> 
                            <input type="text" name="descripcionActividad">
                        </td>
                    </tr>
                    <tr>
                        <td>Actividad :</td>
                        <td><input type="text" name="actividad">
                        </td>
                    </tr>
  
                </table>
            </form>
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
