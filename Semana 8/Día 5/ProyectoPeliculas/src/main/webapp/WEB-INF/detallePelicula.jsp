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
				<h1> Detalle de la película ${detallePelicula.titulo} </h1>
			</div>
			<div class="row">
				<div class="col-6 tarjeta-pelicula">
					<div class="row">
						<div class="col-4">
							<img class="pelicula-imagen" src="${detallePelicula.imagenPortada}" alt="Imagen ${pelicula.titulo}"/>
						</div>
						<div class="col-8">
							<h3> ${detallePelicula.titulo} </h3>
							<p> Género: ${detallePelicula.genero} </p>
							<p> Duración: ${detallePelicula.duracion} minutos </p>
						</div>
					</div>
				</div>
			</div>
			<div class="row mt-2">
				<form class="col-2" action="/peliculas" method="GET">
					<button class="btn btn-secondary">
						Volver a películas
					</button>
				</form>
				<form class="col-2" action="/eliminar/pelicula/${detallePelicula.id}" method="POST">
					<input type="hidden" name="_method" value="DELETE"/>
					<button class="btn btn-danger">
						Eliminar película
					</button>
				</form>
			</div>
		</div>
		<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-YvpcrYf0tY3lHB60NNkmXc5s9fDVZLESaAA55NDzOxhy9GkcIdslK1eN7N6jIeHz" crossorigin="anonymous"></script>
	</body>
</html>