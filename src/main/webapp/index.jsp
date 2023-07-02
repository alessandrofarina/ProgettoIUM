<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>FoodShare | The Food Donation System</title>
    <link rel="stylesheet" href="CSS/main.css" type="text/css">
    <link rel="stylesheet" href="CSS/header.css" type="text/css">
    <link rel="stylesheet" href="CSS/index.css" type="text/css">
</head>
<body>
    <jsp:include page="header.jsp"></jsp:include>

    <section id="task-window">
        <a href="list.jsp"><div class="task"><span>Lista <br> Prodotti</span><div id="task-1"></div></div></a>
        <div class="h-space"></div>
        <a href="donation.jsp"><div class="task"><span>Effettua <br> Donazione</span><div id="task-2"></div></div></a>

        <div class="v-space"></div>

        <a href="auth.jsp?next=add"><div class="task"><span>Aggiungi <br> Prodotti</span><div id="task-3"></div></div></a>
        <div class="h-space"></div>
        <a href="auth.jsp?next=edit"><div class="task"><span>Modifica <br> Prodotti</span><div id="task-4"></div></div></a>
    </section>

</body>
</html>