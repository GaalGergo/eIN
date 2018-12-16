<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<link rel="stylesheet" href="css/fejlec.css">
<header>
    <div id="fejlec">
        <p>E-IN</p>
        <span>Elektronikus iskolanapló</span>
    </div>
    <sec:authorize access="isAuthenticated()">
        <a id="kijelentkezes" href="/logout">Kijelentkezés</a>
    </sec:authorize>
</header>
