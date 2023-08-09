<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Register</title>
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
		style="background-color: dimgrey; margin: 10%; border: solid; padding: 5%">
		<h3>Registration</h3>

		<form action="RegistrationController">

			<table>
				<tr>
					<td>User Id</td>
					<td><input type="text" name="id"></td>
				</tr>
				<tr>
					<td>Full Name</td>
					<td><input type="text" name="fname"></td>
				</tr>
				<tr>
					<td>User Name</td>
					<td><input type="text" name="uname"></td>
				</tr>
				<tr>
					<td>Password</td>
					<td><input type="password" name="pass"></td>
				</tr>
				<tr>
					<td>Confirm Password</td>
					<td><input type="text" name="cpass"></td>
				</tr>
				<tr>
					<td>Mobile Number</td>
					<td><input type="text" name="mno"></td>
				</tr>
				<tr>
					<td>Registration Amount</td>
					<td><input type="text" name="ramt"></td>
				</tr>
			</table>

			<input type="submit" value="Register" name="action"><br>
		</form>

		<p>*username and password are case sensitive</p>

	</div>

</body>
</html>