<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
    <jsp:include page="alap/head.jsp"/>
    <body>
        <link rel="stylesheet" href="/css/kezdooldal.css">
        <header id="header">
            <p>E-IN</p>
            <span>Az elektronikus iskolanapló</span>
        </header>

        <form:form id="loginform" method="POST" action="/regisztracio" modelAttribute="felhasznalo">
            <div class="form-elem">
                <form:label path="nev">Név</form:label>
                <form:input path="nev" type="text" required="required"/>
            </div>
            <div class="form-elem">
                <form:label path="felhasznaloNev">Felhasználónév</form:label>
                <form:input path="felhasznaloNev" type="text" required="required"/>
            </div>
            <div class="form-elem">
                <form:label path="jelszo">Jelszó</form:label>
                <form:input path="jelszo" type="text" required="required"/>
            </div>
            <div class="form-elem">
                <form:label path="tipus">Oktató / Tanuló</form:label>
                <form:select path="tipus" items="${tipusok}"/>
            </div>
            <button type="submit" class="gomb">REGISZTRÁCIÓ</button>
        </form:form>
    </body>
</html>
