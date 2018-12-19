<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
    <jsp:include page="alap/head.jsp"/>
    <body>
        <jsp:include page="alap/fejlec.jsp"/>
        <main>
            <a class="panel" href="/oktato/jegybeiras/">
                <strong>Beírt jegyek száma</strong>
                <span>${jegybeirasok}</span>
            </a>

            <a class="panel" href="/oktato/tanorak/">
                <strong>Következő tanóra</strong>
                <span>${tanora.idopont}</span>
                <span>${tanora.tantargy.nev}</span>
                <span>${tanora.tanterem}</span>
                <span>${tanora.osztaly}</span>
            </a>
        </main>
    </body>
</html>
