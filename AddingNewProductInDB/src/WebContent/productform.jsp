<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert Product</title>
</head>
<body>
<div align="center">
		<h2>Insert Product</h2>
		<form action="productValidation" method="post">
		Product ID: <input type="text" name="productId"><br/>
		Product Name: <input type="text" name="productName"><br/>
			<input type="submit" value="Submit">
		<span class="error">${errors.notInt}</span>
		<span class="error">${errors.dupeProductId}</span>
		<span class="error">${errors.nullProdName}</span>
		<span class="success">${dbMessages.success}</span>
		</form>
	</div>
</body>
</html>