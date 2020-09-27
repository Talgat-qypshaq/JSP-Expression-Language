<%--
  Created by IntelliJ IDEA.
  kz.edu.astanait.User: Talgat
  Date: 9/23/20
  Time: 01:18
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="kz.edu.astanait.User" %>
<head>
    <title>List of Students</title>
</head>
</body>
    <a href="<%=request.getContextPath()+"/index.jsp"%>">add a student</a>
    <br>
    <c:out value="${User.userField}" /><br>
    <c:out value="${User['userField']}" /><br>

    <c:out value="${User.userMethod_1()}" /><br>
    <c:out value="${User['userMethod_1']()}">Plan B </c:out><br>

    <c:out value="${User.userMethod_2('using .')}" /><br>
    <c:out value="${User['userMethod_2']('using []')}">Plan B </c:out><br>
</body>
</html>