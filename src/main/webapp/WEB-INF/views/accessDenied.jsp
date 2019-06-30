<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://kwonnam.pe.kr/jsp/template-inheritance" prefix="layout" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<c:set var="contextPath" value="${pageContext.request.contextPath}"/>
<layout:extends name="base">
    <layout:put block="contents">
        <div id="content-wrapper" class="d-flex flex-column" style="height:100vh">

            <!-- Main Content -->
            <div id="content">

                    <!-- 404 Error Text -->
                    <div class="text-center">
                        <div class="error mx-auto" data-text="404">404</div>
                        <p class="lead text-gray-800 mb-5">Сторінка не знайдена</p>
                        <a href="/">← Повернутись на головну</a>
                    </div>

            </div>
        </div>
    </layout:put>
</layout:extends>