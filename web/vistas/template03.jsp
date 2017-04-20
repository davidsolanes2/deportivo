<%-- 
    Document   : template03
    Created on : 20-abr-2017, 19:45:47
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
        <link rel="stylesheet" href="css/deportivo.css">
    </head>
      <body id="relleno">
        <nav class="titulo">
            <p align="center">Socios</p>
        </nav>
        <div>
            <form action="newdate" method="POST">
                <table class="form">
                    <tr>
                        <td>Socio :</td>
                        <td><input type="text" name="idsocio"> Fecha de Baja :
                            <input type="date" name="fechaBaja"> <span style="margin-left: 45px; margin-right: 10px;">Suscrito :</span> 
                            <input type="text" name="socio_participa">
                        </td>
                    </tr>
                    <tr>
                        <td>Nif :</td>
                        <td><input type="text" name="idnif_usuarionif"> <span style="margin-right: 73px;">Cuota :</span>
                            <input type="number" name="cuota">
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
