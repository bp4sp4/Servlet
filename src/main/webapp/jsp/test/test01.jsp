<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.Arrays, java.util.List" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>1. 점수들의 평균 구하기 </h1>
<% 	 
	int[] scores = {80, 90, 100, 95, 80};
	int sum = 0;
	for (int score : scores) {
	    sum += score;
	}
	double avg = (double) sum / scores.length;
%>
	<p>평균 : <%= avg %> </p>

	<h1>2. 채점 결과 </h1>
 <%
    List<String> scoreList = Arrays.asList(new String[]{"X", "O", "O", "O", "X", "O", "O", "O", "X", "O"});
    int allscore = 0;
    int scorepercent = 10;

    for (String result : scoreList) {
        if (result.equals("O")) {
        	allscore += scorepercent;
        }
    }
%>

	<p>시험 점수: <%= allscore %>점</p>
	<h1>3. 1부터 n까지의 합계를 구하는 함수</h1>
	<%! 
   
    public int sumhap(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        return sum;
    }
	
	int sum = sumhap(50);
%>

<p> 합 : <%= sum %> </p>
</body>
</html>