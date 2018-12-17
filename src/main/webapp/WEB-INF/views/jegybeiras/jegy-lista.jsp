<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
    <jsp:include page="../alap/head.jsp"/>
    <body>
        <jsp:include page="../alap/fejlec.jsp"/>
        <link rel="stylesheet" href="/css/jegy-lista.css">

        <main>
            <a id="uj" class="gomb" href="/oktato/jegybeiras/szerkeszt">Új</a>
            <table id="jegy-lista">
                <thead>
                    <tr class="lista-elem">
                        <th>Időpont</th>
                        <th>Tanuló</th>
                        <th>Tantárgy</th>
                        <th>Oktató</th>
                        <th>Érdemjegy</th>
                        <th></th>
                        <th></th>
                    </tr>
                </thead>
                <tbody>
                    <c:forEach items="${jegyek}" var="jegy">
                        <tr class="lista-elem">
                            <td>${jegy.idopont}</td>
                            <td>${jegy.tanulo.nev}</td>
                            <td>${jegy.tantargy.nev}</td>
                            <td>${jegy.oktato.nev}</td>
                            <td>${jegy.erdemjegy}</td>
                            <td>
                                <form method="POST" action="/oktato/jegybeiras/torol">
                                    <input type="hidden" name="azon" value="${jegy.azon}">
                                    <button class="gomb piros">Törlés</button>
                                </form>
                            </td>
                            <td>
                                <form method="GET" action="/oktato/jegybeiras/szerkeszt">
                                    <input type="hidden" name="azon" value="${jegy.azon}">
                                    <button class="gomb">Szerkeszt</button>
                                </form>
                            </td>
                        </tr>
                    </c:forEach>
                </tbody>
            </table>
        </main>
    </body>
</html>
