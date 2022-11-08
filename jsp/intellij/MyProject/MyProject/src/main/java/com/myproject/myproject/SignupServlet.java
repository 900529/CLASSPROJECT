package com.myproject.myproject;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "SignupServlet", value = "/SignupServlet")
public class SignupServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    String userid = request.getParameter("userid");
    String pw = request.getParameter("pw");

    String username = request.getParameter("username");

        response.setContentType("test/html");

    PrintWriter out = response.getWriter();

        out.write("<html>");
        out.write("<head><meta charset =\"utf-8|"><title>로그인 데이터</title></head>");
        out.write("<body>");
        out.write("<h1> userid : " + userId + "</h1>");
        out.write("<h1> pw : " + pw + "</h1>");
        out.write("<h1> username : " + userName + "</h1>");
        out.wrtie("<h1> memo :" + memo + "</h1>");
        out.write("<h1> 성별 " + gender + "</h1>");
        out.write("</body>");
        out.write("</html>");

        system.out.println(langs);


    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
