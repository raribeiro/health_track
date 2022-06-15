<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Login - HealthTrack</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0-beta1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-0evHe/X+R7YkIZDRvuzKMRqM+OrBnVFBL6DOitfPri4tjfHxaWutUpFmBp4vmVor" crossorigin="anonymous">
    <link href="./assets/custom_style.css" type="text/css" rel="stylesheet" />
    <script src="https://unpkg.com/feather-icons"></script>
</head>
<body>


	<%@ include file="./includes/header_out.jsp" %>
	
	<div class="container">
        <div class="row justify-content-md-center form-login">
            <div class="col-md-3"></div>
            <div class="col-md-6">
                <h3>
                    Acesse sua conta <i data-feather="arrow-right"></i>
                </h3>
                <form action="ConectaUsuarioController" method="post">
                    <div class="mb-3">
                        <label for="email" class="form-label">Informe seu e-mail</label>
                        <input type="email" class="form-control" id="email" aria-describedby="emailHelp" name="email">
                        <div id="emailHelp" class="form-text">E-mail utilizado no momento da criação da conta</div>
                    </div>
                    <div class="mb-3">
                        <label for="pass" class="form-label">Sua senha</label>
                        <input type="password" class="form-control" id="pass" name="pass">
                    </div>
                    <div class="col-auto">
                        <button type="submit" class="btn btn-primary">Acessar</button>
                        <a href="cadastrarUsuario.jsp" class="btn btn-link">Criar nova conta</a>
                    </div>
                    
                </form>
            </div>
            <div class="col-md-3"></div>
        </div>
      </div>

	<%@ include file="./includes/footer.jsp" %>