<%@ page import="java.sql.*"%>
<%
	String user = request.getParameter("userName");   
	String pass = request.getParameter("password");
	String fname = request.getParameter("firstName");
	String lname = request.getParameter("lastName");
	String email = request.getParameter("email");
    Class.forName("com.mysql.jdbc.Driver");
    Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/new",
            "root", "root");
    Statement st = con.createStatement();
    int i = st.executeUpdate("insert into USER(first_name, last_name, email, username, password, regdate) values ('" + fname + "','"
    + lname + "','" + email + "','" + user + "','" + pass + "', CURDATE())");
    if (i > 0) {
        response.sendRedirect("Welcome.html");
        
    } else {
        response.sendRedirect("front.jsp");
    }
    
    
%>