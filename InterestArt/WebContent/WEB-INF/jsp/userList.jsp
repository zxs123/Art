<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt"  prefix="fmt"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<script type="text/javascript">  
var x,y;
function keydownEvent() { 	
   	var location = event.srcElement.id;
    x = location.substr(4, 1); 
    y = location.substr(5, 1);
    var e = window.event || arguments.callee.caller.arguments[0];
    if (e && e.keyCode == 86 && e.ctrlKey ) {
      	var textarea = document.getElementById("area1");
    	textarea.focus();      	
    }
}

function onchangeEvent(){
	var textarea = document.getElementById("area1");
    var str1=textarea.value;
    str1 = str1.replace(/;/g,"###");
    str1 = str1.replace(/:/g,"%%%");    
 	var dataValue = str1.replace(/[\&\r]/g,"").replace(/([^\t\n]*)[\t]/g,"$1:").replace(/([^\n]*?)\n/g,"$1;").split(";");
    for(var i=0;i<dataValue.length;i++){
	 	var s2 = dataValue[i].split(":");
	 	for(var j=0;j<s2.length;j++){
		 	if(s2[j] !== null && s2[j] !== undefined && s2[j] !== ''){
		 		var x1 = 0,y1 = 0;
		 		x1 = i + parseInt(x);
		 		y1 = j + parseInt(y);
		 		var strzxs = 'data';
		 		strzxs = strzxs + x1 + y1;
		 		var qqq = document.getElementById(strzxs);	
		 		qqq.value = s2[j].replace(/###/g,";").replace(/%%%/g,":");
	 		}
	 	}
	}
	var textarea = document.getElementById("area1");
	area1.value = "";
	var data1 = document.getElementById("data"+x+y);
	data1.focus();
}
</script>  
<title>查询商品列表</title>
</head>
<body> 
<form action="${pageContext.request.contextPath }/editUser.action" method="post">
查询条件：
<table width="100%" border=1>
<tr>
<td><input type="submit" value="查询"/></td>
</tr>
</table>
用户列表：
<table width="100%" border=1>
<tr>
	<td>用户名</td>
	<td>性别</td>
	<td>出生日期</td>
	<td>电话</td>
	<td>操作</td>
</tr>
<c:forEach items="${usersList }" var="user">
<tr>
	<td>${user.userName }</td>
	<td>${user.sex }</td>
	<td>${user.birthday}</td>
	<td>${user.telephone }</td>
	
	<td><a href="${pageContext.request.contextPath }/editUser.action?id=${user.userId}">修改</a></td>

</tr>
</c:forEach>

</table>
</form>
<table border="1">
	    <tr><td><input type="text" onkeydown="keydownEvent()"  id="data00"/></td><td><input type="text" onkeydown="keydownEvent()" id="data01"/></td><td><input type="text" onkeydown="keydownEvent()" id="data02"/></td><td><input type="text" onkeydown="keydownEvent()" id="data03"/></td></tr>
	    <tr><td><input type="text" onkeydown="keydownEvent()"  id="data10"/></td><td><input type="text" onkeydown="keydownEvent()" id="data11"/></td><td><input type="text" onkeydown="keydownEvent()" id="data12"/></td><td><input type="text" onkeydown="keydownEvent()" id="data13"/></td></tr>
	    <tr><td><input type="text" onkeydown="keydownEvent()"  id="data20"/></td><td><input type="text" onkeydown="keydownEvent()" id="data21"/></td><td><input type="text" onkeydown="keydownEvent()" id="data22"/></td><td><input type="text" onkeydown="keydownEvent()" id="data23"/></td></tr>
	    <tr><td><input type="text" onkeydown="keydownEvent()"  id="data30"/></td><td><input type="text" onkeydown="keydownEvent()" id="data31"/></td><td><input type="text" onkeydown="keydownEvent()" id="data32"/></td><td><input type="text" onkeydown="keydownEvent()" id="data33"/></td></tr>
    </table>
    <textarea rows="0" cols="0" id="area1" style="border: none;resize: none;overflow:hidden;border:1px solid none;" oninput="onchangeEvent()" onpropertychange="onchangeEvent()" ></textarea>
</body>

</html>