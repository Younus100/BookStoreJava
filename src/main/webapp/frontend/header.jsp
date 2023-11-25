
<!DOCTYPE html>
<%@ page isELIgnored="false" %>
<html>
<head>
    <title>Book Store</title>
    <link href="${pageContext.request.contextPath}/css/header.css" rel="stylesheet"> <!-- Link your CSS file -->
</head>
<body>
<header class="main-header">
    <div class="header-content">
            <div class="logo">
                <img alt="Book Store Logo" src="${pageContext.request.contextPath}/image/logo.jpeg">
            </div>
            <div class="search-bar">
                <input placeholder="Search books..." type="text">
                <button type="submit">Search</button>
            </div>

        <div class="right-column">
            <div class="user-actions" >
                <a href="signin.html">Sign In</a>
                <a href="register.html">Register</a>
                <a href="cart.html">Cart</a>
            </div>
        </div>
    </div>
    <nav class="categories">
        <ul>
            <li><a href="#">Category 1</a></li>
            <li><a href="#">Category 2</a></li>
            <li><a href="#">Category 3</a></li>
        </ul>
    </nav>
</header>

</body>
</html>
