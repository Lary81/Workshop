<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="f" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>ADD Part</h1>
<f:form method="post" modelAttribute="part">
    <p>
        Nazwa:<f:input path="name"/>
         <p>
            <f:errors path="name"/>
        </p>
    </p>
    <p>
        Cena:<f:input path="price"/>
        <p>
            <f:errors path="price"/>
        </p>
    </p>
    <f:hidden path="id"/>
    <button type="submit">Dodaj</button>
</f:form>
<a href="<c:url value="/"/>">Menu główne</a>
</body>
</html>
