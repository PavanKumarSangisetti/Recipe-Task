
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
                <form:form action="update-employee" method="get">
            	    <button type="submit" class="btn btn-primary btn-block">
                        <spring:theme code="Update Employee" text="Update Employee"/>
                    </button>
                </form:form>
            </div>
        </div>
        <div class="col-sm-6 col-sm-pull-6">
            <div class="accountActions">
                <form:form action="create-employee" method="get">
            	    <button type="submit" class="btn btn-primary btn-block">
                        <spring:theme code="Create Employee" text="Create Employee"/>
                    </button>
                </form:form>
            </div>
        </div>
    </div>

<br>

<c:if test="${not empty  myEmployeeData}">
<table>
	<tr>
		<th><spring:theme code="Id"/></th>
		<th><spring:theme code="Name"/></th>
		<th><spring:theme code="Salary"/></th>
		<th><spring:theme code="Work Type"/></th>
		<th><spring:theme code="Annual Pay"/></th>
		<th></th>
	</tr>
	<c:forEach items="${myEmployeeData}" var="myEmployeeData">
	<tr>
		<td>${myEmployeeData.empId}</td>
		<td>${myEmployeeData.empName}</td>
		<td>${myEmployeeData.empSalary}</td>
		<td>${myEmployeeData.empWorkType}</td>
		<td>${myEmployeeData.empAnnualPay}</td>
		<td>
		    <form:form action="delete-employee/${myEmployeeData.empId}" method="post">
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