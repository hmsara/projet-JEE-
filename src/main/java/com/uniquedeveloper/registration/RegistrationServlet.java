package com.uniquedeveloper.registration;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class RegistrationServlet
 */
@WebServlet("/register")
public class RegistrationServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
 

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String uname =request.getParameter("name");
		String uemail =request.getParameter("email");
		String upwd =request.getParameter("pass");
		String Reupwd =request.getParameter("re_pass");
		String umobile =request.getParameter("contact");
		PrintWriter out=response.getWriter();
		RequestDispatcher dispatcher= null;
		if(uname==null || uname.contentEquals("")) {
			request.setAttribute("name", "invalidname");
			dispatcher = request.getRequestDispatcher("registration.jsp");
			dispatcher.forward(request, response);
		
		}if(uemail==null || uemail.contentEquals("")) {
			request.setAttribute("name", "invaliduemail");
			dispatcher = request.getRequestDispatcher("registration.jsp");
			dispatcher.forward(request, response);
		
		}if(upwd==null || upwd.contentEquals("")) {
			request.setAttribute("name", "invalidupwd");
			dispatcher = request.getRequestDispatcher("registration.jsp");
			dispatcher.forward(request, response);
		
		}else if(!upwd.equals(Reupwd)) {
			request.setAttribute("name", "invalidConfirm");
			dispatcher = request.getRequestDispatcher("registration.jsp");
			dispatcher.forward(request, response);
		}
		if(umobile==null || umobile.contentEquals("")) {
			request.setAttribute("name", "invalidumobile");
			dispatcher = request.getRequestDispatcher("registration.jsp");
			dispatcher.forward(request, response);
		
		}else if(umobile.length()>8){
			request.setAttribute("name", "invalidlength");
			dispatcher = request.getRequestDispatcher("registration.jsp");
			dispatcher.forward(request, response);
			
		}
		
		
		try {
			  Class.forName("com.mysql.cj.jdbc.Driver")	;
			  Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/company?serverTimezone=UTC&useSSL=false","sarah","sarah");
			PreparedStatement ps =con.prepareStatement("insert into users (uname,upwd,uemail,umobile) values(?,?,?,?)");
			ps.setString(1,uname);
			ps.setString(2,upwd);
			ps.setString(3,uemail);
			ps.setString(4,umobile);
			int rowCount =ps.executeUpdate();
			dispatcher = request.getRequestDispatcher("registration.jsp");
			if(rowCount>0) {
				request.setAttribute("status", "success");
			}else {
				request.setAttribute("status", "failed");
			}
			dispatcher.forward(request,response);
			con.close();
			}catch(Exception e) {
				e.printStackTrace();
			}
			}
			}
	
			
	


