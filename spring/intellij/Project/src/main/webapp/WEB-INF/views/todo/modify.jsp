<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
    <title>Title</title>
    <style>
    </style>
</head>
<body>

<h1>등록 내용 수정</h1>
<form method="post">
    <input type="hidden" name="writer" value="${loginInfo.idx}">
    <table>
        <tr>
            <td>순서</td>
            <td><input type="text" name="tno" value="${param.tno}" readonly></td>
        </tr>
        <tr>
            <td>행사 참여 메뉴 </td>
            <td><input type="text" name="todo" value="${todo.todo}" > </td>
        </tr>
        <tr>
            <td>행사 참여 시작일</td>
            <td><input type="date" name="dueDate" value="${todo.dueDate}" > </td>
        </tr>
        <tr>
            <td>완료 </td>
            <td><input type="checkbox" name="finished" value="1" ${todo.finished ? 'checked' : ''} > </td>
        </tr>
        <tr>
            <td></td>
            <td>
                <input type="reset">
                <input type="submit" value="수정">
            </td>
        </tr>
    </table>
</form>

<form action="/todo/remove" method="post">
    <input type="hidden" name="tno" value="${param.tno}">
    <input type="submit" value="삭제">
</form>

<a href="/todo/list">행사 메뉴 등록</a>

</body>
</html>