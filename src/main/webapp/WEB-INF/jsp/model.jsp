<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>  

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<form:form action="model" modelAttribute="user">
Firstname:<form:input path="username"/><br>
lastname:<form:input path="password"/>
<br>
        <input type="submit" value="Submit" />      



</form:form>

</body>
</html>