<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>CJN Login</title>
</head>
<body>
	<form action="loginRegister" method="post">
		<table style="background-color: lightgreen; margin-left: 20px;">
			<tr>
				<td><h3 style="color: red;">${message}</h3><h3>${successMessage}</h3></td>
				<td></td>
			</tr>
			<tr>
				<td><h3>CJN Login</h3></td>
			</tr>
			<tr>
				<td>Username:</td>
				<td><input type="text" name="username"></input></td>
			</tr>
			<tr>
				<td>Password:</td>
				<td><input type="password" name="password1"></input></td>
			</tr>
			<tr>
				<td><input type="submit" name="submit" value="login"></input></td>
				<td><a href="register.jsp">New user? Register</a></td>
			</tr>
		</table>
	</form>
</body>
</html>