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
    <title>Book</title>
    <link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css">
    <link rel="stylesheet" href="/css/main.css"> <!-- change to match your file/naming structure -->
    <script src="/webjars/jquery/jquery.min.js"></script>
    <script src="/webjars/bootstrap/js/bootstrap.min.js"></script>
</head>
<body>
<div class="container">
   <h1>Book Store 📚</h1>
   <hr />
   <a href="/create" class="btn btn-primary">Create</a><br />
   
   <table class="table">
   	<thead>
   	<th>ID</th>
   	<th>Title</th>
   	<th>Author</th>
   	<th>Pages</th>
   	<th>Library</th>
   	<th>Actions</th>
   	</thead>
   	<tbody>
   	<c:forEach items="${allMybooks }" var="book">
   	<tr>
   	<td>${book.id }</td>
   	<td>${book.title }</td>
   	<td>${book.author }</td>
   	<td>${book.pages }</td>
   	<td><a href="/library/${book.library.id }">${book.library.name }</a></td>
   	<td>
   	<a href="/edit/${book.id}" class ="btn btn-secondary">Edit</a>
   	<form action="/books/${book.id}" method="post">
    <input type="hidden" name="_method" value="delete">
    <input type="submit" value="Delete" class="btn btn-danger">
    </form>
   	</td>
   	

   	</tr>
   	</c:forEach>
   	</tbody>
   </table>
   </div>
</body>
</html>