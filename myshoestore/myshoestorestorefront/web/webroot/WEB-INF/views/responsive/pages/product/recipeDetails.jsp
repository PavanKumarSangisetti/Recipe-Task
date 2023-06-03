<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import="java.lang.*" %>
<%@ taglib prefix="template" tagdir="/WEB-INF/tags/responsive/template" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>

 <template:page pageTitle="${pageTitle}">
<c:if test="${not empty recipeData}">
<table>
   <tr>
    <th><spring:theme code="myshoestore.recipe.code"/></th>
    <th><spring:theme code="myshoestore.recipe.title"/></th>
   <th><spring:theme code="myshoestore.recipe.description"/></th>
           </tr>
<c:forEach items="${recipeData}" var="recipeData">
<tr>
<td>${recipeData.code}</td>
<td>${recipeData.title}</td>
<td>${recipeData.description}</td>
</tr>
</c:forEach>
</table>
</c:if>
</template:page>