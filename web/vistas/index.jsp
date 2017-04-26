<%-- 
    Document   : index01
    Created on : 17-abr-2017, 12:52:33
    Author     : david
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Centro Deportivo</title>
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link href="../css/bootstrap.min.css" rel="stylesheet" type="text/css"/>
        <link href="../css/bootstrap-theme.min.css" rel="stylesheet" type="text/css"/>
        <link href="../css/main.css" rel="stylesheet" type="text/css"/>
        <link href="../css/deportivo.css" rel="stylesheet" type="text/css"/>
        <script src="js/vendor/modernizr-2.8.3-respond-1.4.2.min.js"></script>
    </head>
    <body id="relleno">
        <nav class="titulo">
            <p align="center">Centro Deportivo</p>
        </nav>
        <div>
            <table align="center">
                <tr>
                    <td>
                        <img src="../Image/Water_polo_1.jpg" alt="seccion de waterpolo" width="800" height="600"/>
                    </td>      
                </tr>
                <tr>
                    <td>
                        <img src="../Image/sincro_1.jpg" alt="seccion de sincro" width="800" height="600"/>
                    </td>
                </tr>
                <tr>
                    <td>
                        <img src="../Image/sala_4.jpeg" alt="seccion de gimnasia" width="800" height="600"/>
                    </td>
                </tr>
            </table>
            <div align="center">
                <table>
                    <tr>
                        <td id="boton_1">
                            <form action="main01.jsp" method="post">
                              <input type="submit" value="Acceso Administrador"/>
                            </form>
                        </td>
                    </tr>
                    <tr>
                        <td id="boton_2">
                            <form action="main50.jsp" method="post">
                              <input type="submit" value="Acceso Usuarios"/>
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
