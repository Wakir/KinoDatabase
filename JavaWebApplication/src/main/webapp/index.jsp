<%@page pageEncoding="UTF-8" contentType="text/html; charset=UTF-8" language="java"%>
<html lang="pl">
<head>
    <meta charset="utf-8"> 
<title>Kino Horyzontów </title>
<link rel="stylesheet" href="css/style.css">
<link rel="preconnect" href="https://fonts.gstatic.com">
<link href="https://fonts.googleapis.com/css2?family=Roboto:wght@400;500&display=swap" rel="stylesheet"> 
<link rel="preconnect" href="https://fonts.gstatic.com">
<link href="https://fonts.googleapis.com/css2?family=Sen&display=swap" rel="stylesheet"> 
</head>

<body>

<%
	String email = (String)session.getAttribute("email");


%>


    <header>
        <h1 id="mainHeader">Kino Horyzontów</h1>
    </header>
    
    <div class= "panelMode">
        <h4 id = "panelName">Panel użytkownika</h5>
        <p id = "panelDane">Wypisywanie danych użytkownika</p>
    </div>
    <div class ="menu">    
        <ul id="menuGoscia">
        <li><a href="#">Repertuar</a></li>
        <li><a href="#">Cennik</a></li>
        <li><a href="#">Kontakt</a></li>
        </ul>

        <ul id="menuUser">
            <li><a href="#">Moje rezerwacje</a></li>
            </ul>

    </div>

    <div class ="login">
           <p id="loginBtn"><a href="pozostale/login.jsp">Zaloguj</a></p> 

    </div>

    <div class ="baner">
        <p>Pozdrawiam serdecznie z miejsca gdzie bedzie baner. </p>
    </div>

</body>
</html>
