package com.marondal.servlet.servlet.test;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/servlet/test08")
public class Test08Controller extends HttpServlet {
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {

		
		response.setContentType("text/html");
		
		PrintWriter out = response.getWriter();
		
		String id = request.getParameter("id");
		String password = request.getParameter("password");
		
		out.print("<html><head><title>로그인</title></head><body>");
		   if (!userMap.get("id").equals(id)) {
	            out.print("<p>ID가 일치하지 않습니다.</p>");
	        } else if (!userMap.get("password").equals(password)) {
	            out.print("<p>Password가 일치하지 않습니다.</p>");
	        } else {
	            out.print("<h1>로그인 성공</h1>");
	            out.print("<h1> " + userMap.get("name") + "님 환영합니다.</h1>");
	        }
	}
	private final Map<String, String> userMap =  new HashMap<String, String>() {
	    {
	        put("id", "hagulu");
	        put("password", "asdf");
	        put("name", "김인규");
	    }
	};
}


