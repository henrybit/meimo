function edit_water_gauge(id) {
	//1.get edit pannel
	$.ajax({
		type:"post",
		url:"../water_gauge/editPannel.do?id="+id,
		dataType:"html",
		success:function(data) {
			var floatW = window.parent.document.getElementById("float_windows");
			floatW.className="float_windows_show";
			floatW.innerHTML=data;
		},
		error:function() {
			alert("初始化异常");
			return;
		}
		
	});
	//2.show cover windows
	var coverW = window.parent.document.getElementById("window_overflow");
	coverW.style.display="block";
}

function cancel_edit_water_gauge() {
	//1.close float windows
	var floatW = window.parent.document.getElementById("float_windows");
	floatW.className="float_windows";
	//2.close cover windows
	var coverW = window.parent.document.getElementById("window_overflow");
	coverW.style.display="none";
}
function confirm_edit_water_gauge() {
	//1.close float windows
	var floatW = window.parent.document.getElementById("float_windows");
	floatW.className="float_windows";
	//2.close cover windows
	var coverW = window.parent.document.getElementById("window_overflow");
	coverW.style.display="none";
	//3.confirm form action
	$.ajax({
		type:"post",
		url:"../water_gauge/updateOne.do",
		data:$('#edit_water_gauge_form').serialize(),
		dataType:"json",
		async: false,
		success:function(data) {
			//TODO
			if(data.success==true)
				alert("更新完成");
			else
				alert("更新失败");
		},
		error:function() {
			alert("更新失败");
		}
	});
}

function changeType(e) {
	var inputType = document.getElementById("water_gauge_type");
	inputType.value=e.value;
}

function add_water_gauge() {
	//1.get add pannel
	$.ajax({
		type:"post",
		url:"../water_gauge/addPannel.do",
		dataType:"html",
		success:function(data) {
			var floatW = window.parent.document.getElementById("float_windows");
			floatW.className="float_windows_show";
			floatW.innerHTML=data;
		},
		error:function() {
			alert("初始化异常");
			return;
		}
		
	});
	//2.show cover windows
	var coverW = window.parent.document.getElementById("window_overflow");
	coverW.style.display="block";
}

function cancel_add_water_gauge() {
	//1.close add windows
	var floatW = window.parent.document.getElementById("float_windows");
	floatW.className="float_windows";
	//2.close cover windows
	var coverW = window.parent.document.getElementById("window_overflow");
	coverW.style.display="none";
}

function confirm_add_water_gauge() {
	//1.close add windows
	var floatW = window.parent.document.getElementById("float_windows");
	floatW.className="float_windows";
	//2.close cover windows
	var coverW = window.parent.document.getElementById("window_overflow");
	coverW.style.display="none";
	//3.confirm form action
	$.ajax({
		type:"post",
		url:"../water_gauge/addOne.do",
		data:$('#add_water_gauge_form').serialize(),
		dataType:"json",
		async: false,
		success:function(data) {
			if(data.success==true)
				alert("新增完成");
			else
				alert("新增失败");
		},
		error:function() {
			alert("新增失败");
		}
	});
}

function drop_water_gauge_pannel(id) {
//	var drop_confirm_div = document.getElementById("drop_confirm");
//	drop_confirm_div.className="drop_confirm_show";
	var inputE = document.getElementById("drop_water_gauge_id");
	inputE.value=id;
}

function drop_water_gauge(){
	var inputE = document.getElementById("drop_water_gauge_id");
	var id = inputE.value;
	$.ajax({
		type:"get",
		url:"../water_gauge/dropOne.do?id="+id,
		dataType:"json",
		success:function(data) {
			if(data.success==true) {
				var drop_confirm_div = document.getElementById("drop_confirm");
				drop_confirm_div.className="modal fade bs-example-modal-sm";
			}
			else {
				alert("删除失败");
				var drop_confirm_div = document.getElementById("drop_confirm");
				drop_confirm_div.className="modal fade bs-example-modal-sm";
			}
		},
		error:function() {
			alert("删除失败");
			return;
		}
		
	});
}

function cannel_water_gauge(){
	var drop_confirm_div = document.getElementById("drop_confirm");
	drop_confirm_div.className="modal fade bs-example-modal-sm";
}