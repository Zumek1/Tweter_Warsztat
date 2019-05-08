<%--
  Created by IntelliJ IDEA.
  User: zumek1
  Date: 08.05.19
  Time: 22:01
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<html>
<head>
    <title>Tweeter</title>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.0/jquery.min.js"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"></script>


</head>
<body>
<div class="jumbotron text-center">
    <h1>Welcome in My Tweeter :)</h1>
    <p>Zaloguj się lub zarejestruj i zaczynamy zabawę:)</p>
</div>

<div class="container">
    <h2>Zaloguj się/ Zarejestruj się</h2>


    <form:form method="post" modelAttribute="user">
        <div class="form-group">
            <label for="email">Email:</label>
            <form:input path="email" type="email" class="form-control" id="email" placeholder="Enter email" name="email"/>
        </div>
        <div class="form-group">
            <label for="pwd">Password:</label>
            <form:input path="password" type="password" class="form-control" id="pwd" placeholder="Enter password" name="pswd"/>
        </div>
        <div class="form-group">
            <label>Imię:</label>
            <form:input path="firstName"  class="form-control" placeholder="Enter firstName" />
        </div>
        <div class="form-group">
            <label>Imię:</label>
            <form:input path="lastName"  class="form-control" placeholder="Enter lastName" />
        </div>
        <div class="form-group form-check">
            <label class="form-check-label">
                <input class="form-check-input" type="checkbox" name="remember"> Remember me
            </label>
        </div>
        <button type="submit" class="btn btn-primary">Submit</button>
    </form:form>
</div>

</body>
</html>
