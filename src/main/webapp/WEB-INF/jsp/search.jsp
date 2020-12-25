<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
 
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<table style="width:400px">
<tr>
<td>Customer ID</td><td>Customer Name</td><td>Product Nmae</td>
</tr>

<tr><td>
<input type="text" name="customerid" value=${customer.customerid }></td>
<td>
<input type="text" name="customername" value=${customer.name }></td>
<td>
<input type="text" name="productname" value=${customer.name }></td>
</tr>

</table>
<table>
<tr>
<td>Product</td>
<td>Quantity</td>
<td>Price</td>
<td>Action</td>
</tr>
<tr>
<td><input type="text" value=${product.name}></td>
<td><input type="text" value=${product.quantity}>
<td><input type="text" value=${product.price}>
<td><a href="<c:url value='/edit/${product.id}' />" >Edit</a>&nbsp;<a href="delete/${product.id}">delete</a></td>

</tr>
</table>
</body>  
</html>