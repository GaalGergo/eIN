<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<link rel="stylesheet" href="/css/fejlec.css">
<header>
    <div id="fejlec">
        <a href="/oktato">
            <p>E-IN</p>
            <span>Elektronikus iskolanapló</span>
        </a>
    </div>
    <div>
        <a class="gomb" href="/naptar">Naptár</a>
        <a class="gomb" href="/oktato/jegybeiras">Jegybeírás</a>
        <a class="gomb" href="/oktato/orafelvetel">Órafelvétel</a>
    </div>
    <sec:authorize access="isAuthenticated()">
        <a class="gomb" href="/logout">Kijelentkezés</a>
    </sec:authorize>
</header>
