<%@ page import="java.util.ArrayList" %>
<%@ page import="com.quizzio.model.entities.User" %>
<%@ page import="java.util.List" %><%
    ArrayList<User> leaderboard = (ArrayList<User>) request.getAttribute("sessionResults");
%>
<!doctype html>
<html>
<head>
    <meta charset="utf-8">
    <title>Classement</title>
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link href="http://netdna.bootstrapcdn.com/bootstrap/3.2.0/css/bootstrap.min.css" rel="stylesheet">
    <script src="http://code.jquery.com/jquery-1.11.1.min.js"></script>
    <script src="http://netdna.bootstrapcdn.com/bootstrap/3.2.0/js/bootstrap.min.js"></script>
    <link rel="stylesheet" href="../static/css/ranking.css">
</head>
<body>
<div class='leaderboard'>
    <h1><span>Classement</span></h1>
    <div class="content">
        <ul>
            <%for (User u : leaderboard){ %>
            <li>
                <span class="name"><%= u.getUsername()%></span>
                <span class="count"><%= u.getPoint()%></span>
            </li>
            <% }%>
        </ul>
    </div>
</div>

<div class="content-button">
    <input class="btn btn-lg btn-danger btn-block" type="submit" id="login" onclick="document.location.href='http://localhost:8082/';" value="Accueil">
</div>

</body>
</html>
