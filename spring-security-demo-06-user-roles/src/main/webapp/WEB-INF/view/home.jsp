<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="security" uri="http://www.springframework.org/security/tags" %>
<!DOCTYPE html>
<html>
<head>
	<title>Pradeep's Company Home Page</title>
</head>
<body>
	<h2>Pradeep's Company Home Page</h2>
	<hr>
	
	Welcome to the pradeep's company home page!
	
	<br><br>
	
	<hr>
	
	<!-- display user name and role -->
	
	<p>
		User: <security:authentication property="principal.username"/>
		<br><br>
		Role(s):<security:authentication property="principal.authorities"/>
	</p>
	<hr>
	
	
	<form:form action="${pageContext.request.contextPath}/logout"
				method="POST">
		<input type="submit" value="Logout">
	</form:form>
</body>
</html>