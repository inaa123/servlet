<%@ page language='java' contentType='text/html; charset=utf-8' pageEncoding='utf-8'%>
<%@ taglib prefix='c' uri='http://java.sun.com/jsp/jstl/core' %>
<%
	String userId = request.getParameter("userId");
	String isStoreId = request.getParameter("isStoreId");
	
	if(!userId.equals("")) { //usreId값이 있으면
		session.setAttribute("userid", userId); //session에 
		
		if(isStoreId != null && isStoreId.equals("true")) {
			Cookie cookie = new Cookie("userId", userId);
			cookie.setMaxAge(10); //10초후 로그인 시 아이디가 자동저장되지않음
			response.addCookie(cookie);
		}
	}
%>
<c:redirect url='main.jsp'/>