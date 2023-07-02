<%@ page import="java.util.ArrayList" %>
<%@ page import="Food.Food" %>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>FoodShare | The Food Donation System</title>
    <link rel="stylesheet" href="CSS/main.css" type="text/css">
    <link rel="stylesheet" href="CSS/header.css" type="text/css">
    <link rel="stylesheet" href="CSS/list.css" type="text/css">
</head>
<body>
    <% ArrayList<Food> foods = (ArrayList<Food>) application.getAttribute("Foods"); %>

    <jsp:include page="header.jsp"></jsp:include>

    <section id="task-window">
    <span>Lista Prodotti</span>
    <p>
        Lorem ipsum dolor sit amet, consectetur adipisci elit, sed do eiusmod tempor incidunt ut labore et dolore magna aliqua.
        Ut enim ad minim veniam, quis nostrum exercitationem ullamco laboriosam, nisi ut aliquid ex ea commodi consequatur.
        Duis aute irure reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur.
    </p>

        <hr>
        <div id="foods">
            <% for(Food food: foods) { %>
                <div class="food">
                    <img src="SAMPLES/<%= food.getName() %>.png">
                    <span class="name"><%= food.getName() %></span>
                    <span class="quantity">x<%= food.getQuantity() %></span>
                    <span class="urgency"><%= food.getUrgency().name() %> Urgenza</span>
                </div>
            <% } %>
        </div>
        <hr>

    </section>

</body>
</html>