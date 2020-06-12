
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
 <% 
            if(session.getAttribute("username")==null)
            {
                response.sendRedirect("index.jsp");
            }
        
  %>
<html>
<!--    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Welcome</title>
    </head>
    <body>
       
        <center><h1>Welcome User!</h1></center>
       <div>
            <a href="logout.jsp"><h1>logout</h1></a>
        </div>
    </body>-->
    <%String uname=(String)session.getAttribute("username"); %>

    <head>
        <link rel="stylesheet" type="text/css" href="styles.css">
      <script type="text/javascript" src="check.js"></script>
        <title>The Chat Room</title>
    <link rel="shortcut icon" href="icon.jpeg" />
    <script>
     setInterval(reloaddata,3000);
    </script>
    </head>

    <body>
        <p id="result"></p>
        Welcome, <%=uname%>
        <div align="right"><a href="logout.jsp" >logout</a></div>
        <div id="list">
            <div id="content">
            </div>
            <input style="display: none" type="text" id="u" value="<%=uname%>">
            <textarea id='h' style="width: 100%; height: 10%;"></textarea>
            <input type="button" value="send"  onclick="addText()" />
        </div>
    </body>
</html>
