<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="css/index.css">
<script type="text/javascript" src="js/PiusValidChecker.js"></script>
<script type="text/javascript" src="js/jun26_check.js"></script>
<script type="text/javascript" src="js/go.js"></script>
</head>
<body>
	<table id="siteTbl">
		<tr>
			<th id="siteTitleArea"><a href="">Title</a></th>
		</tr>
		<tr>
			<td id="siteContentArea" align="center">
				<jsp:include page="${contentPage }"></jsp:include>
			</td>
		</tr>
	</table>
	
	<table id="siteMenuTbl">
		<tr>
			<td align="center"><a href="AppleController">Apple</a></td>
			<td align="center"><a href="">Banana</a></td>
			<td align="center"><a href="">Cherry</a></td>
			<td align="center"><a href="DBCController">DB연결</a></td>
		</tr>
	</table>
	
</body>
</html>