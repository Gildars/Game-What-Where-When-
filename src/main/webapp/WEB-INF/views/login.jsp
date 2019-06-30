<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page language="java" pageEncoding="UTF-8" %>
<%@ page contentType="text/html;charset=UTF-8" %>
<c:set var="contextPath" value="${pageContext.request.contextPath}"/>
<!DOCTYPE html>
<html lang="ru">

<head>

    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <meta name="description" content="">
    <meta name="author" content="">

    <title>Гра "Що? Де? Коли?" - Авторизація</title>

    <!-- Custom fonts for this template-->
    <link href="${contextPath}/resources/vendor/fontawesome-free/css/all.min.css" rel="stylesheet" type="text/css">
    <link href="https://fonts.googleapis.com/css?family=Nunito:200,200i,300,300i,400,400i,600,600i,700,700i,800,800i,900,900i"
          rel="stylesheet">

    <!-- Custom styles for this template-->
    <link href="${contextPath}/resources/css/sb-admin-2.min.css" rel="stylesheet">

</head>

<body class="bg-gradient-primary">

<div class="container">

    <!-- Outer Row -->
    <div class="row justify-content-center">

        <div class="col-xl-10 col-lg-12 col-md-9">

            <div class="card o-hidden border-0 shadow-lg my-5">
                <div class="card-body p-0">
                    <!-- Nested Row within Card Body -->
                    <div class="row">
                        <div class="col-lg-6 d-none d-lg-block bg-login-image"></div>
                        <div class="col-lg-6">
                            <div class="p-5">
                                <div class="text-center">
                                    <h1 class="h4 text-gray-900 mb-4">Авторизація</h1>
                                </div>
                                <form class="user" method="POST" action="${contextPath}/login">
                                    <div class="form-group ${error != null ? 'has-error' : ''}">
                                        <div class="form-group">
                                            <span>${message}</span>
                                            <input type="text" class="form-control form-control-user" name="username"
                                                   id="username" aria-describedby="username" placeholder="Логін"
                                                   autofocus="true">
                                        </div>
                                        <div class="form-group">
                                            <input type="password" class="form-control form-control-user"
                                                   name="password" id="password" aria-describedby="password"
                                                   placeholder="Пароль">
                                            <c:if test="${error != null}">
                                                <div class="card bg-danger text-white shadow">
                                                    <div class="card-body">
                                                        <div class="text-white small">${error}</div>
                                                    </div>
                                                </div>
                                            </c:if>
                                            <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}"/>
                                        </div>
                                        <button type="submit" class="btn btn-primary btn-user btn-block">
                                            Увійти
                                        </button>
                                    </div>
                                    <hr>
                                </form>
                                <div class="text-center">
                                    <a class="small" href="${contextPath}/registration">Створити аккаунт!</a>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>

    </div>

</div>

</div>

<!-- Bootstrap core JavaScript-->
<script src="${contextPath}/resources/vendor/jquery/jquery.min.js"></script>
<script src="${contextPath}/resources/vendor/bootstrap/js/bootstrap.bundle.min.js"></script>

<!-- Core plugin JavaScript-->
<script src="${contextPath}/resources/vendor/jquery-easing/jquery.easing.min.js"></script>

<!-- Custom scripts for all pages-->
<script src="${contextPath}/resources/js/sb-admin-2.min.js"></script>

</body>

</html>