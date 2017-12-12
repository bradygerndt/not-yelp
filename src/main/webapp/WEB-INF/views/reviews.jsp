<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
         pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page session="false"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
    <jsp:include page="./partials/header.jsp"></jsp:include>
    <title>Restaurants</title>
</head>
<body>

<!-- Navbar -->
<jsp:include page="./partials/navbar.jsp"></jsp:include>

<div class="content-wrapper">
    <div class="page-start">
        <h1 class="page-title">Reviews for ${restaurant.getRname()}</h1>
        <c:if test="${notification == success}">
            <p class="text-center"> Your review has been submitted!</p>
        </c:if>
    </div>
    <div class="container">
        <div class="row">
            <div class="col-md-8 col-md-offset-2">
                <ul class="list-group">
                    <c:forEach items="${reviews}" var="review">
                        <li class="list-group-item list-group-item-borderless">
                            <div class="container list-container">
                                <div class="row">
                                    <div class="row">
                                        <h3>"${review.getReviewtitle()}"</h3>
                                        <h4>${review.getRating()}/5</h4>
                                        <span class="pull-right">${review.getReviewdate()}</span>
                                        <span>${review.getCustemail()}</span>
                                    </div>
                                    <div>
                                        <p>${review.getReviewdesc()}</p>
                                    </div>
                                </div>
                            </div>
                        </li>
                    </c:forEach>
                </ul>
            </div>
            <div class="col-md-2">
                <a>Submit a review for ${restaurant.getRname()}</a>
            </div>
        </div>
    </div>
</div>
</body>
</html>