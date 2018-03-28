package com.htc.day8.main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.sql.rowset.CachedRowSet;
import javax.sql.rowset.RowSetFactory;
import javax.sql.rowset.RowSetProvider;

public class RowSetDemo {
public static void main(String[] args) throws ClassNotFoundException, SQLException {
	Connection con;
	Statement st;
	ResultSet rs;
	Class.forName("org.postgresql.Driver");
	con=DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres","postgres","123Welcome");
	System.out.println("connected to db");
	st=con.createStatement();
	rs=st.executeQuery("select * from product");
	
	RowSetFactory factory=RowSetProvider.newFactory();
	CachedRowSet crs=factory.createCachedRowSet();
	crs.populate(rs);
	con.close();
	crs.absolute(4);
	
	crs.beforeFirst();
	while(crs.next())
		
	{
		System.out.println(crs.getString(1)+"\t"+crs.getString(2)+"\t"+crs.getString(3));
	}
	}
}

