<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Display Product</title>
</head>
<body>


<h1>Displaying the Product Details....</h1>
<hr>
<%= "Product Id : " + session.getAttribute("pid") %> <br> <br>

<%= "Product Name : " + session.getAttribute("pname") %>  <br> <br>

<%= "Product Price : " + session.getAttribute("pprice") %>

</body>
</html>