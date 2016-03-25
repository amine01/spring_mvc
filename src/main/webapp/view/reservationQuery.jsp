<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix='c'%>
<%@ taglib uri="http://www.springframework.org/tags" prefix='spring'%>
<!DOCTYPE>
<html>
<head>
<title><spring:message code="reservation.title" /></title>
</head>
<body>
	<h1>
		<spring:message code="reservation.query" />
	</h1>
	<h3>
		<spring:message code="reservation.handling" />${handlingTime}</h3>
	<h3>
		<spring:message code="reservation.language" />${pageContext.response.locale}</h3>
	<form action="reservation" method="post">
		<ul>
			<li><spring:message code="reservation.courtName" /><input
				type="text" name="courtName"></li>
			<li><input type="submit" value=" OK "></li>
		</ul>
	</form>
	<c:if test="${reservationsQ.size()>0}">
		<table>
			<tr>
				<th>Court Name</th>
				<th>Player Name</th>
				<th>Sport Type</th>
			</tr>
			<c:forEach items="${reservationsQ}" var="reservation">
				<tr>
					<td>${reservation.courtName}</td>
					<td>${reservation.player.name}</td>
					<td>${reservation.sportType.name}</td>
				</tr>
			</c:forEach>
		</table>
	</c:if>
</body>
</html>