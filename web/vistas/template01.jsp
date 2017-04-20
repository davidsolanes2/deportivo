<%-- 
    Document   : template01
    Created on : 20-abr-2017, 19:45:15
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
            <p align="center">Registro General</p>
        </nav>
        <div>
            <form action="newdate" method="POST">
                <table class="form">
                    <tr>
                        <td>Usuario :</td>
                        <td><input type="text" name="idusuario"> Fecha de Alta :
                            <input type="date" name="fechaAlta"> <span style="margin-left: 115px;">Nif :</span> 
                            <input type="text" name="nif">
                        </td>
                    </tr>
                    <tr>
                        <td>Nombre :</td>
                        <td><input type="text" name="nombre"> <span style="margin-right: 43px;">Apellidos :</span>
                            <input type="text" name="apellidos">
                        </td>
                    </tr>
                    <tr>
                        <td>Direccion :</td>
                        <td><input type="text" name="direccion"> <span style="margin-right: 37px;">Poblacion :</span>
                            <input type="text" name="poblacion"> Codigo Postal :  
                            <input type="text" name="cp" style="width: 75px">
                        </td>     
                    </tr>
                    <tr>
                        <td>Telefono : </td>
                        <td><input type="text" name="telefono"><span style="margin-right: 75px;"> Email :</span>
                            <input type="text" name="email">
                        </td>
                    </tr>
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
