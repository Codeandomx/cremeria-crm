<%-- 
    Document   : admin
    Created on : 19/03/2019, 08:20:47 AM
    Author     : romin
--%>

<%@taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<spring:url value="/resources/" var="base" />
<!DOCTYPE html>

<html lang="es">
    <head>
        <title>Programación web con java</title>
        <jsp:include page="common/head.jsp"/>
    </head>

    <jsp:include page="common/header.jsp"/>
    
    <body>
        <div class="container">
            <!-- Inicio modificar -->
            <h1>CS01 Cremeria sinaloense</h1>
            <h3>Projecto web</h3>
            <!-- Fin modificar -->
        </div>
        
        <jsp:include page="common/footer.jsp"/>
    </body>
</html>