<%@page import="com.pius.jun211.main.Pius"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
 	<%
 		// EL (Expression Language)
 		//		값 받을 때 Java 대신 가능
 		//		.jsp에서만 사용 가능
 		//			(.jsp를 톰캣이 Servlet으로 바꿀때 EL을 Java코드로 바꿔줌)
 		//		문법 : ${XXX }
 		//			연산자 사용 가능
 		//			형 변환 자동
 		//			값이 없으면 그냥 넘어감
 		//			import가 없어도 됨
 		
 		// 		파라미터값 읽기 : ${param.파라미터명 }
 		
 		//		어트리뷰트값 읽기(int, double, String, ...포함)
 		//				: ${어트리뷰트명 }
 		
 		// 		어트리뷰트값 읽기(객체)
 		//				주소값 - ${어트리뷰트명 }
 		//				속성값 - ${어트리뷰트명.멤버변수명 }
 		
 		//		어트리뷰트값 읽기(List, [])
 		//				AL, [] 자체 - ${어트리뷰트명 }
 		//				인덱스 위치의 객체 - ${어트리뷰트명[인덱스] }
 		//				인덱스 위치의 객체 속성 - ${어트리뷰트명[인덱스].멤버변수명 }
 		
 		//		반복문, 조건문 - EL (X) / CustomTag (O) 		
 	%>
 	
 	<% 
 		String x = request.getParameter("x");
 		String y = request.getParameter("y");
 		int z = (Integer) request.getAttribute("z");
 		
 		Pius p = (Pius) request.getAttribute("p");
 		
 		ArrayList<Pius> pio = (ArrayList<Pius>) request.getAttribute("pio");
 	%>
 	<h1>결과</h1>
 	<%=x %> x <%=y %> = <%=z %> <br>
 	<%=p.getName() %> : <%=p.getAge() %> : <%=p.getHeight() %> : <%=p.getWeight() %> <p>
 	<%=p %> <p>
 	
 	<%=pio %> <p>
 	<%=pio.get(1) %> <p>
 	<%=pio.get(2).getName() %>, <%=pio.get(3).getAge() %> <p>
 	
 	<%
 		for (int i = 0; i < pio.size(); i++){
 	%>
 		<%=pio.get(i).getName() %> : <%=pio.get(i).getAge() %>살 <br>
 	<%
 		}
 	%>
 	<hr>
 	${param.x } <p>
 	${param.y } <p>
 	${param.x  * param.y } <p>
 	${z } <p>
 	<hr>
 	${p.name } : ${p.age } : ${p.height } : ${p.weight } <p>
 	<hr>
 	${param.a;sdkfjj;awvnjw;aoskfvjz;sodgjq;ok } <!-- 값이 없을 때 -->
 	<hr>
 	${pio } <P>
 	${pio[1] } <P>
 	${pio[2].name }, ${pio[3].age } <P>
 	
</body>
</html>


















