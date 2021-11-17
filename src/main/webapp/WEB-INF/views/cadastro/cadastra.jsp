<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
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
<title>Veterinária - Cadastro</title>
</head>
<jsp:include page="../includepages/menu.jsp"></jsp:include>
<body>

	<div class="column vh89 bg-cadastra">

		<spring:url value="/cadastra/salva" var="cadastra" />

		<h1>Cadastro de Tarefas</h1>

		<form:form modelAttribute="cliente" action="${cadastra}">

			<input type="hidden" name="id" id="id" value="${cliente.id}" />
			<div class="form-group">
				<label for="nome">Nome</label>
				<form:input path="nome" cssClass="form-control" />
			</div>

			<div class="form-group">
				<label for="cpf">CPF</label>
				<form:input path="cpf" cssClass="form-control" />
			</div>

			<div class="form-group">
				<label for="endereco">Endereço</label>
				<form:input path="endereco" cssClass="form-control" />
			</div>

			<div class="form-group">
				<label for="telefone">Telefone</label>
				<form:input path="telefone" cssClass="form-control" />
			</div>
			<br />

			<c:if test="${cliente.id == '0'}">
				<button type="submit" class="btn btn-primary">Cadastrar</button>
			</c:if>
			<c:if test="${cliente.id != '0'}">
				<button type="submit" class="btn btn-primary">Editar</button>
			</c:if>
			<a href="/" class="btn btn-success">Voltar</a>

		</form:form>
		<br />
		<br />
	</div>
</body>

<jsp:include page="../includepages/rodape.jsp"></jsp:include>
</html>
