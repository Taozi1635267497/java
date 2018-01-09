<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<script type="text/javascript" src="${pageContext.request.contextPath}/js/js/jquery-1.8.0.min.js"></script>
<script type="text/javascript">
	//普通的方法
	function loadList(){
		$.post('/nis-manage/admin/list',{},
			function(data){
			$('#listdata').empty();/* 清空容器  */
			$.each(data,function(i,v){
				$('<tr></tr>')
				     .append($('<td></td>').html(v.adminId))
				     .append($('<td></td>').html(v.adminName))
				     .append($('<td></td>').html(v.password))
				     .append($('<td></td>').html(v.permissions))
				     .append($('<td></td>').html('--'))
				     .appendTo('#listdata');
			});
		});
		
	}
	//必须用此回调函数调用此方法
	$(function(){
		loadList();
	})
	
</script>
</head>
<body>
	<table border="1" width="600px" cellspacing="0">
		<thead><td>管理员ID</td><td>管理员账号</td><td>管理员密码</td><td>管理员权限</td><td>操作</td></thead>
		<tbody id="listdata"></tbody>
	</table>
</body>
</html>