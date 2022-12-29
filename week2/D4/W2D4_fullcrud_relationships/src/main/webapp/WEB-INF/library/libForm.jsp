<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!-- c:out ; c:forEach etc. --> 
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!-- Formatting (dates) --> 
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!-- form:form -->
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!-- for rendering errors on PUT routes -->
<%@ page isErrorPage="true" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Library</title>
    <link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css">
    <link rel="stylesheet" href="/css/main.css"> <!-- change to match your file/naming structure -->
    <script src="/webjars/jquery/jquery.min.js"></script>
    <script src="/webjars/bootstrap/js/bootstrap.min.js"></script>
</head>
<body>
   <div class="container">
   <h1>Create Library</h1>
   	<hr />
   	${allLibraries }
   	<form:form action="/createLib" method = "post" modelAttribute="library">
   	<form:label path="name">Name: </form:label>
   	<form:input path= "name"/>
   	<form:errors path= "name"/><br />
   	
   	<form:label path="location">Location: </form:label>
   	<form:input path= "location"/>
   	<form:errors path= "location"/><br />
   	<br />
   	    <input type="submit" value="Create Library" class="btn btn-success"/>
   	
   	</form:form>
   </div>
</body>
</html>