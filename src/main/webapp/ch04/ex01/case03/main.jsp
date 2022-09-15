<%@ page language='java' contentType='text/html; charset=utf-8' pageEncoding='utf-8'%>
<%
	Object user = session.getAttribute("userId"); // user값이 없으면 로그인 안한것.
	
	if(user == null) { //로그인 안했으면! -> 로그인 하면됨
		String userId = "";
		Cookie[] cookies = request.getCookies();
		
		if(cookies != null) { //쿠키값이 있으면?
			for(Cookie cookie: cookies)
				if(cookie.getName().equals("userId"))
					userId = cookie.getValue(); //쿠키값 읽어낸다.
		}
%>
		<form action='loginProc.jsp' method='post'>
			ID: <input type='text' name='usrId' value='<%= userId %>'/>
			PW: <input type='password' name='pw'/><br><br>
			<input type='checkbox' name='isStoreId' value='true'>ID 저장
			<input type='submit' value='로그인'/>
		</form>
<%
	} else {
%>
		<%= user %>님, 환영합니다. &nbsp;
		<a href='logout.jsp'>로그아웃</a>
<%
	}
%>