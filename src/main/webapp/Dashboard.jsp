<%@page import="linkcode.model.User"%>
<%@page import="java.util.List"%>
<%@page import="linkcode.dao.LoginDaoImpl"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Dashboard</title>
</head>
<body style="background-color: blanchedalmond">

	<%!User user = null;%>
	<%
	Object o = session.getAttribute("user");
	User user = (User) o;
	%>

	<div style="text-align: center; padding-top: 1%">
		<%!String msg = null;%>
		<%
		Object o1 = session.getAttribute("msg");
		String msg = (String) o1;
		%>

		<%=msg%>
	</div>

	<div
		style="background-color: dimgrey; align-items center; margin: 5%; border: solid;">
		<h1>
			Welcome
			<%=user.getFname()%></h1>

	</div>

	<div
		style="background-color: dimgrey; align-items center; margin: 10%; border: solid; padding: 5%">
		<table>
			<tr>
				<td>User Id</td>
				<td><%=user.getId()%></td>
			</tr>
			<tr>
				<td>Full Name</td>
				<td><%=user.getFname()%></td>
			</tr>
			<tr>
				<td>User Name</td>
				<td><%=user.getUname()%></td>
			</tr>
			<tr>
				<td>Password</td>
				<td><%=user.getPass()%></td>
			</tr>
			<tr>
				<td>Mobile Number</td>
				<td><%=user.getMno()%></td>
			</tr>
			<tr>
				<td>Registration Amount</td>
				<td><%=user.getRamt()%></td>
			</tr>
		</table>

	</div>

	<div
		style="background-color: dimgrey; align-items center; margin: 10%; border: solid; padding: 5%">
		<a href="Home.html">
						<button type="submit">Log out</button>
				</a>
	</div>

</body>
</html>