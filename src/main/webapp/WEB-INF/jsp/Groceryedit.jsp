<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%> 
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
 <body>
<form:form method="post" action="editsave"> 

<table class="innerTable" id="bcv" width="100%">
			<tr>
				<td>
					<fieldset >
						<legend>Products</legend>
						<table width="100%" id="bvc">
						
                        <tr>
                            <td>Product</td>
                            <td>Quantity</td>
                            <td>Price</td>
                        </tr>
                        </div>
                        <tr>
                            <td><input name="name"type="text" value=${product.name }  /></td>
                            <td><input name="quantity"type="text" value=${product.quantity }></td>
                            <td><input name="price" type="text" value=${product.price }></td>
                            <td><input name="id" type="hidden" value=${product.id }></td>
                            <td><input name="customerid" type="hidden" value=${product.customerid }></td>
          </tr>
                        
                        </div>
                        <div id="asd"></div>
                        						
                        </table>
					</fieldset>
			</td>
			</tr>
			
			</table>
			<input type="submit" value="submit">

</form:form>  
</body>
   

</html>