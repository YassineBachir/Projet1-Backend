<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Agent Dashboard</title>
    <link rel="stylesheet" href="/Style.css">
</head>
<body>
<div class="container">
    <h1>Bienvenue dans votre tableau de bord!</h1>
    <p><strong>Numéro en cours de traitement :</strong> ${currentProcessingTicket}</p>
    <form action="/agent/next" method="post" style="display: inline-block; margin-right: 10px;">
        <button class="btn">Client suivant</button>
    </form>

    <form action="/agent/previous" method="post" style="display: inline-block;">
        <button class="btn">Client précédent</button>
    </form>


</div>
</body>
</html>
