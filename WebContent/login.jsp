<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
 <form method="post" action="${pageContext.request.contextPath }/user_login.action">
  	 	用户名：<input type="text" name="admin.userName"><br/>
  	 	密码：<input type="text" name="admin.pwd"><br/>
  	 	<input type="submit" value="登陆"><br/>
  	 </form>
</body>
</html>