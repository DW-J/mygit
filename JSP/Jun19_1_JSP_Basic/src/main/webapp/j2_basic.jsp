<%@page import="java.util.Random"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%-- 
		램덤한 숫자를(1 ~ 100) 넣었을 때, 짝인지 홀인지 알려주는 기능
		뽑은 숫자와 홀짝 여부를 웹페이지에 출력
	--%>
	<% 
	Random r = new Random();
	int num = r.nextInt(100) + 1;
	String result = "짝";
	if(num % 2 == 1){
		result = "홀";
	}
	%>
	
	뽑은 숫자는 <%=num %> <p>
	<%=result %> <p>
	
	<%!
		public String getOE(int x) {
		return (x % 2 == 0) ? "짝수" : "홀수";
	}
	%>
	<%
		int x = r.nextInt(100) + 1;
	%>
	
	

</body>
</html>
























