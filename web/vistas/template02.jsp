<%-- 
    Document   : template02
    Created on : 20-abr-2017, 19:45:31
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
            <p align="center">Empleados</p>
        </nav>
        <div>
            <form action="newdate" method="POST">
                <table class="form">
                    <tr>
                        <td>Empleado :</td>
                        <td><input type="text" name="idempleado"> Fecha de Baja :
                            <input type="date" name="fechaBaja"> <span style="margin-left: 115px; margin-right: 20px;">Categoria :</span> 
                            <input type="text" name="idcategoria">
                        </td>
                    </tr>
                    <tr>
                        <td>Nif :</td>
                        <td><input type="text" name="idnif_usuarionif"> <span style="margin-right: 46px;">Actividad :</span>
                            <input type="text" name="actividad"> <span style="margin-right: 46px;">Salario :</span>
                            <input type="number" name="salario">
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
