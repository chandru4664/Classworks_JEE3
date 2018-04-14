package com.htc.webapp.contorller;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class SampleServlet
 */
@WebServlet(
		urlPatterns = { "/SampleServlet" }, 
		initParams = { 
				@WebInitParam(name = "filepath", value = "./resource/file1.txt")
		})
public class SampleServlet extends HttpServlet {
	
	
String file;
String driver;
String username;
String password;

public void init(ServletConfig config)
{
	file=getInitParameter("filepath");
	ServletContext context=config.getServletContext();
	
	driver=context.getInitParameter("Driver");
	username=config.getServletContext().getInitParameter("username");
	password=config.getServletContext().getInitParameter("password");
}
       
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		out.println(file);
		
		out.println(driver+"<br/>");
		out.println(username+"<br/>");
		out.println(password+"<br/>");
		
		
		/*FileReader fr=new FileReader(file);
		BufferedReader br=new BufferedReader(fr);
		out.println(br.readLine());
		br.close();
		fr.close();*/
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
