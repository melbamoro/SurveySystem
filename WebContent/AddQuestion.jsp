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
<%@taglib uri="http://java.sun.com/jstl/core_rt" prefix="c" %>
<MAP NAME = "map">
<AREA SHAPE = "RECT" COORDS = "0,20,446,273" 
             HREF = "home.html">
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
		<a id="links" href="login.html">Sign Off</a>
	</div>

	<!-- LEFT MENU -->
	<div class="leftmenu">
<br>
	<table cellpadding=7px  class="menu_items" bgcolor=LAVENDER width=99%>
		
		<tr>
			<td><a href="#">View Questions</a></td>
		</tr>
		
		<tr>
			<td><a href="#">Add Question</a></td>
		</tr>
		
		<tr>
			<td><a href="#">Edit Question</a></td>
		</tr>
		
		<tr>
			<td><a href="#">Delete Question</a></td>
		</tr>
			</table>
	
		
	</div>
	
	<div class="rightmenu">
		<br>	
			<form name="addQuestionForm" action="newquestionfields.survey">
					    <table border="0" bordercolor="black" cellpadding=10> 
						<tr>
							<td align="right">
									<input type="submit" value="Add New Question" />
									<a href="SaveQuestions.survey" ><input type="button" value="Submit" /></a>
							</td>
						</tr>
					    <tr>
					    	<td colspan="4">Question ${no}</td>
					    </tr>
					     <tr>
					     	<td colspan="4"><textarea cols="60" rows="2" name="questionTxt">${i.question}</textarea></td>
					     </tr>
					     <tr>
					     	<td>Option A</td>
					     	<td><input type="text" name="option1Txt" value="${i.option1}" ></td>
					     	<td>Option B</td>
					     	<td><input type="text" name="option2Txt" value="${i.option2}" ></td>
					     </tr>
					     <tr>
					     	<td>Option C</td>
					     	<td><input type="text" name="option3Txt" value="${i.option3}" ></td>
					     	<td>Option D</td>
					     	<td><input type="text" name="option4Txt" value="${i.option4}" ></td>
					     </tr>
					     <tr><td colspan="4"><hr/></td></tr>
					   
					 
					     </table>
					 </form>
					 <form>
					 <br/>
					 <table align="center" border="0" bordercolor="black" cellpadding=10>
					     <tfoot>
					     	<tr>
					     		<td align="center" colspan="5"><input type="submit" value="Submit" /></td>
					     	</tr>
					     </tfoot>
					    </table>
					  </form>
					

			
	</div>
	

</div>
</body>
</html>