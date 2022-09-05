package ch01;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/ch01/get/add") //url �Ҵ�, �� �������� ������ �� �ۼ�(���ؽ�Ʈ?���̿� �����Ѱ�)
public class C1_Get extends HttpServlet { //http������ ��ӹ����� Ŭ������ ������ ��.(����: �ڹپ��� ���۾���; ���)
	@Override
	public void doGet(HttpServletRequest req, HttpServletResponse res)
		throws ServletException, IOException {
		int num1 = 1;
		int num2 = 2;
		
		res.setContentType("text/html; charset=utf-8"); //textŸ�� html, charset?����? utf-8�� �Ѵ�.
		PrintWriter out = res.getWriter(); //out ��ü�� response�� ���� ����� ��. response�ٵ�ȿ� ����ȴ�.
		out.println("<h2>Get</h2>"); //����� html�ڵ�� ��.
		out.printf("<p>%d + %d = %d</p>", num1, num2, num1 + num2);
	}
}
