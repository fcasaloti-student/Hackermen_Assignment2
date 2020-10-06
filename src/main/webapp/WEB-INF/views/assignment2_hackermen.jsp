<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<html>
<head>
<link href='./static/css/style_hackermen.css' rel='stylesheet'>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Group Page - Hackermen</title>
</head>

<body>
	<h1>${group.groupName} - GroupPage</h1>
	<div>
		<table>
			<tr>
				<td><img src="${daniil.photo}" alt="${daniil.name}">
				<img src="${fabio.photo}" alt="${fabio.name}">
				<img src="${fernando.photo}" alt="${fernando.name}"></td>
			</tr>
			<tr>
				<td id="description"><br>${group.groupDescription}</td>
			</tr>
		</table>
	</div>


</body>
</html>
