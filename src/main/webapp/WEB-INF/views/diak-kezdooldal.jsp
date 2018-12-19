<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
    <jsp:include page="alap/head.jsp"/>
    <body>
        <jsp:include page="alap/fejlec.jsp">
            <jsp:param name="felhasznaloTipus" value="'TANULO'"></jsp:param>
        </jsp:include>
        <main>
            <link rel="stylesheet" href="/css/jegy-lista.css">

            <h4>Jegyek</h4>
            <table id="jegy-lista">
                <thead>
                    <tr class="lista-elem">
                        <th>Időpont</th>
                        <th>Tantárgy</th>
                        <th>Oktató</th>
                        <th>Érdemjegy</th>
                    </tr>
                </thead>
                <tbody>
                <c:forEach items="${jegybeirasok}" var="jegy">
                    <tr class="lista-elem">
                        <td>${jegy.idopont}</td>
                        <td>${jegy.tantargy.nev}</td>
                        <td>${jegy.oktato.nev}</td>
                        <td>${jegy.erdemjegy}</td>
                    </tr>
                </c:forEach>
                </tbody>
            </table>
            <p>Átlag: <c:out value="${átlag}"></c:out></p>
        </main>
    </body>
</html>
