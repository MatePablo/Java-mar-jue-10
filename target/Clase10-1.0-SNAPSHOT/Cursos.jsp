<%-- 
    Document   : Cursos
    Created on : 8 feb. 2021, 18:45:44
    Author     : pablo
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Mantenimiento de Cursos!</h1>
        
        <form>
            <table>
                <tr><td>Titulo:</td><td><input type="text" name="titulo"/></td></tr>
                <tr><td>Profesor:</td><td><input type="text" name="profesor"/></td></tr>
                <tr><td>Dia:</td>
                    <td>
                        <select name="dia">
                            <option value="LUNES">Lunes</option>
                            <option value="MARTES">Martes</option>
                            <option value="MIERCOLES">Miercoles</option>
                            <option value="JUEVES">Jueves</option>
                            <option value="VIERNES">Viernes</option>
                        </select>
                    </td>
                </tr>
                <tr><td>Turno:</td>
                    <td>
                        <select name="turno"><option value="MAÑANA"/>Mañana</select>
                    </td>
                </tr>
                <tr>
                    <td><input type="submit" value="Guardar"/></td>
                    <td><input type="reset" value="Borrar"/></td>
                </tr>
            </table>
        </form>
    </body>
</html>
