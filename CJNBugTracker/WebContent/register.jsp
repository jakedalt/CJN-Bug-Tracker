<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>CJN Registration</title>
</head>
<body>
	<form action="loginRegister" method="post">
		<table style="background-color: skyblue; margin-left: 20px;">
			<tr>
				<td><h3>CJN Registration</h3></td>
			</tr>
			<tr>
				<td>Username:</td>
				<td><input type="text" name="username"></input></td>
			</tr>
			<tr>
				<td>Full Name:</td>
				<td><input type="text" name="name"></input></td>
			</tr>
			<tr>
				<td>Password:</td>
				<td><input type="password" name="password1"></input></td>
			</tr>
			<tr>
				<td>Re-type Password:</td>
				<td><input type="password" name="password2"></input></td>
			</tr>
			<tr>
				<td><input type="submit" name="submit" value="register"></input></td>
				<td><a href="login.jsp">Already a member? Login</a></td>
			</tr>
		</table>
	</form>
</body>
</html>