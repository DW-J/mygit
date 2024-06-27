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
			<th id="siteTitle" align="center">2024년 6월 25일</th>
		</tr>
		<tr>
			<td id="siteMenu">
				<a href="HomeController">Home</a>
				<a href="CalcController">사칙연산</a>
				<a href="JSTLCController">JSTL-C</a>
				<a href="JSTLFController">JSTL-F</a>
			</td>
		</tr>
		<tr>
			<td id="siteContent" ><jsp:include page="${contentPage }"></jsp:include></td>
		</tr>
		
	</table>
</body>
</html>