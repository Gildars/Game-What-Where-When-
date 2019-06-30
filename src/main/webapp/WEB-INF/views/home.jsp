<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://kwonnam.pe.kr/jsp/template-inheritance" prefix="layout" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<c:set var="contextPath" value="${pageContext.request.contextPath}"/>
<layout:extends name="base">
    <layout:put block="contents">
        <%@include file="./parts/sidebar.jsp" %>
        <div id="content-wrapper" class="d-flex flex-column">

            <!-- Main Content -->
            <div id="content">
                <%@include file="./parts/navbar.jsp" %>
                <div class="container-fluid">

                    <!-- Page Heading -->

                    <!-- DataTales Example -->
                    <div class="card shadow mb-4">
                        <div class="card-header py-3">
                            <h6 class="m-0 font-weight-bold text-primary">Набір в команди</h6>
                        </div>
                        <div class="card-body">
                            <div class="table-responsive">
                                <div id="dataTable_wrapper" class="dataTables_wrapper dt-bootstrap4">
                                    <div class="row">
                                        <div class="col-sm-12">
                                            <table class="table table-bordered dataTable" id="dataTable" role="grid"
                                                   aria-describedby="dataTable_info" style="width: 100%;" width="100%"
                                                   cellspacing="0">
                                                <thead>
                                                <tr role="row">
                                                    <th class="sorting_asc" tabindex="0" aria-controls="dataTable"
                                                        rowspan="1" colspan="1" style="width: 271px;"
                                                        aria-sort="ascending"
                                                        aria-label="Name: activate to sort column descending">Команда
                                                    </th>
                                                    <th class="sorting" tabindex="0" aria-controls="dataTable"
                                                        rowspan="1" colspan="1" style="width: 403px;"
                                                        aria-label="Position: activate to sort column ascending">
                                                        Кількість гравців
                                                    </th>
                                                    <th class="sorting" tabindex="0" aria-controls="dataTable"
                                                        rowspan="1" colspan="1" style="width: 171px;"
                                                        aria-label="Salary: activate to sort column ascending">
                                                    </th>
                                                </tr>
                                                </thead>
                                                <tbody>
                                                <c:forEach items="${teams}" var="team">
                                                <tr role="row" class="odd">
                                                    <td>${team.name}</td>
                                                    <td>4</td>
                                                    <td>
                                                        <a href="#" class="btn btn-success btn-icon-split">
                                                            <span class="icon text-white-50">
                                                                <i class="fas fa-check"></i>
                                                            </span>
                                                            <span class="text">Приєднатись</span>
                                                        </a>
                                                    </td>
                                                </tr>
                                                </c:forEach>
                                                </tbody>
                                            </table>
                                        </div>
                                    </div>
                                    <div class="row">
                                        <div class="col-sm-12 col-md-5">
                                            <div class="dataTables_info" id="dataTable_info" role="status"
                                                 aria-live="polite">Сторнка 1 з 2
                                            </div>
                                        </div>
                                        <div class="col-sm-12 col-md-7">
                                            <div class="dataTables_paginate paging_simple_numbers"
                                                 id="dataTable_paginate">
                                                <ul class="pagination">
                                                    <li class="paginate_button page-item previous disabled"
                                                        id="dataTable_previous"><a href="#" aria-controls="dataTable"
                                                                                   data-dt-idx="0" tabindex="0"
                                                                                   class="page-link">Попередня</a></li>
                                                    <li class="paginate_button page-item active"><a href="#"
                                                                                                    aria-controls="dataTable"
                                                                                                    data-dt-idx="1"
                                                                                                    tabindex="0"
                                                                                                    class="page-link">1</a>
                                                    </li>
                                                    <li class="paginate_button page-item "><a href="#"
                                                                                              aria-controls="dataTable"
                                                                                              data-dt-idx="2"
                                                                                              tabindex="0"
                                                                                              class="page-link">2</a>
                                                    </li>
                                                    <li class="paginate_button page-item next" id="dataTable_next"><a
                                                            href="#" aria-controls="dataTable" data-dt-idx="7"
                                                            tabindex="0" class="page-link">Наступна</a></li>
                                                </ul>
                                            </div>
                                        </div>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>

                </div>

            </div>
            <%@include file="./parts/footer.jsp" %>
        </div>
    </layout:put>
</layout:extends>