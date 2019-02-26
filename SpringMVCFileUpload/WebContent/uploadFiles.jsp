<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jstl/core_rt" prefix="c"%>    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<center>
<h2>${MSG}</h2>
<form action="selectFiles.lavi" method="post" enctype="multipart/form-data">
Select File1: <input type="file" name="file"/><br>
Select File2: <input type="file" name="file"/><br>
Select File3: <input type="file" name="file"/><br>
Select File4: <input type="file" name="file"/><br>
<input type="submit" value="Upload">
</form>
</center>

</body>
</html>