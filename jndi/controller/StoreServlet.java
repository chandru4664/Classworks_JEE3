package com.htc.webapp.jndi.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.htc.webapp.jndi.DAO.StudentDAO;
import com.htc.webapp.jndi.DAO.StudentDAOImpl;
import com.htc.webapp.jndi.entity.Student;

/**
 * Servlet implementation class StoreServlet
 */
@WebServlet("/StoreServlet")
public class StoreServlet extends HttpServlet {
	
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		Student student=new Student(request.getParameter("idtxt"),request.getParameter("nametxt"),
				request.getParameter("crstxt"));
		
		StudentDAO dao=new StudentDAOImpl();
		try {
			if(dao.storeStudent(student))
			{
				out.println("records added successfully");
			}
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
