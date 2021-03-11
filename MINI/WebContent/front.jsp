<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Example</title>
    </head>
    <body bgcolor="lightblue">
        <form method="post" action="Login.jsp">
            <center>
            <table border="0" width="30%" cellpadding="3">
                    <tr>
                        <th colspan="2">Login Page</th>
                    </tr>
                    <tr>
                        <td>Username</td>
                        <td><input type="text" name="user" required="required" /></td>
                    </tr>
                    <tr>
                        <td>Password</td>
                        <td><input type="password" name="pass" required="required" /></td>
                    </tr>
                    <tr>
                        <td><input type="submit" value="Login" /></td>
                        <td><input type="reset" value="Reset" /></td>
                    </tr>
                    <tr>
                        <td colspan="2">New User: <a href="register.jsp">Register Here</a></td>
                    </tr>
            </table>
            </center>
        </form>
    </body>
</html>