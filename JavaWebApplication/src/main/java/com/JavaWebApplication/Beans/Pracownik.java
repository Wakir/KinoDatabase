package com.JavaWebApplication.Beans;

public class Pracownik {
	
	private String imie;
	private String nazwisko;
	private String stanowisko;
	private String email;
	private String haslo;
	
	
	
	
	public Pracownik() {
		super();
	}
	public Pracownik(String imie, String nazwisko, String stanowisko, String email, String haslo) {
		super();
		this.imie = imie;
		this.nazwisko = nazwisko;
		this.stanowisko = stanowisko;
		this.email = email;
		this.haslo = haslo;
	}
	
	public String getImie() {
		return imie;
	}
	public void setImie(String imie) {
		this.imie = imie;
	}
	public String getNazwisko() {
		return nazwisko;
	}
	public void setNazwisko(String nazwisko) {
		this.nazwisko = nazwisko;
	}
	public String getStanowisko() {
		return stanowisko;
	}
	public void setStanowisko(String stanowisko) {
		this.stanowisko = stanowisko;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getHaslo() {
		return haslo;
	}
	public void setHaslo(String haslo) {
		this.haslo = haslo;
	}
	
	

}
