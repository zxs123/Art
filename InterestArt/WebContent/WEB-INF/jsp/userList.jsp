<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt"  prefix="fmt"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
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
</body>

</html>