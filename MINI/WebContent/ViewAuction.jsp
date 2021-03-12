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
AuctionDAO pd=new AuctionDAO();
List<Auction> li=pd.getAllAuction();
%>
<table>
<tr>
<th>Auction ID</th>
<th>Team ID</th>
<th>Player ID</th>
<th>Year</th>
<th>Sold At</th>
</tr>
<%
for(Auction p:li)
{
	%>
	<tr>
	<td><%=p.getAucid() %></td>
	<td><%=p.getTid() %></td>
	<td><%=p.getPid() %></td>
	<td><%=p.getYear() %></td>
	<td><%=p.getCost() %></td>
	<td><a href="editauction.jsp?id=<%=p.getAucid() %>">Update</a></td>
	</tr>
	<%} %>
</table>

</body>
</html>