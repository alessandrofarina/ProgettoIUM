<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>FoodShare | The Food Donation System</title>
    <link rel="stylesheet" href="CSS/main.css" type="text/css">
    <link rel="stylesheet" href="CSS/header.css" type="text/css">
    <link rel="stylesheet" href="CSS/addProduct.css" type="text/css">
    <link rel="stylesheet" href="CSS/input.css" type="text/css">
</head>
<body>

<jsp:include page="header.jsp"></jsp:include>

<section id="task-window">
    <span>Aggiungi Prodotti</span>
    <p>
        Lorem ipsum dolor sit amet, consectetur adipisci elit, sed do eiusmod tempor incidunt ut labore et dolore magna aliqua.
        Ut enim ad minim veniam, quis nostrum exercitationem ullamco laboriosam, nisi ut aliquid ex ea commodi consequatur.
        Duis aute irure reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur.
    </p>

    <form action="AddProduct" method="post" enctype="multipart/form-data">
        <div class="input-box" id="sample">
            <label id="preview" for="sample-input">Immagine di Riferimento</label>
            <input id="sample-input" type="file" accept="image/png" name="sample" onchange="preview(this)">
        </div>

        <div class="input-box">
            <input type="text" name="product" placeholder="Prodotto" required>
        </div>

        <div class="input-box">
            <input type="number" min="1" max="100" name="quantity" placeholder="Quantità" required>
        </div>

        <div class="input-box">
            <select name="urgency">
                <option value="Bassa">Bassa Urgenza</option>
                <option value="Media">Media Urgenza</option>
                <option value="Alta">Alta Urgenza</option>
            </select>
        </div>

        <div class="submit">
            <input type="submit" value="Conferma">
        </div>

    </form>
</section>

<script src="JS/main.js"></script>
</body>
</html>