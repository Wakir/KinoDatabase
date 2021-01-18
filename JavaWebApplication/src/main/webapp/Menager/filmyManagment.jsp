
<%@page import="../Film"%>
<%@page import="java.util.ArrayList"%> 
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

            <ul id="menuMenager3">
                <li><a href="filmyManagmentAdd.jsp">Dodaj film</a></li>
                <li><a href="filmyManagmentModify.jsp">Modyfikuj dane filmu</a></li>
                <li><a href="filmyManagmentDelete.jsp">Usuń film</a></li>
                </ul>     

    </div>

    <div class ="login">
           <p id="loginBtn"><a href="http://localhost:8080/JavaWebApplication/jsp/Guest/index.jsp">Wyloguj</a></p> 

    </div>

    <div class ="tabela">
        <p>Filmy</p>

        <table border="1">
            <tr>
            <td>Nazwa</td>
            <td>Reżyser</td>
            <td>Czas trwania</td>
            <td>Gatunek</td>
            <td>Pegi</td>
            <td>Obsada</td>
            </tr>  
            
            <%-- Fetching the attributes of the request object 
             which was previously set by the servlet  
              "StudentServlet.java" 
        --%>  
        <%ArrayList<Film> filmy =  
            (ArrayList<Film>)request.getAttribute("filmList"); 
        for(Film f:filmy){%> 
        <%-- Arranging data in tabular form 
        --%> 
            <tr> 
                <td><%=f.getTytul()%></td> 
                <td><%=f.getRezyser()%></td> 
                <td><%=f.getDlugosc()%></td> 
                <td><%=f.getGatunek()%></td>
                <td><%=f.getPegi()%></td>
                <td><%=f.getObsada()%></td>
            </tr> 
          
            </table>
    </div>

</body>
</html>
