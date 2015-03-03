<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="base.jsp" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>拇指社区-物业ERP系统</title>
<link href="<%=basePath%>/css/header.css" rel="stylesheet" type="text/css">
<link href="<%=basePath%>/css/navi.css" rel="stylesheet" type="text/css">
<link href="<%=basePath%>/css/main.css" rel="stylesheet" type="text/css">
<link href="<%=basePath%>/css/tablecloth.css" rel="stylesheet" type="text/css">
<script type="text/javascript" src="<%=basePath%>/js/tablecloth.js"></script>
<script type="text/javascript" src="<%=basePath%>/js/map.js"></script>
<script type="text/javascript" src="<%=basePath%>/js/main.js"></script>
<script type="text/javascript" src="<%=basePath%>/js/gauge/water_gauge.js"></script>
<script type="text/javascript" src="<%=basePath%>/js/gauge/gauge.js"></script>
<script type="text/javascript" src="<%=basePath%>/js/manager/user.js"></script>
</head>
<body onload="initSubMenu()">
	<div class="community-global-header" onclick="hidenSubMenu(this)">
		<div class="global-header-row">
			<div class="row-welcome">
				<a>拇指科技</a>
				<span class="tool-spacing-left"></span>
				<a><span>欢迎XXXX!</span></a>
			</div>
			<div class="row-tools">
				<a href="#"><span>新手指南</span></a>
				<span class="tool-spacing-right"></span>
				<a href="#"><span>帮助中心</span></a>
				<span class="tool-spacing-right"></span>
				<a href="#"><span>在线客服</span></a>
			</div>
		</div>
	</div>
	<div class="navi" id="navi">
		<div class="navi-raw">
			<a id="erp-logo" class="logo" data-ga="免费的ERP" href="http://free.aliyun.com" target="_blank" style="display: inline-block; width: 230px; z-index: 3000;"></a>
			<img src="<%=basePath%>/image/navi.jpg" style="float: left; width: 210px; display: block;">
			<div class="navi-raw-left">
				<ul style="padding-left: 50px;">
					<li id="navi_fee_m" onclick="selectedSubMenu(this)"><h2>费用管理</h2></li>
					<li id="navi_community_m" onclick="selectedSubMenu(this)"><h2>社区管理</h2></li>
					<li id="navi_resource_m" onclick="selectedSubMenu(this)"><h2>资产管理</h2></li>
					<li id="navi_report_m" onclick="selectedSubMenu(this)"><h2>报表管理</h2></li>
					<li id="navi_contract_m" onclick="selectedSubMenu(this)"><h2>合同管理</h2></li>
					<li id="navi_sys_m" onclick="selectedSubMenu(this)"><h2>系统管理</h2></li>
				</ul>
			</div>
			<div class="navi-raw-right"></div>
		</div>
	</div>
	<div class="subnavi" id="subnavi" onclick="hidenSubMenu(this)">
		<div class="sub-menu-list-show" id="sub_menu_fee">
			<dl>
				<dt>费用项</dt>
				<dd><a>调整费用项</a></dd>
				<dd><a>费用项管理</a></dd>
			</dl>
			<dl>
				<dt>读表管理</dt>
				<dd><a>水表管理</a></dd>
				<dd><a>纯净水表管理</a></dd>
				<dd><a>电表管理</a></dd>
				<dd><a>天然气表管理</a></dd>
			</dl>
			<dl>
				<dt>费用收取</dt>
				<dd><a>住户收费</a></dd>
				<dd><a>商铺收费</a></dd>
			</dl>
			<!--
			<dl>
				<dt>费用支出</dt>
				<dd><a>商户读表录入</a></dd>
			</dl>
			-->
		</div>
		<div class="sub-menu-list-show" id="sub_menu_community">
			<dl>
				<dt>用户</dt>
				<dd><a>住户管理</a></dd>
				<dd><a>商户管理</a></dd>
				<dd><a>租户管理</a></dd>
			</dl>
			<dl>
				<dt>资源</dt>
				<dd><a>房屋管理</a></dd>
				<dd><a>商铺管理</a></dd>
				<dd><a>车库管理</a></dd>
				<dd><a>车辆管理</a></dd>
			</dl>
			<dl>
				<dt>服务</dt>
				<dd><a>故障处理</a></dd>
				<dd><a>保洁绿化</a></dd>
				<dd><a>保安消防</a></dd>
				<dd><a>工程施工</a></dd>
				<dd><a>客户服务</a></dd>
			</dl>
		</div>
		<div class="sub-menu-list-show" id="sub_menu_resource">
			<dl>
				<dt>设备</dt>
				<dd><a>保洁设备</a></dd>
				<dd><a>消防设备</a></dd>
				<dd><a>监控设备</a></dd>
				<dd><a>工程设备</a></dd>
			</dl>
		</div>
		<div class="sub-menu-list-show" id="sub_menu_report">
			<dl>
				<dt>营收</dt>
				<dd><a>应收账款</a></dd>
				<dd><a>实收账款</a></dd>
				<dd><a>滞纳金账款</a></dd>
			</dl>
			<dl>
				<dt>支出</dt>
				<dd><a>支出账款</a></dd>
				<dd><a>采购账款</a></dd>
			</dl>
			<dl>
				<dt>盈余</dt>
				<dd><a>盈余账款</a></dd>
			</dl>
		</div>
		<div class="sub-menu-list-show" id="sub_menu_contract">
			<dl>
				<dt>合同</dt>
				<dd><a>商铺租赁</a></dd>
				<dd><a>车库租赁</a></dd>
				<dd><a>停车费租赁</a></dd>
			</dl>
		</div>
		<div class="sub-menu-list-show" id="sub_menu_sys">
			<dl>
				<dt>系统管理</dt>
				<dd><a>用户设置</a></dd>
				<dd><a>权限设置</a></dd>
				<dd><a>账号设置</a></dd>
			</dl>
		</div>
	</div>
	<div class="body-content" style="margin:0 auto;">
		<!-- <iframe src="gauge/water_gauge.jsp" name="content" class="" frameborder="0" height="auto" width="1200px" style="min-height: 600px;">
		</iframe> -->
		<iframe name="body_content_iframe" id="body_content_iframe" src="<%=basePath%>/user/list.do" name="content" class="" frameborder="0" height="auto" width="1200px" style="min-height: 600px;">
		</iframe>
	</div>
	<div class="footer">
		<div class="copyright">
        <p class="big">
        	<span>厦门美摩科技有限公司&copy; 2014 91meimo.com 版权所有&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</span>
            <a target="_blank" href="#">关于我们</a>&nbsp;&nbsp;
            <a target="_blank" href="#">法律声明</a>&nbsp;&nbsp;
            <a target="_blank" href="#">友情链接</a>
         </p>
    	</div>
	</div>
	<div class="qwindow_mask" id="window_overflow" style="opacity: 0.5; z-index: 30000; width: 100%; height: 100%; display: none; background-color: rgb(84, 84, 84);position:absolute;top:0;left:0"></div>
	<div class="float_windows" id="float_windows">
		<!-- <iframe id="float_windows_iframe" src=""></iframe> -->
	</div>
</body>
</html>