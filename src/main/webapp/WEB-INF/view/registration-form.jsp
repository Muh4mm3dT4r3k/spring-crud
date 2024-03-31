<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>registration</title>
</head>
<body>
    <form:form modelAttribute="user" action="create-user" method="post">
        <p>first name: <form:input path="firstName" /> </p>
        <p>last name: <form:input path="lastName" /> </p>
        <p>email: <form:input path="email" /> </p>
        <p>password: <form:input path="password" /> </p>
        <form:select multiple="true" path="roles" items="${rolesList}" itemLabel="name" itemValue="id" />
        <input type="submit">
    </form:form>
</body>
</html>
