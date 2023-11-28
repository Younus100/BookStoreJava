<!doctype html>
<%@ page isELIgnored="false" %>
<html lang="en" xmlns:jsp="http://www.w3.org/2001/XInclude">
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <link href="${pageContext.request.contextPath}/css/login.css" rel="stylesheet"> <!-- Link your CSS file -->
    <title>Login Page</title>
</head>
<body>
    <jsp:include page="header.jsp" />
    <!DOCTYPE html>
    <html>
    <head>
        <title>Login Page</title>
        <link href="css/styles.css" rel="stylesheet"> <!-- Link your CSS file -->
    </head>
    <body>
    <div class="login-center">
        <div class="login-container">
            <form class="login-form" action="index.jsp" method="post">
                <h2>Login</h2>
                <div class="input-group">
                    <label for="username">Username</label>
                    <input type="text" id="username" name="username" required>
                </div>
                <div class="input-group">
                    <label for="password">Password</label>
                    <input type="password" id="password" name="password" required>
                </div>
                <button type="submit">Login</button>
            </form>
        </div>
    </div>


    <jsp:include page="footer.jsp" />
</body>
</html>