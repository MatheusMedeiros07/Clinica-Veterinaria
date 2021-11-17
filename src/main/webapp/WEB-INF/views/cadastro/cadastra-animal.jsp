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

	<spring:url value="/cadastra/salva-animais" var="cadastra" />

	<div class="column vh89 bg-agendamento">
		<div class="sombra">
			<h2>Cadastro Animal</h2>
		</div>

		<div class="column">
			<p>Preencha os dados do animal nos campos abaixo</p>



			<form:form modelAttribute="animal" action="${cadastra}/${clienteId}">

				<input type="hidden" name="id" id="id" value="${animal.id}" />


				<div class="form-group">
					<label for="nome">Nome</label>
					<form:input path="nome" cssClass="form-control" />
				</div>

				<div class="form-group">
					<label for="especie">Espécie</label>
					<form:input path="especie" cssClass="form-control" />
				</div>

				<div class="form-group">
					<label for="raca">Raça</label>
					<form:input path="raca" cssClass="form-control" />
				</div>

				<div class="form-group">
					<label for="dataNasc">Data de Nascimento</label>
					<form:input type="date" path="dataNasc" cssClass="form-control" />
				</div>
				<br>
				<br>


				<input type="submit" value="Cadastra">
			</form:form>

		</div>
	</div>

	<script type="text/javascript" src="/js/jquery.js"></script>
	<script type="text/javascript" src="/js/bootstrap.min.js"></script>

</body>

<jsp:include page="../includepages/rodape.jsp"></jsp:include>
</html>