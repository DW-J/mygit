<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    <%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="css/apple.css">
</head>
<body>
	<table id="appleTbl" border="1">
		<tr>
		<td align="center" colspan="3"> ${r }<a href="AppleRegController">등록</a></td>
		</tr>
		<tr>
			
			
			<td id="appleBoard" align="center">
				<table id="appleContext"  border="1">
					<tr>
						<td>지역</td>
						<td>가격</td>
					</tr>
					<c:forEach var="apple" items="${apples }">
					<tr class="dataTr" onclick="goAppleDetail('${apple.a_location}');">
						<td>${apple.a_location }</td>
						<td>
							<fmt:formatNumber value="${apple.a_price }" type="number" />
						</td>
					</tr>
					</c:forEach>
				</table>
			</td>
			
			
		</tr>
		<tr>
			<td align="center">
				<c:forEach var="p" begin="1" end="${pageCount }">
					<a href="ApplePageController?p=${p }">${p }</a>
				</c:forEach>
			</td>
		</tr>
	</table>
				<img src="css/apple_C.jpg">
				<img src="css/apple_M.jpg">
</body>
</html>