<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
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
        <c:if test="${param.felhasznaloTipus == 'OKTATO'}">
        <a class="gomb" href="/oktato/jegybeiras">Jegybeírás</a>
        </c:if>
        <a class="gomb" href="/oktato/tanorak">Tanórák</a>
    </div>
    <sec:authorize access="isAuthenticated()">
        <a class="gomb" href="/logout">Kijelentkezés</a>
    </sec:authorize>
</header>
