<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
    <title>Title</title>

    <!-- Bootstrap core CSS -->
    <link href="/css/bootstrap/bootstrap.min.css" rel="stylesheet">

    <!-- Custom styles for this template -->
    <link href="/css/bootstrap/offcanvas.css" rel="stylesheet">

    <style>
        td {
            padding: 6px;
        }
        .loginInfo{
            border: 1px solid #333;
        }
    </style>
</head>
<body class="bg-light">
<nav class="navbar navbar-expand-lg fixed-top navbar-dark bg-dark">
    <a class="navbar-brand mr-auto mr-lg-0" href="#">행사 메뉴 등록</a>
    <button class="navbar-toggler p-0 border-0" type="button" data-toggle="offcanvas">
        <span class="navbar-toggler-icon"></span>
    </button>

    <div class="navbar-collapse offcanvas-collapse" id="navbarsExampleDefault">
        <ul class="navbar-nav mr-auto">

        </ul>
        <form class="form-inline my-2 my-lg-0">
            <input class="form-control mr-sm-2" type="text" placeholder="Search" aria-label="Search">
            <button class="btn btn-outline-success my-2 my-sm-0" type="submit">Search</button>
        </form>
    </div>
</nav>

<h1>${title}</h1>

<div class="my-3 p-3">
    <form>
        <select name="searchType">
            <option value ="dname">등록 메뉴</option>
            </select>
        <input type ="text" class="form-control col-4" name="keyword">
        <input type="submit"class="btn btn-info col-1" value="검색">

    </form>
    </div>

<table class="table table-striped">
    <tr>
        <td>순서</td>
        <td>등록 메뉴</td>
        <td>행사 시작일</td>
        <td>완료</td>
    </tr>

    <c:forEach var="todo" items="${todoList}" varStatus="stat">
        <tr>
            <td>${todo.tno} / ${stat.count}</td>
            <td><a href="/todo/read?tno=${todo.tno}">${todo.todo}</a></td>
            <td>${todo.dueDate}</td>
            <td>${todo.finished ? '완료' : '진행중'}</td>
        </tr>
    </c:forEach>

</table>


<a class="btn btn-block" href="/todo/register">메뉴 추가등록</a>


</body>
</html>