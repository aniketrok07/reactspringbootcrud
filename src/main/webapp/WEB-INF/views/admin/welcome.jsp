<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h2>Welcome ${requestScope.UserDetl.name}</h2>
<ul>
<li><a href="<spring:url value='/admin/add'/>">Add Player Details</a></li>
<li><a href="<spring:url value='/admin/displayAll'/>">Display All Team Records</a></li>
<li><a href="<spring:url value='/admin/remove'/>">Remove player from any team</a></li>
<li><a href="<spring:url value='/admin/bestBatsmen'/>">Display best Batsmen from all teams</a></li>
<li><a href="<spring:url value='/admin/bestBowler'/>">Display best Bowler from all teams</a></li>

</ul>
</body>
</html>