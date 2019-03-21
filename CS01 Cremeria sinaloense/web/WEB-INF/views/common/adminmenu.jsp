<%-- 
    Document   : adminmenu
    Created on : 19/03/2019, 09:50:34 AM
    Author     : romin
--%>

<%@taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<spring:url value="/" var="base" />

<aside id="contenido_a">
    <h2 class="pprincipal">Menu</h2>
    <ul id="menu">
        <li><a href="${base}admin.htm">Inicio</a></li>
        <li><a href="${base}#">Categorias</a></li>
        <li><a href="${base}#">Productos</a></li>
        <li><a href="${base}#">Usuarios</a></li>
        <li><a href="${base}#">Roles</a></li>
        <li><a href="${base}#">Pedidos</a></li>
        <li><a href="${base}#">Tipos telefono</a></li>
        <li><a href="${base}index.htm">Salir</a></li>
    </ul>
</aside>