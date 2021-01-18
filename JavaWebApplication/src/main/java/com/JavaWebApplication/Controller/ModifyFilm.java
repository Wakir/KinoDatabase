package com.JavaWebApplication.Controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.JavaWebApplication.Beans.Film;
import com.JavaWebApplication.Model.FilmDB;

/**
 * Servlet implementation class ModifyFilm
 */
public class ModifyFilm extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ModifyFilm() {
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
		
		String tytul = request.getParameter("filmTitle");
		String rezyser = request.getParameter("director");
		String dlugosc = request.getParameter("duration");
		String gatunek = request.getParameter("gatunek");
		String pegi = request.getParameter("pegi");
		String obsada = request.getParameter("cast");
		
		dlugosc = "02:21:43.020100";
		
		Film dane = new Film(tytul,rezyser,gatunek,pegi,obsada,dlugosc);
		FilmDB film = new FilmDB();
	}

}
