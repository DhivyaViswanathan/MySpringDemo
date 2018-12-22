<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
response.setHeader("Cache-Control", "no-cache, no-store, must-revalidate");//1.1
response.setHeader("Pragma", "no-cache");//1.0
response.setHeader("Expires", "0");//Proxy
if(session.getAttribute("username")==null){
	response.sendRedirect("login.jsp");
}
%>
 ${username}
 <a href="videos.jsp">videos here</a>
 
 <form action="logout">
 <input type="submit" value="logout">
 </form>
</body>
</html>