<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
    <%@page isELIgnored="false"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "https://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Locations</title>
</head>
<%@ page import="java.util.Date" %>
<body>
<h3>Hi John</h3><br>
<strong>Current Time is</strong>: <%=new Date() %>

<table>
<tr>
<th>id</th>
<th>code</th>
<th>name</th>
<th>type</th>
<th>phone</th>
<th>email</th>
<th>address</th>

</tr>
<c:forEach items="${vendors}" var="vendor">
<tr>
<td>${vendor.id}</td>
<td>${vendor.code}</td>
<td>${vendor.name}</td>
<td>${vendor.type}</td>
<td>${vendor.phone}</td>
<td>${vendor.email}</td>
<td>${vendor.address}</td>

<td><a href="deleteVendor?id=${vendor.id}">Delete Vendor</a>
<td><a href="showUpdate?id=${vendor.id}">Edit Vendor</a>
</tr>
</c:forEach>
</table>

<a href="showCreate">Add Vendor</a>
</body>
</html>