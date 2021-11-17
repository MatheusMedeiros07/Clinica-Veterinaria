<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="pt-br">
<head>
<meta charset="UTF-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<link rel="preconnect" href="https://fonts.gstatic.com">
<link
	href="https://fonts.googleapis.com/css2?family=Poppins&display=swap"
	rel="stylesheet">
<link rel="stylesheet" href="/css/style.css">
<link href="/css/bootstrap.min.css" rel="stylesheet" />

<title>Arca de Noé - Veterinária</title>
</head>
<jsp:include page="../includepages/menu.jsp"></jsp:include>
<body>

	<spring:url value="/cadastra/cadastra-animal" var="cadastraAnimal" />
	<spring:url value="/cadastra/deleta-animal" var="deleta" />
	<spring:url value="/cadastra/edita-animal" var="edita" />

	<div class="column vh89 bg-animais">

		<div class="container">

			<div class="jumbotron">
				<h1 class="sombra">Animais</h1>
				<a href="${cadastraAnimal}/${clienteId}"
					class="btn btn-outline-primary">Adicionar Animal</a><br>
				<br>
			</div>

			<table class="table">
				<tr>
					<th>Nome</th>
					<th>Espécie</th>
					<th>Raça</th>
					<th>Data Nascimento</th>
					<th colspan="2">Ações</th>
				</tr>
				<c:forEach var="animal" items="${animais}">
					<tr>
						<td>${animal.nome}</td>
						<td>${animal.especie}</td>
						<td>${animal.raca}</td>
						<td>${animal.dataNasc1}</td>
						<td><a href="${edita}/${clienteId}/${animal.id}"
							class="btn btn-warning">Editar</a></td>
						<td><a href="${deleta}/${clienteId}/${animal.id}"
							class="btn btn-danger">Deletar</a></td>
					</tr>
				</c:forEach>


			</table>
		</div>


	</div>


	<script type="text/javascript" src="/js/jquery.js"></script>
	<script type="text/javascript" src="/js/bootstrap.min.js"></script>
</body>

<jsp:include page="../includepages/rodape.jsp"></jsp:include>
</html>