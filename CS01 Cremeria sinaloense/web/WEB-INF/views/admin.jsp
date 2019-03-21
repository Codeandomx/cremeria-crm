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
        <jsp:include page="common/adminhead.jsp"/>
    </head>

    <body>
        
        <jsp:include page="common/adminheader.jsp"/>
        <section id="wrapper">
            <section id="contenido">
                <jsp:include page="common/adminmenu.jsp"/>
	        <article id="contenido_b">
	            Hola
	        </article>
	    </section>
	    </section>
        </section>
        <jsp:include page="common/adminfooter.jsp"/>
      
    </body>
</html>