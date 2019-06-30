<%@page contentType="text/html; charset=UTF-8" %>
<%@ taglib uri="http://kwonnam.pe.kr/jsp/template-inheritance" prefix="layout" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang=ru>
<head>
    <link href="${contextPath}/resources/css/sb-admin-2.min.css" rel="stylesheet">
    <%@include file="../parts/meta.jsp" %>
</head>
<body id="page-top">

<div id="wrapper">
    <layout:block name="contents">


    </layout:block>
</div>

<sec:authorize access="hasAnyRole('ROLE_PLAYER')">
    <c:if test="${pageContext.request.userPrincipal.name != null}">
        <form id="logoutForm" method="POST" action="${contextPath}/logout">
            <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}"/>
        </form>

        <h3>Привіт </h3>
        <div class="modal fade" id="logoutModal" ${pageContext.request.userPrincipal.name}abindex="-1" role="dialog"
             aria-labelledby="exampleModalLabel"
             style="display: none;" aria-hidden="true">
            <div class="modal-dialog" role="document">
                <div class="modal-content">
                    <div class="modal-header">
                        <h5 class="modal-title" id="exampleModalLabel">Ви справді хочете вийти?</h5>
                        <button class="close" type="button" data-dismiss="modal" aria-label="Close">
                            <span aria-hidden="true">×</span>
                        </button>
                    </div>
                    <div class="modal-body">Виберіть "Вийти" нижче, якщо ви готові завершити поточний сеанс.</div>
                    <div class="modal-footer">
                        <button class="btn btn-secondary" type="button" data-dismiss="modal">Скасувати</button>
                        <form method="POST" action="${contextPath}/logout">
                            <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}"/>
                        </form>
                        <a class="btn btn-primary" onclick="document.forms['logoutForm'].submit()">Вийти</a>
                    </div>
                </div>
            </div>
        </div>
    </c:if>
</sec:authorize>
<script src="${contextPath}/resources/vendor/jquery/jquery.min.js"></script>
<script src="${contextPath}/resources/vendor/bootstrap/js/bootstrap.bundle.min.js"></script>

<!-- Core plugin JavaScript-->
<script src="${contextPath}/resources/vendor/jquery-easing/jquery.easing.min.js"></script>

<!-- Custom scripts for all pages-->
<script src="${contextPath}/resources/js/sb-admin-2.min.js"></script>
</body>
</html>