
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import="java.lang.*" %>
<%@ taglib prefix="template" tagdir="/WEB-INF/tags/responsive/template" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="template" tagdir="/WEB-INF/tags/responsive/template"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="formElement" tagdir="/WEB-INF/tags/responsive/formElement" %>



<template:page pageTitle="${pageTitle}">

<div class="row">
        <div class="col-sm-6 col-sm-push-6">
            <div class="accountActions">
                <form:form action="updateCadburry" method="get">
            	    <button type="submit" class="btn btn-primary btn-block">
 <spring:theme code="Update Product" text="Update Product"/>
                    </button>
                </form:form>
            </div>
        </div>
        <div class="col-sm-6 col-sm-pull-6">
            <div class="accountActions">
                <form:form action="create-cadburry" method="get">
            	    <button type="submit" class="btn btn-primary btn-block">
 <spring:theme code="create-cadburry" text="Create Cadburry"/>
                    </button>
                </form:form>
            </div>
        </div>
    </div>

<br>

<c:if test="${not empty  cadburryData}">
<table>
	<tr>
		<th><spring:theme code="qty"/></th>
		<th><spring:theme code="price"/></th>
		<th><spring:theme code="products"/></th>

		<th></th>
	</tr>
	<c:forEach items="${cadburryData}" var="cadburryData">
	<tr>
		<td>${cadburryData.qty}</td>
		<td>${cadburryData.price}</td>
		<td>${cadburryData.products}</td>
		<td>
		    <form:form action="deleteproduct/${cadburryData.products}" method="post">
		        <button type="submit" class="btn btn-danger btn-block">
                    <spring:theme code="Delete" text="Delete"/>
                </button>
            </form:form>
		</td>
	</tr>
	</c:forEach>
</table>
</c:if>
</template:page>