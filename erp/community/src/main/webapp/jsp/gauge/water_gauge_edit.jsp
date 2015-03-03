<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="../base.jsp" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link href="<%=basePath%>/css/tablecloth.css" rel="stylesheet" type="text/css">
<link href="<%=basePath%>/css/main.css" rel="stylesheet" type="text/css">
<link href="<%=basePath%>/css/gauge/gauge.css" rel="stylesheet" type="text/css">
<script type="text/javascript" src="<%=basePath%>/js/tablecloth.js"></script>
<script type="text/javascript" src="<%=basePath%>/js/main.js"></script>
<script src="<%=basePath%>/js/gauge/water_gauge.js"></script>
</head>
<body>
	<%WaterGaugeVO waterGaugeVo = (WaterGaugeVO)request.getAttribute("waterGaugeVo");%>
	<div class="float_water">
		<div class="float_water_title">
			<span>编辑</span>
		</div>
		<div class="float_water_content">
			<form action="<%=basePath%>/water_gauge/updateOne.do" method="post" id="edit_water_gauge_form">
			<table>
				<tr>
					<td>序号</td><td><input type="text" value="${waterGaugeVo.id}" disabled="disabled" name="id"/></td>
				</tr>
				<tr>
					<td>表编号</td>
					<td>
						<input type="text" value="${waterGaugeVo.no}" name="no" />
						<input type="hidden" value="${waterGaugeVo.communityid}" name="community_id" />
					</td>
				</tr>
				<tr>
					<td>表类型</td>
					<td><select name="typeS" id="typeS" style="width: 130px;font-size: medium;" onchange="changeType(this)">
						<option value="<%=Constant.WaterGauge.TYPE_HOUSEHOLD%>" <%if(waterGaugeVo.getType()==Constant.WaterGauge.TYPE_HOUSEHOLD) out.print("selected");%>>住户</option>
						<option value="<%=Constant.WaterGauge.TYPE_SHOP%>" <%if(waterGaugeVo.getType()==Constant.WaterGauge.TYPE_SHOP) out.print("selected");%>>商铺</option>
						<option value="<%=Constant.WaterGauge.TYPE_PUB%>" <%if(waterGaugeVo.getType()==Constant.WaterGauge.TYPE_PUB) out.print("selected");%>>公摊</option>
					</select><input id="water_gauge_type" type="hidden" name="type" value="${waterGaugeVo.type}" /></td>
				</tr>
				<tr>
					<td>楼栋号</td><td><input type="text" name="buildingNo" value="${waterGaugeVo.buildingNo}" /></td>
				</tr>
				<tr>
					<td>房间号</td><td><input type="text" name="homeNo" value="${waterGaugeVo.homeNo}" /></td>
				</tr>
				<tr>
					<td>读数</td><td><input type="text" name="num" value="${waterGaugeVo.num}" /></td>
				</tr>
				<tr>
					<td>操作员</td><td><input type="text" name="operator" value="${waterGaugeVo.operator}" /></td>
				</tr>
				<tr>
					<td style="width:"><input style="width:100px" type="text" name="year" value="${waterGaugeVo.year}" />年</td>
					<td><input style="width:100px" type="text" name="month" value="${waterGaugeVo.month}" />月</td>
				</tr>
			</table>
			</form>
		</div>
		<div class="float_water_btn_r">
			<button type="button" class="btn btn-primary" data-toggle="button" onclick="confirm_edit_water_gauge()">确定</button>
			<button type="button" class="btn btn-primary" data-toggle="button" style="background-color: #FF5151;background-image: none;" onclick="cancel_edit_water_gauge()">取消</button>
		</div>
	</div>
</body>
</html>