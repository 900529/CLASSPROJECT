<%--
  Created by IntelliJ IDEA.
  User: gram
  Date: 2022-11-23
  Time: 오전 10:12
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

  <h1>로그인</h1>

  <form method="post">

      <table>
          <tr>
              <td>아이디</td>
             <td><input type = "text" name="uid"></td>
          </tr>
          <tr>
              <td>패스워드</td>
              <td><input type = "password" name="pw"></td>
          </tr>
          <tr>
              <td></td>
              <td><input type = "submit" value="로그인"></td>
          </tr>

      </table>

  </form>

</body>
</html>
