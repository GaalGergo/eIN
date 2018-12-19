<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
    <jsp:include page="../alap/head.jsp"/>
    <body>
        <jsp:include page="../alap/fejlec.jsp">
            <jsp:param name="felhasznaloTipus" value="OKTATO"></jsp:param>
        </jsp:include>
        <main>
            <form:form id="jegybeiras" method="POST" action="/oktato/jegybeiras/szerkeszt" modelAttribute="jegy">
                <div class="form-elem">
                    <form:label path="tanuloId">Tanulo</form:label>
                    <form:select path="jegybeirasEntity.tanulo.azon"
                                 items="${tanulok}"
                                 itemValue="azon"
                                 itemLabel="nev"/>
                </div>
                <div class="form-elem">
                    <form:label path="tantargyId">Tantárgy</form:label>
                    <form:select path="jegybeirasEntity.tantargy.azon"
                                 items="${tantargyak}"
                                 itemValue="azon"
                                 itemLabel="nev"/>
                </div>
                <div class="form-elem">
                    <form:label path="jegybeirasEntity.erdemjegy">Érdemjegy</form:label>
                    <form:input path="jegybeirasEntity.erdemjegy"
                                type="number"
                                min="1"
                                max="5"
                                required="required"/>
                </div>
                <form:input type="hidden" path="jegybeirasEntity.azon"/>
                <button type="submit" class="gomb">MENTÉS</button>
            </form:form>
        </main>
    </body>
</html>
