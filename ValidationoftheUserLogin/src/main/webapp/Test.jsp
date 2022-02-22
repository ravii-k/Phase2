<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>



<%! String s= "hello";%> <!-- // declaration -->
<%! public void sayHello(){
	System.out.println(s);}
	%>

<%=s%>	
	
<% 
//String s = "Hi"

sayHello();
%>

</body>
</html>