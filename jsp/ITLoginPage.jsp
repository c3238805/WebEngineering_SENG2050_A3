<jsp:useBean id="newLogin" class = "pkg.User" scope="session"/>
<!DOCTYPE html>
<html>
	<head>
		<link href="/A3/css/style.css" rel = "stylesheet"/>
		<title>itservices IT sign in page</title>		<!--check with team later-->
	</head>
	<body>
		<h2>IT Staff Sign in</h2>
		<p><c:out>${errorLogin}</c:out></p> 
		<p><c:out>${errorRegister}</c:out></p>
		<form action=IT method=POST >
			<label for="itusername">username:</label>
			<input type="text" id="itusername" name="itusername"><br><br>

			<label for="itpassword">password:</label>
			<input type="text" id="itpassword" name="itpassword"><br><br>

			<button type="submit" name=itLogin value=itLogin >Login</button>
			<a href="/A3/jsp/itRegister.jsp">IT Register here</a>
		</form><br>


	</body>
</html>