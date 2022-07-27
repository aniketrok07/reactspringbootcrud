<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h5 style="color: red;text-align: center;">${requestScope.mesg}</h5>
	<form  method="post">
		<table style="background-color: lightgrey; margin: auto">
			<tr>
				<td>Enter User Name : </td>
				<td><input type="text" name="name" required /></td>
			</tr>
			<tr>
				<td>Enter Password : </td>
				<td><input type="password" name="pass" required /></td>
			</tr>

			<tr>
				<td><input type="submit" value="Login" /></td>
				<td><input type="reset" value="Cancel" /></td>
			</tr>
			
		</table>
	</form>
</body>
</html>