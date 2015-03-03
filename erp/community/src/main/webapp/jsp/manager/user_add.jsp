<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="../base.jsp" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link href="<%=basePath%>/css/tablecloth.css" rel="stylesheet" type="text/css">
<link href="<%=basePath%>/css/main.css" rel="stylesheet" type="text/css">
<link href="<%=basePath%>/css/manager/user.css" rel="stylesheet" type="text/css">
<script type="text/javascript" src="<%=basePath%>/js/tablecloth.js"></script>
<script type="text/javascript" src="<%=basePath%>/js/main.js"></script>
<script src="<%=basePath%>/js/manager/user.js"></script>
</head>
<body>
	<%int communityId = ConvertTools.StringToInt(CookieManager.getCookieValue(request, "communityid")); %>
	<div class="float_user">
		<div class="float_user_title">
			<span>新增</span>
		</div>
		<div class="float_user_content">
			<form action="<%=basePath%>/user/addOne.do" method="post" id="add_user_form">
			<table>
				<tr>
					<td>姓名</td>
					<td>
						<input type="text" value="" name="userName" />
						<input type="hidden" value="<%=communityId%>" name="communityid" />
					</td>
				</tr>
				<tr>
					<td>用户状态</td>
					<td>
						<select name="statusS" id="statusS" style="width: 130px;font-size: medium;" onchange="changeUserStatus(this)">
							<option value="<%=Constant.User.USER_STATUS_LIVE%>" selected>在住</option>
							<option value="<%=Constant.User.USER_STATUS_MOVE%>">已迁</option>
						</select>
						<input id="userStatus" name="userStatus" type="hidden" value="<%=Constant.User.USER_STATUS_LIVE%>" />
					</td>
				</tr>
				<tr>
					<td>用户类型</td>
					<td><select name="typeS" id="typeS" style="width: 130px;font-size: medium;" onchange="changeUserType(this)">
						<option value="<%=Constant.User.USER_TYPE_OWNER%>" selected>业主</option>
						<option value="<%=Constant.User.USER_TYPE_TENANT%>">租户</option>
						<option value="<%=Constant.User.USER_TYPE_SHOP%>">商户</option>
					</select><input id="userType" type="hidden" name="userType" value="<%=Constant.User.USER_TYPE_OWNER%>" /></td>
				</tr>
				<tr>
					<td>用户性别</td>
					<td>
						<select name="sexS" id="sexS" style="width: 130px;font-size: medium;" onchange="changeUserSex(this)">
							<option value="<%=Constant.User.USER_SEX_MAN%>" selected>男</option>
							<option value="<%=Constant.User.USER_SEX_LADY%>">女</option>
						</select>
						<input id="sex" name="sex" type="hidden" value="<%=Constant.User.USER_SEX_MAN%>" />
					</td>
				</tr>
				<tr>
					<td>证件类型</td>
					<td>
						<select name="cardTypeS" id="cardTypeS" style="width: 130px;font-size: medium;" onchange="changeCardType(this)">
							<option value="<%=Constant.User.CARD_TYPE_ID%>" selected>身份证</option>
							<option value="<%=Constant.User.CARD_TYPE_PASSPORT%>">护照</option>
							<option value="<%=Constant.User.CARD_TYPE_LICENSE%>">驾照</option>
							<option value="<%=Constant.User.CARD_TYPE_SECURITY%>">社保卡</option>
						</select>
						<input id="cardType" type="hidden" name="cardType" value="<%=Constant.User.CARD_TYPE_ID%>" />
					</td>
				</tr>
				<tr>
					<td>证件号</td><td><input type="text" name="cardNo" value="" /></td>
				</tr>
				<tr>
					<td>出生日期</td><td><input type="text" name="birthDay" value="" /></td>
				</tr>
				<tr>
					<td>房间信息</td><td><input type="text" name="roominfo" value="" /></td>
				</tr>
				<tr>
					<td>籍贯</td><td><input type="text" name="hometown" value="" /></td>
				</tr>
				<tr>
					<td>联系电话</td><td><input type="text" name="telephone" value="" /></td>
				</tr>
				<tr>
					<td>联系地址</td><td><input type="text" name="address" value="" /></td>
				</tr>
				<tr>
					<td>备注</td><td><input type="text" name="description" value="" /></td>
				</tr>
			</table>
			</form>
		</div>
		<div class="float_user_btn_r">
			<button type="button" class="btn btn-primary" data-toggle="button" onclick="confirm_add_user()">确定</button>
			<button type="button" class="btn btn-primary" data-toggle="button" style="background-color: #FF5151;background-image: none;" onclick="cancel_add_user()">取消</button>
		</div>
	</div>
</body>
</html>