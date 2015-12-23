<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>Book Your Ticket</h1>
	<br />
	<form action="ticketbooking">
		<input type="hidden" name="userid" value=${userid} > <input
			type="hidden" name="movieid" value=${movieid}> <input
			type="hidden" name="statusid" value=${statusid}> <input
			type="hidden" name="reservationdate" value=${reservationdate}>
		TicketCount:<input type="text" name="ticketcount"><br />
		Timing:<select name="timingid">
			<option value=1>${timeid1}</option>
			<option value=2>${timeid2}</option>
			<option value=3>${timeid3}</option>
			<option value=4>${timeid4}</option>
		</select><br /> <input type="submit" value="continue">

	</form>

</body>
</html>