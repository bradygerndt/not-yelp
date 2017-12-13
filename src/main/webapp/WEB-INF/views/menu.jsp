<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
         pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
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
                <ul class="list-group">
                    <c:forEach items="${orderList}" var="order">
                        <li class="list-group-item list-group-item-borderless">
                            <div class="container list-container">
                                <div class="row">
                                    <div class="col-md-4">
                                        <a href="./menu/${order.getRestId()}"><h4>${order.getRestId()}</h4></a>
                                        <div>
                                            <c:choose>
                                                <c:when test="${order.getRestId() != Null}">
                                                    <c:out value="${order.getFoodName()},${order.getFoodName()} " />
                                                </c:when>
                                                <c:otherwise>
                                                    <span>No Menu Items listed</span>
                                                </c:otherwise>
                                            </c:choose>
                                        </div>
                                    </div>
                                </div>
                            </div>
                        </li>
                    </c:forEach>
                </ul>
            </div>
        </div>
    </div>
</div>
</body>
</html>
