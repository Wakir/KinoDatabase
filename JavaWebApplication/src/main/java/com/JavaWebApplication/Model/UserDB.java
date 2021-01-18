package com.JavaWebApplication.Model;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.JavaWebApplication.Beans.Uzytkownik;

public class UserDB {
	
	public void insertUser(Uzytkownik dane)
	{
		MyDb db = new MyDb();
		Connection con = db.getCon();
		try {
			Statement stmt =  con.createStatement();
			String imie = dane.getImie();
			String nazwisko = dane.getNazwisko();
			String telefon = dane.getNumerTel();
			String email = dane.getEmail();
			String haslo = dane.getPassword();
			Integer typ = 3;
			stmt.executeUpdate("insert into login(Mail,Haslo,Id_typu) VALUES ('"+email+"','"+haslo+"','"+typ+"')");
			stmt.executeUpdate("insert into uzytkownik(Imie,Nazwisko,Numer_telefonu,Mail) VALUES ('"+imie+"','"+nazwisko+"','"+telefon+"','"+email+"')");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
	}
	
	public Integer readData(Uzytkownik user)
	{
		String mail = user.getEmail();
		String haslo = user.getPassword();
		MyDb db = new MyDb();
		ResultSet rs;
		Connection con = db.getCon();
		try {
			Statement stmt =  con.createStatement();
		
			rs = stmt.executeQuery("SELECT Id_typu,Mail,Haslo FROM bdkino.login where Mail ='"+mail+"' and Haslo ='"+haslo+"' ");
			//rs.next();
			if(rs.next())
			{Integer token = rs.getInt("Id_typu");
				return token;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return 0;
	
	}

}
