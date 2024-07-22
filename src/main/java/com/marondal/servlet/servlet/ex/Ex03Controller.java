package com.marondal.servlet.servlet.ex;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/servlet/ex03")
public class Ex03Controller extends HttpServlet {

	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
		
		response.setCharacterEncoding("utf-8");
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		// 이름과 생년월일을 전달받고,
		// 이름과 나이를 정리한 html을 작성한다.
		
		String name = request.getParameter("name");
		String birthday = request.getParameter("birthday"); //20040512
		
		String yearString = birthday.substring(0, 4);
		int year = Integer.parseInt(yearString);
		
		int age = 2024 - year + 1;
		
		out.println("<html><head><title>이름, 나이</title></head><body>");
		out.println("<h2>이름 : "+ name + " </h2>");
		out.println("<h2>나이 : "+ age + " </h2>");
		out.println("</body></html>");
	}
}
