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
		<h1 class="page-title">Restaurants</h1>
	</div>
	<div class="container">
		<div class="row">
			<div class="col-md-8 col-md-offset-2">
				<ul class="list-group">
					<c:forEach items="${restaurants}" var="restaurant">
						<li class="list-group-item list-group-item-borderless">
							<div class="container list-container">
								<div class="row">
									<div class="col-md-4">
										<a href="./restaurant/${restaurant.getRestid()}"><h4>${restaurant.getRname()}</h4></a>
										<div>
										<div>${restaurant.getDiningtype()}</div>
											<c:choose>
												<c:when test="${restaurant.getHours() != Null}">
													<c:out value="${restaurant.getHours()}" />
												</c:when>
												<c:otherwise>
													<span>No hours listed</span>
												</c:otherwise>
											</c:choose>
										</div>
									</div>
									<div class="col-md-4 col-md-offset-4">
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
										<div>
											<a href="tel:${restaurant.getPhone()}">${restaurant.getPhone()}</a>
										</div>
										<div>
											<a href="mailto:${restaurant.getEmail()}">${restaurant.getEmail()}</a>
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