package com.htc.client;

import java.math.BigDecimal;
import java.sql.SQLException;

import javax.sql.rowset.JdbcRowSet;
import javax.sql.rowset.RowSetFactory;
import javax.sql.rowset.RowSetProvider;

public class ClientTest {

	private static final String DB_USERNAME="postgres";
	private static final String DB_PASSWORD="123Welcome";
	private static final String DB_URL ="jdbc:postgresql://localhost:5432/postgres";

	public static void main(String[] args) throws SQLException {
		
		RowSetFactory rowSetFactory = RowSetProvider.newFactory();
		JdbcRowSet jdbcRowSet = rowSetFactory.createJdbcRowSet();
		
		jdbcRowSet.setUrl(DB_URL);
		jdbcRowSet.setUsername(DB_USERNAME);
		jdbcRowSet.setPassword(DB_PASSWORD);
		
		jdbcRowSet.setCommand("SELECT * FROM employeetable");
		
		jdbcRowSet.execute();
		
		/*showEmployeesInfo(jdbcRowSet);
		System.out.println("-------------------------------------------------------");*/
		
		//addEmployee(jdbcRowSet);
		
		System.out.println("-------------------------------------------------------");
		
		showEmployeesInfo(jdbcRowSet);
	}

	private static void addEmployee(JdbcRowSet jdbcRowSet) throws SQLException {
		jdbcRowSet.moveToInsertRow();
		jdbcRowSet.updateInt("employee_id", 146);
		jdbcRowSet.updateString("employee_name", "Bob");
		jdbcRowSet.updateString("email", "Bob.cs@siffy.com");
		jdbcRowSet.updateDouble("salary", 57000.00);
		jdbcRowSet.updateTimestamp("date_of_joining", new java.sql.Timestamp(new java.util.Date().getTime()));
		jdbcRowSet.updateBigDecimal("bonus", new BigDecimal(2000.00));
		
		jdbcRowSet.insertRow();
		
		System.out.println("A new EMployee is added..");
		
		 
	}

	private static void showEmployeesInfo(JdbcRowSet jdbcRowSet) throws SQLException {
		
		while (jdbcRowSet.next()) {
			int empId = jdbcRowSet.getInt("employee_id");
			String eName = jdbcRowSet.getString("employee_name");
			String email = jdbcRowSet.getString("email");
			Double salary = jdbcRowSet.getDouble("salary");
			BigDecimal bonus = jdbcRowSet.getBigDecimal("bonus");

			System.out.println(empId + "\t" + eName + "\t" + salary + "\t" + email + "\t" + bonus);
		
		}
		jdbcRowSet.beforeFirst();
		
	}
}
