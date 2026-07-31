<c:forEach items="${Cars}" var="car" varStatus="status">
    <tr>
        <td>${status.index + 1}</td>
        <td>${car.modelName}</td>
        <td>$${car.price}</td>
        <td>${car['class'].simpleName}</td>
    </tr>
</c:forEach>

<br>

<a href="${pageContext.request.contextPath}/">Home</a> |
<a href="${pageContext.request.contextPath}/add-car">Add New Car</a>
