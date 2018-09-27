<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<c:forEach items="${list}" var = "d">
	부서번호 ${d.deptno}, 부서이름${d.deptname}, 부서지역${d.deptloc}<br>
</c:forEach>

</body>
</html>