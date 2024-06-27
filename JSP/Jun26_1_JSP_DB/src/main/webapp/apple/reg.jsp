<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript" src="js/PiusValidChecker.js"></script>
<script type="text/javascript" src="js/jun26_check.js"></script>
<link rel="stylesheet" href="css/reg.css">
</head>
<body>
	<form action="AppleRegController" method="post" 
		name="appleRefForm" onsubmit="return appleRegCheck();">
	<table id="redTbl" border="1">
		<tr>
			<td>지역</td>
			<td> <input autofocus="autofocus" autocomplete="off" 
					placeholder="필수" name="a_location"
					required="required" class="textType"> </td>
		</tr>
		<tr>
			<td>색깔</td>
			<td> 
				<select name="a_color" class="slt">
					<option disabled selected>색깔</option>
					<option>빨강</option>
					<option>주황</option>
					<option>노랑</option>
					<option>초록</option>
					<option>파랑</option>
					<option>남색</option>
					<option>자색</option>
				</select>
			</td>
		</tr>
		<tr>
			<td>맛</td>
			<td> 
				<select name="a_flavor" class="slt">
					<option disabled selected>맛</option>
					<option>단맛</option>
					<option>신맛</option>
					<option>떫은맛</option>
				</select> 
			</td>
		</tr>
		<tr>
			<td>가격</td>
			<td> <input autocomplete="off" 
					placeholder="숫자만 입력" name="a_price"
					required="required" class="textType"> </td>
		</tr>
		<tr>
			<td align="center" class="td1">제품소개</td>
			<td>
				<textarea name="a_introduce"></textarea>
			</td>
		</tr>
		<tr>
			<td align="center" class="btn" colspan="2">
				<button>등록</button>
			</td>
		</tr>
	</table>
	
	</form>
</body>
</html>

















