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
<h4>
<c:out value="${quote }" />
</h4>
<ul>
<c:forEach items="${roomList}" var ="room" >

<li><c:out value="${room }"/></li>
</c:forEach>
</ul>
</body>
</html>