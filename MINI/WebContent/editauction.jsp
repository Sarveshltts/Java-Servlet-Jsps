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
AuctionDAO pd=new AuctionDAO();
Auction p1=pd.getAllAuctionById(id);
%>
<form action="./UpdateAuctionServlet" method="post">
<input type="hidden" name="id" value= <%=p1.getAucid() %>> <br><br>
Team ID: <input type="number" value="<%=p1.getTid() %>" name="tid"><br><br>
Player ID: <input type="number" value="<%=p1.getPid() %>" name="pid"><br><br>
Year: <input type="number" value="<%=p1.getYear() %>" name="year"><br><br>
Sold At: <input type="number" value="<%=p1.getCost() %>" name="cost"><br><br>
<input type="submit" value="Update Auction">

</form>
</body>
</html>