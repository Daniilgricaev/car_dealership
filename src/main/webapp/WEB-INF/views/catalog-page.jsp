<h1>${dealerShipName}</h1>
<p>Address: ${dealerShipAddress}</p>

<c:if test="${not empty car}">
    <h2>Car: ${car.modelName}</h2>
    <p>Price: $${car.price}</p>
</c:if>
