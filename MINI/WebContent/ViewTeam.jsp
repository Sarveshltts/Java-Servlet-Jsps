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
TeamDAO pd=new TeamDAO();
List<Team> li=pd.getAllTeam();
%>
<table>
<tr>
<th>Team ID</th>
<th>Team Name</th>
<th>Owner Name</th>
<th>Coach Name</th>
</tr>
<%
for(Team p:li)
{
	%>
	<tr>
	<td><%=p.getTid() %></td>
	<td><%=p.getTname() %></td>
	<td><%=p.getOname() %></td>
	<td><%=p.getCname() %></td>
	<td><a href="editteam.jsp?id=<%=p.getTid() %>">Update</a></td>
	</tr>
	<%} %>
</table>

</body>
</html>