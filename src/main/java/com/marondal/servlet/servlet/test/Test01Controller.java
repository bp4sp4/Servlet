package com.marondal.servlet.servlet.test;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



public class Test01Controller extends HttpServlet{

	
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
		

		PrintWriter out = response.getWriter();
		// 현재날짜 시간 response 에 담기
		Date now = new Date();
		
		SimpleDateFormat fomatter = new SimpleDateFormat("오늘의 날짜는 yyyy년 M월 d일 HH:mm:ss");
		String dateTimeString = fomatter.format(now);
		out.println(dateTimeString);
		
	}
}
