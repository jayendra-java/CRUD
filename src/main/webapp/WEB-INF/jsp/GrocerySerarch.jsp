<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<script type="text/javascript">
function validateForm()
{
	
	var customerid=document.getElementById("customerid").value;
	var customerid1=customerid.length;
	var customername=document.getElementById("customername").value;
	var customername1=customername.length;
	var phonenumber=document.getElementById("productname").value;
	var phonenumber1=phonenumber.length;
	if(customerid1==0||customername1==0||phonenumber1==0)
	{
		alert("eneter all fields");
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
<form method="get" action="search">   
<h2>Grocery Search</h2>
<table style="width:400px">
<tr>
<td>Customer ID</td><td>Customer Name</td><td>Product Nmae</td>
</tr>
<tr><td>
<input type="text" id="customerid" name="customerid" value=""></td>
<td>
<input type="text" id="customername"name="customername" value=""></td>
<td>
<input type="text" id="productname"name="productname" value=""></td>
</tr>
<tr> <td></td><td></td>
<td style="text-align:right">
<input type="submit" value="submit" onclick="return validateForm()" ><input type="button" value="reset"></td>
</tr>
</table>
</form>
</body>
</html>