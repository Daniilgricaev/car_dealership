<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Catalog</title>
    <style>
        /* Настраиваем body как Flex-контейнер на всю высоту экрана */
        body {
            text-align: center;
            font-family: Arial, sans-serif;
            margin: 0;
            display: flex;
            flex-direction: column;
            min-height: 100vh; /* Высота во весь экран */
        }

        /* Главный контент занимает всё свободное место */
        .content {
            flex: 1;
            padding: 50px 20px 20px 20px;
        }

        /* Подвал всегда прижат к низу страницы */
        footer {
            padding: 20px;
            background-color: #0065fc; /* Легкий серый фон для выделения */
            margin-top: auto; /* Выталкивает подвал вниз */
        }
    </style>
</head>
<body>

<div class="content">
    <h1>${dealerShipName}</h1>

    <c:if test="${not empty car}">
        <h2>Car: ${car.modelName}</h2>
        <p>Price: $${car.price}</p>
    </c:if>
</div>

<footer>
    <p>Address: ${dealerShipAddress}</p>
</footer>

</body>
</html>
