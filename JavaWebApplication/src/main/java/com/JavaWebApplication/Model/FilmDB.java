package com.JavaWebApplication.Model;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Time;

import com.JavaWebApplication.Beans.Film;
import com.JavaWebApplication.Beans.Uzytkownik;

public class FilmDB {
	
	
	public void insertFilm(Film dane)
	{
		MyDb db = new MyDb();
		ResultSet rs;
		Connection con = db.getCon();
		try {
			Statement stmt =  con.createStatement();
			String tytul = dane.getTytul();
			String rezyser= dane.getRezyser();
			String gatunek = dane.getGatunek();
			String pegi = dane.getPegi();
			String obsada = dane.getObsada();
			String dlugosc = dane.getDlugosc();
			Integer gatId =2;
			Integer pegiId =1;
			
			String[] rezysertab = rezyser.split(" ");
			
			rs = stmt.executeQuery("SELECT Id_rezysera from  bdkino.rezyser where imie ='"+rezysertab[0]+"'and nazwisko ='"+rezysertab[1]+"' ");
			rs.next();
			Integer rezId = rs.getInt("Id_rezysera");
			
			rs = stmt.executeQuery("SELECT Id_gatunku from  bdkino.gatunektab where Nazwa_gatunku ='"+gatunek+"' ");
			rs.next();
			gatId = rs.getInt("Id_gatunku");
			
			rs = stmt.executeQuery("SELECT Id_PEGI from  bdkino.pegitab where Nazwa_PEGI ='"+pegi+"' ");
			rs.next();
			pegiId = rs.getInt("Id_PEGI");
			
			stmt.executeUpdate("insert into film(Nazwa,Id_gatunku, Id_rezysera, Id_PEGI, Czas_trwania, Obsada) VALUES ('"+tytul+"','"+gatId+"',"
					+ " '"+rezId+"', '"+pegiId+"', '"+dlugosc+"', '"+obsada+"'    ) ");
			
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	public void modifyFilm(Film dane)
	{
		MyDb db = new MyDb();
		ResultSet rs;
		Connection con = db.getCon();
		try {
			Statement stmt =  con.createStatement();
			String tytul = dane.getTytul();
			String rezyser= dane.getRezyser();
			String gatunek = dane.getGatunek();
			String pegi = dane.getPegi();
			String obsada = dane.getObsada();
			String dlugosc = dane.getDlugosc();
			Integer gatId =2;
			Integer pegiId =1;
			
			String[] rezysertab = rezyser.split(" ");
			
			rs = stmt.executeQuery("SELECT Id_rezysera from  bdkino.rezyser where imie ='"+rezysertab[0]+"'and nazwisko ='"+rezysertab[1]+"' ");
			rs.next();
			Integer rezId = rs.getInt("Id_rezysera");
			
			rs = stmt.executeQuery("SELECT Id_gatunku from  bdkino.gatunektab where Nazwa_gatunku ='"+gatunek+"' ");
			rs.next();
			gatId = rs.getInt("Id_gatunku");
			
			rs = stmt.executeQuery("SELECT Id_PEGI from  bdkino.pegitab where Nazwa_PEGI ='"+pegi+"' ");
			rs.next();
			pegiId = rs.getInt("Id_PEGI");
			
			
			stmt.executeUpdate(" Update Film set Id_gatunku ='"+gatId+"', Id_rezysera ='"+rezId+"', Id_PEGI  = '"+pegiId+"',"
					+ " Czas_trwania ='"+dlugosc+"', Obsada = '"+obsada+"'   where Nazwa = '"+tytul+"' ");
						
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}
	
	
	public void deleteFilm(Film dane)
	{
		MyDb db = new MyDb();
		ResultSet rs;
		Connection con = db.getCon();
		try {
			Statement stmt =  con.createStatement();
			String tytul = dane.getTytul();
		
			
			stmt.executeUpdate("Delete from Film where Nazwa = '"+tytul+"'  ");
			
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
