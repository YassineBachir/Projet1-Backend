<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Informations du Ticket</title>
    <link rel="stylesheet" href="css/Style.css">
</head>
<body>
<div class="container">
    <h1>Votre Ticket</h1>
    <p><strong>Numéro de ticket :</strong> ${numTicket}</p>
    <p><strong>Position dans la file :</strong> ${positionInQueue}</p>
    <p><strong>Nombre de personnes devant vous :</strong> ${peopleAhead}</p>
    <p><strong>Numéro en cours de traitement :</strong> ${currentProcessingTicket}</p>
    <a href="/" class="btn">Retour</a>
</div>
</body>
</html>
