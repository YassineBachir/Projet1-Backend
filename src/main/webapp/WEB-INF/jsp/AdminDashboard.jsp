<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Admin Dashboard</title>
    <link rel="stylesheet" href="/Style.css">
</head>
<body>
<div class="container">
    <h1>Bienvenue dans le tableau de bord administrateur!</h1>
    <h2>Vue globale des files d'attente</h2>

    <table border="1" style="width: 100%; margin-top: 20px; text-align: center;">
        <thead>
        <tr>
            <th>Service</th>
            <th>Localisation</th>
            <th>Nombre de tickets</th>
            <th>Action</th>
        </tr>
        </thead>
        <tbody>
        <c:forEach var="queue" items="${queues}">
            <tr>
                <td>${queue.service}</td>
                <td>${queue.location}</td>
                <td>${queue.ticketCount}</td>
                <td>
                    <form action="/admin/queue-details" method="get" style="display: inline-block;">
                        <input type="hidden" name="service" value="${queue.service}">
                        <input type="hidden" name="location" value="${queue.location}">
                        <button class="btn">Voir détails</button>
                    </form>
                </td>
            </tr>
        </c:forEach>
        </tbody>
    </table>
</div>
</body>
</html>
