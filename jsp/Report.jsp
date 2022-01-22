<jsp:useBean id="newLogin" class = "pkg.User" scope="session"/>
<!DOCTYPE html>
<html>
	<head>
		<link href="/A3/css/style.css" rel = "stylesheet"/>
		<title>Report an Issue</title>
	</head>
	<body>
		<h2>Report an issue</h2>
		<p>UserName : <c:out>${username}</c:out></p>
		<form action=Main method=POST>
            <button name=LogOut value=LogOut >Log Out</button>
        </form><br>
		
		
		<div class=box>
			<form action="ReportIssue" method=POST>
				<div>
				<label for="Category">Which best describes your issue:</label>

				<select name="Category" id="Category">
					<option value="Network">Network</option>
					<option value="Software">Software</option>
					<option value="Hardware">Hardware</option>
					<option value="Email">Email</option>
					<option value="Account">Account</option>
				</select>

				<br>
				<p>Select only for network issue:
				<select name="Network" id="Network">
					<option value="CantConnect">Can not connect </option>
					<option value="Speed">Speed</option>
					<option value="Constantdropouts">Constant dropouts</option>
					<option value="NA">Not applicable</option>
				</select>
				</p>


				<p>Select only for Software issue:
				<select name="Software" id="Software">
					<option value="Slowtoload">Slow to load </option>
					<option value="WontLoadatAll">Does not load at all</option>
					<option value="NA">Not applicable</option>
				</select>
				</p>

				<p>Select only for Hardware issue:
				<select name="Hardware" id="Hardware">
					<option value="Computerwontturnon">Computer won not turn on</option>
					<option value="Computerbluescreens”">Computer Blue screens</option>
					<option value="Diskdrive">Disk drive</option>
					<option value="Peripherals">Peripherals</option>
					<option value="NA">Not applicable</option>
				</select>
				</p>

				<p>Select only for Email issue:
				<select name="Email" id="Email">
					<option value="Cantsend">Can not send</option>
					<option value="Cantrecieve">Can not recieve</option>
					<option value="Spamphishing">Spam/Phishing</option>
					<option value="NA">Not applicable</option>
				</select>
				</p>

				<p>Select only for Account issue:
				<select name="Account" id="Account">
					<option value="Passwordreset">Password reset</option>
					<option value="Wrongdetails">Wrong details</option>
					<option value="NA">Not applicable</option>
				</select>
				</div>
				</p>

				<div class="field">
				<label for="Description">Description of the problem (Max. 1000 words)</label><br>
					<textarea id="Description" name="Description" rows="4" cols="50" placeholder=" Please elaborate on the problem.">
					</textarea>
				</div>

				<div class="buttons">
					<input type="submit" value="submit" class="button" />
				</div><br>

				<div class="buttons">
					<input type="reset" value="Reset form">
				</div><br>	
			</form>	
		</div>

	</body>
</html>