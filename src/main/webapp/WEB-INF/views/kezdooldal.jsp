<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
    <jsp:include page="head.jsp"/>
    <body>
        <link rel="stylesheet" href="css/kezdooldal.css">
        <header id="header">
            <p>E-IN</p>
            <span>Az elektronikus iskolanapló</span>
        </header>

        <form id="loginform" method="POST" action="/login">
            <div class="form-elem">
                <label for="username">Felhasználónév</label>
                <input id="username" type="text" name="username">
            </div>
            <div class="form-elem">
                <label for="password">Jelszó</label>
                <input id="password" type="password" name="password">
            </div>
            <button type="submit">BEJELENTKEZÉS</button>
        </form>
    </body>
</html>
