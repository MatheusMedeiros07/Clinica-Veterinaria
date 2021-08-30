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
	
		<spring:url value="/cadastra/edita" var="edita"/>
		<spring:url value="/cadastra/deleta" var="deleta"/>
		<spring:url value="/cadastra/animais-cliente" var="animais"/>
		
		<div class="column vh89 bg-agenda">
		
			<div class="container">
			
				<div class="jumbotron">
					<h1 class="sombra">Clientes</h1>
				</div>
				
				<table class="table">
					<tr>
						<th>Nome</th>
						<th>CPF</th>
						<th>Endereço</th>
						<th>Telefone</th>
						<th>Animais</th>
						<th colspan="3">Ações</th>
					</tr>
					<c:forEach var="cliente" items="${clientes}">
						<tr>
							<td>${cliente.nome}</td>
							<td>${cliente.cpf}</td>
							<td>${cliente.endereco}</td>
							<td>${cliente.telefone}</td>
							<td>${cliente.animais.size()}</td>
							<td><a href="${edita}/${cliente.id}" class="btn btn-warning">Editar</a></td>
							<td><a href="${deleta}/${cliente.id}" class="btn btn-danger">Deletar</a></td>
							<td><a href="${animais}/${cliente.id}" class="btn btn-info">Animais</a></td>
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