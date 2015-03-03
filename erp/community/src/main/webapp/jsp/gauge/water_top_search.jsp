<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<form action="<%=basePath%>/water_gauge/search.do" method="post" id="water_gauge_search_form" name="water_gauge_search_form">
<div class="gauge-top-search">
	<button type="button" class="btn btn-primary" style="float:left;" onclick="add_water_gauge()" id="new_gauge_btn">新增水表</button>
	<div class="col-lg-6">
	    <div class="input-group">
	      <input type="text" class="form-control" placeholder="Search for..." name="searchText" id="search_text" value="" onkeypress="if(event.keyCode==13) {search_water_gauge();return false;}">
	      <span class="input-group-btn">
	        <button class="btn btn-default" type="button" onclick="search_water_gauge()">搜索</button>
	      </span>
	    </div><!-- /input-group -->
  	</div><!-- /.col-lg-6 -->	
  	<div style="clear:both;height:0px;"></div>
</div>
<div class="gauge-filter" style="border: 1px solid #ddd;">
	<div class="search_gauge_type" style="float:left;width:900px;border-bottom: 1px dotted #ccc;">
		<div style="width:60px"><span>类型：</span></div>
		<div><a onclick="search_water_gauge_type_change(<%=Constant.WaterGauge.TYPE_HOUSEHOLD%>)">住户</a></div>
		<div><a onclick="search_water_gauge_type_change(<%=Constant.WaterGauge.TYPE_SHOP%>)">商铺</a></div>
		<div><a onclick="search_water_gauge_type_change(<%=Constant.WaterGauge.TYPE_PUB%>)">公摊</a></div>
		<input type="hidden" id="gauge_type" name="type" value="<%=Constant.WaterGauge.TYPE_HOUSEHOLD%>" />
	</div>
	<div class="gauge-time" style="float:left;width:900px;margin-top: 3px;">
		<div style="width:60px"><span>时间：</span></div>
		<div><a onclick="search_water_gauge_time_change(<%=Constant.WaterGauge.TIME_MONTH%>)">一个月</a></div>
		<div><a onclick="search_water_gauge_time_change(<%=Constant.WaterGauge.TIME_THREE_MONTHS%>)">三个月</a></div>
		<div><a onclick="search_water_gauge_time_change(<%=Constant.WaterGauge.TIME_HALF_YEAR%>)">半年</a></div>
		<div><a onclick="search_water_gauge_time_change(<%=Constant.WaterGauge.TIME_YEAR%>)">一年</a></div>
		<div><a onclick="search_water_gauge_time_change(<%=Constant.WaterGauge.TIME_ALL%>)">全部</a></div>
		<input type="hidden" id="gauge_time" name="gaugeTime" value="<%=Constant.WaterGauge.TIME_ALL%>" />
	</div>
	<div style="clear:both;height:0px;width:0px;"></div>
</div>
<div class="gauge-order">
	<div class="order">
		<span style="float:left;">排序：</span>
		<div class="order_selected"><a onclick="search_water_gauge_order_change(<%=Constant.WaterGauge.ORDER_TYPE_NATURAL%>)">自然序</a></div>
		<div><a onclick="search_water_gauge_order_change(<%=Constant.WaterGauge.ORDER_TYPE_TIME_DESC%>)">时间</a></div>
		<input type="hidden" id="order" name="order" value="<%=Constant.WaterGauge.ORDER_TYPE_NATURAL%>" />
	</div>
	<nav>
	  <ul class="pager">
	    <li><a onclick="search_water_gauge_page_change(1)">上一页</a></li>
	    <li><a onclick="search_water_gauge_page_change(2)">下一页</a></li>
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
