<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Student</title>
<style>
input{
	width: 80%;
	padding: 12px 20px;
	margin: 8px 0;
	display: inline-block;
	border: 1px solid #ccc;
	border-radius: 4px;
	box-sizing: border-box;
}

input[type=submit] {
	width: 80%;
	background-color: red;
	color: white;
	padding: 14px 20px;
	margin: 8px 0;
	border: none;
	border-radius: 4px;
	cursor: pointer;
}

input[type=submit]:hover {
	background-color: purple;
}

form {
	border-radius: 5px;
	background-color: #f2f2f2;
	padding: 20px;
}
</style>
</head>

<body>

	<h3>New student</h3>

	<div>
		<form action="/mvcUserManager/StudentControleur" method="post">
			<label for="fname">Student First Name</label> <br><input type="text" id="fname"
				name="firstname" placeholder="Your name.."><br><label
				for="lname">Student Last Name</label><br> <input type="text" id="lname"
				name="lastname" placeholder="Your last name.."><br> <label
				for="ID">Student ID</label> <br><input type="number" id="ID" name="ID" placeholder="Student ID..">
				<br> <label
				for="Mark">Mark</label> <br><input type="number" id="Mark"
				name="Mark" placeholder="Student Mark..">
			  <br><input type="submit" value="Submit">
		</form>
		
	</div>

</body>
</html>