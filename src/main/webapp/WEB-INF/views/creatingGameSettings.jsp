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
                    <form:form method="POST" class="user col-3 col-md-10 col-xl-10" modelAttribute="gameSetting" action="/game/create/stepTwo">
                    <div class="form-group ${error != null ? 'has-error' : ''}">

                        <spring:bind path="gameSetting.countPlayers">
                            <div class="form-group ${status.error ? 'has-error' : ''}">
                                <label class="col-3 col-md-6 col-xl- control-label" for="count_players">Кількість гравців</label>
                                <div class="col-3 col-md-6 col-xl-3">
                                    <form:select path="countPlayers" id="count_players"
                                                 name="Кількість гравців" class="form-control">
                                        <option value="2">Два</option>
                                        <option value="3">Три</option>
                                        <option value="4">Чотири</option>
                                    </form:select>
                                    <form:errors path="countPlayers" element="div"
                                                 cssClass="card bg-danger text-white shadow card-body text-white small m-2">
                                    </form:errors>
                                </div>
                            </div>
                        </spring:bind>

                        <spring:bind path="gameSetting.countQuestions">
                            <div class="form-group ${status.error ? 'has-error' : ''}">
                                <label class="col-3 col-md-6 col-xl- control-label" for="count_questions">Кількість запитань</label>
                                <div class="col-3 col-md-6 col-xl-3">
                                    <form:select path="countQuestions" id="count_questions"
                                                 name="Кількість запитань" class="form-control">
                                        <option value="5">5</option>
                                        <option value="6">6</option>
                                        <option value="7">7</option>
                                        <option value="8">8</option>
                                        <option value="9">9</option>
                                        <option value="10">10</option>
                                    </form:select>
                                    <form:errors path="countQuestions" element="div"
                                                 cssClass="card bg-danger text-white shadow card-body text-white small m-2">
                                    </form:errors>
                                </div>
                            </div>
                        </spring:bind>

                        <spring:bind path="gameSetting.countPlayers">
                            <div class="form-group ${status.error ? 'has-error' : ''}">
                                <label class="col-3 col-md-6 col-xl- control-label" for="tips_type">Тип підсказок</label>
                                <div class="col-3 col-md-6 col-xl-3">
                                    <form:select path="tipsType" id="tips_type" name="Тип підсказок"
                                                 class="form-control">
                                        <option value="show_the_probability_of_the_correct_answer">Ймовірність
                                            правильної відповіді
                                        </option>
                                        <option value="remove_some_wrong">Видалити неправильну відповідь</option>
                                        <option value="give_text_hint">Текстовая подсказка</option>
                                        <option value="give_extra_time">Додатковій час</option>
                                    </form:select>
                                    <form:errors path="tipsType" element="div"
                                                 cssClass="card bg-danger text-white shadow card-body text-white small m-2">
                                    </form:errors>
                                </div>
                            </div>
                        </spring:bind>

                        <spring:bind path="gameSetting.timePerQuestion">
                            <div class="form-group ${status.error ? 'has-error' : ''}">
                                <label class="col-3 col-md-6 col-xl-3 control-label" for="time_per_question">Час відведений на одне
                                    питання</label>
                                <div class="col-3 col-md-6 col-xl-3">
                                    <form:input path="timePerQuestion" id="time_per_question"
                                                name="Час відведений на одне питання" class="form-control"
                                                placeholder="" type="time" value="00:00" min="30" max="280"
                                                step="1" required=""/>
                                    <form:errors path="timePerQuestion" element="div"
                                                 cssClass="card bg-danger text-white shadow card-body text-white small m-2">
                                    </form:errors>
                                </div>
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