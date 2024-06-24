<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="rsp.css">
</head>
<body>
	<table class="rspTbl">
		<tr>
			<th colspan="3">♬가위바위보 시작♬</th>
		</tr>
		<tr>
			<td class="td1" colspan="3" align="center">
				└|∵┌|  |┐∵|┘
			</td>
		</tr>
		
		<tr>
			<td align="center"> 
				<a href="HomeController?userHand=1"><img src="css/1.jpg"></a> 
			</td>
			<td align="center"> 
				<a href="HomeController?userHand=2"><img src="css/2.jpg"></a> 
			</td>
			<td align="center"> 
				<a href="HomeController?userHand=3"><img src="css/3.jpg"></a> 
			</td>
		</tr>
		<tr>
			<td class="td2" align="center">유저(↓)</td>
			<td class="td2" align="center">싸움수준 실화냐?</td>
			<td class="td2" align="center">상대(↓)</td>
		</tr>
		<tr>
			<td align="center" class="td3"> <img src="css/${uh }"> </td>
			<td> <img src="css/crazy.jpg"> </td>
			<td align="center" class="td3"> <img src="css/${ch }"> </td>
		</tr>
		<tr>
			<td class="td1" colspan="3" align="center">
				판정 : ${r }
			</td>
		</tr>
		<tr>
			<td class="td1" colspan="3" align="center">
			${t } ${w } ${d } ${l }
			</td>
		</tr>
		<tr>
			<td class="td1" colspan="3" align="center">
				<form action="HomeController" method="post">
					<button>다시하기</button>
				</form>
			</td>
		</tr>
		
	</table>
	
</body>
</html>