<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<!DOCTYPE html>
<html lang="es">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="assets/css/styles.css">
    <title>Login</title>
</head>
<body>
<div class="login-container">
    <img src="assets/images/logo.jpg" alt="logo" class="login-image">
    <form class="login-form" action="" method="post">
        <input type="text" placeholder="Nombre de usuario" class="input-field" name="user">
        <input type="password" placeholder="Contraseña" class="input-field" name="password">
        <button type="submit" class="login-button" name="login">Iniciar sesión</button>
    </form>
    <c:if test="${mensaje!=null}">
        <p>${mensaje}</p>
    </c:if>
</div>
</body>
</html>
