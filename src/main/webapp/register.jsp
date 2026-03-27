<!DOCTYPE html>
<html>
<head>
    <title>Register</title>
    <link rel="stylesheet" href="css/style.css">
</head>
<body class="auth-body">

<div class="auth-container">
    <h2>Create Account</h2>

    <form action="register" method="post">
        <input type="text" name="username" placeholder="Username" required><br>
        <input type="password" name="password" placeholder="Password" required><br>

        <button type="submit">Register</button>
    </form>

    <p>Already have an account? <a href="login.jsp">Login</a></p>
</div>

</body>
</html>