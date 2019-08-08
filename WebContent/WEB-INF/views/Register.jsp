<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form:form action="saveCompany"  method="POST"  modelAttribute="company">
<form:input path="companyName"/>
<form:input path="turnover"/>
<form:input path="ceo"/>
<form:input path="boardOfDirectors"/>
<form:input path="sectorId"/>
<form:input path="breifWriteUp"/>
<form:input path="stockCode"/>
</form:form>
</body>
</html>