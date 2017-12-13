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
    <title>Registration</title>
    <jsp:include page="partials/header.jsp"></jsp:include>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
</head>
<body>

<div class="container">
    <div class="row">
        <div class="page-header">
            <h1>Register for Not-Yelp</h1>
            <p>Sign up and keep track of the food you care about!</p>
        </div>
    </div>
    <div class="col-md-6 col-md-offset-3">
        <div>${notification}</div>
        <div class="panel panel-default">
            <div class=panel-body">
                <div class="panel-body">
                    <form:form method="POST" action="doRegister" modelAttribute="customer">
                        <div class="form-group">
                            <label for="email">Email address</label>
                            <form:input path="email" type="email" class="form-control" placeholder="Enter email"/>
                        </div>
                        <div class="form-group">
                            <label>Password</label>
                            <form:input path="password" type="password" class="form-control" placeholder="Password"/>
                        </div>
                        <div class="form-group">
                            <label>First Name</label>
                            <form:input path="fname" class="form-control" placeholder="First name"/>
                            <label>Middle Initial</label>
                            <form:input path="minit" class="form-control" placeholder="Middle Initial"/>
                            <label>Last Name</label>
                            <form:input path="lname" class="form-control" placeholder="Last Name"/>
                        </div>
                        <div class="form-group">
                            <label>Address</label>
                            <form:input path="streetno" type="number" class="form-control"/>
                            <form:input path="streetname" class="form-control" placeholder="Street Name"/>
                            <form:input path="city" class="form-control" placeholder="City"/>
                            <form:input path="state" class="form-control" placeholder="State"/>
                            <form:input path="zip" class="form-control" placeholder="Zip Code"/>
                        </div>
                        <div class="form-group">
                            <label>Phone</label>
                            <form:input path="phone" class="form-control" placeholder="Phone Number"/>
                        </div>
                        <button type="submit" class="btn btn-primary">Submit</button>
                    </form:form>
                </div>
            </div>
        </div>
    </div>
</div>


</body>
</html>
