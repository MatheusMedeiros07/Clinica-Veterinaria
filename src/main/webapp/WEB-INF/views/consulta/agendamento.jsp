<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="pt-br">
	<head>	
		<meta charset="UTF-8">
		<meta http-equiv="X-UA-Compatible" content="IE=edge">
		<meta name="viewport" content="width=device-width, initial-scale=1.0">
		<link rel="preconnect" href="https://fonts.gstatic.com">
		<link href="https://fonts.googleapis.com/css2?family=Poppins&display=swap" rel="stylesheet">
		<link rel="stylesheet" href="/css/style.css">
		<link href="/css/bootstrap.min.css" rel="stylesheet"/>
		<title>Arca de Noé - Veterinária</title>
	</head>
	
	<jsp:include page="../includepages/menu.jsp"></jsp:include>
	
	<body>	
		<div class="column vh89 bg-agendamento">
			<div class="column">
				<h2>Agendamentos</h2>
			</div>

			<div class="column">
				<p>Por favor, agende o horário.</p>

				<form action="#" method="POST">
					<label for="Nome">Nome</label><br>
					<input type="text" id="Nome" placeholder="Nome"><br><br>

					<label for="telefone">Telefone</label><br>
					<input type="text" id="telefone" placeholder="Telefone"><br><br>

					<label for="dia">Dia</label><br>
					<input type="date" id="dia"><br><br>

					<label for="horario">Hora</label><br>
					<input type="time" id="horario"><br><br>

					<label for="medico">Veterinário</label><br>
					<select name="medico" id="medico">
						<option value="#">Dr. Nome Sobrenome</option>
						<option value="#">Dr. Nome Sobrenome</option>
						<option value="#">Dr. Nome Sobrenome</option>
					</select><br><br>

					<input type="submit" value="ENVIAR">
				</form>
			</div>
		</div>
		
		<script type="text/javascript" src="/js/jquery.js"></script>
		<script type="text/javascript" src="/js/bootstrap.min.js"></script>
	</body>
	
	<jsp:include page="../includepages/rodape.jsp"></jsp:include>
</html>