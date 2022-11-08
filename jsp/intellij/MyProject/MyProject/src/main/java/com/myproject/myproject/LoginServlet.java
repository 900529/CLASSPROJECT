package com.myproject.myproject;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "LoginServlet", value = "/login")
public class LoginServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        // 사용자가 입력한 데이터를 추출한다.
        String userid = request.getParameter(name: "userid");
        String pw = request.getParameter(name:"pw");

        response.setContentType("test/html");

        printWriter out = response.getWriter();

        out.write(s:"<html>");
        out.write(s:"<head><title>로그인 데이터</title></head>");
        out.write(s:"<body>");
        out.write(s:"<h1> userid : " + userid + "</h1>");
        out.write(s:"<h1> pw : " + pw + "</h1>");
        out.write(s:"</body>");
        out.write(s:"</html>");

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
