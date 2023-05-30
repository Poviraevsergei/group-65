<%@ page import="com.tms.User" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Hello user</title>
</head>
<body>

<%User u = (User) request.getAttribute("Yakub");%>
<%=u.getId()%>
<%=u.getName()%>
${Yakub}

<c:if test="${arrayUsers != null}">
    <c:out value="arrayUsers is not null"/>
</c:if>

<c:forEach var="user" items="${arrayUsers}">
    <c:out value="${user}"/>
</c:forEach>
</body>
</html>