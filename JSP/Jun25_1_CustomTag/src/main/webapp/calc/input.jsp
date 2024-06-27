<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript" src="js/PiusValidChecker.js"></script>
<script type="text/javascript" src="js/CalcCheck.js"></script>
<link rel="stylesheet" href="css/index.css">
<link rel="stylesheet" href="css/calc.css">
</head>
<body>
		<form action="CalcController" name="calcForm" onsubmit="return calcCheck();">
			<table id="clacTbl">
				<tr>
					<td align="center">
						x : <input placeholder="x" autofocus="autofocus"
						autocomplete="off" name="x">
					</td>
				</tr>
				<tr>
					<td align="center">
						y : <input placeholder="y" autofocus="autofocus"
						autocomplete="off" name="y">
					</td>
				</tr>
				<tr>
					<td align="center">
						<button>계산</button>
					</td>
				</tr>
			</table>
		</form>
</body>
</html>




















