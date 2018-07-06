<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>SignIn</title>
</head>
<body bgcolor="LightSalmon">
	<div style="background-color: pink">
		<fieldset>
			<legend>
				<h3 style="color: black;">SignIn</h3>
			</legend>
			<form action="signin" method="post">
				UserName : <input type="email" name="username"><br>
				Password : <input type="password" name="password"
					pattern="((?=.*\d)(?=.*[0-9])(?=.*[A-Z])(?=.*[a-z])(?=.*[@#$%^&*()!]).{6,20})"
					title="must Contain atleast( one digit[0-9],one aplha[a-z] and [A-Z],one specialCharacter )"><br>
				<input type="submit" value="signIn" />&nbsp;
			</form>
			<br>
			<form action="forgetpassword" method="post">
				<input type="submit" value="Forgot Password">
			</form>
		</fieldset>
	</div>
</body>
</html>