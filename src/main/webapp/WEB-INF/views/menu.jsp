<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
         pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page session="false"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
    <jsp:include page="./partials/header.jsp"></jsp:include>
    <title>Menu</title>
</head>
<body>

<!-- Navbar -->
<jsp:include page="./partials/navbar.jsp"></jsp:include>

<div class="content-wrapper">
    <div class="page-start">
        <h1 class="page-title">Menu</h1>
    </div>
    <div class="container">
        <div class="row">
            <div class="col-md-8 col-md-offset-2">
                <form:form method="POST" action="/doOrder" modelAttribute="foodform">
                <ul class="list-group">
                    <!--    Do c when here for no menu items-->
                    <c:forEach items="${foodform.orders}" var="order" varStatus="s">
                        <li class="list-group-item list-group-item-borderless">
                            <div class="container list-container">
                                <div class="row">
                                    <div class="col-md-4">
                                        <h4><c:out value="${order.getFoodName()}"/></h4>
                                    </div>
                                    <%--<form:hidden path="${menu[${s.index}].FoodName}"/>--%>
                                        <div class="col-md-4 col-md-offset-4">
                                            <div class="row">
                                                <p class="pull-right">$${order.getPrice()}</p>
                                            </div>
                                            <div class="row col-md-4 col-md-offset-10">
                                                <form:hidden path="orders[${s.index}].FoodName"/>
                                                <input type="number" class="form-control" name="Qty${s.index}"/>
                                            </div>
                                        </div>
                                </div>
                            </div>
                        </li>
                    </c:forEach>
                </ul>
                    <div class="pull-right">

                    <small>How would you like to get your food?</small>
                    <div class="radio">
                        <label><input type="radio" name="pickup">Pickup</label>
                    </div>
                    <div class="radio">
                        <label><input type="radio" name="deliver">Delivery</label>
                    </div>

                    <button type="submit" class="btn btn-primary">Submit</button>
                    </div>
                </form:form>
            </div>
        </div>
    </div>
</div>
</body>
</html>
