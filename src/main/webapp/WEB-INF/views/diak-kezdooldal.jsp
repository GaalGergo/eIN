<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
    <jsp:include page="alap/head.jsp"/>
    <body>
        <jsp:include page="alap/fejlec.jsp">
            <jsp:param name="felhasznaloTipus" value="'TANULO'"></jsp:param>
        </jsp:include>
        <main>
            <h4>Jegyek</h4>
            <table id="diak-jegy-lista">
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

            <h4>Átlagok</h4>
            <table id="atlagok">
                <thead>
                    <tr class="lista-elem">
                        <th>Tantárgy</th>
                        <th>Átlag</th>
                    </tr>
                </thead>
                <tbody>
                <c:forEach items="${átlagok}" var="átlag">
                    <tr class="lista-elem">
                        <td>${átlag.key}</td>
                        <td class="${átlag.value < 2.0 ? 'piros-betu': ''}">
                            <fmt:formatNumber type="number" maxFractionDigits="2" value="${átlag.value}" />
                        </td>
                    </tr>
                </c:forEach>
                </tbody>
            </table>
        </main>
    </body>
</html>
