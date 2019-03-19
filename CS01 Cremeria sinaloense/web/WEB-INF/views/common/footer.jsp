<%-- 
    Document   : footer
    Created on : 17/03/2019, 07:41:42 PM
    Author     : codeando
--%>

<%@taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<spring:url value="/resources/" var="base" />

<!--
footer-bottom  start
============================= -->
<footer id="footer-bottom">
    <div class="container">
        <div class="row">
            <div class="col-md-12 col-sm-12">
                <div class="block">
                    <p>Copyright &copy; 2019 - Cremeria el sabor sinaloense</p>
                </div>
            </div>
        </div>
    </div>
</footer>

<!-- Js -->
<script src="${base}js/vendor/modernizr-2.6.2.min.js"></script>
<!-- <script src="//ajax.googleapis.com/ajax/libs/jquery/1.10.2/jquery.min.js"></script> -->
<script>window.jQuery || document.write('<script src="${base}js/vendor/jquery-1.10.2.min.js"><\/script>')</script>
<script src="${base}js/jquery.nav.js"></script>
<script src="${base}js/jquery.sticky.js"></script>
<script src="${base}js/bootstrap.min.js"></script>
<script src="${base}js/plugins.js"></script>
<script src="${base}js/wow.min.js"></script>
<script src="${base}js/main.js"></script>
