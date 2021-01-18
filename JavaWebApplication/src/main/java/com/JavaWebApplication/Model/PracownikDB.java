package com.JavaWebApplication.Model;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import com.JavaWebApplication.Beans.Pracownik;

public class PracownikDB {

	
	public void InsertPracownik(Pracownik dane)
	{
		MyDb db = new MyDb();
		Connection con = db.getCon();
		try {
			Statement stmt =  con.createStatement();
			String imie = dane.getImie();
			String nazwisko = dane.getNazwisko();
			String telefon = dane.getNumerTel();
			String email = dane.getEmail();
			String haslo = dane.getHaslo();
			String stanowisko = "Kasjer";
			Integer typ = 2;
			stmt.executeUpdate("insert into login(Mail,Haslo,Id_typu) VALUES ('"+email+"','"+haslo+"','"+typ+"')");
			stmt.executeUpdate("insert into pracownik(Imie,Nazwisko,Mail,Stanowisko) VALUES ('"+imie+"','"+nazwisko+"','"+email+"','"+stanowisko+"')");
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	
	
	
}
