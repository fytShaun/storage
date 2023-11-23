<%@ page contentType="text/html; charset=utf-8" pageEncoding="utf-8" %>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8">
    <title>入库添加</title>
    <%@ include file="include/head.jsp" %>
</head>
<body>
<div class="container-fluid">
    <ul class="nav nav-tabs">
        <li><a href="rukuList?">入库列表</a></li>
        <li class="active"><a href="#">添加</a></li>
    </ul>
    <br/>
    <form class="form-horizontal" role="form" action="rukuAdd" method="post" onsubmit="return check()">
        <div class="form-group">
            <label class="col-sm-3 control-label">货号：</label>
            <div class="col-sm-5">
                <input type="text" class="form-control" id="rukuNo" name="rukuNo">
            </div>
        </div>
        <div class="form-group">
            <label class="col-sm-3 control-label">采购单号：</label>
            <div class="col-sm-5">
                <input type="text" class="form-control" id="rukuDingdanhao" name="rukuDingdanhao">
            </div>
        </div>
        <div class="form-group">
            <label class="col-sm-3 control-label">货物名称：</label>
            <div class="col-sm-5">
                <input type="text" class="form-control" id="rukuName" name="rukuName">
            </div>
        </div>
        <div class="form-group">
            <label class="col-sm-3 control-label">数量：</label>
            <div class="col-sm-5">
                <input type="text" class="form-control" id="rukuSuliang" name="rukuSuliang">
            </div>
        </div>
        <div class="form-group">
            <label class="col-sm-3 control-label">入库时间：</label>
            <div class="col-sm-5">
                <input type="text" class="form-control" id="rukuTime" name="rukuTime">
            </div>
        </div>
        <div class="form-group">
            <label class="col-sm-3 control-label">操作员：</label>
            <div class="col-sm-5">
                <input type="text" class="form-control" id="rukuRen" name="rukuRen">
            </div>
        </div>
        <div class="form-group">
            <label class="col-sm-3 control-label">备注：</label>
            <div class="col-sm-5">
                <textarea rows="3" class="form-control" id="rukuText" name="rukuText" placeholder="请输入内容......"></textarea>
            </div>
        </div>
        <div class="form-group">
            <label class="col-sm-3 control-label"></label>
            <div class="col-sm-5">
                <input type="submit" class="btn btn-pill btn-grad btn-primary btn-sm" value="保存">
                <input type="button" class="btn btn-pill btn-grad btn-default btn-sm" value="返回" onclick="javascript:history.back(-1);">
            </div>
        </div>
    </form>
</div>
</body>
<script type="text/javascript">
    //提交之前进行检查，如果return false，则不允许提交
    function check() {
        //根据ID获取值
        if (document.getElementById("rukuNo").value.trim().length == 0) {
            alert("货号不能为空!");
            return false;
        }
        if (document.getElementById("rukuDingdanhao").value.trim().length == 0) {
            alert("采购单号不能为空!");
            return false;
        }
        if (document.getElementById("rukuName").value.trim().length == 0) {
            alert("货物名称不能为空!");
            return false;
        }
        if (document.getElementById("rukuSuliang").value.trim().length == 0) {
            alert("数量不能为空!");
            return false;
        }
        if (document.getElementById("rukuTime").value.trim().length == 0) {
            alert("入库时间不能为空!");
            return false;
        }
        if (document.getElementById("rukuRen").value.trim().length == 0) {
            alert("操作员不能为空!");
            return false;
        }
        return true;
    }
</script>
</html>
