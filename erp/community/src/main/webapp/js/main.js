var menuList = ["navi_fee_m","navi_community_m","navi_resource_m","navi_report_m","navi_contract_m","navi_sys_m"];
var subMenuList = ["sub_menu_fee","sub_menu_community","sub_menu_resource","sub_menu_report","sub_menu_contract","sub_menu_sys"];
var mmap = new Map(); 
function initSubMenu() {
	var menu = document.getElementById("navi");
	var subMenu = document.getElementById("subnavi");
	var paddingWidth = 20;
	for(var i=0,menuName;menuName=menuList[i];i++) {
		var subMN = subMenuList[i];
		mmap.put(menuName,subMN);
		//alert(menuName);
		//alert(subMenuList[i]);
		var e = document.getElementById(menuName);
		var subMenu_content = document.getElementById(subMN);
		//subMenu_content.className = "sub-menu-list";
		subMenu_content.className = "sub-menu-list";
		subMenu.style.top=parseInt(getTop(e))+parseInt(menu.offsetHeight)+"px";
		//subMenu_content.style.left=parseInt(getLeft(e))+parseInt(paddingWidth)+"px";
		subMenu_content.style.left=parseInt(getLeft(e))+"px";
	}
}
function selectedSubMenu(e) {
	initHideSubMenu();
	initUnSelectedMenu();
	var mn = e.id;
	var smn = mmap.get(mn);
	var se = document.getElementById(smn);
	se.className = "sub-menu-list-show";
	e.className = "li-selected";
}
function initUnSelectedMenu() {
	for(var i=0,mn;mn=menuList[i];i++) {
		var se = document.getElementById(mn);
		se.className = "li-unselected";
	}
}
function initHideSubMenu() {
	for(var i=0,smn;smn=subMenuList[i];i++) {
		var se = document.getElementById(smn);
		se.className = "sub-menu-list";
	}
}

function hidenSubMenu(e) {
	for(var i=0,smn;smn=subMenuList[i];i++) {
		var se = document.getElementById(smn);
		se.className = "sub-menu-list";
	}
}

//获取元素的纵坐标 
function getTop(e){ 
	var offset=e.offsetTop; 
	if(e.offsetParent!=null) offset+=getTop(e.offsetParent); 
	return offset; 
} 
//获取元素的横坐标 
function getLeft(e){ 
	var offset=e.offsetLeft; 
	if(e.offsetParent!=null) offset+=getLeft(e.offsetParent); 
	return offset; 
} 

function showWindowOverflow() {
	var windowFlow = document.getElementById("window_overflow");
	windowFlow.style.display = "block";
}

function hiddenWindowOverflow() {
	var windowFlow = document.getElementById("window_overflow");
	windowFlow.style.display = "none";	
}