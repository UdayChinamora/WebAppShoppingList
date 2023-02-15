<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
 <!-- Required meta tags -->
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

    <!-- Bootstrap CSS -->
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" >

<title>Edit An Item</title>
</head>
<body>
<div class="container">
<h2>Edit This Item </h2>
<small class="text-muted">Make changes to the store or item</small>
<br />
<form action = "editItemServlet" method="post">
<div class="form-group">
<label for="store">Store:</label><input type ="text" name = "store" value= "${itemToEdit.store}"><br />

</div>
<div class="form-group">
<label for="item">Item:</label>
<input type = "text" name = "item"  value= "${itemToEdit.item}"><br />
</div>
<input type = "hidden" name = "id" value="${itemToEdit.id}">
<input type = "submit" value="Save Edited Item" class="btn btn-primary">
</form>

<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" ></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js" ></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js" ></script>
</div>

</body>
</html>