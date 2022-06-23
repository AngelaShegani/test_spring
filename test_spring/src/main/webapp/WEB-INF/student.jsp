<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Student</title>
</head>
<body>
<p>Name : <c:out value="${student}" /> </p>
<p>City : <c:out value="${city}" /> </p>

My stacks are:
<ul>
<c:forEach items="${myStacks}" var ="stack">
    <li><c:out value="${stack}" /></li>
</c:forEach>
</ul>
</body>
</html>