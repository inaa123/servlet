<%@ page language='java' contentType='text/html; charset=utf-8' pageEncoding='utf-8'%>
<ul>
	<li><%= request.getRequestURL() %></li>
	<li><%= request.getProtocol() %></li> <!-- 클라이언트와 서버가 사용하는? 프로토콜.. -->
	<li><%= request.getServerName() %></li>
	<li><%= request.getContextPath() %></li>
	<li><%= request.getRequestURI() %></li>
	<li><%= request.getQueryString() %></li>
	<li><%= request.getMethod() %>
</ul>