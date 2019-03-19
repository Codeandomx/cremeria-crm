<%-- 
    Document   : products
    Created on : 18/03/2019, 08:34:12 PM
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
            blog start
            ============================ -->
            <section id="blog">
                <div class="container">
                    <div class="row">
                        <div class="col-md-12">
                            <div class="block">
                                <h1 class="heading">Latest <span>From</span> the <span>Blog</span></h1>
                                <ul>
                                    <li class="wow fadeInLeft" data-wow-duration="300ms" data-wow-delay="300ms">
                                        <div class="blog-img">
                                            <img src="${base}images/blog/blog-img-1.jpg" alt="blog-img">
                                        </div>
                                        <div class="content-right">
                                            <h3>Homestyle Chicken Pot Pie</h3>
                                            <p>Prepared in true New England fash-ion. Tender all-white meat chicken simmered...</p>
                                        </div>
                                    </li>
                                    <li class="wow fadeInLeft" data-wow-duration="300ms" data-wow-delay="400ms">
                                        <div class="blog-img">
                                            <img src="images/blog/blog-img-2.jpg" alt="blog-img">
                                        </div>
                                        <div class="content-right">
                                            <h3>Homestyle Chicken Pot Pie</h3>
                                            <p>Prepared in true New England fash-ion. Tender all-white meat chicken simmered...</p>
                                        </div>
                                    </li>
                                    <li class="wow fadeInLeft" data-wow-duration="300ms" data-wow-delay="500ms">
                                        <div class="content-left">
                                            <h3>Homestyle Chicken Pot Pie</h3>
                                            <p>Prepared in true New England fash-ion. Tender all-white meat chicken simmered...</p>
                                        </div>
                                        <div class="blog-img-2">
                                            <img src="images/blog/blog-img-3.jpg" alt="blog-img">
                                        </div>
                                    </li>
                                    <li class="wow fadeInLeft" data-wow-duration="300ms" data-wow-delay="600ms">
                                        <div class="content-left">
                                            <h3>Homestyle Chicken Pot Pie</h3>
                                            <p>Prepared in true New England fash-ion. Tender all-white meat chicken simmered...</p>
                                        </div>
                                        <div class="blog-img-2">
                                            <img src="images/blog/blog-img-4.jpg" alt="blog-img">
                                        </div>
                                    </li>
                                    <li class="wow fadeInLeft" data-wow-duration="300ms" data-wow-delay="700ms">
                                        <div class="blog-img">
                                            <img src="images/blog/blog-img-5.jpg" alt="blog-img">
                                        </div>
                                        <div class="content-right">
                                            <h3>Homestyle Chicken Pot Pie</h3>
                                            <p>Prepared in true New England fash-ion. Tender all-white meat chicken simmered...</p>
                                        </div>
                                    </li>
                                    <li class="wow fadeInUp" data-wow-duration="300ms" data-wow-delay="800ms">
                                        <div class="blog-img">
                                            <img src="images/blog/blog-img-6.jpg" alt="blog-img">
                                        </div>
                                        <div class="content-right">
                                            <h3>Homestyle Chicken Pot Pie</h3>
                                            <p>Prepared in true New England fash-ion. Tender all-white meat chicken simmered...</p>
                                        </div>
                                    </li>
                                </ul>
                                <a class="btn btn-default btn-more-info wow bounceIn" data-wow-duration="500ms" data-wow-delay="1200ms" href="#" role="button">More Info</a>
                            </div>
                        </div><!-- .col-md-12 close -->
                    </div><!-- .row close -->
                </div><!-- .containe close -->
            </section><!-- #blog close -->
            <!-- Fin modificar -->
        </div>
        
        <jsp:include page="common/footer.jsp"/>
    </body>
</html>
