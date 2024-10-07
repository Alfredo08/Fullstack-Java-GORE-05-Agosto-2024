<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title> Mi primer página JSP con SPring </title>
		<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH" crossorigin="anonymous">
		<link href="/estilos/index.css" rel="stylesheet">
	</head>
	<body>
		<h1> Bienvenidos a la clase de JSP con Spring </h1>
		<p> Estaremos cargando contenido Java embebido en HTML </p>
		<h1> Hola mi nombre es <c:out value="${nombre}" /> y tengo ${edad} años.</h1>
		<h2> Y conozco los siguiente lenguajes de progrmación</h2>
		<ul>
			<c:forEach items="${lenguajesProgramacion}" var="lenguaje">
				<li> ${lenguaje} </li>
			</c:forEach>
		</ul>
		<form method="GET" action="/nuevo/lenguaje">
			<button class="btn btn-primary">
				Agregar lenguaje
			</button>
		</form>
		
		<h2> Cuento con el siguiente certificado </h2>
		<p> ${certificadoJava.getNombre()} - ${certificadoJava.institucion} </p>
		<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-YvpcrYf0tY3lHB60NNkmXc5s9fDVZLESaAA55NDzOxhy9GkcIdslK1eN7N6jIeHz" crossorigin="anonymous"></script>
		<h2> Tengo 8 mascotas</h2>
		<img src="/imagenes/Mia.png" alt="Imagen de una gatita cálico">
	</body>
</html>
