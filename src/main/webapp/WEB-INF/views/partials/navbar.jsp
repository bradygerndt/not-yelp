<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<div class="page-header">
	<div class="container navheader">
		<nav class="navbar navbar-default navbar-fixed-top">
			<div class="container-fluid">
			<div class="navbar-header">
			   <button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#nav">
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>                        
      </button>
      <a class="navbar-brand">Not Yelp</a>
      </div>
      <div class="collapse navbar-collapse" id="nav">
				<ul class="nav navbar-nav">
					<li><a href="#">Home</a></li>
					<li><a href="/restaurants">View Restaurants</a></li>
				</ul>
				<ul class="nav navbar-nav navbar-right">
					<form class="navbar-form navbar-left" role="search">
						<div class="form-group">
							<input type="text" class="form-control search-bar"
								placeholder="Search for restaurants...">
						</div>
						<button type="submit" class="btn btn-default">Go</button>
					</form>
					<li class="dropdown"><a href="#" class="dropdown-toggle"
						data-toggle="dropdown" role="button" aria-haspopup="true"
						aria-expanded="false">${customer.getFname()}<span class="caret"></span></a>
						<ul class="dropdown-menu navbar-right">
							<li><a href="/logout">Log Out</a></li>
						</ul>
					</li>
				</ul>
				</div>
			</div>
		</nav>
	</div>
</div>