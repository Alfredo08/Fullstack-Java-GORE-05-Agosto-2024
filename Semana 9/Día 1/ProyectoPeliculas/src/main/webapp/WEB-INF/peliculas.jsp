<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title> Aplicación de películas </title>
		<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH" crossorigin="anonymous">
		<link href="/css/peliculas.css" rel="stylesheet"/>
	</head>
	<body>
		<div class="container mt-3">
			<div class="row">
				<h1> Películas </h1>
			</div>
			<div class="row contenedor-peliculas">
				<c:forEach items="${peliculas}" var="pelicula">
				<div class="col-3 tarjeta-pelicula">
					<h3> ${pelicula.titulo} </h3>
					<img class="pelicula-imagen" src="${pelicula.imagenPortada}" alt="Imagen ${pelicula.titulo}"/>
					<p> Género: ${pelicula.genero} </p>
					<p> Duración: ${pelicula.duracion} minutos </p>
					<div class="row">
						<form class="col-6" action="/detalle/pelicula/${pelicula.id}" method="GET">
							<button class="btn btn-success">
								Detalle
							</button>
						</form>
						<form class="col-6" action="/formulario/editar/pelicula/${pelicula.id}">
							<button class="btn btn-info">
								Editar
							</button>
						</form>
					</div>
				</div>
				</c:forEach>
			</div>
			<div class="row mt-2">
				<form action="/formulario/pelicula" method="GET">
					<button class="btn btn-secondary">
						Agregar película
					</button>
				</form>
			</div>
		</div>
		<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-YvpcrYf0tY3lHB60NNkmXc5s9fDVZLESaAA55NDzOxhy9GkcIdslK1eN7N6jIeHz" crossorigin="anonymous"></script>
	</body>
</html>