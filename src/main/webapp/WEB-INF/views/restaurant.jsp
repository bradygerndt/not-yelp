<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<jsp:include page="./partials/header.jsp"></jsp:include>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>${restaurant.getRname()}</title>
</head>
<body>
	<!-- Navbar -->
	<jsp:include page="./partials/navbar.jsp"></jsp:include>
	<div class="container">
		<div class="col-md-8">
			<div class="panel panel-default">
				<div class="panel-heading">
					<h1 class="text-center">${restaurant.getRname()}</h1>
				</div>
				<div class="panel-body">$${restaurant.getPricerange()} &middot; ${restaurant.getDiningtype()} </div>
				<p>${restaurant.getPhone()}</p>
				<p>${restaurant.getEmail()}</p>
				<p>${restaurant.getHours()}</p>
				<c:choose>
					<c:when test="${restaurant.getCity() != Null}">
						<div>${restaurant.getStreetno()}
								${restaurant.getStreetname()},</div>
						<div>${restaurant.getCity()},${restaurant.getState()}</div>
					</c:when>
					<c:otherwise>
						<div>No address listed.</div>
					</c:otherwise>
				</c:choose>
				<p>Delivery: </p>
				<p>${restaurant.getDeliveryflag()}</p>
				<p>Outdoor seating: </p>
                <p>${restaurant.getOutdoorseating()}</p>
			</div>
		</div>
</body>
</html>