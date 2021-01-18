package com.JavaWebApplication.Controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.JavaWebApplication.Beans.Uzytkownik;
import com.JavaWebApplication.Model.UserDB;

/**
 * Servlet implementation class Login
 */
public class Zaloguj extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Zaloguj() {
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
		PrintWriter out = response.getWriter();
		String password = request.getParameter("password");
		String email = request.getParameter("email");
		
		UserDB ud = new UserDB();
		
		Uzytkownik user = new Uzytkownik();
		user.setEmail(email);
		user.setPassword(password);
		
		Integer s1 = ud.readData(user);
		
		if(s1==3)
		{
			//out.println("UDALO SIĘ ZALOGOWAĆ uzytkownikowi");
			//HttpSession session = request.getSession();
			//session.setAttribute("email", email);
			response.sendRedirect("User\\userPanel.jsp");
			
		}
		else if(s1==2)
		{
			//out.println(" UDALO SIĘ ZALOGOWAĆ pracownikowi");
			response.sendRedirect("Employee\\employeePanel.jsp");
		}
		else if(s1==1)
		{
			//out.println(" UDALO SIĘ ZALOGOWAĆ Panu szefowi");
			response.sendRedirect("Menager\\menagerPanel.jsp");
		}
		else 
		{
			
			//out.println(" NIE UDALO SIĘ ZALOGOWAĆ ");
			response.sendRedirect("Guest\\index.jsp");
		}
		
		
	}

}
