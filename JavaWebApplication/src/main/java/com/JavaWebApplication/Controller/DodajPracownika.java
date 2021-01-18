package com.JavaWebApplication.Controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.JavaWebApplication.Beans.Pracownik;
import com.JavaWebApplication.Model.PracownikDB;
import com.JavaWebApplication.Model.UserDB;

/**
 * Servlet implementation class DodajPracownika
 */
public class DodajPracownika extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DodajPracownika() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
		
		String imie = request.getParameter("firstName");
		String nazwisko = request.getParameter("lastName");
		String password = request.getParameter("password");
		String telefon = request.getParameter("phoneNum");
		String email = request.getParameter("email");
		
		Pracownik dane = new Pracownik(imie,nazwisko,telefon,email,password);
		PracownikDB ud = new PracownikDB();
		ud.InsertPracownik(dane);
		
		
	}

}
