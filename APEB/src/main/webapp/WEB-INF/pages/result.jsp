<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

 
<body style="background-color:green" >
<br><br><br>
<h1 style="color:red; text-align:center">Result Page</h2>

<form style="center"; action="add.htm"   method="post">
<center>
<table>
<tr>
<th>ServiceNo</th>
<td>${dtokey.serviceNo }</td>
</tr><br>

<tr>
<th>CusName</th>
<td>${dtokey.customerName }</td>
</tr>
<br>
<tr>
<th>Address</th>
<td>${dtokey.address}</td>
</tr>
<br>

<tr>
<th>Mobile</th>
<td>${dtokey.mobile }</td>
</tr>
<br>

<tr>
<th>Units</th>
<td>${dtokey.units}</td>
</tr>
<br>

<tr>
<th>Gmail</th>
<td>${dtokey.email }</td>
</tr>
<br>

<tr>

<th>Amount</th>
<td>${dtokey.billAmount }</td>
</tr>

</table>
</center>
</form>
</body>

 
 <a  href="home.htm">home</a>
 