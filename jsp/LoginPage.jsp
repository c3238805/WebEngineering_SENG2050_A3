<jsp:useBean id="newLogin" class = "pkg.User" scope="session"/>
<!DOCTYPE html>
<html>
	<head>
		<link href="/A3/css/style.css" rel = "stylesheet"/>
		<title>IT Reporting system sign in page</title>		<!--check with team later-->
	</head>
	<body>
		<h2>Sign in</h2>
		<p><c:out>${errorLogin}</c:out></p> 
		<p><c:out>${errorRegister}</c:out></p>
		<form action=Main method=POST >
			<label for="username">username:</label>
			<input type="text" id="username" name="username"><br><br>

			<label for="password">password:</label>
			<input type="text" id="password" name="password"><br><br>

			<button type="submit">Login</button>
			<a href="/A3/jsp/Register.jsp">Register here</a>
		</form><br>
	<div id="Topright" >	
		<a href="/A3/IT">IT Login</a>
	</div>

	</body>
</html>
