<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
      <%@ page import ="java.util.*,com.ltts.model.*,com.ltts.DAO.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
int id=Integer.parseInt(request.getParameter("id"));
PlayerDAO pd=new PlayerDAO();
Player p1=pd.getAllPlayerById(id);
%>
<form action="./UpdatePlayerServlet" method="post">
<input type="hidden" name="id" value= <%=p1.getPlayerid() %>>
Player Name: <input type="text" value="<%=p1.getPlayername()%>" name="pname"><br><br>
Team Id: <input type="number" value="<%=p1.getTeamid()%>" name="tid"><br><br>
Date of birth: <input type="date" value="<%=p1.getDob()%>" name="dob"><br><br>
Skill: <input type="text" value="<%=p1.getSkill()%>" name="skill"><br><br>
Number of Matches played: <input type="number" value="<%=p1.getNumberofmatches()%>" name="noof"><br><br>
Runs made: <input type="number" value="<%=p1.getRuns()%>" name="runs"><br><br>
Wickets Taken: <input type="number" value="<%=p1.getWickets()%>" name="wickets"><br><br>
Player Country: <input type="text" value="<%=p1.getCountry()%>" name="pcountry"><br><br>
<input type="submit" value="Update Player">

</form>
</body>
</html>