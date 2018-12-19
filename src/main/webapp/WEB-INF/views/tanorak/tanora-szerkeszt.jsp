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
            <form:form id="tanora" method="POST" action="/oktato/tanorak/szerkeszt" modelAttribute="tanora">
                <div class="form-elem">
                    <form:label path="tantargy.azon">Tantárgy</form:label>
                    <form:select path="tantargy.azon"
                                 items="${tantargyak}"
                                 itemValue="azon"
                                 itemLabel="nev"/>
                </div>
                <div class="form-elem">
                    <form:label path="tanterem">Tanterem</form:label>
                    <form:input path="tanterem" required="required"/>
                </div>
                <div class="form-elem">
                    <form:label path="osztaly">Osztály</form:label>
                    <form:input path="osztaly" required="required"/>
                </div>
                <div class="form-elem">
                    <form:label path="idopont">Időpont</form:label>
                    <form:input path="idopont" type="datetime" required="required"/>
                </div>

                <form:input type="hidden" path="azon"/>
                <button type="submit" class="gomb">MENTÉS</button>
            </form:form>
        </main>
    </body>
</html>
