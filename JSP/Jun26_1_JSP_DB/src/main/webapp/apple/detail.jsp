<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2>Apple Information</h2>
	<table id="detailTbl" border="1">
	<form action="AppleDetailController" method="post">
		<tr>
			<td>지역 :</td>
			<td class="td2">
				<input readonly="readonly" name="a_location" class="inputt"
				value="${apple.a_location }">
			</td>
		</tr>
		<tr>
			<td class="td2">색깔 :</td>
			<td>
				<input autofocus="autofocus" autocomplete="off" 
				name="a_color" class="inputt"
				value="${apple.a_color }"> 
			</td>
		</tr>
		<tr>
			<td class="td2">맛 :</td>
			<td><input autocomplete="off" name="a_flavor" class="inputt"
				value="${apple.a_flavor }"></td>
		</tr>
		<tr>
			<td class="td2">가격 :</td>
			<td><input autocomplete="off" name="a_price" class="inputt"
				value="${apple.a_price }"></td>
		</tr>
		<tr>
			<td class="td2">소개 :</td>
			<td><input id="textArea" autocomplete="off" maxlength="100" name="a_introduce"
				value="${apple.a_introduce }"></td>
		</tr>
		<tr>
			<td align="center" colspan="2">
				<button class="btn">수정</button>
	</form>
				<button class="btn" onclick="deleteApple('${apple.a_location}');">삭제</button>
				<button class="btn" onclick="history.back();">뒤로</button>
			</td>
		</tr>
	</table>
</body>
</html>











