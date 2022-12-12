<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@ page import="students.*"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>STUDENTS</title>
</head>
<body>
	<table style="border: 1px solid #ddd; border-radius: 10px;">
		<tr>
			<th
				style="color: pink; text-align: left; padding: 20px; border: 1px solid #ddd;">First
				Name</th>
			<th
				style="color: pink; text-align: left; padding: 20px; border: 1px solid #ddd;">
				Last Name</th>
			<th
				style="color: pink; text-align: left; padding: 20px; border: 1px solid #ddd;">
				ID</th>
			<th
				style="color: pink; text-align: left; padding: 20px; border: 1px solid #ddd;">
				Mark</th>

		</tr>
		<jsp:useBean  id="Students" class="students.StudentManager" scope="request" />
		<jsp:getProperty name="Students" property="students"/>
		
		<%-- <%
		StudentManager students = (StudentManager) request.getAttribute("Students");
		for (int i = 0; i < students.getStudents().getStudentsNumber(); i++) {
		%> --%>

		<%-- <tr>

			<td style="padding: 20px; border: 1px solid #ddd;"><%= students.getStudents().getStudent(i).getFName() %></td>
			<td style="padding: 20px; border: 1px solid #ddd;"><%=students.getStudents().getStudent(i).getLName()%></td>
			<td style="padding: 20px; border: 1px solid #ddd;"><%=students.getStudents().getStudent(i).getNumber()%></td>
			<td style="padding: 20px; border: 1px solid #ddd;"><%=students.getStudents().getStudent(i).getNote()%></td>
		</tr> --%>
		
		<tr><th style="color: pink; text-align: left; padding: 20px; border: 1px solid #ddd;">
			moyenne génerale
			</th>
			<td></td><td></td>
			
		</tr>
	</table>
	<form action="/mvcUserManager/StudentControleur" method="get">
		<input style="	width: 40%;
	background-color: pink;
	color: white;
	padding: 14px 20px;
	margin: 8px 0;
	border: none;
	border-radius: 4px;
	cursor: pointer;" type="submit" value="Add student">
	</form>



</body>
</html>