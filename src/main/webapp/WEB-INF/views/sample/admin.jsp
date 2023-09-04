<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    <%@ taglib uri="http://www.springframework.org/security/tags" prefix="sec" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2>admin페이지 입니다.</h2>
	<p>principal : <sec:authentication property="principal" /></p>
	<p>MemberVO : <sec:authentication property="principal.member" /></p>
	<p>사용자 이름 : <sec:authentication property="principal.member.userName" /></p>
	<p>사용자 권한 : <sec:authentication property="principal.member.authList" /></p>
	
	<a href="/customLogout">로그아웃</a>
</body>
</html>