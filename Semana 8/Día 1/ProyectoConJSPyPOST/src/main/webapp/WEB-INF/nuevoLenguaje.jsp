<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Insert title here</title>
		<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH" crossorigin="anonymous">
	</head>
	<body>
		<div class="container">
			<div class="row">
				<h1> Agregar lenguaje de programación </h1>
			</div>
			<div class="row">
				<form class="col-6" method="POST" action="/agregar/lenguaje">
					<label class="form-label"> Lenguaje: </label>
					<input class="form-control" type="text" name="nuevoLenguaje"/>
					<button class="btn btn-success"> Agregar </button>
				</form>
			</div>
			<div class="row">
				<a href="/inicio"> Volver al inicio </a>
			</div>
		</div>
		<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-YvpcrYf0tY3lHB60NNkmXc5s9fDVZLESaAA55NDzOxhy9GkcIdslK1eN7N6jIeHz" crossorigin="anonymous"></script>
	</body>
</html>