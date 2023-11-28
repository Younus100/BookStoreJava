<!DOCTYPE html>
<%@ page isELIgnored="false" %>
<html lang="en" xmlns:jsp="">
<head>
    <meta charset="UTF-8">
    <title>Admin Dashboard - Bookstore</title>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/admin.css">
</head>
<body>
    <jsp:directive.include file="header.jsp" />
<header>
    <h1>Admin Dashboard</h1>
</header>

<main>
    <!-- Dashboard Overview Section -->
    <section id="dashboard">
        <h2>Dashboard Overview</h2>
        <!-- Content for dashboard metrics, charts, etc. -->
    </section>

    <!-- Book Management Section -->
    <section id="book-management">
        <h2>Book Management</h2>
        <!-- Content for managing books -->
    </section>

    <!-- Order Management Section -->
    <section id="order-management">
        <h2>Order Management</h2>
        <!-- Content for managing orders -->
    </section>

    <!-- User Management Section -->
    <section id="user-management">
        <h2>User Management</h2>
        <!-- Content for managing users -->
    </section>
    <!-- Other sections for reports, settings, etc. -->
</main>

    <jsp:directive.include file="footer.jsp" />
</body>
</html>
