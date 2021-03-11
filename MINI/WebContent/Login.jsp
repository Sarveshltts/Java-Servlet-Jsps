<%@ page import="java.sql.*"%>
<%
    String un = request.getParameter("user");   
    String psd = request.getParameter("pass");
    Class.forName("com.mysql.jdbc.Driver");
    Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/new",
            "root", "root");
    PreparedStatement ps=con.prepareStatement("select * from user where userName=? and password=?");
    ps.setString(1,un);
    ps.setString(2, psd);
    ResultSet rs=ps.executeQuery();
    if (rs.next()) {
        session.setAttribute("user", un);
        response.sendRedirect("home.html");
    } else {
        out.println("Invalid password <a href='front.jsp'>Go home and try again.</a>");
    }
%>