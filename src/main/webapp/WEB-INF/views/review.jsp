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
            <div class=panel-body">
                <div class="panel-body">
                    <form:form method="POST" action="doReview" modelAttribute="review">
                        <form:input path="reviewtitle" class="form-control"/>
                        <button type="submit" class="btn btn-primary">Submit</button>
                    </form:form>
                </div>
            </div>
        </div>
    </div>
</div>


</body>
</html>
