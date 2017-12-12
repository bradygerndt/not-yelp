<%--
  Created by IntelliJ IDEA.
  User: brady
  Date: 12/2/2017
  Time: 4:27 PM
  To change this template use File | Settings | File Templates.
--%>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Review</title>
    <jsp:include page="partials/header.jsp"></jsp:include>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
</head>
<body>

<div class="container">
    <div class="col-md-6 col-md-offset-3">
        <div>${notification}</div>
        <div class="panel panel-default">
            <div class="panel-heading">
                Review for ${restaurant.getRname()}
            </div>
            <div class=panel-body">
                <div class="panel-body">
                    <form:form method="POST" action="/doReview" modelAttribute="review">
                        <form:hidden path="restid"/>
                        <label for="reviewtitle">Review Title</label>
                        <form:input path="reviewtitle" class="form-control"/>
                        <label for="rating">Review Title</label>
                    <form:select path="rating" class="form-control">
                        <form:option value="NONE" label="--- Select ---"/>
                        <form:option value="1" label="1"/>
                        <form:option value="2" label="2"/>
                        <form:option value="3" label="3"/>
                        <form:option value="4" label="4"/>
                        <form:option value="5" label="5"/>
                    </form:select>
                        <label for="reviewdesc">Comments</label>
                    <form:textarea path="reviewdesc" class="form-control"/>
                        <button type="submit" class="btn btn-primary">Submit</button>
                    </form:form>
                </div>
            </div>
        </div>
    </div>
</div>


</body>
</html>
