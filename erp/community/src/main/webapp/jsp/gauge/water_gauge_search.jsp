<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="../base.jsp" %>
<html>
<link href="<%=basePath%>/css/tablecloth.css" rel="stylesheet" type="text/css">
<link href="<%=basePath%>/css/gauge/gauge.css" rel="stylesheet" type="text/css">
<script type="text/javascript" src="<%=basePath%>/js/tablecloth.js"></script>
<body>
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
			<span style="font-size: 14px; color: red; font-family: arial; font-weight: bold;cursor: pointer;" onclick="">删除</span>
		</td>
		</tr>
	</c:forEach>
	<tr>
		<td>1</td><td>t19204</td><td>住户</td>
		<td>37栋</td><td>702</td><td>31</td><td>小张</td>
		<td>2015-01-01</td>
		<td>
			<span style="font-size: 14px; color: blue; font-family: arial; font-weight: bold;cursor: pointer;" onclick="edit_water_gauge(1)">编辑</span>
			<span style="font-size: 14px; color: red; font-family: arial; font-weight: bold;cursor: pointer;" onclick="">删除</span>
		</td>
	</tr>
</table>
</body>
</html>