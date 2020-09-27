<%--
  Created by IntelliJ IDEA.
  kz.edu.astanait.User: Talgat
  Date: 9/23/20
  Time: 01:14
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Enter Student Data</title>
</head>
    <form action="servlet_1" method="post">
        <input type="text" placeholder="first name" maxlength="30" name="studentFirstName"><br><br>
        <input type="text" placeholder="last name" maxlength="30" name="studentLastName"><br><br>
        <input type="number" placeholder="grade" style="width:155px" min="0" max="100" name="studentGrade"><br><br>
        <input type="submit">
    </form>
</body>
</html>