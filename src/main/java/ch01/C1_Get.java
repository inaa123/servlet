package ch01;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/ch01/get/add") //url 할당, 이 서블릿만의 고유한 거 작성(컨텍스트?사이에 유일한거)
public class C1_Get extends HttpServlet { //http서블릿을 상속받으면 클래스는 서블릿이 됨.(서블릿: 자바언어로 웹앱쓰고싶어서 사용)
	@Override
	public void doGet(HttpServletRequest req, HttpServletResponse res)
		throws ServletException, IOException {
		int num1 = 1;
		int num2 = 2;
		
		res.setContentType("text/html; charset=utf-8"); //text타입 html, charset?뭐를? utf-8로 한다.
		PrintWriter out = res.getWriter(); //out 객체는 response로 부터 만들어 냄. response바디안에 저장된다.
		out.println("<h2>Get</h2>"); //출력이 html코드면 됨.
		out.printf("<p>%d + %d = %d</p>", num1, num2, num1 + num2);
	}
}
