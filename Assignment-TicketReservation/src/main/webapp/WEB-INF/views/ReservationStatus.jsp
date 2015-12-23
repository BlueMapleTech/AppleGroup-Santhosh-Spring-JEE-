<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form action="statusbooking">
		<input type="hidden" name="name" value=${name }> <input
			type="hidden" name="id" value=1> <input type="submit"
			value="Booking">
	</form>
	<form action="statuscancelling">
		<input type="hidden" name="name" value=${name }> <input
			type="hidden" name="id" value=2> <input type="submit"
			value="Cancelling">
	</form>


</body>
</html>