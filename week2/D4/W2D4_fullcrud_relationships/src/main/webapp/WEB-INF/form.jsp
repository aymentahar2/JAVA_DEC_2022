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
    <title>Create</title>
    <link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css">
    <link rel="stylesheet" href="/css/main.css"> <!-- change to match your file/naming structure -->
    <script src="/webjars/jquery/jquery.min.js"></script>
    <script src="/webjars/bootstrap/js/bootstrap.min.js"></script>
</head>
<body>
<div class="container">
<h1>Create 📖</h1>
<hr />
   <form:form action="/createBook" method="post" modelAttribute="book">
   <div>
         <form:errors path="*" style="color:red"/>     
   </div>
    <p>
        <form:label path="title">Title</form:label>
        <form:input path="title"/>
    </p>
    <p>
        <form:label path="author">Author</form:label>
        <form:textarea path="author"/>
    </p>

    <p>
        <form:label path="pages">Pages</form:label>
        <form:input type="number" path="pages"/>
    </p>    
    
    <p>
			<form:select path="library">
				<c:forEach items="${allLibs }" var="l" >
				<form:option value="${l.id }">
					${l.name }
					</form:option>
				</c:forEach>
			</form:select>
		</p>
    <input type="submit" value="Create" class="btn btn-success"/>
</form:form>    
</div>
</body>
</html>