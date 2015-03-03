function add_user() {
	//1.get add pannel
	$.ajax({
		type:"post",
		url:"../user/addPannel.do",
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
function confirm_add_user() {
	//1.close add windows
	var floatW = window.parent.document.getElementById("float_windows");
	floatW.className="float_windows";
	//2.close cover windows
	var coverW = window.parent.document.getElementById("window_overflow");
	coverW.style.display="none";
	//3.confirm form action
	$.ajax({
		type:"post",
		url:"../user/addOne.do",
		data:$('#add_user_form').serialize(),
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

function refresh_user_body() {
	$.ajax({
		type:"post",
		url:"../user/refresh.do",
		dataType:"html",
		async: false,
		success:function(data) {
			if(window.frames["body_content_iframe"])
				window.frames["body_content_iframe"].document.getElementById("user-body").innerHTML = data;
			else
				document.getElementById("user-body").innerHTML = data;
			tablecloth();
		},
		error:function() {
			alert("刷新失败");
		}
	});
}

function cancel_add_user() {
	//1.close add windows
	var floatW = window.parent.document.getElementById("float_windows");
	floatW.className="float_windows";
	//2.close cover windows
	var coverW = window.parent.document.getElementById("window_overflow");
	coverW.style.display="none";
}

function search_user() {
	$.ajax({
		type:"post",
		url:"../user/search.do",
		data:$('#user_search_form').serialize(),
		dataType:"html",
		success:function(data) {
			document.getElementById("user-body").innerHTML=data;
			tablecloth();
		},
		error:function() {
			alert("搜索失败");
		}
	});
}

function search_user_type_change(v) {
	var typeinput = document.getElementById("user_type");
	typeinput.value=v;
}

function search_order_change(v) {
	var orderinput = document.getElementById("order");
	orderinput.value=v;
}
function search_page_change(v) {
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
}

function changeUserStatus(e) {
	var inputE = document.getElementById("userStatus");
	inputE.value=e.value;
}
function changeUserType(e) {
	var inputE = document.getElementById("userType");
	inputE.value=e.value;
}
function changeUserSex(e) {
	var inputE = document.getElementById("sex");
	inputE.value=e.value;
}
function changeCardType(e) {
	var inputE = document.getElementById("cardType");
	inputE.value=e.value;
}

function cancel_edit_user() {
	//1.close float windows
	var floatW = window.parent.document.getElementById("float_windows");
	floatW.className="float_windows";
	//2.close cover windows
	var coverW = window.parent.document.getElementById("window_overflow");
	coverW.style.display="none";
}

function confirm_edit_user() {
	//1.close float windows
	var floatW = window.parent.document.getElementById("float_windows");
	floatW.className="float_windows";
	//2.close cover windows
	var coverW = window.parent.document.getElementById("window_overflow");
	coverW.style.display="none";
	//3.confirm form action
	$.ajax({
		type:"post",
		url:"../user/updateOne.do",
		data:$('#edit_user_form').serialize(),
		dataType:"json",
		async: false,
		success:function(data) {
			if(data.success==true) {
				alert("更新完成");
				refresh_user_body();
			}
			else
				alert("更新失败");
		},
		error:function() {
			alert("更新失败");
		}
	});
}
function edit_user(id) {
	//1.get edit pannel
	$.ajax({
		type:"post",
		url:"../user/editPannel.do?id="+id,
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

function cannel_drop_user() {
	var drop_confirm_div = document.getElementById("drop_confirm");
	drop_confirm_div.className="modal fade bs-example-modal-sm";
}

function drop_user_pannel(id) {
	var inputE = document.getElementById("drop_user_id");
	inputE.value=id;
}

function drop_user() {
	var inputE = document.getElementById("drop_user_id");
	var id = inputE.value;
	$.ajax({
		type:"get",
		url:"../user/dropOne.do?id="+id,
		dataType:"json",
		success:function(data) {
			if(data.success==true) {
				var drop_confirm_div = document.getElementById("drop_confirm");
				drop_confirm_div.className="modal fade bs-example-modal-sm";
				refresh_user_body();
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