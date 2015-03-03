<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="../base.jsp" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link href="<%=basePath%>/css/tablecloth.css" rel="stylesheet" type="text/css">
<link href="<%=basePath%>/css/register.css" rel="stylesheet" type="text/css">
<link href="<%=basePath%>/css/main.css" rel="stylesheet" type="text/css">
<script type="text/javascript" src="<%=basePath%>/js/tablecloth.js"></script>
<script type="text/javascript" src="<%=basePath%>/js/register.js"></script>
<title>美摩-新用户注册-填写企业信息</title>
</head>
<body>
	<div class="header" id="header">
		<h1 class="logo" style="width: 280px;height: 50px;margin: 0;padding: 0;float: left;margin-left: 80px;">
  			<img src="<%=basePath%>/image/login_logo.png">
		</h1>
		<div class="other" style="float: right;margin-right: 200px;line-height: 40px;padding-bottom: 0;padding-top: 25px;">
			<a href="www.91meimo.com" style="margin-left:5px;margin-right: 5px;">官网首页</a>
			<a href="product.91meimo.com" style="margin-left: 5px;margin-right: 5px;">产品介绍</a>
		</div>
	</div>
	<div class="register_content" id="register_content">
		<div>
			<div class="progress">
			  <div class="progress-bar progress-bar-success progress-bar-striped active" aria-valuenow="40" aria-valuemin="0" aria-valuemax="100" style="width: 40%">
			    <span>填写企业信息</span>
			  </div>
			  <!--
			  <div class="progress-bar progress-bar-success progress-bar-striped active" aria-valuenow="40" aria-valuemin="0" aria-valuemax="100" style="width: 0%">
			    <span class="sr-only">填写社区信息</span>
			  </div>
			  <div class="progress-bar progress-bar-success progress-bar-striped active" aria-valuenow="20" aria-valuemin="0" aria-valuemax="100" style="width: 0%">
			    <span class="sr-only">注册完成</span>
			  </div>
			   -->
			</div>
		</div>
		<div>
			<form id="register_form" name="register_form" method="POST" action="<%=basePath%>/login/registerProperty.do">
				<table class="register_form_table">
					<tr>
						<td width="100px">
							<span style="color:red;">*</span>
							<span>企业名称：</span>
						</td>
						<td>
							<input type="text" value="" placeholder="企业名称" name="propertyName"/>
						</td>
					</tr>
					<tr>
						<td>
							<span style="color:red;">*</span>
							<span>账户名：</span>
						</td>
						<td>
							<input type="text" value="" placeholder="登陆账户名" name="loginName"/>
						</td>
					</tr>
					<tr>
						<td>
							<span style="color:red;">*</span>
							<span>密码：</span>
						</td>
						<td>
							<input type="password" value="" placeholder="" name="password" id="password"/>
						</td>
					</tr>
					<tr>
						<td>
							<span style="color:red;">*</span>
							<span>重复输入密码确认：</span>
						</td>
						<td>
							<input type="password" value="" placeholder="请重复输入密码确认" name="password2" id="password2"/>
						</td>
					</tr>
					<tr>
						<td>
							<span class="glyphicon glyphicon-phone"></span>
							<span style="color:red;">*</span>
							<span>联系电话：</span>
						</td>
						<td>
							<input type="text" value="" name="telephone" />
						</td>
					</tr>
					<tr>
						<td>
							<span class="glyphicon glyphicon-envelope"></span>
							<span>邮箱：</span>
						</td>
						<td>
							<input type="email" value="" name="email" />
						</td>
					</tr>
					<tr>
						<td>
							<span>备注：</span>
						</td>
						<td>
							<input type="text" value="" name="description" />
						</td>
					</tr>
				</table>
				<input type="submit" value="下一步" tabindex="4" name="submit-btn" style="width: 50%;color: white;background-color:#339933;margin:0 auto;" onclick=""/>
			</form>
		</div>
	</div>
	<div class="footer" style="margin-top:80px;">
		<div class="copyright">
        <p class="big">
        	<span>厦门美摩科技有限公司&copy; 2014 91meimo.com 版权所有&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</span>
            <a target="_blank" href="#">关于我们</a>&nbsp;&nbsp;
            <a target="_blank" href="#">法律声明</a>&nbsp;&nbsp;
            <a target="_blank" href="#">友情链接</a>
         </p>
    	</div>
	</div>
</body>
</html>