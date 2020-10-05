<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Academic Profile - Success Page</title>
</head>

<body>
	<h1>${group.groupName}</h1>
	<table>
		<tr>
			<td><img src="<c:url value="/static/Placeholder.png" />"></td>
		</tr>
		<tr>
			<td colspan="3">${group.groupDescription}</td>
		</tr>
	</table>


</body>
</html>
