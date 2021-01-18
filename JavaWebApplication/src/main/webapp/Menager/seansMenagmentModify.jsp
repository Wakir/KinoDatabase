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

    <div class="pracownikForm">
        <p>Seanse</p>

        <form id="pracownikForm" action="..\DodajSeans" method="post"> 
            <select name="film" id="film" required>
                <option value ="film1">film1</option>
            </select>
            
            <select name="opiekun" id="opiekun" required>
                <option value ="Andrzej">Andrzej</option>
            </select>

            <select name="sala" id="sala" required>
                    <option value ="duza">duza</option>
            </select>   

            <label for="date">Data</label>
            <input type="date" name="date" required/><br/>
           
            <label for="time">Czas</label>
            <input type="time" name="time" value="21:37"required/><br/>

            <label for="czasTrwania">Czas trwania</label>
            <input type="text" name="czasTrwania" value="dluuuugo" required/><br/>
            
            <label for="napisy">Napisy</label>
            <select name="napisy" id="napisy" required>
                <option value ="1">TAK</option>
                <option value ="0">NIE</option>
            </select>

            <label for="jezyk">Język</label>
            <select name="jezyk" id="jezyk" required>
                <option value ="polski">Polski</option>
                <option value ="niemiecki">Niemiecki</option>
                <option value ="java">java</option>
            </select>

            <input type="submit" value="Modyfikuj"/>  
        </form>  

        <form id="cancelBtn" method="get" action="seansMenagment.jsp">
            <button type="submit">Anuluj</button>
        </form>
        

    </div>

</body>
</html>