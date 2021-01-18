<%@page pageEncoding="UTF-8" contentType="text/html; charset=UTF-8" language="java"%>
<html lang="pl">
<head>
    <meta charset="utf-8"> 
<title>Kino Horyzontów (Menager) </title>
<link rel="stylesheet" href="../css/style.css">
<link rel="preconnect" href="https://fonts.gstatic.com">
<link href="https://fonts.googleapis.com/css2?family=Roboto:wght@400;500&display=swap" rel="stylesheet"> 
<link rel="preconnect" href="https://fonts.gstatic.com">
<link href="https://fonts.googleapis.com/css2?family=Sen&display=swap" rel="stylesheet"> 
</head>

<body>
    <header>
        <h1 id="mainHeader">Kino Horyzontów</h1>
    </header>
    
    <div class= "panelMode">
        <h4 id = "panelName">Panel menadżera</h5>
        <p id = "panelDane">Wypisywanie danych menago</p>
    </div>
    <div class ="menu">    
        <ul id="menuMenager">
        <li><a href="seansMenagment.jsp">Zarządzanie seansami</a></li>
        <li><a href="pracownicyManagment.jsp">Zarządzanie pracownikami</a></li>
        <li><a href="filmyManagment.jsp">Zarządzanie filmami</a></li>
        <li><a href="rezerwacjeMenagment.jsp">Zarządzanie rezerwacjami</a></li>
        </ul>

        <ul id="menuMenager2">
            <li><a href="przegladRachunkow.jsp">Przegląd rachunków</a></li>
            </ul>
   

    </div>

    <div class ="login">
           <p id="loginBtn"><a href="http://localhost:8080/JavaWebApplication/jsp/Guest/index.jsp">Wyloguj</a></p> 

    </div>

    <div class ="pracownikForm">
        <p>Film</p>

        <form id="pracownikForm" action="..\DodajFilm" method="post"> 
            <label for="filmTitle">Tytuł</label>
            <input type="text" name="filmTitle" required/><br/>
            <label for="director">Reżyser</label>
            <input type="text" name="director" required/><br/>
            <label for="duration">Czas trwania</label>
            <input type="text" name="duration" required/><br/>
            <label for="gatunek">Gatunek</label>

            <select name="gatunek" id="gatunek" required>
                    <option value ="Dramat">Dramat</option>
            </select>
            <label for="pegi">Pegi</label>

            <select name="pegi" id="pegi" required>
                    <option value ="12+">12+</option>
            </select>

            <label for="cast">Obsada</label>
            <input type="text" name="cast"/><br/>     


            <input type="submit" value="Dodaj"/>  
        </form>  

        <form id="cancelBtn" method="get" action="filmyManagment.jsp">
            <button type="submit">Anuluj</button>
        </form>
        

    </div>

</body>
</html>