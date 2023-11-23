<%@ page contentType="text/html; charset=utf-8" pageEncoding="utf-8" %>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8">
    <title>入库管理</title>
    <%@ include file="include/head.jsp" %>
</head>
<body>
<div class="container-fluid">
    <ul class="nav nav-tabs">
        <li class="active"><a href="rukuList">入库列表</a></li>
        <c:if test="${loginUser.userType == '管理员'}"><li><a href="ruku_add.jsp">添加</a></li></c:if>
    </ul>
    <br/>
    <form class="form-inline" id="searchForm" action="rukuList" method="post">
        <div class="form-group">
            <input type="text" class="form-control" name="keyword" id="keyword" placeholder="货物名称">
            <input type="hidden" id="searchColumn" name="searchColumn" value="ruku_name"/>
        </div>
        <button class="btn btn-pill btn-grad btn-primary btn-sm"><span class="glyphicon glyphicon-search" aria-hidden="true"></span>查询
        </button>
    </form>
    <br/>
    <table class="table table-hover table-bordered">
        <thead>
        <tr>
            <th>货号</th>
            <th>采购单号</th>
            <th>货物名称</th>
            <th>数量</th>
            <th>入库时间</th>
            <th>操作员</th>
            <th>备注</th>
            <th>操作</th>
        </tr>
        </thead>
        <tbody>
        <c:forEach items="${list}" var="vo">
            <tr>
                <td>${vo.rukuNo}</td>
                <td>${vo.rukuDingdanhao}</td>
                <td><a href="rukuGet?id=${vo.id}">${vo.rukuName}</a></td>
                <td>${vo.rukuSuliang}</td>
                <td>${vo.rukuTime}</td>
                <td>${vo.rukuRen}</td>
                <td title="${vo.rukuText}">
                <c:choose>
                    <c:when test="${fn:length(vo.rukuText) > 19}">
                        <c:out value="${fn:substring(vo.rukuText, 0, 19)}..."/>
                    </c:when>
                    <c:otherwise>
                        <c:out value="${vo.rukuText}"/>
                    </c:otherwise>
                </c:choose>
                </td>
                <td>
                    <button onclick="window.location.href='rukuEditPre?id=${vo.id}'"
                            class="btn btn-pill btn-grad btn-primary btn-xs"
<%--                            <c:if test="${loginUser.userType != '管理员'}">disabled="disabled" title="没有权限！！！"</c:if>--%>
                             >
                        <span class="glyphicon glyphicon-pencil" aria-hidden="true"></span>
                        编辑
                    </button>
                    <button onclick="if(window.confirm('将要删除：${vo.rukuName}？'))window.location.href='rukuDelete?id=${vo.id}'"
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
