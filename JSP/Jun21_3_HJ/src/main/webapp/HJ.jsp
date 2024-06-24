<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<table>
		<tr>
			<th colspan="2">홀짝 게임 시작</th>
		</tr>
		<tr>
			<td class="td1" colspan="3" align="center">
			
			</td>
		</tr>
		<tr>
			<td align="center"> <a href="HomeController?userAns=1"><img src="css/1.jpg"></a></td>
			<td align="center"> <a href="HomeController?userAns=0"><img src="css/2.jpg"></a> </td>
		</tr>
		
		<tr>
			<td class="td1" colspan="2" align="center"> 동전 : ${c }	</td>
		</tr>
		<tr>	
			<td class="td1" colspan="2" align="center">	답 : ${r }	</td>
		</tr>
		<tr>
			<td class="td1" colspan="2" align="center">	${t } ${w } ${l } ${p }	</td>
		</tr>
		<tr>
			<td class="td1" colspan="2" align="center">
				<form action="HomeController" method="post">
					<button>다시하기</button>
				</form>
			</td>
		</tr>
	</table>
</body>
</html>