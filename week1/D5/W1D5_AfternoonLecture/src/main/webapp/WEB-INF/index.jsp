<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!-- New line below to use the JSP Standard Tag Library -->
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core"%>    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Le JAVA est genial</title>
</head>
<body>
<h1>Hello from JSP !!!</h1>
<hr>
<h4>Alex Information</h4>
<ul>
<li>name: <c:out value="${x}"/></li>
<li>Age: <c:out value="${AlexAge}"/></li>
</ul>
<c:out value="${msg}"/>
</body>
</html>