<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix='c'%>
<!DOCTYPE>
<html>
<head>
<title>Reservation Query</title>
</head>
<body>
	<h1>Reservation Query :</h1>
	<form action="reservation" method="post">
		<ul>
			<li>Court Name :<input type="text" name="courtName"></li>
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
	<%-- 	<c:forEach items="${reservationsQ}" var="reservation">
		
	</c:forEach> --%>


</body>
</html>