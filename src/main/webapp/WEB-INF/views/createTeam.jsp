<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://kwonnam.pe.kr/jsp/template-inheritance" prefix="layout" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<c:set var="contextPath" value="${pageContext.request.contextPath}"/>
<layout:extends name="base">
    <layout:put block="contents">
        <%@include file="./parts/sidebar.jsp" %>
        <div id="content-wrapper" class="d-flex flex-column">

            <!-- Main Content -->
            <div id="content">
                <%@include file="./parts/navbar.jsp" %>
                <div class="container-fluid">
                    <label class="col-xl-3 col-3 col-md-6">Форма создания команды</label>
                    <form:form method="POST" class="user col-3 col-md-6 col-xl-3" modelAttribute="team" action="/game/create/stepOne">
                    <div class="form-group ${error != null ? 'has-error' : ''}">

                        <spring:bind path="team.name">
                            <div class="form-group ${status.error ? 'has-error' : ''}">
                                <form:input type="text" path="name" aria-describedby="name"
                                            class="form-control form-control-user" placeholder="Назва команди"
                                            name="name"
                                            autofocus="true"/>
                                <form:errors path="name" element="div"
                                             cssClass="card bg-danger text-white shadow card-body text-white small m-2">
                                </form:errors>
                            </div>
                        </spring:bind>

                    </div>

                    <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}"/>
                </div>
                <button type="submit" class="btn btn-primary btn-user btn-block col-3 col-md-6 col-xl-3 m-4">
                    Створити гру
                </button>
            </div>
            </form:form>

        </div>

        </div>
        <%@include file="./parts/footer.jsp" %>
        </div>
    </layout:put>
</layout:extends>