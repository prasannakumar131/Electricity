<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<h1 style="color: red; text-align: center">Result page</h1>

<table>
	<tr>
		<th>ServiceNo</th>
		<td>${dtokey.serviceNo }</td>
	</tr>

	<tr>
		<th>CusName</th>
		<td>${dtokey.customerName }</td>
	</tr>

	<tr>
		<th>Address</th>
		<td>${dtokey.address }</td>
	</tr>
	<tr>
		<th>Mobile</th>
		<td>${dtokey.mobile }</td>
	</tr>

	<tr>
		<th>Gmail</th>
		<td>${dtokey.email }</td>
	</tr>
	
	<tr>
		<th>Units</th>
		<td>${dtokey.units }</td>
	</tr>

	<tr>
		<th>BillAmount:</th>
		<td>${dtokey.billAmount }</td>
	</tr>
	


</table>
<br>
<br>




<a href="home.htm">home</a>
