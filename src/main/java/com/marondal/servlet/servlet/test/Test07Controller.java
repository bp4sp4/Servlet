package com.marondal.servlet.servlet.test;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/servlet/test07")
public class Test07Controller extends HttpServlet {
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
		response.setContentType("text/html");
		
		PrintWriter out = response.getWriter();
		
		String name = request.getParameter("name");
		String aboutme = request.getParameter("aboutme");
		
		out.println("<html><head><title>이름, 나이</title></head><body>");
		out.println("<h2> "+ name + "</h2>님 지원이 완료되었습니다.<hr>" );
		out.println(""+ aboutme + "");
		out.println("</body></html>");
		
	}
}
