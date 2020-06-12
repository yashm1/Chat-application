<%@page import="java.io.FileReader"%>
<%@page import="java.io.BufferedReader"%>
<%@page import="java.io.File"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link rel="stylesheet" href="Style/style.css">
        <title>VChat</title>
</head>
<body>
        <div class="colorcontainer"></div>
        <div class="formcontainer">
                <div class="heading" align="center">VChat</div>
                <div class="formheading">Welcome!</div>
                <p>Please enter username and password.</p>
                <form name="signupform" action="login" method="post">
                    <input type="text" id="username" name="username" required placeholder="Username">
                        <input type="password" id="password" name="password" required placeholder="Password">
                        <div class="buttoncontainer">
                                <button type="submit" class="signinbutton" name="choice" value="signin">
                                        <div class="btntxt">Sign in</div>
                                </button>
                            <button type="submit" class="signupbutton" name="choice" value="signup">
                                        <div class="btntxt">Sign up</div>
                                </button>
                        </div>
                </form>
        </div>
        <div class="foot">Welcome to the official VChat web-client.</div>
</body>
</html>
