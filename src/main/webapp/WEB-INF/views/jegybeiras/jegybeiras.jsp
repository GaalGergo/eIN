<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
    <jsp:include page="../alap/head.jsp"/>
    <body>
        <jsp:include page="../alap/fejlec.jsp"/>
        <main>
            <form:form id="jegybeiras" method="POST" action="/oktato/jegybeiras" modelAttribute="jegy">
                <div class="form-elem">
                    <form:label path="tanuloId">Tanulo</form:label>
                    <form:select path="tanuloId" items="${tanulok}" itemValue="azon" itemLabel="nev"/>
                </div>
                <div class="form-elem">
                    <form:label path="tantargyId">Tantárgy</form:label>
                    <form:select path="tantargyId" items="${tantargyak}" itemValue="azon" itemLabel="nev"/>
                </div>
                <div class="form-elem">
                    <form:label path="jegybeirasEntity.erdemjegy">Érdemjegy</form:label>
                    <form:input path="jegybeirasEntity.erdemjegy" type="number" required="required"/>
                </div>
                <button type="submit">MENTÉS</button>
            </form:form>
        </main>
    </body>
</html>
