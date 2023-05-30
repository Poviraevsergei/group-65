<%@ page import="java.util.Date" %>

<%!
    long summa(int a, int b) {
        return a + b;
    }
%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>My JSP</title>
</head>
<body>
<h1>Hello ${name}</h1>   <!-- достаем из памяти объект с ключем name -->
<%new Date();%>      <!-- без '=' код выполнится, но мы не увидим результат-->
<%=new Date()%>      <!-- c '=' код выполнится, и мы увидим результат-->

<!-- есть скрытые обьекты request, response -->
<%=request.getParameter("name")%>
<h1>Summa 5 + 2 = <%=summa(5, 2)%>
</h1>
</body>
</html>