<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="s" uri="http://www.springframework.org/tags" %>
<html>
<head>
    <title>Sklep ogrodniczy</title>
</head>
<body>
<h1><s:message code="index.title"/></h1>
<ul>
    <li>
        <a href="show-parts.html">
            <s:message code="index.showParts"/>
        </a>
    </li>
    <li>
        <a href="product-form.html">
            Dodaj part
        </a>
    </li>
</ul>
</body>
</html>