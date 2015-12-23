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

	<h1>LIST OF MOVIE</h1>
	<div class="row">

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
					<c:forEach items="${details}" var="user">
						<tr>
							<td><c:out value="${user.moviename}" /></td>
							<td><c:out value="${user.release_date}" /></td>
							<td>
								<%-- <a
								href="book?id1=<c:out value="${user.movie_id}"/>,id=<c:out value="${id}" />">Book</a> --%>
								<form action=book>
									<input type="hidden" name="id1"
										value=<c:out value="${user.movie_id}"/> /> <input type="hidden"
										name="id" value=<c:out value="${id}"/> />
										<input type="hidden"
										name="statusid" value=<c:out value="${statusid}"/> />
										<input type="hidden" name="date"
										value=<c:out value="${user.release_date}"/> />
										 <input type="submit"
										value="Book">
								</form>
							</td>
						</tr>
					</c:forEach>

				</tbody>
			</table>
		</div>
	</div>

</body>
</html>