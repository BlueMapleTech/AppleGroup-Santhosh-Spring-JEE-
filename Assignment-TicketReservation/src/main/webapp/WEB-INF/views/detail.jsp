<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Bootstrap Example</title>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
	href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js"></script>
<script
	src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/js/bootstrap.min.js"></script>

</head>
<body>

	<h1>Book U6 Show</h1>

	<br>
	<h2>Admin Page</h2>

	<a href="hom">home</a>!!
	<a href="edit1">AddMovie</a>!!
	<a href="edittime1">AddTime</a>!!
	<a href="count">AddTicketTypeAndCount</a>!!
    <a href="ticketrate">AddTicketRate</a>!!

	<p>---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------</p>
	<div class="row">
		<div class="col-sm-12">
			<div class="col-sm-6" style="background-color: lavender;">
				MOVIE LIST
				<table border=3 class="table">
					<thead>
						<tr>
							<th>name</th>
							<th>Release</th>
							<th colspan=1>Action</th>
						</tr>
					</thead>
					<tbody>

						<c:forEach items="${model.data}" var="record" >

							<c:forEach items="${record.details}" var="user">
								<tr>
									<td><c:out value="${user.moviename}" /></td>
									<td><c:out value="${user.release_date}" /></td>
									<td><a href="edit?name=<c:out value="${user.movie_id}"/>">edit</a></td>

								</tr>
							</c:forEach>
						</c:forEach>


					</tbody>
				</table>
			</div>
			<div class="col-sm-6" style="background-color: lavender;">
				TIME LIST
				<table border=3 class="table">
					<thead>
						<tr>
							<th>timing</th>
							<th colspan=1>Action</th>
						</tr>
					</thead>
					<tbody>
						<c:forEach items="${model.data}" var="record" >

							<c:forEach items="${record.timel}" var="user">
								<tr>
									<td><c:out value="${user.timing}" /></td>
									<td><a
										href="edittime?id=<c:out value="${user.timing_id}"/>">edit</a></td>

								</tr>
							</c:forEach>

						</c:forEach>
					</tbody>
				</table>
			</div>

		</div>
	</div>
	<div class="row">
		<div class="col-sm-12">
			<div class="col-sm-6" style="background-color: lavender;">
				RESERVATION STATUS
				<table border=3 class="table">
					<thead>
						<tr>
							<th>Reservation_Status</th>
							<th colspan=1>Action</th>
						</tr>
					</thead>
					<tbody>
						<c:forEach items="${model.data}" var="record" >
							<c:forEach items="${record.reservationdetails}" var="user">
								<tr>
									<td><c:out value="${user.reservation_status}" /></td>
									<td><a
										href="editstatus?name=<c:out value="${user.reservation_status_id}"/>">edit</a></td>

								</tr>
							</c:forEach>
						</c:forEach>
					</tbody>
				</table>
			</div>
			<div class="col-sm-6" style="background-color: lavender;">
				TICKET TYPE AND COUNT
				<table border=3 class="table">
					<thead>
						<tr>
							<th>ticket type</th>
							<th>ticket count</th>
							<th colspan=1>Action</th>
						</tr>
					</thead>
					<tbody>
						<c:forEach items="${model.data}" var="record" >

							<c:forEach items="${record.ticket}" var="user">
								<tr>
									<td><c:out value="${user.ticket_type}" /></td>
									<td><c:out value="${user.ticket_type_count}" /></td>
									<td><a
										href="edittickettype?id=<c:out value="${user.ticket_type_id}"/>">edit</a></td>

								</tr>
							</c:forEach>
						</c:forEach>
					</tbody>
				</table>
			</div>

		</div>
	</div>
	<div class="col-sm-6" style="background-color: lavender;">
				RateDetail
				<table border=3 class="table">
					<thead>
						<tr>
							<th>TicketRate</th>
							<th>TicketTypeId</th>
							<th>movieid</th>
							<th colspan=1>Action</th>
						</tr>
					</thead>
					<tbody>

						<c:forEach items="${model.data}" var="record" >

							<c:forEach items="${record.ticketrate}" var="user">
								<tr>
									<td><c:out value="${user.ticket_rate}" /></td>
									<td><c:out value="${user.ticket_type_ticket_type_id}" /></td>
									<td><c:out value="${user.movie_movie_id}" /></td>
									<td><a href="editticketrate?name=<c:out value="${user.ticket_rate_id}"/>">edit</a></td>

								</tr>
							</c:forEach>
						</c:forEach>


					</tbody>
				</table>
			</div>
	
</body>




</html>