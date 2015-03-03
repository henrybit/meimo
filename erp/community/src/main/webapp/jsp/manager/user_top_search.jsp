<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<form action="<%=basePath%>/user/search.do" method="post" id="user_search_form" name="user_search_form">
<div class="user-top-search">
	<button type="button" class="btn btn-primary" style="float:left;" onclick="add_user()" id="new_user_btn">新增用户</button>
	<div class="col-lg-6" style="margin-left:40px;">
	    <div class="input-group">
	      <input type="text" class="form-control" placeholder="Search for..." name="searchText" id="search_text" value="" onkeypress="if(event.keyCode==13) {search_user();return false;}" />
	      <span class="input-group-btn">
	        <button class="btn btn-default" type="button" onclick="search_user()">搜索</button>
	      </span>
	    </div><!-- /input-group -->
  	</div><!-- /.col-lg-6 -->	
  	<div class="glyphicon glyphicon-refresh" onclick="refresh_user_body()" style="line-height: 30px;margin-left: 40px;color: blue;cursor: pointer;">刷新</div>
  	<div style="clear:both;height:0px;"></div>
</div>
<%-- <div class="user-filter" style="border: 1px solid #ddd;">
	<div class="search_user_type" style="float:left;width:900px;border-bottom: 1px dotted #ccc;">
		<div style="width:80px"><span>用户类型：</span></div>
		<div><a onclick="search_user_type_change(<%=Constant.User.USER_TYPE_OWNER%>)">业主</a></div>
		<div><a onclick="search_user_type_change(<%=Constant.User.USER_TYPE_TENANT%>)">租户</a></div>
		<div><a onclick="search_user_type_change(<%=Constant.User.USER_TYPE_SHOP%>)">商户</a></div>
		<input type="hidden" id="user_type" name="userType" value="<%=Constant.User.USER_TYPE_OWNER%>" />
	</div>
	<div style="clear:both;height:0px;width:0px;"></div>
</div> --%>
<div class="user-order" style="margin-top:3px;">
	<%-- <div class="order">
		<span style="float:left;">排序：</span>
		<div class="order_selected"><a onclick="search_order_change(<%=Constant.User.ORDER_TYPE_NATURAL%>)">自然序</a></div>
		<div><a onclick="search_order_change(<%=Constant.User.ORDER_TYPE_TIME_DESC%>)">时间</a></div>
		<input type="hidden" id="order" name="order" value="<%=Constant.User.ORDER_TYPE_NATURAL%>" />
	</div> --%>
	<nav style="float:right;">
	  <ul class="pager" style="margin-top:0px;margin-bottom: 3px;">
	    <li><a onclick="search_page_change(1)">上一页</a></li>
	    <li><a onclick="search_page_change(2)">下一页</a></li>
	    <input type="hidden" id="pageNo" name="pageNo" value="0" />
	  </ul>
	</nav>
	<!-- <nav>
	  <ul class="pagination">
	    <li class="disabled"><a href="#" aria-label="Previous"><span aria-hidden="true">&laquo;</span></a></li>
	    <li class="active"><a href="#">1 <span class="sr-only">(current)</span></a></li>
	    ...
	  </ul>
	</nav> -->
</div>
</form>
<div style="clear:both;height:0px;"></div>