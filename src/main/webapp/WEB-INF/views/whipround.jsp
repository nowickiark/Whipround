<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page session="true"%>

<html>
<body>
<div>

    <table>

        <tr>
            <th>Id</th>
            <th>Whip Round Description</th>
            <th>The goal</th>
            <th>Percentage</th>
            <th>details</th>
        </tr>

    <c:forEach var="whipround" items="${whip_rounds}">
        <tr>
            <td>${whipround.whipRound.id}</td>
            <td>${whipround.whipRound.description}</td>
            <td>${whipround.whipRound.goal}</td>
            <td>${whipround.percentage}</td>
            <td><a href="/whipround/${whipround.whipRound.id}">Donate/Details</a></td>
        </tr>
    </c:forEach>

    </table>

</div>

</body>
</html>