<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
    <title>Title</title>
    <style>
    </style>
</head>
<body>

<h1>푸드트럭 참여내용 등록</h1>
<form method="post">
    <input type="hidden" name="writer" value="${loginInfo.idx}">
    <table>
        <tr>
            <td>행사 진행 메뉴</td>
            <td><input type="text" name="todo"> </td>
        </tr>
        <tr>
            <td>행사 참여 시작일</td>
            <td><input type="date" name="dueDate"> </td>
        </tr>
        <tr>
            <td></td>
            <td>
                <input type="reset">
                <input type="submit" value="Register">
            </td>
        </tr>
    </table>

</form>



</body>
</html>