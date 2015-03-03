function search_water_gauge() {
	$.ajax({
		type:"post",
		url:"../water_gauge/search.do",
		data:$('#water_gauge_search_form').serialize(),
		dataType:"html",
		success:function(data) {
			document.getElementById("gauge-body").innerHTML=data;
			tablecloth();
		},
		error:function() {
			alert("搜索失败");
		}
	});
}

function search_water_gauge_type_change(v) {
	var typeinput = document.getElementById("gauge_type");
	typeinput.value=v;
	search_water_gauge();
}

function search_water_gauge_time_change(v) {
	var timeinput = document.getElementById("gauge_time");
	timeinput.value=v;
	search_water_gauge();
}

function search_water_gauge_order_change(v) {
	var orderinput = document.getElementById("order");
	orderinput.value=v;
	search_water_gauge();
}
function search_water_gauge_page_change(v) {
	var pageNoE = document.getElementById("pageNo");
	var pageNo = pageNoE.value;
	if(v==1) {
		pageNo = parseInt(pageNo)-parseInt(1);
	} else if(v==2){
		pageNo = parseInt(pageNo)+parseInt(1);
	}
	if(pageNo < 0)
		pageNo = 0;
	pageNoE.value=pageNo;
	search_water_gauge();
}