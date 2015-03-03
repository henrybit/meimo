<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="../base.jsp" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link href="<%=basePath%>/css/header.css" rel="stylesheet" type="text/css">
<link href="<%=basePath%>/css/navi.css" rel="stylesheet" type="text/css">
<link href="<%=basePath%>/css/tablecloth.css" rel="stylesheet" type="text/css">
<link href="<%=basePath%>/css/gauge/gauge.css" rel="stylesheet" type="text/css">
<script type="text/javascript" src="<%=basePath%>/js/tablecloth.js"></script>
<script type="text/javascript" src="<%=basePath%>/js/main.js"></script>
<script type="text/javascript" src="<%=basePath%>/js/gauge/water_gauge.js"></script>
<script type="text/javascript" src="<%=basePath%>/js/gauge/gauge.js"></script>
<title>拇指社区-水表记录</title>
</head>
<body style="width: 1000px; margin: 15px auto 0px;" onclick="parent.hidenSubMenu(this)">
	<div class="home-gauge-top">
		<%@ include file="water_top_search.jsp" %>
		<!-- 
		<div class="home-gauge-top-search">
			<input class="input-noselected" type="text" value="表编号" style="float:left;width:200px" onclick="search_input(this)"/>
			<a href="#" style="float:left"><img src="<%=basePath%>/image/search_btn.png" width="24px" heigth="24px" title="搜索" /></a>
		</div>
		<div style="margin-left: 20px;float: left;"><a onclick="add_water_gauge()"><img src="<%=basePath%>/image/add_new.png" title="新增" width="28px" heigth="28px" /></a></div>
		<div class="home-page-controller">
			<a href="#"><span>首页</span></a>
			<a href="#">上一页</a>
			<a href="#">下一页</a>
			<span style="border-right: 1px dashed rgb(0, 0, 0); margin-left: 6px; padding-right: 6px;">共24项</span>
			<span>1/8</span>
		</div>
		<div style="clear:both;height:0px;"></div>
		 -->
	</div>
	<div class="gauge-body" id="gauge-body">
		<table style="text-align:center;margin-top:5px;">
			<tr>
				<th>序列号</th><th>表编号</th><th>表类型</th>
				<th>楼栋号</th><th>房间号</th><th>本次读数</th><th>读表员</th>
				<th>创建时间</th><th>操作</th>
			</tr>
			<c:forEach var="vo" items="${voList}" varStatus="status">
				<tr>
				<td>${vo.id}</td>
				<td>${vo.no}</td>
				<td>${vo.type}</td>
				<td>${vo.buildingNo}</td>
				<td>${vo.homeNo}</td>
				<td>${vo.num}</td>
				<td>${vo.operator}</td>
				<td>${vo.year}-${vo.month}</td>
				<td>
					<span style="font-size: 14px; color: blue; font-family: arial; font-weight: bold;cursor: pointer;" onclick="edit_water_gauge(${vo.id})">编辑</span>
					<span style="font-size: 14px; color: red; font-family: arial; font-weight: bold;cursor: pointer;" data-toggle="modal" data-target=".bs-example-modal-sm" onclick="drop_water_gauge_pannel(${vo.id})">删除</span>
				</td>
				</tr>
			</c:forEach>
		</table>
		<div class="modal fade bs-example-modal-sm" tabindex="-1" role="dialog" aria-labelledby="mySmallModalLabel" aria-hidden="true" id="drop_confirm">
		  <div class="modal-dialog modal-sm">
		    <div class="modal-content">
		    	<div class="modal-header">
          			<button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">×</span></button>
          			<h4 class="modal-title" id="mySmallModalLabel">确定删除本条数据?</h4>
        		</div>
        		<div class="modal-body">
		      		<button type="button" class="btn btn-info" id="drop_confirm_yes" onclick="drop_water_gauge()">确定</button>
		      		<button type="button" class="btn btn-danger" id="drop_confirm_no" onclick="cannel_water_gauge()">取消</button>
		      	</div>
		      	<input type="hidden" id="drop_water_gauge_id" value="" /> 
		    </div>
		  </div>
		</div>
	</div>
</body>
</html>