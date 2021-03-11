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
Player Id:<input type="hidden" name="id" value= <%=p1.getPlayerid() %>> <br><br>
Player Name: <input type="text" value="<%=p1.getPlayername()%>" name="pname"><br><br>
Player Country: <input type="text" value="<%=p1.getCountry()%>" name="pcountry"><br><br>
<input type="submit" value="Update Player">

</form>
</body>
</html>