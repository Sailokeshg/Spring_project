<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
<head>
<title>Employee Details</title>
<meta charset="ISO-8859-1">
<%@include file="./base.jsp"%>
</head>
<body>


	<div class="container mt-3">

		<h1>Add Employee Form</h1>
		<div style = "position:relative; left:80px; bottom:60px; background-color:yellow;">
		<a href="${pageContext.request.contextPath}/">
            <button type="submit" id="home" class="btn btn-primary" style="float:right;">Home</button>
        </a>
        </div>
		<a href="addEmployee" class="btn btn-primary"> Add Employee </a>
		<br><br>
		<div class="row">

			<table class="table table-hover">
			<caption>Employee Details</caption>
				<thead>
					<tr>
						<th scope="col">ID</th>
						<th scope="col">Name</th>
						<th scope="col">Department</th>
						<th scope="col">Salary</th>
						<th scope="col">Address</th>
						<th scope="col">Designation</th>
						<th scope="col">Edit</th>
						<th scope="col">Delete</th>
					</tr>
				</thead>
				<tbody>
					<c:forEach var="emp" items="${employee}">
						<tr>
							<td class="table-plus">${emp.id}</td>
							<td>${emp.name}</td>
							<td>${emp.department}</td>
							<td>${emp.salary}</td>
							<td>${emp.address}</td>
							<td>${emp.designation}</td>
							<td><a href="editEmployee/${emp.id}" class="btn btn-warning">
									Edit </a></td>
							<td><a href="deleteEmployee/${emp.id}"
								class="btn btn-danger"> Delete </a></td>
						</tr>
					</c:forEach>
				</tbody>
			</table>
		</div>
	</div>

</body>
</html>