package com.marondal.servlet.database.ex;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.marondal.servlet.common.MysqlService;

@WebServlet("/db/ex/ex02")
public class Ex02Controller extends HttpServlet {
    
    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
       
        response.setContentType("text/plain; charset=UTF-8");
        
        PrintWriter out = response.getWriter();
        
        MysqlService mysqlService = MysqlService.getInstance();
        
        // 접속
        mysqlService.connect();
        
        ResultSet resultSet = mysqlService.select("SELECT * FROM used_goods");
        
        try {
            while(resultSet.next()) {
                String title = resultSet.getString("title");
                int price = resultSet.getInt("price");
                
                out.println("제목: " + title + " 가격: " + price);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } 
        
        String query = "INSERT INTO `used_goods`\n"
        		+ "(`sellerId`, `title`, `price`, `description`)\n"
        		+ "VALUES\n"
        		+ "(3, '고양이 간식 팝니다', 2000, '안먹어서 팔아요');\n"
        
        int count = mysqlService.update(query);
        
        out.println("삽입 결과 : " + count);
    }
}
