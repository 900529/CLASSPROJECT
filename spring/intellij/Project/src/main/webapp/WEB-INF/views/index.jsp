<%--
  Created by IntelliJ IDEA.
  User: gram
  Date: 2022-11-30
  Time: 오후 12:10
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
    <style>
        img {height : 70px;}
    </style>
</head>
<body>

<h1>Food Truck Festival</h1>

 <ul>
     <li>참여업체 등록</li>
     <li>행사 메뉴, 시작일을 등록해주세요.</li>

     <div class="card" style="width: 18rem;">
         <ul class="list-group list-group-flush">

     <li>  <a href="/todo/list" class="list-group-item" > 행사 메뉴 확인 </a></li>

     <c:if test="${loginInfo eq null}">
         <li><a href="/login" class="list-group-item">로그인</a></li>
         <li><a href="/member/register" class="list-group-item">업체 신규 가입</a></li>
     </c:if>
     
     <c:if test="${loginInfo ne null}">
         <li>${loginInfo.uid}  (${loginInfo.uname}} <img src="/uploadfile/member/${loginInfo.uphoto}"></li>
         <li><a href="/logout">로그아웃</a></li>
     </c:if>

 </ul>
</div>
<%@ include file="/WEB-INF/views/frame/jsresource.jsp"%>
</body>
</html>
