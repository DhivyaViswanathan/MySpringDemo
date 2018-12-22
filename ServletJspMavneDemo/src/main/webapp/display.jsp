<%@page import="com.learning.sample.model.StudenModel"%>
<%@page import="java.util.*" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
ArrayList<StudenModel> cont =  (ArrayList<StudenModel>)request.getAttribute("studentInfo");
Iterator it=cont.iterator();
while(it.hasNext()){
	out.println(it.next());
	out.println("\n");
}
//  Iterator<StudenModel> itr = cont.iterator();
//  while (itr.hasNext()) {
//  String element = itr.next();
%>

</body>
</html>