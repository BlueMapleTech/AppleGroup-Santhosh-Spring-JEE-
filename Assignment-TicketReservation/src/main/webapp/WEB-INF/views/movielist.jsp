<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Book Ur Show</title>
</head>
<body>
	<h1>Movie Details</h1>
	<form action="mlist" method="post">
		<input type="hidden" name="movie_id" value=${name}><br>
		MovieName:<br /> <input type="text" name="moviename"><br>
		ReleaseDate:<br /> <input type="text" name="release_date" /><br>
		NoOfShow :<br /> <input type="text" name="no_of_show"><br>
		<h1>Timing Details</h1><br>
		Timing :<br /> <input type="checkbox" name="count" value=${1 } />9.00AM
		to 12.00PM<br /> <input type="checkbox" name="count" value=${2 } />12.30PM
		to 3.30PM<br /> <input type="checkbox" name="count" value=${3 } />4.00PM
		to 7.00PM<br /> <input type="checkbox" name="count" value=${4 } />7.30PM
		to 10.30PM<br />
		
		<h1>Ticket Rate Details</h1><br/>
		 FirstClassTicketRate:<input type="text" name="rate"><br />
		BolconeyTicketRate:<input type="text" name="rate1"><br /> <input
			type="submit" value="click">
	</form>
</body>
</html>