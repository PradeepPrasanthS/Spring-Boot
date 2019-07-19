<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
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
	
	<form:form action="${pageContext.request.contextPath}/logout"
				method="POST">
		<input type="submit" value="Logout">
	</form:form>
</body>
</html>