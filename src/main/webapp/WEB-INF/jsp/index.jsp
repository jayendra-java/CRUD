<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%> 
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
  
<html>
<head>
<script type="text/javascript" src="https://ajax.googleapis.com/ajax/libs/jquery/1.5.0/jquery.min.js"></script>

<script type="text/javascript">
function myFunction1() {
	var table = document.getElementById("bvc");
	var rowCount = table.rows.length;
	var row = table.insertRow(rowCount);
	var cell1 = row.insertCell(0);
	var element1 = document.createElement("input");
	element1.type = "text";
	element1.name="name";
	cell1.appendChild(element1);

	var cell2 = row.insertCell(1);
	var element3 = document.createElement("input");
	element3.type = "text";
	element3.name="quantity";
	cell2.appendChild(element3);

	var cell3 = row.insertCell(2);
	var element2 = document.createElement("input");
	element2.type = "text";
	element2.name = "price";
	cell3.appendChild(element2);
}
</script>

<script type="text/javascript">
function myFunction() {
	 alert("hello");
	     var add="<tr>";
	        add+="<td><input type='text'></td>";
	        add+="<td><input type='text'></td>";
	        add+="<td><input type='text'></td>";
	        add+="</tr>";
           var txtNewInputBox = document.getElementById('bvc');

   // Then add the content (a new input box) of the element.
	txtNewInputBox.innerHTML = add;
	        document.getElementById("asd").append(add);

	     }

</script>
<script type="text/javascript">
function validateForm()
{
	
	var name=document.getElementById("name").value;
	var name1=name.length;
    var quantity=document.getElementById("quantity").value;
	var quantity1=quantity.length;
    var price=document.getElementById("price").value;
	var price1=price.length;
	var customerid=document.getElementById("customerid").value;
	var customerid1=customerid.length;
	var customername=document.getElementById("customername").value;
	var customername1=customername.length;
	var phonenumber=document.getElementById("phonenumber").value;
	var phonenumber1=phonenumber.length;

	if(quantity1==0||name1==0||price1==0||customerid1==0||customername1==0||phonenumber1==0)
		{
		alert("Enter all field");
		return false;
		}
	else
		{
		return true;
		}
	
	}
</script>
</head>
<body>
<form method="get" action="save" >   
<h2>Grocery Billing</h2>
<table>
<tr>
<td>Customer ID</td><td>Customer Name</td><td>Phone Number</td><td>Billing Date</td>
</tr>
<tr><td>
<input type="text" id="customerid"name="customerid" value=""></td>
<td>
<input type="text" id="customername"name="customername" value=""></td>
<td>
<input type="text" id="phonenumber"name="phonenumber" value=""></td>
<td>
<input type="date" name="billingdate"></td>
</tr>
</table>
<br>
<table class="innerTable" id="bcv" width="100%">
			<tr>
				<td>
					<fieldset >
						<legend>Products</legend>
						<table width="100%" id="bvc">
						<div id="1">
                        <tr>
                            <td>Product</td>
                            <td>Quantity</td>
                            <td>Price</td>
                        </tr>
                        </div>
                        <div id="2">
                        
                        <tr>
                            <td><input id="name" name="name" ></td>
                            <td><input id="quantity" name="quantity"></td>
                            <td><input id="price"name="price"></td>
                        </tr>
                        
                        </div>
                        <div id="asd"></div>
                        						
                        </table>
					</fieldset>
			</td>
			</tr>
			<tfoot>
			<tr>
			<td style="text-align:right"><input type="button"value="Add New Row" id="newrows" onclick="myFunction1()"  >
			</tr>
			<tr>
			<td style="text-align:right"><input type="submit" value="submit" onclick="return validateForm()" >
			</td></tr>
			</tfoot>
			</table>
			<a href="/GroceryBilling/src/main/webapp/WEB-INF/jsp/welcome.jsp">click here for practise</a>
  </form>  
</body>
</html>
