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
<h1>Hello from index view !</h1>
<hr />
<p>Email: <c:out value="${email }"></c:out></p>
<p>Message: <c:out value="${message }"></c:out></p>

</body>
</html>