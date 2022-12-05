<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
  <title>Title</title>
  <style>
  </style>
</head>
<body>

<h1>등록 내용 확인</h1>

<table>
  <tr>
    <td>순서</td>
    <td><input type="text" name="tno" value="${todo.tno}" readonly></td>
  </tr>
  <tr>
    <td>행사 참여 메뉴</td>
    <td><input type="text" name="todo" value="${todo.todo}" readonly> </td>
  </tr>
  <tr>
    <td>행사 참여 시작일</td>
    <td><input type="date" name="dueDate" value="${todo.dueDate}" readonly> </td>
  </tr>
  <tr>
    <td>상태</td>
    <td><input type="checkbox" name="finished" ${todo.finished ? 'checked' : ''} > </td>
  </tr>
</table>

<a href="/todo/modify?tno=${param.tno}">수정/삭제</a> <a href="/todo/list">행사 메뉴 등록</a>

</body>
</html>