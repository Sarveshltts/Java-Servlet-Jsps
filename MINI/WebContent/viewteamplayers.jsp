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
List<Player> nli=new ArrayList<Player>();
String name=request.getParameter("tname");
for(Player p: li){
	if(p.getCountry().equalsIgnoreCase(name)){
		nli.add(p);
	}
}
%>
<h1>Team Name: <%=name %> </h1>
<h2>Players are</h2>
<% for(Player p2:nli) {%>
<%=p2.getPlayername() %> <br><br>
<%} %>
</body>
</html>