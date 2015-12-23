<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<p>Insert TicketRate Details</p>
	<form action="ratedetails" method="post">
		<input type="hidden" name="ticket_rate_id" value=${id }><br/>
		TicketRate:<input type="text" name="ticket_rate"> <br/>Ticket_Type:<input
			type="text" name="ticket_type_ticket_type_id"> <br/>Movie:<input
			type="text" name="movie_movie_id"> <br/><input type="submit"
			value="click">
	</form>

</body>
</html>