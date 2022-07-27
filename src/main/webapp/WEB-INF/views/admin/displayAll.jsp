<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib uri="http://www.springframework.org/tags" prefix="spring" %>
    <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

</head>
<body>
<h2>All Team Players</h2>
<table>
<tr>
<th>Id</th>
<th>Name</th>
<th>Team</th>
<th>Role</th>
<th>Matches Played</th>
<th>Runs</th>
<th>Wickets</th>
</tr>

<c:forEach items="${requestScope.allPlayer}" var="play">
<tr>
<td>${play.id}</td>
<td>${play.name}</td>
<td>${play.team}</td>
<td>${play.role}</td>
<td>${play.matchPlayed}</td>
<td>${play.runs}</td>
<td>${play.wickets}</td>
</tr>
</c:forEach>
</table>
</body>
</html>