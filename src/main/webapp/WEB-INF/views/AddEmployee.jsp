<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<!DOCTYPE html>
<html lang="en">

<head>
<meta charset="ISO-8859-1">
<%@include file="./base.jsp"%>
<title>Add new Employee</title>
<style>
  .error
  {color:red}
</style>
</head>
<body>
	<div class="container mt-3">
<div style = "position:relative;  background-color:yellow;">
               <a href="${pageContext.request.contextPath}/">
               <button type="submit" class="btn btn-primary" style="float:right;">Home</button></a>
         </div>
		<h1>Add Employee Form</h1>
		<form:form action="/SpringMvcCrud/insertEmployee" modelAttribute="insertEmployee" method="post">
			<div class="row">
				<div class="col">
					<div class="form-group">
						<label for="name">Name</label>
						<form:input type="text" class="form-control" path="name" id="name" name="name"
							placeholder="Enter Name" />
						<form:errors path="name" cssClass="error" />
					</div>
				</div>
				<div class="col">
					<div class="form-group">
						<label for="designation">Designation</label>
						<form:input type="text"
							class="form-control" id="designation" path="designation" name="designation"
							placeholder="Enter Designation" />
                       <form:errors path="designation" cssClass="error" />
					</div>
				</div>
			</div>

			<div class="row">
				<div class="col">
					<div class="form-group">
						<label for="department">Department</label>
						 <form:input
							type="text" class="form-control" id="department"
							name="department" path="department" placeholder="Enter department" />
					</div>
				</div>
				<div class="col">
					<div class="form-group">
						<label for="salary">Salary</label>
						<form:input type="number"
							class="form-control" id="salary" path="salary" name="salary"
							placeholder="Enter Salary" />
							<form:errors path="salary" cssClass="error" />
					</div>
				</div>
			</div>

			<div class="row">
				<div class="col">
					<div class="form-group">
						<label for="address">Address</label>
						<form:textarea class="form-control" id="address" path="address" name="address"
							rows="5" placeholder="Enter Address" />
					</div>
				</div>
			</div>

			<a href="${pageContext.request.contextPath }/"
				class="btn btn-warning"> Back </a>
			<button type="submit" class="btn btn-primary">Submit</button>
		</form:form>
	</div>
</body>
</html>
