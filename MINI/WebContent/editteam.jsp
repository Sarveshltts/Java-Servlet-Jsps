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
TeamDAO pd=new TeamDAO();
Team p1=pd.getAllTeamById(id);
%>
<form action="./UpdateTeamServlet" method="post">
<input type="hidden" name="id" value= <%=p1.getTid() %>> <br><br>
Team Name: <input type="text" value="<%=p1.getTname() %>" name="tname"><br><br>
Owner Name: <input type="text" value="<%=p1.getOname() %>" name="oname"><br><br>
Coach Name: <input type="text" value="<%=p1.getCname() %>" name="cname"><br><br>
<input type="submit" value="Update Team">

</form>
</body>
</html>