package com.uniquedeveloper.registration;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class login
 */
@WebServlet("/login")
public class login extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
 
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String uemail=request.getParameter("username");
		String upwd=request.getParameter("password");
		HttpSession session =request .getSession();
		RequestDispatcher dispatcher =null;
		if(uemail==null || uemail.contentEquals("")) {
			request.setAttribute("name", "invalidEmail");
			dispatcher = request.getRequestDispatcher("login.jsp");
			dispatcher.forward(request, response);
		
		}if(upwd==null || upwd.contentEquals("")) {
			request.setAttribute("name", "invalidpassword");
			dispatcher = request.getRequestDispatcher("login.jsp");
			dispatcher.forward(request, response);
		}
		try {
			 Class.forName("com.mysql.cj.jdbc.Driver")	;
			  Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/company?serverTimezone=UTC&useSSL=false","sarah","sarah");
			  PreparedStatement ps =con.prepareStatement("select * from users where uemail=? and upwd=?");
			 
				ps.setString(1,uemail);
				ps.setString(2,upwd);
		ResultSet rs=ps.executeQuery();
		if(rs.next()) {
			session.setAttribute("name", rs.getString("uname"));
			dispatcher = request.getRequestDispatcher("index.jsp");
		
		
		}else {
			request.setAttribute("status", "failed");
			dispatcher = request.getRequestDispatcher("login.jsp");
			
			
		}
		
		dispatcher.forward(request, response);
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		
	}

}
