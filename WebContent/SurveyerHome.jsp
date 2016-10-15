<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" href="temp.css"/>
</head>
<body onload="number_of_questions();">
<%@taglib uri="http://java.sun.com/jstl/core_rt" prefix="c" %>
<MAP NAME = "map">
<AREA SHAPE = "RECT" COORDS = "0,20,446,273" 
             HREF="home.html">
</MAP>

<div class="container">
	
	<!-- header -->
	<div class="header">
		<img src="logonew2.png" USEMAP = "#map" width= height=/>
	</div>
	
	<!-- Menu Bar -->	
	<div class="menubar" align="right">
		<a id="links" href="home.html">Home</a><font color=white> | </font>
		<a id="links" href="about.html">About</a><font color=white> | </font>
		<a id="links" href="intructions.html">Instructions</a><font color=white> | </font>
		<a id="links" href="login.html">Login</a>
	</div>


	<div><h1>${i}</h1>
		<p class="menu_header" style="width:100%"></p>
		<div align="center">	
		<table border=1>
		<tr>
			<th>SurveyId</th>
			<th>Survey Title</th>
			<th>Created Date</th>
			<th>Add Questions</th>
			<th>Edit</th>
			<th>Delete</th>
		</tr>
		<c:forEach var="sur" items="${sList}">
		<tr>
			<td>${sur.surveyId}</td>
			<td>${sur.surveyTitle}</td>
			<td>${sur.surveyDate}</td>
			<td>
				<a href="addquestions.survey?surveyId=${sur.surveyId}">Add Questions</a>
			</td>
			<td>
				<a href="">Edit Survey</a>
			</td>
			<td>
				<a href="">Delete Survey</a>
			</td>
		</tr>
		</c:forEach>
		</table>	
		</div>
	</div>
	

</div>
</body>
</html>