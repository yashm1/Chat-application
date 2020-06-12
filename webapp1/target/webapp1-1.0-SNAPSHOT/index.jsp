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
                <div class="formheading">Sign in</div>
                <p>Please enter your phone number</p>
                <form name="signupform" action="" method="post">
                        <input type="text" class="form-control" id="mobilenumber" name="mobile" required placeholder="Phone number">
                        <button type="submit" class="signupbutton">
                                <div class="btntxt">Next</div>
                        </button>
                </form>
        </div>
        <div class="foot">Welcome to the official VChat web-client.</div>
</body>
</html>
