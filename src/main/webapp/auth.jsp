<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>FoodShare | The Food Donation System</title>
    <link rel="stylesheet" href="CSS/main.css" type="text/css">
    <link rel="stylesheet" href="CSS/header.css" type="text/css">
    <link rel="stylesheet" href="CSS/auth.css" type="text/css">
    <link rel="stylesheet" href="CSS/input.css" type="text/css">
</head>
<body>

<jsp:include page="header.jsp"></jsp:include>

<section id="task-window">
    <span>Autenticazione</span>
    <p>
        Lorem ipsum dolor sit amet, consectetur adipisci elit, sed do eiusmod tempor incidunt ut labore et dolore magna aliqua.
        Ut enim ad minim veniam, quis nostrum exercitationem ullamco laboriosam, nisi ut aliquid ex ea commodi consequatur.
        Duis aute irure reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur.
    </p>

    <form action="Auth" method="post">

        <input type="hidden" value="<%= request.getParameter("next") %>" name="next">

        <div class="input-box">
            <% if(request.getParameter("pass") != null && request.getParameter("pass").equals("false")) { %>
                <p>Il codice inserito non è valido.</p>
            <% } %>
            <input type="text" name="code" placeholder="Codice">
        </div>

        <div class="submit">
            <input type="submit" value="Login">
        </div>

    </form>
</section>

</body>
</html>