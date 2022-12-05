<%--
  Created by IntelliJ IDEA.
  User: gram
  Date: 2022-12-01
  Time: 오전 9:46
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
    <title>Title</title>
</head>
<body>

 <h1>회원 로그인</h1>

<form method="post">

  <table>
    <tr>
      <td>ID</td>
      <td><input type="text" placeholder="아이디를 입력하시오" name="uid"></td>
    </tr>
    <tr>
      <td>PW</td>
      <td><input type="password" placeholder="비밀번호를 입력하시오" name="pw"></td>
    </tr>
    <tr>
      <td></td>
      <td><input type="submit" value="로그인"></td>
    </tr>

  </table>

</form>
</body>
</html>
