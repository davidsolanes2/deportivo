<%-- 
    Document   : main01
    Created on : 18-abr-2017, 22:11:14
    Author     : david
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link href="../css/bootstrap.min.css" rel="stylesheet" type="text/css"/>
        <link href="../css/bootstrap-theme.min.css" rel="stylesheet" type="text/css"/>
        <link href="../css/main.css" rel="stylesheet" type="text/css"/>
        <link href="../css/deportivo.css" rel="stylesheet" type="text/css"/>
        <script src="js/vendor/modernizr-2.8.3-respond-1.4.2.min.js"></script>
        <style></style>
    </head>
    <body>
        <div id="relleno">
        <nav class="titulo">
            <p align="center">Gestion del Centro Deportivo</p>
        </nav>
        <div>
            <h6>Datos Personales</h6>
            <hr>
            <table>
                <tr>
                    <td id="boton_4">
                        <form action="template01.jsp" method="post">
                           <input type="submit" value="Registro General"/>
                        </form>
                    </td>
                    <td id="boton_5">
                        <form action="template02.jsp" method="post">
                           <input type="submit" value="Datos Empleados"/>
                        </form>
                    </td>
                </tr>
                <tr>
                    <!--
                    <td id="boton_6">
                        <form action="template-03.html" method="post">
                           <input type="submit" value="Registro Usuarios"/>
                        </form>
                    </td>
                    -->
                    <td id="boton_7">
                        <form action="template03.jsp" method="post">
                           <input type="submit" value="Datos Socios"/>
                        </form>
                    </td>
                </tr>
            </table>
            <br>
            <h6>Datos Salas</h6>
            <hr>
            <table>
                <tr>
                    <td id="boton_8">
                        <form action="template04.jsp" method="post">
                           <input type="submit" value="Actividades"/>
                        </form>
                    </td>
                </tr>
            </table>
            <div align="center">
                <table>
                    <tr>
                        <td id="boton_3">
                            <form action="index.jsp" method="post">
                              <input type="submit" value="Home"/>
                            </form>
                        </td>
                    </tr>
                </table>
            </div>
        </div>
        <footer>
            <div class="pie_1" >
                <table>
                    <h6>Building by </h6>
                    <h4>Corneyesky/Llauna</h4>
                </table>
            </div>
            <div class="pie_2"></div>
        </footer>
    </body>
</html>
