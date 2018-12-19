<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
    <jsp:include page="../alap/head.jsp"/>
    <body>
        <jsp:include page="../alap/fejlec.jsp">
            <jsp:param name="felhasznaloTipus" value="OKTATO"></jsp:param>
        </jsp:include>
        <link rel="stylesheet" href="/css/jegy-lista.css">

        <main>
            <table id="jegy-lista">
                <thead>
                <tr class="lista-elem">
                    <th>Időpont</th>
                    <th>Tantárgy</th>
                    <th>Tanterem</th>
                    <th>Osztály</th>
                    <th></th>
                    <th></th>
                </tr>
                </thead>
                <tbody>
                <c:forEach items="${tanorak}" var="tanora">
                    <tr class="lista-elem">
                        <td>${tanora.idopont}</td>
                        <td>${tanora.tantargy.nev}</td>
                        <td>${tanora.tanterem}</td>
                        <td>${tanora.osztaly}</td>
                        <td>
                            <form method="POST" action="/oktato/tanorak/torol">
                                <input type="hidden" name="azon" value="${tanora.azon}">
                                <button class="gomb piros">Törlés</button>
                            </form>
                        </td>
                        <td>
                            <form method="GET" action="/oktato/tanorak/szerkeszt">
                                <input type="hidden" name="azon" value="${tanora.azon}">
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
