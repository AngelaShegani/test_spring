<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Form</title>
    <link rel="stylesheet" type="text/css" href="/css/style.css">
</head>
<body>
<h3>Login</h3>
<form action='/results' method="post" >
    <p>Name:</p> <input type="text" name='name'>
    <p>Email:</p> <input type="text" name='email'>
    <p>Program:
        <select name ="program">
            <option value="java">Jave</option>
            <option value="MERN">MERN</option>
            <option value="python">Python</option>
        </select>
    </p>
    <p><button>Submit</button>  </p>
</form>
</body>
</html>