<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="j" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
	<title>Import Stock</title>
	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/css/bootstrap.min.css">

	<!-- jQuery library -->
	<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>

	<!-- Latest compiled JavaScript -->
	<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/js/bootstrap.min.js"></script>
	<link rel="stylesheet" type="text/css" href="mystyle.css">
	<style><%@include file="/WEB-INF/views/css/mystyle.css"%></style>
	<meta name="viewport" content="width=device-width, initial-scale=1">
	</head>
	
	<body>
		<div class="header">
			<a href="#default" class="logo">StockExchange</a>
			<div class="header-right">
				<a class="active" href="#home">Logout</a>
			</div>
		</div>
		
		<br>
		<br>
		<main>

  <input id="tab1" type="radio" name="tabs" checked>
  <label for="tab1">ImportData</label>

  <input id="tab2" type="radio" name="tabs">
  <label for="tab2">Manage Company</label>

  <input id="tab3" type="radio" name="tabs">
  <label for="tab3">Manage Exchange</label>

  <input id="tab4" type="radio" name="tabs">
  <label for="tab4">Update IPO Details</label>

  <section id="content1">
    <h2>Import Excel</h2>
	<hr/>
	<h3>Select Excel file to be Uploaded</h3>
	<br>
	<br>
	<form action="">
	<input type="file"  name="fileChoose"/>
	<br>
	<br>
	
	<input type="submit" value="submit" name="choose"/>
	</form>
	<br>
	<br>
	<a>Click here to download sample excel file</a>
  </section>

  <section id="content2">

    <ul class="nav nav-tabs" id="myTab" role="tablist">
  <li class="nav-item">
    <a class="nav-link active" id="home-tab" data-toggle="tab" href="#home" role="tab" aria-controls="home" aria-selected="true">Add Company</a>
  </li>
  <li class="nav-item">
    <a class="nav-link" id="profile-tab" data-toggle="tab" href="#profile" role="tab" aria-controls="profile" aria-selected="false">Update Company</a>
  </li>
</ul>

<div class="tab-content">
  <div class="tab-pane active" id="home" role="tabpanel" aria-labelledby="home-tab">
	<h3>Create New Company</h3>
	<hr/>
	
	<form:form action="saveCompany"  method="POST"  modelAttribute="company">
	<div class="container-fluid"> <!-- If Needed Left and Right Padding in 'md' and 'lg' screen means use container class -->
            <div class="row" class="i-am-centered">
                <div style="text-align:right" class="col-xs-6 col-sm-6 col-md-6 col-lg-6">
                   <p id="pid">CompanyName:</p>
					<p id="pid">turnover</p>
					<p id="pid">ceo:</p>
					<p id="pid">boardofdirector:</p>
					<p id="pid">sector id:</p>
					<p id="pid">Breif:</p>
					<p id="pid">Stock Code:</p>
				   
				   
                </div>
            <div style="text-align:left" class="col-xs-6 col-sm-6 col-md-6 col-lg-6">
				
				<form:input  path="companyName" /><br><br>
				<form:input  path="turnover" /><br><br>
				<form:input  path="ceo" /><br><br>
				<form:input  path="boardOfDirectors" /><br><br>
				<form:input  path="sectorId" /><br><br>
				<form:input  path="breifWriteUp" /><br><br>
				<form:input  path="stockCode" /><br><br>
				<br><br>
				<input type="submit" value="Submit"/>
                </div>
            </div>
        </div>
		</form:form>

  </div>
  <div class="tab-pane" id="profile" role="tabpanel" aria-labelledby="profile-tab">
	<h3>List of Company</h3>
	<hr/>
	<table class="table table-hover table-dark">
  <thead>
    <tr>
      <th scope="col">Company Name</th>
      <th scope="col">CEO,BOD</th>
      <th scope="col">Breif</th>
	  <th scope="col">Update</th>
    </tr>
  </thead>
  <tbody>
  <j:forEach var="c" items="${list}">
    <tr>
      <td>${c.companyName}</td>
      <td>${c.ceo}</td>
      <td>${c.breifWriteUp}</td>
	  <td>${c.stockCode}</td>
    </tr>
	</j:forEach>
  </tbody>
</table>
  </div>
</div>

<script>
  $(function () {
    $('#myTab li:last-child a').tab('show')
  })
</script>
	
  </section>

  <section id="content3">
   <ul class="nav nav-tabs" id="myTab" role="tablist">
 
  <li class="nav-item">
    <a class="nav-link" id="messages-tab" data-toggle="tab" href="#messages" role="tab" aria-controls="messages" aria-selected="false">Add Stock Details</a>
  </li>
  <li class="nav-item">
    <a class="nav-link" id="settings-tab" data-toggle="tab" href="#settings" role="tab" aria-controls="settings" aria-selected="false">List All Stock</a>
  </li>
</ul>

<div class="tab-content">
 <div class="tab-pane" id="messages" role="tabpanel" aria-labelledby="messages-tab">
	<h3>Register New Stock</h3>
	<hr/>
	
	
	<form:form action="saveStock"  method="POST"  modelAttribute="stock">
	<div class="container-fluid"> 
            <div class="row" class="i-am-centered">
                <div style="text-align:right" class="col-xs-6 col-sm-6 col-md-6 col-lg-6">
                   <p id="pid">Stock Name:</p>
					<p id="pid">Contract Address:</p>
					<p id="pid">Brief:</p>
					<p id="pid">Remarks:</p>
				   
				   
                </div>
            <div style="text-align:left" class="col-xs-6 col-sm-6 col-md-6 col-lg-6">
				
				<form:input path="stockName" name="sname" placeholder="StockName"/><br><br>
				<form:input path="contactAddress" name="conadd" placeholder="Stock Exchange Name"/><br><br>
				<form:input path="brief" name="sBrief" placeholder="Breif"/><br><br>
				<form:input path="remarks" name="sremarks" placeholder="Remarks"/><br><br>
				<br><br>
				<input type="submit" value="Submit"/>
                </div>
            </div>
        </div>
		</form:form>
	
	
	
	

  </div>
   <div class="tab-pane" id="settings" role="tabpanel" aria-labelledby="settings-tab">
	<h3>List all Stock</h3>
	<hr/>
	<table class="table table-hover table-dark">
  <thead>
   
    <tr>
      <th scope="col">StockName</th>
      <th scope="col">Contact Address</th>
      <th scope="col">Brief</th>
	  <th scope="col">Remarks</th>
    </tr>
   
  </thead>
  
  <tbody>
  <j:forEach var="k" items="${stockList}">
    <tr>
      <td>${k.stockName}</td>
      <td>${k.contactAddress}</td>
      <td>${k.brief}</td>
      <td>${k.remarks}</td>
    </tr>
     </j:forEach>
  </tbody>
</table>
  </div>
</div>

<script>
  $(function () {
    $('#myTab1 li:last-child a').tab('show')
  })
</script>
  </section>

  <section id="content4">
  <h3>Add IPO Plan</h3>
	<hr/>

	<form id="ipoform">
	<div class="container-fluid"> <!-- If Needed Left and Right Padding in 'md' and 'lg' screen means use container class -->
            <div class="row" class="i-am-centered">
                <div style="text-align:right" class="col-xs-6 col-sm-6 col-md-6 col-lg-6">
                   <p id="pid">Company code:</p>
					<p id="pid">Stock exchange Name:</p>
					<p id="pid">Price pershare:</p>
					<p id="pid">Total no of shares:</p>
					<p id="pid">Open date time:</p>
					<p id="pid">Remarks:</p>
				   
				   
                </div>
            <div style="text-align:left" class="col-xs-6 col-sm-6 col-md-6 col-lg-6">
				
				<input type="text" name="IPO_Name" placeholder="StockName"/><br><br>
				<input type="text" name="IPO_Add" placeholder="Stock Exchange Name"/><br><br>
				<input type="text" name="IPO_Price" placeholder="Price_per_share"/><br><br>
				<input type="text" name="IPO_Shares" placeholder="Total no of shares"/><br><br>
				<input type="text" name="IPO_Date" placeholder="Open date time"/><br><br>
				<input type="text" name="IPO_Remarks" placeholder="Remarks"/><br><br>
				<br><br>
				<input type="submit" value="Submit"/>
                </div>
            </div>
        </div>
		</form>
  </section>

</main>
	</body>
</html>