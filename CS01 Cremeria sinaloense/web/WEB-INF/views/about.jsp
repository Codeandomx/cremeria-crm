<%-- 
    Document   : about
    Created on : 18/03/2019, 07:48:15 PM
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
            <!--
            about-us start
            ============================== -->
            <section id="about-us">
                <div class="container">
                    <div class="row">
                        <div class="col-md-12">
                            <div class="block">
                                <img class="wow fadeInUp" data-wow-duration="300ms" data-wow-delay="400ms" src="${base}images/cooker-img.png" alt="cooker-img">
                                <h1 class="heading wow fadeInUp" data-wow-duration="400ms" data-wow-delay="500ms" >Your <span>Restaurant’s</span> </br> Website Has To Look <span>Good</span>
                                </h1>
                                <p class="wow fadeInUp" data-wow-duration="300ms" data-wow-delay="600ms">Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim </br> ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in </br>voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat</p>
                            </div>
                        </div><!-- .col-md-12 close -->
                    </div><!-- .row close -->
                </div><!-- .containe close -->
            </section><!-- #call-to-action close -->
            <!-- Fin modificar -->
        </div>
        
        <jsp:include page="common/footer.jsp"/>
    </body>
</html>