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
<h1>Contact us</h1>
<hr />
   <h3>Contact</h3>
    <form action='/processForm' method='POST'>
	<label>Email:</label>
    	<input type="text" name='email'> <br />
	<label>Message:</label>
    	<input type='text' name='message'> <br />
    		<label>Secret Key:</label>
    	<input type='password' name='secretKey'> <br />
    	<button>Send</button>
    </form>
</body>
</html>