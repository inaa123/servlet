<%@ page language='java' contentType='text/html; charset=utf-8' pageEncoding='utf-8'%>
<%
	Cookie cookie = new Cookie("name", "john"); //쿠키 생성
	response.addCookie(cookie);//리스펀스에 쿠키를 집어넣기
%>
<a href='main.html'>메인</a>
