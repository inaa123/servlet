<%@ page language='java' contentType='text/html; charset=utf-8' pageEncoding='utf-8'%>
<form action='siteProc.jsp'>
	<input type='radio' name='site' value='daum'>다음
	<input type='radio' name='site' value='naver'>네이버
	<input type='submit'/>
</form>
<% 
	String msg = request.getParameter("msg");
%>
<%= msg != null ? msg : "" %>

<!-- 과제 :
다음 또는 네이버를 선택하고, 폼을 제출한다. (입력은 키보드, 선택은 마우스; 또는->라디오, 그리고->checkbox)
해당 사이트로 이동한다. 

미완성된 폼을 제출하면, 다시 폼으로 돌아온다.
위의 경우, 폼 아래에 에러 메시지를 출력한다.
-->
