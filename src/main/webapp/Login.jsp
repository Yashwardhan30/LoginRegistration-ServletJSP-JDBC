<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login</title>
</head>
<body style="background-color: blanchedalmond">

	<div style="text-align: center; padding-top: 3%">
		<%!String msg = null;%>
		<%
		Object o = session.getAttribute("msg");
		String msg = (String) o;
		%>

		<%=msg%>
	</div>

	<div
		style="background-color: dimgrey; margin: 10%; border: solid; padding: 5%;">
		<h3>Login</h3>

		<form action="LoginController">

			<table>
				<tr>
					<td>User Name</td>
					<td><input type="text" name="uname"></td>
				</tr>
				<tr>
					<td>Password</td>
					<td><input type="password" name="pass"></td>
				</tr>
			</table>

			<input type="submit" value="Login" name="action"><br>
		</form>

		<p>*username and password are case sensitive</p>

	</div>

</body>
</html>