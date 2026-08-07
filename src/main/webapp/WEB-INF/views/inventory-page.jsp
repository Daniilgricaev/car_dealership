<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Inventory</title>
</head>
<body>
<table border="1">
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

<br>
<a href="${pageContext.request.contextPath}/">Home</a> |
<a href="${pageContext.request.contextPath}/add-car">Add New Car</a>
</body>
</html>