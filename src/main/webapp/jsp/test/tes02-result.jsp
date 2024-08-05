<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>BMI 측정결과</h1>
 <%
        String heightStr = request.getParameter("height");
        String weightStr = request.getParameter("weight");

        if (heightStr != null && weightStr != null) {
            try {
                double height = Double.parseDouble(heightStr);
                double weight = Double.parseDouble(weightStr);

                double bmi = weight / ((height / 100.0) * (height / 100.0));
                String bmiCategory;

                if (bmi < 18.5) {
                    bmiCategory = "저체중";
                } else if (bmi < 25) {
                    bmiCategory = "정상";
                } else if (bmi < 30) {
                    bmiCategory = "과체중";
                } else {
                    bmiCategory = "비만";
                }
                out.println("<h1>당신은 " + bmiCategory + " 입니다.</h1>");
                out.println("<p>BMI수치 : " + String.format("%.2f", bmi) + "</p>");

            } catch (NumberFormatException e) {
                out.println("<p>잘못된 입력입니다. 다시 시도해주세요.</p>");
            }
        } else {
            out.println("<p>키와 몸무게를 입력해주세요.</p>");
        }
    %>
</body>
</html>