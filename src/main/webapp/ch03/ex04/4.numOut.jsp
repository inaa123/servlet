<%@ page language='java' contentType='text/html; charset=utf-8' pageEncoding='utf-8'%>
<%@ taglib prefix='c' uri='http://java.sun.com/jsp/jstl/core' %>
<%
	String numStr = request.getParameter("num"); //STRING타입이어서 산술연산못함.
	
	try {
		int num = Integer.parseInt(numStr); //string을 int로 바꾼다. 파싱
%>
		<%= num * 2 %>
		<a href='4.numIn.jsp'>뒤로가기</a>
	
<%
	} catch(NumberFormatException e) {
		
%>
		<%-- 과제: numIn.jsp form에 에러메시지(영어)를 출력하라. --%>
		<c:redirect url='4.numIn.jsp?msg=Input number.'/>
<%
	}
%>