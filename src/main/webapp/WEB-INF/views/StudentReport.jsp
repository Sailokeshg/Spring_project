<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
<head>
<title>Student page</title>
<meta charset="ISO-8859-1">
<%@include file="./base.jsp"%>
<script>
	$(document).ready(function() {

		getAllrecord();

		$('#saveStudent').show();
		$('#updateStudent').hide();
		$('#idField').hide();

		$('#gettime').click(function() {
			$.ajax({
				url : 'date',
				success : function(data) {
					$('#printtime').html(data);
				}
			});
		});

		$('#saveStudent').click(function() {
			$.ajax({
				type : "POST",
				url : "insertStudent",
				data : {
					name : $("#name").val(),
					age : $("#age").val(),
					course : $("#course").val()
				},
				success : function(result) {
					getAllrecord();
					$('#studentForm')[0].reset()
				},
				error : function(err) {
					alert("error is" + err)
					console.log(err)
				}
			});

		});

	});

	var data = "";
	function getAllrecord() {
		$
				.ajax({
					type : "GET",
					url : "getAllStudent",
					success : function(response) {
						 data = response

						 $('.tr').remove();
						for (i = 0; i < data.length; i++) {
							$("#studentTable")
									.append(
											'<tr class="tr"> <td>'
													+ data[i].id
													+ '</td> <td>'
													+ data[i].name
													+ '</td> <td>'
													+ data[i].age
													+ '</td> <td>'
													+ data[i].course
													+ '</td> <td><input type="button" class="btn btn-warning" onclick="editStudent('
													+ data[i].id
													+ ')"  value="Edit"></input></td> <td> <input type="button" class="btn btn-danger" onclick="deleteStudent('
													+ data[i].id
													+ ');" value="Delete"></input></td> </tr>');

						}

					},
					error : function(err) {
						alert("error is" + err)
						console.log(err)
					}
				});
	}



	function editStudent(id) {
		$.ajax({
			type : "GET",
			url : "getOneStudent/" + id,
			dataType : 'json',
			success : function(response) {

				//alert("student--"+response.id);
				$("#id").val(response.id), $("#name").val(response.name), $(
						"#age").val(response.age), $("#course").val(
						response.course)

				$('#saveStudent').hide();
				$('#updateStudent').show();
				$('#idField').show();
			},
			error : function(err) {
				alert("error is" + err)
			}
		});
	}

	function updateStudentbtn() {

		$.ajax({
			type : "POST",
			url : "updateStudent",
			data : {
				id : $("#id").val(),
				name : $("#name").val(),
				age : $("#age").val(),
				course : $("#course").val()
			},
			success : function(result) {
				getAllrecord();

				$('#saveStudent').show();
				$('#updateStudent').hide();
				$('#idField').hide();
				$('#studentForm')[0].reset()
			},
			error : function(err) {
				alert("error is" + err)
			}
		});

	}

	function deleteStudent(id) {
		$.ajax({
			url : "deleteStudent/" + id,
			success : function(response) {
				getAllrecord();
			},
			error : function(err) {
				alert("error is" + err)
			}
		});
	}

</script>
<style>
  .error
  {color:red}
</style>

</head>
<body>

	<div class="container mt-3">
		<form:form id="studentForm" modelAttribute="insertStudent" method="POST">
			<div class="row">
				<div class="col-4">
					<h3>Student Form</h3>

					<div class="row" id="idField">
						<div class="col">
							<div class="form-group">
								<label for="id">ID</label> <form:input type="text" readonly="readonly"
									class="form-control" id="id" path="id" name="id" />

							</div>
						</div>
					</div>


					<div class="row">
						<div class="col">
							<div class="form-group">
								<label for="name">Name</label> <form:input type="text"
									class="form-control" id="name" name="name" path="name"
									placeholder="Enter Name" />
									<form:errors path="name" style="color:red;" />
							</div>
						</div>
					</div>

					<div class="row">
						<div class="col">
							<div class="form-group">
								<label for="age">Age</label> <form:input type="text"
									class="form-control" id="age" name="age" path="age"
									placeholder="Enter Age" />

							</div>
						</div>
					</div>

					<div class="row">
						<div class="col">
							<div class="form-group">
								<label for="name">Course</label> <form:input type="text"
									class="form-control" id="course" name="course" path="course"
									placeholder="Enter Course" />
									<form:errors path="course" cssClass="error" />
							</div>
						</div>
					</div>
					<div class="row">
						<div class="col">
							<button type="button" id="saveStudent" class="btn btn-primary">Submit</button>
							<button type="button" id="updateStudent"
								onclick="updateStudentbtn()" class="btn btn-primary">Update</button>
						</div>
					</div>
				</div>
				<div class="col-8">

					<h3>Student Record</h3>
					<div style = "position:relative; left:80px; bottom:40px;">
					<a href="${pageContext.request.contextPath}/">
                         <span  class="btn btn-primary" style="float:right;">Home</span>
                      </a>
                    </div>
					 <br>
					<table class="table table-hover">
					 <caption>Student form</caption>
						<thead>
							<tr>
								<th scope="col">ID</th>
								<th scope="col">Name</th>
								<th scope="col">Age</th>
								<th scope="col">Course</th>
								<th scope="col">Edit</th>
								<th scope="col">Delete</th>
							</tr>
						</thead>
						<tbody id="studentTable">
						<%--
						<c:forEach var="std" items="${student}">
						<tr>
							<td class="table-plus">${std.id}</td>
							<td>${std.name}</td>
							<td>${std.age}</td>
							<td>${std.course}</td>
							<td><a href="editEmployee/${std.id}" class="btn btn-warning">
									Edit </a></td>
							<td><a href="deleteEmployee/${std.id}"
								class="btn btn-danger"> Delete </a></td>
						</tr>
					</c:forEach> --%>
						</tbody>
					</table>
				</div>
			</div>
		</form:form>
	</div>

</body>
</html>