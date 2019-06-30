<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page language="java" pageEncoding="UTF-8" %>
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
                                <form:form method="POST" modelAttribute="userForm" class="user">
                                    <div class="form-group ${error != null ? 'has-error' : ''}">
                                    <spring:bind path="username">
                                        <div class="form-group ${status.error ? 'has-error' : ''}">
                                            <span>${message}</span>
                                            <form:input type="text" path="username" aria-describedby="username"
                                                        class="form-control form-control-user" placeholder="Логін"
                                                        name="username"
                                                        autofocus="true"></form:input>
                                            <form:errors path="username" element="div"
                                                         cssClass="card bg-danger text-white shadow card-body text-white small m-2">
                                            </form:errors>
                                        </div>
                                    </spring:bind>
                                    <spring:bind path="email">
                                        <div class="form-group ${status.error ? 'has-error' : ''}">
                                            <span>${message}</span>
                                            <form:input type="email" path="email" class="form-control form-control-user"
                                                        placeholder="Email"
                                                        id="email" aria-describedby="email"
                                                        autofocus="true" name="email"></form:input>
                                            <form:errors path="email" element="div"
                                                         cssClass="card bg-danger text-white shadow card-body text-white small m-2"></form:errors>
                                        </div>
                                    </spring:bind>
                                    <spring:bind path="password">
                                        <div class="form-group">
                                            <form:input type="password" path="password"
                                                        class="form-control form-control-user"
                                                        name="password" id="password" placeholder="Пароль"></form:input>
                                            <form:errors path="password" element="div"
                                                         cssClass="card bg-danger text-white shadow card-body text-white small m-2"></form:errors>
                                        </div>
                                    </spring:bind>

                                    <spring:bind path="passwordConfirm">
                                        <div class="form-group ${status.error ? 'has-error' : ''}">
                                            <form:input type="password" path="passwordConfirm"
                                                        class="form-control form-control-user"
                                                        name="passwordConfirm" id="passwordConfirm"
                                                        placeholder="Повторіть пароль"></form:input>
                                            <form:errors path="passwordConfirm" element="div"
                                                         cssClass="card bg-danger text-white shadow card-body text-white small m-2"></form:errors>

                                            <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}"/>
                                        </div>
                                        <button type="submit" class="btn btn-primary btn-user btn-block">
                                            Зберегти
                                        </button>
                                        </div>
                                    </spring:bind>
                                    <hr>
                                </form:form>
                                <div class="text-center">
                                    <a class="small" href="${contextPath}/login">У вас вже є аккаунт?</a>
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