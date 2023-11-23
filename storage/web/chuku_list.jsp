<%@ page contentType="text/html; charset=utf-8" pageEncoding="utf-8" %>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8">
    <title>出库管理</title>
    <%@ include file="include/head.jsp" %>
</head>
<body>
<div class="container-fluid">
    <ul class="nav nav-tabs">
        <li class="active"><a href="chukuList">出库列表</a></li>
        <c:if test="${loginUser.userType == '管理员'}"><li><a href="chuku_add.jsp">添加</a></li></c:if>
    </ul>
    <br/>
    <form class="form-inline" id="searchForm" action="chukuList" method="post">
        <div class="form-group">
            <input type="text" class="form-control" name="keyword" id="keyword" placeholder="货物名称">
            <input type="hidden" id="searchColumn" name="searchColumn" value="chuku_name"/>
        </div>
        <button class="btn btn-pill btn-grad btn-primary btn-sm"><span class="glyphicon glyphicon-search" aria-hidden="true"></span>查询
        </button>
    </form>
    <br/>
    <table class="table table-hover table-bordered">
        <thead>
        <tr>
            <th>货号</th>
            <th>货物名称</th>
            <th>数量</th>
            <th>客户名</th>
            <th>联系方式</th>
            <th>操作员</th>
            <th>备注</th>
            <th>操作</th>
        </tr>
        </thead>
        <tbody>
        <c:forEach items="${list}" var="vo">
            <tr>
                <td>${vo.chukuHuohao}</td>
                <td><a href="chukuGet?id=${vo.id}">${vo.chukuName}</a></td>
                <td>${vo.chukuSuliang}</td>
                <td>${vo.chukuClientname}</td>
                <td>${vo.chukuTel}</td>
                <td>${vo.chukuMan}</td>
                <td title="${vo.chukuText}">
                <c:choose>
                    <c:when test="${fn:length(vo.chukuText) > 19}">
                        <c:out value="${fn:substring(vo.chukuText, 0, 19)}..."/>
                    </c:when>
                    <c:otherwise>
                        <c:out value="${vo.chukuText}"/>
                    </c:otherwise>
                </c:choose>
                </td>
                <td>
                    <button onclick="window.location.href='chukuEditPre?id=${vo.id}'"
                            class="btn btn-pill btn-grad btn-primary btn-xs"
<%--                            <c:if test="${loginUser.userType != '管理员'}">disabled="disabled" title="没有权限！！！"</c:if>--%>
                             >
                        <span class="glyphicon glyphicon-pencil" aria-hidden="true"></span>
                        编辑
                    </button>
                    <button onclick="if(window.confirm('将要删除：${vo.chukuName}？'))window.location.href='chukuDelete?id=${vo.id}'"
                            class="btn btn-pill btn-grad btn-info btn-xs"
<%--                            <c:if test="${loginUser.userType != '管理员'}">disabled="disabled" title="没有权限！！！"</c:if> >--%>
                        <span class="glyphicon glyphicon-remove" aria-hidden="true"></span>
                        删除
                    </button>
                </td>
            </tr>
        </c:forEach>
        </tbody>
    </table>
    <div style="float: right;padding-right: 10px;color: #515151;"><jsp:include page="split.jsp"/></div>
</div>
</body>
</html>
