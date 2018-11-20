<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
    <head>
        <title>E-IN</title>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="https://fonts.googleapis.com/css?family=Open+Sans:300,400,700" rel="stylesheet">
        <link href="https://fonts.googleapis.com/css?family=Anton" rel="stylesheet">
        <link rel="stylesheet" href="css/kezdooldal.css">
    </head>
    <body>
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
        </form>
    </body>
</html>
