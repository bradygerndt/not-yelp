<%--
  Created by IntelliJ IDEA.
  User: brady
  Date: 12/2/2017
  Time: 4:27 PM
  To change this template use File | Settings | File Templates.
--%>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page session="false" %>
<html>
<head>
    <title>Login</title>
    <jsp:include page="partials/header.jsp"></jsp:include>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
</head>
<body>

<div class="container">
    <div class="row">
        <div class="page-header">
            <h1>Not-Yelp</h1>
            <p>Keep track of your local sources of food!</p>
        </div>
    </div>
    <div class="col-md-6 col-md-offset-3">
        <div>${notification}</div>
        <div class="panel panel-default">
            <div class=panel-body">
                <div class="panel-body">
                    <form:form method="POST" action="doLogin" modelAttribute="customer">
                        <div class="form-group">
                            <label for="email">Email address</label>
                            <form:input path="email" type="email" class="form-control" placeholder="Enter email"/>
                        </div>
                        <div class="form-group">
                            <label>Password</label>
                            <form:input path="password" type="password" class="form-control" placeholder="Password"/>
                        </div>
                        <button type="submit" class="btn btn-primary">Submit</button>
                        <div><small>Don't have an account? <a href="register">Register here!</a></small></div>
                    </form:form>
                </div>
            </div>
        </div>
    </div>
</div>


</body>
</html>
