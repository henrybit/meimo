<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="../base.jsp" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link href="<%=basePath%>/css/header.css" rel="stylesheet" type="text/css">
<link href="<%=basePath%>/css/navi.css" rel="stylesheet" type="text/css">
<link href="<%=basePath%>/css/tablecloth.css" rel="stylesheet" type="text/css">
<link href="<%=basePath%>/css/manager/user.css" rel="stylesheet" type="text/css">
<script type="text/javascript" src="<%=basePath%>/js/tablecloth.js"></script>
<script type="text/javascript" src="<%=basePath%>/js/main.js"></script>
<script type="text/javascript" src="<%=basePath%>/js/manager/user.js"></script>
<title>用户列表</title>
</head>
<body style="width: 1000px; margin: 15px auto 0px;" onclick="parent.hidenSubMenu(this)">
	<div class="user-top">
		<%@ include file="user_top_search.jsp" %>
	</div>
	<div class="user-body" id="user-body">
		<table style="text-align:center;margin-top:5px;">
			<tr>
				<th>序列号</th><th>用户名</th><th>用户状态</th><th>用户类型</th><th>用户性别</th>
				<th>证件类型</th><th>证件号</th><th>出生日期</th><th>年龄</th><th>房间信息</th>
				<th>籍贯</th><th>联系电话</th><th>联系地址</th><th>创建时间</th><th>备注</th><th style="width:80px;">操作</th>
			</tr>
			<c:forEach var="vo" items="${voList}" varStatus="status">
				<tr>
				<td>${vo.id}</td>
				<td>${vo.userName}</td>
				<td>
					<c:choose>
						<c:when test="${vo.userStatus==1}">
							在住
						</c:when>
						 <c:otherwise>
						 	已迁
						</c:otherwise>
					</c:choose>
				</td>
				<td>
					<c:choose>
						<c:when test="${vo.userType==1}">
							业主
						</c:when>
						<c:when test="${vo.userType==2}">
							租户
						</c:when>
						 <c:otherwise>
						 	商户
						</c:otherwise>
					</c:choose>
				</td>
				<td>
					<c:choose>
						<c:when test="${vo.sex==1}">
							男
						</c:when>
						 <c:otherwise>
						 	女
						</c:otherwise>
					</c:choose>
				</td>
				<td>
					<c:choose>
						<c:when test="${vo.cardType==1}">
							身份证
						</c:when>
						<c:when test="${vo.cardType==2}">
							护照
						</c:when>
						<c:when test="${vo.cardType==3}">
							驾照
						</c:when>
						 <c:otherwise>
						 	社保卡
						</c:otherwise>
					</c:choose>
				</td>
				<td>${vo.cardNo}</td>
				<td>${vo.birthDay}</td>
				<td>${vo.age}</td>
				<td>${vo.roominfo}</td>
				<td>${vo.hometown}</td>
				<td>${vo.telephone}</td>
				<td>${vo.address}</td>
				<td>${vo.createTime}</td>
				<td>${vo.description}</td>
				<td>
					<span style="font-size: 14px; color: blue; font-family: arial; font-weight: bold;cursor: pointer;" onclick="edit_user(${vo.id})">编辑</span>
					<span style="font-size: 14px; color: red; font-family: arial; font-weight: bold;cursor: pointer;" data-toggle="modal" data-target=".bs-example-modal-sm" onclick="drop_user_pannel(${vo.id})">删除</span>
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
		      		<button type="button" class="btn btn-info" id="drop_confirm_yes" onclick="drop_user()">确定</button>
		      		<button type="button" class="btn btn-danger" id="drop_confirm_no" onclick="cannel_drop_user()">取消</button>
		      	</div>
		      	<input type="hidden" id="drop_user_id" value="" /> 
		    </div>
		  </div>
		</div>
	</div><!-- user-body -->
</body>
</html>