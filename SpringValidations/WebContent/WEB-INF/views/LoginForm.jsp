<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" 
	"http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Login</title>
<style>
.error {
	color: red;
	font-weight: bold;
}
</style>
</head>
<body>
	<div align="center">
		<h2>Login Form</h2>
		<table border="0" width="90%">
			<form:form action="login" commandName="userForm" method="post">
				<tr>
					<td align="left" width="10%">Email:</td>
					<td align="left" width="20%"><form:input path="email"
							size="30" /></td>
					<td align="left"><form:errors path="email" cssClass="error" />
					</td>
				</tr>
				<tr>
					<td>Password:</td>
					<td><form:password path="password" size="30" /></td>
					<td><form:errors path="password" cssClass="error" /></td>
				</tr>
				<tr>
					<td><input type="submit" value="Login" /></td>
				</tr>
			</form:form>
		</table>
	</div>
	<a href="uploadform">Upload Image</a> 
</body>
</html>