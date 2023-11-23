<%@ page contentType="text/html; charset=utf-8" pageEncoding="utf-8" %>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8">
    <title>出库详情</title>
    <%@ include file="include/head.jsp" %>
</head>
<body>
<div class="container-fluid">
    <ul class="nav nav-tabs">
        <li><a href="chukuList">用户列表</a></li>
        <li class="active"><a href="#">详情</a></li>
    </ul>
    <br/>
    <form class="form-horizontal" role="form" action="#" method="post">
        <input type="hidden" class="form-control" id="id" name="id" value="${vo.id}"/>
        <div class="form-group">
            <label class="col-sm-3 control-label">货号：</label>
            <div class="col-sm-5" style="padding-top: 7px;">
                ${vo.chukuHuohao}
            </div>
        </div>
        <div class="form-group">
            <label class="col-sm-3 control-label">货物名称：</label>
            <div class="col-sm-5" style="padding-top: 7px;">
                ${vo.chukuName}
            </div>
        </div>
        <div class="form-group">
            <label class="col-sm-3 control-label">数量：</label>
            <div class="col-sm-5" style="padding-top: 7px;">
                ${vo.chukuSuliang}
            </div>
        </div>
        <div class="form-group">
            <label class="col-sm-3 control-label">客户名：</label>
            <div class="col-sm-5" style="padding-top: 7px;">
                ${vo.chukuClientname}
            </div>
        </div>
        <div class="form-group">
            <label class="col-sm-3 control-label">联系方式：</label>
            <div class="col-sm-5" style="padding-top: 7px;">
                ${vo.chukuTel}
            </div>
        </div>
        <div class="form-group">
            <label class="col-sm-3 control-label">操作员：</label>
            <div class="col-sm-5" style="padding-top: 7px;">
                ${vo.chukuMan}
            </div>
        </div>
        <div class="form-group">
            <label class="col-sm-3 control-label">备注：</label>
            <div class="col-sm-5" style="padding-top: 7px;">
                <textarea rows="3" class="form-control" id="chukuText" name="chukuText" disabled="disabled">${vo.chukuText}</textarea>
            </div>
        </div>
        <div class="form-group">
            <label class="col-sm-3 control-label"></label>
            <div class="col-sm-5" style="padding-top: 7px;">
                <input type="button" class="btn btn-pill btn-grad btn-default btn-sm" value="返回" onclick="javascript:history.back(-1);">
            </div>
        </div>
    </form>
</div>
</body>
</html>
