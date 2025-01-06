<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Gestion des Services</title>
    <link rel="stylesheet" href="css/Style.css">
</head>
<body>
<div class="container">
    <h1>Bienvenue dans l'application de gestion des services</h1>

    <form action="/submit" method="post">
        <div class="form-group">
            <label for="service">Choisissez un service :</label>
            <select id="service" name="service" required>
                <option value="" disabled selected>-- Sélectionner un service --</option>
                <c:forEach var="service" items="${services}">
                    <option value="${service}">${service}</option>
                </c:forEach>
            </select>
        </div>

        <div class="form-group">
            <label for="location">Choisissez une localisation :</label>
            <select id="location" name="location" required>
                <option value="" disabled selected>-- Sélectionner une localisation --</option>
                <c:forEach var="location" items="${localisations}">
                    <option value="${location}">${location}</option>
                </c:forEach>
            </select>
        </div>

        <button type="submit" class="btn">Valider</button>
    </form>
</div>
</body>
</html>
