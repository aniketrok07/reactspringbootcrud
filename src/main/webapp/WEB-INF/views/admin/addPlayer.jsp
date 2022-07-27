<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib uri="http://www.springframework.org/tags" prefix="spring" %>
    <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<!-- <h3>Enter Player Details</h3> -->
<spring:url var="url" value="/admin/add" />
<form:form action="${url}" method="post" modelAttribute="player">
<h3>Enter Player Details</h3>
        <table style="background-color: lightgrey; margin: auto">
            <tr>
            <th>Player Name</th><td>
            <form:input path="name" /></td>
            </tr>
            <tr>
            <th>Team Name</th><td>
            <form:input path="team" /></td>
            </tr>
            <tr>
            <th>Player Role</th>
            <td><form:select path="role">
            <option selected="selected" hidden="true">--Select--</option>
            <option>BATSMAN</option>
            <option>BOWLER</option>
            </form:select></td>
            </tr>
        <tr>
        <td><button type="submit">add</button></td>
        <td><button type="reset">cancel</button></td>
        </tr>
        </table>
</form:form>
</body>
</html>