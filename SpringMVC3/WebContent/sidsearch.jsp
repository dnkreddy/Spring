<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jstl/core_rt" prefix="c"%>    
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<center>
<h1>Lavi Login Page</h1>
<h1>${MSG}</h1>
<form:form action="search.lavi" method="post" modelAttribute="stu"> 
<table>
<tr>
<td>Student ID:</td>
<td><form:input path="sid"/></td>
<td><font color="red"> <form:errors path="sid"/></font> </td>
</tr>

<tr>
<td><input type="submit" value="Login"/></td>
</tr>
</table>

</form:form>
</center>
</body>
</html>