<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" href="temp.css"/>
</head>
<body>
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


	
	<div>
		<p class="menu_header" style="width:100%"></p>	
		
	
	<table align="center" width="100%" border="0" >
				<tr>
					<td align="center" style="padding-right:50px;color:darkblue;background-color:lavender;padding:5px;padding-left:10px;">
					CREATE SURVEY
					</td>
				</tr>
				<tr>
					<td><br/><br/>
				
					<form action="createSurvey.survey" method="post">
					    <table align="center" cellpadding=6>
					    	<tr>
					    		<th colspan="3">Please Enter Following Details</th>
					    	</tr>
					    	<tr height="20px"></tr>
					    	<tr>
					    		<td>Survey Title<span style="color:red;">*</span></td>
					    		<td>:</td>
					    		<td><input type="text" name="surveyTitleTxt" value="" size="57"></td>
					    		
					    	</tr>
					    	<tr>
					    		<td>Survey Description</td>
					    		<td>:</td>
					    		<td><textarea cols="39" rows="3" name="surveyDescTxt"></textarea></td>
					    	</tr>
					    	<tr>
					    		<td></td>
					    		<td></td>
					    		<td><input class="button" type="submit" name="createSurveyBtn" value="Create Survey" />
					    		
					    	<!-- 	<input class="button" type="submit" name="addexeQueBtn" value="Select Existing Questions" /> --></td>
					    		
					    	</tr>
					    </table>
					    </form>
				
					</td>
				</tr>
				</table>
	</div>
	

</div>
</body>
</html>