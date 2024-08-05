<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
	
		// 닉네임을 전달 받고, html에 포함
		String nickname = request.getParameter("nickname");
		// 라디오 버튼 파라미터
		String animal = request.getParameter("animal");
		// 셀렉트박스 파라미터
		String fruit = request.getParameter("fruit");
		// 체크박스 파라미터
		String[] foodArray = request.getParameterValues("food");
		String foodListString = "";
		for(int i = 0; i < foodArray.length; i++) {
			foodListString += foodArray[i] +  " ";  
		}
	
	%>
	<h3><%= nickname %></h3>
	<h3><%= animal %></h3>
	<h3><%= fruit %></h3>
	<h3><%= foodListString %></h3>
</body>
</html>