<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

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
				<h1> Agregar película </h1>
			</div>
			<div class="row">
				<form:form class="col-6" action="/agregar/pelicula" method="POST" modelAttribute="pelicula">
					<div>
						<form:label class="form-label" path="titulo"> Título: </form:label>
						<form:input class="form-control" path="titulo" />
						<form:errors class="alert alert-danger d-block" path="titulo" /> 
					</div>
					<div>
						<form:label class="form-label" path="genero"> Género: </form:label>
						<form:input class="form-control" path="genero" />
						<form:errors class="alert alert-danger d-block" path="genero" /> 
					</div>
					<div>
						<form:label class="form-label" path="duracion"> Duración: </form:label>
						<form:input class="form-control" path="duracion" />
						<form:errors class="alert alert-danger d-block" path="duracion" /> 
					</div>
					<div>
						<form:label class="form-label" path="imagenPortada"> Imagen de la película: </form:label>
						<form:input class="form-control" path="imagenPortada" />
						<form:errors class="alert alert-danger d-block" path="imagenPortada" /> 
					</div>
					<button class="btn btn-primary">
						Agregar
					</button>
				</form:form>
			</div>
			<div class="row mt-2">
				<form action="/peliculas" method="GET">
					<button class="btn btn-secondary">
						Volver a películas
					</button>
				</form>
			</div>
		</div>
		<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-YvpcrYf0tY3lHB60NNkmXc5s9fDVZLESaAA55NDzOxhy9GkcIdslK1eN7N6jIeHz" crossorigin="anonymous"></script>
	</body>
</html>