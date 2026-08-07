<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Inventory</title>
    <style>
        body {
            text-align: center;
            font-family: Arial, sans-serif;
            margin: 0;
            display: flex;
            flex-direction: column;
            min-height: 100vh;
        }

        .content {
            flex: 1;
            padding: 50px 20px 20px 20px;
            display: flex;
            flex-direction: column;
            align-items: center;
        }

        table {
            border-collapse: collapse;
            margin-top: 20px;
            min-width: 50%;
        }
        th, td {
            border: 1px solid #ddd;
            padding: 10px 15px;
            text-align: center;
        }
        th {
            background-color: #f2f2f2;
        }

        .empty-message {
            color: #666;
            font-style: italic;
            margin-top: 20px;
        }

        footer {
            padding: 20px;
            background-color: #0065fc;
            margin-top: auto;
            border-top: 1px solid #0065fc;
        }
        footer a {
            color: #000000;
            text-decoration: none;
            margin: 0 10px;
        }
        footer a:hover {
            text-decoration: underline;
        }
    </style>
</head>
<body>

<div class="content">
    <h2> Car Inventory</h2>

    <c:choose>
        <c:when test="${not empty Cars}">
            <table>
                <tr>
                    <th>#</th>
                    <th>Model</th>
                    <th>Price</th>
                    <th>Type</th>
                </tr>
                <c:forEach items="${Cars}" var="car" varStatus="status">
                    <tr>
                        <td>${status.index + 1}</td>
                        <td>${car.modelName}</td>
                        <td>$${car.price}</td>
                        <td>${car['class'].simpleName}</td>
                    </tr>
                </c:forEach>
            </table>
        </c:when>
        <c:otherwise>
            <p class="empty-message">No cars in inventory yet. Add your first car!</p>
        </c:otherwise>
    </c:choose>
</div>

<footer>
    <a href="${pageContext.request.contextPath}/"> Home</a> |
    <a href="${pageContext.request.contextPath}/add-car"> Add New Car</a>
</footer>

</body>
</html>