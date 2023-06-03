
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import="java.lang.*" %>
<%@ taglib prefix="template" tagdir="/WEB-INF/tags/responsive/template" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>

 <template:page pageTitle="${pageTitle}">
<c:if test="${not empty cadburryData}">
<table>
   <tr>
    <th><spring:theme code="myshoestore.cadburry.qty"/></th>
    <th><spring:theme code="myshoestore.cadburry.price"/></th>
   <th><spring:theme code="myshoestore.cadburry.products"/></th>
           </tr>
<c:forEach items="${cadburryData}" var="cadburryData">
<tr>
<td>${cadburryData.qty}</td>
<td>${cadburryData.price}</td>
<td>${cadburryData.products}</td>
</tr>
</c:forEach>
</table>
</c:if>
</template:page>