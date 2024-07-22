package com.marondal.servlet.servlet.ex;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Ex01Controller extends HttpServlet {
	
	
	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
		// response header
		// 응답 데이터에 대한 정보
		// character set
		response.setCharacterEncoding("utf-8");
		// 데이터 타입
		// MIME
		// text/plain : 그냥 문자열
		response.setContentType("text/plain");
		
		// response body 
		PrintWriter out =  response.getWriter();
		out.println("URL Mapping 예제");
		
		// 현재날짜 시간 response 에 담기
		Date now = new Date();
		out.println(now);
		
		// 2024년 07월 17일 21:28:30
		SimpleDateFormat fomatter = new SimpleDateFormat("yyyy년 MM월 dd일 HH:mm:ss");
		String dateTimeString = fomatter.format(now);
		out.println(dateTimeString);
		
	
	}
}
