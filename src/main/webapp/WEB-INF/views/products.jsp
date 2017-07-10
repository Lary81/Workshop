<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="f" uri="http://java.sun.com/jsp/jstl/fmt" %>

<html>
<head>
    <title></title>
</head>
<body>
<table>
    <thead>
        <tr>
            <th>Lp.</th>
            <th>Id</th>
            <th>Nazwa</th>
            <th>Cena</th>
        </tr>
    </thead>
    <tbody>
        <c:forEach items="${parts}" var="part" varStatus="status">
            <tr>
                <td>${status.index + 1}</td>
                <td>${part.id}</td>
                <td>${part.name}</td>
                <td><f:formatNumber type="currency" value="${part.price}"/></td>
                <td><a href="part-form.html?id=${part.id}">Edit</a></td>
            </tr>
        </c:forEach>
    </tbody>
</table>
<a href="<c:url value="/"/>">Main</a>
</body>
</html>
