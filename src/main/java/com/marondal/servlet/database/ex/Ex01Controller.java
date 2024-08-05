package com.marondal.servlet.database.ex;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/db/ex/ex01")
public class Ex01Controller extends HttpServlet {

    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {

        response.setContentType("text/plain");
        request.setCharacterEncoding("utf-8");
		response.setCharacterEncoding("utf-8");

        PrintWriter out = response.getWriter();

        // 데이터 베이스 접속
        try {
            DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());

            // 접속주소, 포트, id, password
            String url = "jdbc:mysql://127.0.0.1:3306/dulumary_240708";
            String id = "root";
            String password = "root";

            Connection connection = DriverManager.getConnection(url, id, password);
            Statement statement = connection.createStatement();


            String query = "SELECT * FROM used_goods;";

            ResultSet resultSet = statement.executeQuery(query);

            while (resultSet.next()) {  
                String title = resultSet.getString("title");
                int price = resultSet.getInt("price");
                String description = resultSet.getString("description");
                out.print("제목 : " + title + ", 가격 : " + price + ", 설명 : " + description + "\n");
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
