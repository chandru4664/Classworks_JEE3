package com.htc.webapp.jndi.DAO;

import java.sql.Connection;
import java.sql.DriverManager;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

public class ConnectDB {
public static Connection getConnection()
{
	Connection con=null;
			try
	{
				/*Class.forName("org.postgresql.Driver");
				
				
				con=DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres",
						"postgres","123Welcome");
				System.out.println("connected to db");*/
				
				
				Context initContext = new InitialContext();
				Context envContext  = (Context)initContext.lookup("java:/comp/env");
				DataSource ds = (DataSource)envContext.lookup("jdbc/postgres");
				 con = ds.getConnection();
	}
	catch(Exception ex)
	{
		ex.printStackTrace();
	}
	return con;
}
}
