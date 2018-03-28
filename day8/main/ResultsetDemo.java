package com.htc.day8.main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

public class ResultsetDemo {
public static void main(String[] args) throws ClassNotFoundException, SQLException {
	Connection con;
	Statement st;
	ResultSet rs;
	Class.forName("org.postgresql.Driver");
	con=DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres","postgres","123Welcome");
	System.out.println("connected to db");
	st=con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_UPDATABLE);
	
	rs=st.executeQuery("select * from student");
	/*System.out.println("3rd record");
	rs.absolute(3);
	System.out.println(rs.getString(1)+"\t"+rs.getString(2)+"\t"+rs.getString(3));
	
	System.out.println("1st record");
	rs.first();
	//rs.updateString(3,"machine learning");
	
	System.out.println(rs.getString(1)+"\t"+rs.getString(2)+"\t"+rs.getString(3));
	
	System.out.println("last record");
	rs.last();
	System.out.println(rs.getString(1)+"\t"+rs.getString(2)+"\t"+rs.getString(3));
	
	
	System.out.println("reverse record");
	while(rs.previous())
	{
		System.out.println(rs.getString(1)+"\t"+rs.getString(2)+"\t"+rs.getString(3));
	}
	*/
	System.out.println(rs.getStatement().toString());
	ResultSetMetaData rsd=rs.getMetaData();
	System.out.println();
	System.out.println(rsd.getColumnCount());
	System.out.println(rsd.getColumnName(2));
	
}
}
