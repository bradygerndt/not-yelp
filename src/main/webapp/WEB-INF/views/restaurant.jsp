<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
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
		<div class="col-md-8 col-md-offset-2">
			<div class="panel panel-default">
				<div class="panel-heading">
					<h1 class="text-center">${restaurant.getRname()}</h1>
				</div>
				<div class="panel-body">asdfasdfasdfasd</div>
			</div>
		</div>
</body>
</html>