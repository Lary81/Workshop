<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title></title>
</head>
<body>
<p>
    Zapisano czesc ${part.name} w cenie ${part.price}
</p>
<a href="<c:url value="/"/>">Main</a>
</body>
</html>
