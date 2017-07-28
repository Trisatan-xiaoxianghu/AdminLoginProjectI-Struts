<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
 	<h1>欢迎你，${userInfo.userName }</h1>
<table align="center" border="1">
<tr>
  			<td>序号</td>
  			<td>编号</td>
  			<td>用户名</td>
  			<td>密码</td>
</tr>

<%@taglib uri="/struts-tags" prefix="s" %>
<s:iterator var="admin" value="#request.listAdmin" status="st">
<tr>
  			<td><s:property value="#st.count"/></td>
  			<td><s:property value="#admin.id"/></td>
  			<td><s:property value="#admin.userName"/></td>
  			<td><s:property value="#admin.pwd"/></td>
</tr>




</s:iterator>








</table>
</body>
</html>