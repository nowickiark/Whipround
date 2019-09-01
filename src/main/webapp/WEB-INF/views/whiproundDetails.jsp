<%@ page session="false"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<html>
<body>

<form:form method="POST" action="/whipround/donate" modelAttribute="donation">
    <table>
        <tr>
            <td><form:label path="user.userName">Username</form:label></td>
            <td><form:input path="user.userName"/></td>
        </tr>
        <tr>
            <td><form:label path="user.email">Email</form:label></td>
            <td><form:input path="user.email"/></td>
        </tr>
        <tr>
            <td><form:label path="donation">Amount</form:label></td>
            <td><form:input type="donation" path="donation"/></td>
        </tr>
            <form:hidden path="whipRound.id"></form:hidden>
        <tr>
            <td><input type="submit" value="Pay"/></td>
        </tr>


    </table>
</form:form>

</body>
</html>