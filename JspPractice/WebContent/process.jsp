<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<jsp:useBean id="user" class="com.bridgelabz.jsppractice.models.User"></jsp:useBean>
	<jsp:setProperty property="*" name="user" />
	<%=user%>
	<%
		String name;
		String password;
		name = (String) request.getParameter("nm");
		password = (String) request.getParameter("pwd");
		if (name.equals("Bijaya laxmi") && password.equals("mama")) {
			/* request.setAttribute("successfulMessage", "username = Bijaya laxmi and password = mama"); */
	%>


	<jsp:forward page="successful.jsp">
		<jsp:param value="username = Bijaya laxmi and password = mama"
			name="successfulMessage" />
	</jsp:forward>

	<%
		} else {
			/* request.setAttribute("unsuccessfulMessage", "your username is "+name+" and password is "+password+" which is invalid"); */
	%>

	<jsp:forward page="unsuccessful.jsp">
		<jsp:param value="your" name="unsuccessfulMessage" />
	</jsp:forward>

	<%
		}
	%>
</body>
</html>