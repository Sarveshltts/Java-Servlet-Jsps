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
PlayerDAO pd=new PlayerDAO();
List<Player> li=pd.getAllPlayers();
%>
<table>
<tr>
<th>Player Number</th>
<th>Player Name</th>
<th>Team_id</th>
<th>Date of Birth</th>
<th>Skill</th>
<th>Number of Matches</th>
<th>Runs</th>
<th>Wickets</th>
<th>Country</th>
</tr>
<%
for(Player p:li)
{
	%>
	<tr>
	<td><%=p.getPlayerid() %></td>
	<td><%=p.getPlayername() %></td>
	<td><%=p.getTeamid() %></td>
	<td><%=p.getDob() %></td>
	<td><%=p.getSkill() %></td>
	<td><%=p.getNumberofmatches() %></td>
	<td><%=p.getRuns() %></td>
	<td><%=p.getWickets() %></td>
	<td><%=p.getCountry() %></td>
	<td><a href="editplayer.jsp?id=<%=p.getPlayerid()%>">Update</a></td>
	</tr>
	<%} %>
</table>

</body>
</html>