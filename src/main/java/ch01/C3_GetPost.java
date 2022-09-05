package ch01;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/ch01/getPost/add")
public class C3_GetPost extends HttpServlet {
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
	
	@Override
	public void doPost(HttpServletRequest req, HttpServletResponse res)
		throws ServletException, IOException {
		int num1 = 1;
		int num2 = 2;
		
		res.setContentType("text/html; charset=utf-8"); // utf-8로 인코딩하면 돼, 인코딩하는 객체?는? 클라이언트, res는 클라이언트에게 보내는 데이터ㅣㄴ까
		PrintWriter out = res.getWriter();
		out.println("<h2>POST</h2>");
		out.printf("<p>%d + %d = %d</p>", num1, num2, num1 + num2);
	}
}
