<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import="java.lang.*" %>
<%@ taglib prefix="template" tagdir="/WEB-INF/tags/responsive/template" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>

 <template:page pageTitle="${pageTitle}">
<c:if test="${not empty IngredientsData}">
<table>
   <tr>
    <th><spring:theme code="myshoestore.ingredient.code"/></th>
    <th><spring:theme code="myshoestore.ingredient.title"/></th>
   <th><spring:theme code="myshoestore.ingredient.description"/></th>
   <th><spring:theme code="myshoestore.ingredient.name"/></th>
   <th><spring:theme code="myshoestore.ingredient.units"/></th>
   <th><spring:theme code="myshoestore.ingredient.quantity"/></th>
           </tr>
<c:forEach items="${IngredientsData}" var="IngredientsData">
<tr>
<td>${IngredientsData.code}</td>
<td>${IngredientsData.title}</td>
<td>${IngredientsData.description}</td>
</tr>
</c:forEach>
</table>
</c:if>
</template:page>