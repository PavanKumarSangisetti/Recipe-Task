
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import="java.lang.*" %>
<%@ taglib prefix="template" tagdir="/WEB-INF/tags/responsive/template" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="template" tagdir="/WEB-INF/tags/responsive/template"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="cms" uri="http://hybris.com/tld/cmstags"%>
<%@ taglib prefix="formElement" tagdir="/WEB-INF/tags/responsive/formElement" %>

<template:page pageTitle="${pageTitle}">
<c:url value = "/update-employee"/>
<h1>Update Employee</h1>
<form:form action="update-employee" method="post" modelAttribute="employeeForm">
    <formElement:formInputBox idKey="employee.id" labelKey="Employee ID" path="empId" inputCSS="text" mandatory="true"/>
    <formElement:formInputBox idKey="employee.name" labelKey="Employee Name" path="empName" inputCSS="text" mandatory="true"/>
    <formElement:formInputBox idKey="employee.salary" labelKey="Employee Salary" path="empSalary" inputCSS="text" mandatory="true"/>
    <formElement:formInputBox idKey="employee.workType" labelKey="Employee WorkType" path="empWorkType" inputCSS="text" mandatory="true"/>

    <div class="row">
        <div class="col-sm-6 col-sm-push-6">
            <div class="accountActions">
                <button type="submit" class="btn btn-primary btn-block">
                    <spring:theme code="Update" text="Update"/>
                </button>
            </div>
        </div>
        <div class="col-sm-6 col-sm-pull-6">
            <div class="accountActions">
                <a href="https://localhost:9002/myShoeStore/en/myemployee/create-employee"
            	    <button type="button" method="get" class="btn btn-default btn-block backToHome">
                        <spring:theme code="Cancel" text="Cancel"/>
                    </button>
                </a>
            </div>
        </div>
    </div>
</form:form>
</template:page>