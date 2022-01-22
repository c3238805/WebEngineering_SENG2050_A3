<jsp:useBean id="newLogin" class = "pkg.User" scope="session"/>
<!DOCTYPE html>
<html>
    <head>
        <title>Main Page </title>
        <link href="/A3/css/style.css" rel = "stylesheet"/>
    </head>

    <body>
        <h1>MainPage</h1>
        <p>UserName : <c:out>${username}</c:out></p>  
        <p>Password : <c:out>${password}</c:out></p>  

        <form action=Main method=POST>
            <button name=LogOut value=LogOut >Log Out</button>
        </form><br>

        <form action=Main method=POST>
            <button name=ReportIssue value=ReportIssue >
                Report an Issue<br>
                Experiencing a problem ? Report it here
            </button>
        </form><br>

        <form action=Main method=POST>
            <button name=Search value=Search >
                Search Knowledge<br>
                Search our Knowledge base and find answers
            </button>
        </form>
        


    </body>

</html>