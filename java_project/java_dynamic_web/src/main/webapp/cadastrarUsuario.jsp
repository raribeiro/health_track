<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Login HealthTrack</title>
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
                    Crie uma nova conta <i data-feather="user-plus"></i>
                </h3>
                <form accept="">
                    <div class="mb-3">
                        <label for="exampleInputEmail1" class="form-label">Informe seu e-mail</label>
                        <input type="email" class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp" name="email">
                        <div id="emailHelp" class="form-text">E-mail utilizado para acessar sua conta</div>
                    </div>
                    <div class="mb-3">
                        <label for="exampleInputPassword1" class="form-label">Sua senha</label>
                        <input type="password" class="form-control" id="exampleInputPassword1" name="senha">
                    </div>
                    <div class="mb-3">
                        <label for="exampleInputPassword1" class="form-label">Confirme sua senha</label>
                        <input type="password" class="form-control" id="exampleInputPassword1Conf" name="senha_conf">
                    </div>
                    <div class="col-auto">
                        <button type="submit" class="btn btn-primary">Enviar</button>
                        <a href="#" class="btn btn-link">Cadastrar</a>
                    </div>
                    
                </form>
            </div>
            <div class="col-md-3"></div>
        </div>
      </div>
    
</body>
<%@ include file="./includes/footer.jsp" %>