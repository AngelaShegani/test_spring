<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Student Info</title>

</head>
<body>
<p>Name : <c:out value="${name}" /> </p>
<p>email : <c:out value="${email}" /> </p>
<p>program : <c:out value="${program}" /> </p>
<a href="/test">Test Sesioni</a>
</body>
</html>