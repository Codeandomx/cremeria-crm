<%-- 
    Document   : adminfooter
    Created on : 19/03/2019, 09:49:20 AM
    Author     : romin
--%>

<%@taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<spring:url value="/resources/admin/" var="base" />

<footer>
<p>Sistema de Administración - Cremeria Sinaloense 2019</p>
</footer>
<div class="error"></div>
<div class="success"></div>

<script src="${base}js/jquery2.0.3.min.js"></script>
<script src="${base}js/modernizr.js"></script>
<script src="${base}js/admin.js"></script>