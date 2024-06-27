<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="css/index.css">
</head>
<body>
	<table id="siteTbl">
		<tr>
			<th id="siteTitle" align="center">몰?루 아카이브</th>
		</tr>
		<tr>
			<td id="siteMenu">
				<a href="HomeController">Home</a>
				<a href="">1</a>
				<a href="">2</a>
				<a href="">3</a>
			</td>
		</tr>
		<tr>
			<td id="siteContent" ><jsp:include page="${contentPage }"></jsp:include></td>
		</tr>
		<!-- <tr>
			<td><img src=""> </td>
			<td><img src=""> </td>
		</tr> -->
		
	</table>
</body>
</html>