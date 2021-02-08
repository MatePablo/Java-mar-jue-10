<%-- 
    Document   : Test
    Created on : 8 feb. 2021, 18:09:09
    Author     : pablo
--%>

<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="es">
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
        
        <!-- Bloque de comentarios HTML o XML -->
        
        
        <%
            // Esto es un bloque de codigo Java.
            
            int x=2;
            
            //Este hola mundo se va a imprimir en la consola del servidor, no en la web.
            System.out.println("***************************");
            System.out.println("Hola mundo!");
            System.out.println("***************************");
            
            //renderiza en el browser
            out.println( "<h3>Hola mundo JSP!!</h3>" );
            
            List<String> lista = new ArrayList();
            
            // Recibir parametros de usuario
            try {
                String nombre=request.getParameter("nombre");
                if ( nombre != null || !nombre.isEmpty() ){
                    out.println("Hola " + nombre);
                }
            } catch (Exception e) {
                out.println("No se recibieron parametros!");
            }
            
        %>
        
    </body>
</html>
