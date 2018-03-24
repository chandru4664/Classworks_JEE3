package COM.HTC.JDBC.CLIENT;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

public class DBCommunicator {
	private Properties connectionProperties=new Properties();
	
	
	public DBCommunicator() throws FileNotFoundException, IOException{
		connectionProperties.load(new FileInputStream("connection.PROPERTIES"));
	}
	public Connection createConnection() throws ClassNotFoundException, SQLException{
		try{
			Class.forName(connectionProperties.getProperty("driver"));
			Connection connection=DriverManager.getConnection(connectionProperties.getProperty("url"),connectionProperties.getProperty("username"),connectionProperties.getProperty("password"));
			return connection;
		}catch(ClassNotFoundException ex){
			throw new ClassNotFoundException("DRIVER-MISSED",ex);
		} catch (SQLException ex) {
			throw new SQLException("CONNECTION-FAILED",ex);
		} 
	}
	public Connection createOranConnection() throws ClassNotFoundException, SQLException{
		try{
			Class.forName("com.inet.ora.OraDriver");
			Connection connection=DriverManager.getConnection(connectionProperties.getProperty("inet.url"),connectionProperties.getProperty("inet.username"),connectionProperties.getProperty("inet.password"));
			return connection;
		}catch(ClassNotFoundException ex){
			throw new ClassNotFoundException("DRIVER-MISSED",ex);
		} catch (SQLException ex) {
			throw new SQLException("CONNECTION-FAILED",ex);
		}
	}
	public int createTable(String tableName,String...fields) throws SQLException, ClassNotFoundException{
		Connection conn=null;
		try{
			conn=createConnection();
			Statement stmt=conn.createStatement();
			StringBuilder query=new StringBuilder("CREATE TABLE "+tableName+"(");
			for(String field:fields){
				query.append(field).append(",");
			}
			query.setCharAt(query.length()-1,')');
			return stmt.executeUpdate(query.toString());
		}catch(SQLException ex){
			throw new SQLException("CREATION-FAILED",ex);
		}finally{
			if(conn!=null)conn.close();
		}
	}
	public int insertRow() throws ClassNotFoundException, SQLException{
		
		try(Connection conn=createConnection()){
				Statement stmt=conn.createStatement();
				return stmt.executeUpdate("insert into SetEightEmps(EmpNo,EmpName,Salary) values(2,'Ramu',40000)");
		}		
	}
	public int updateRow() throws ClassNotFoundException, SQLException{	
		try(Connection conn=createConnection()){
				Statement stmt=conn.createStatement();
				return stmt.executeUpdate("update SetEightEmps set Salary=Salary+10000");
		}		
	}
	
	public List<String> getEmpNames() throws SQLException, ClassNotFoundException{
		List<String> emps=null;
		try(Connection conn=createConnection()){
			emps=new ArrayList<String>();
			Statement stmt=conn.createStatement();
			ResultSet rs=stmt.executeQuery("Select Empname from SetEightEmps");
			while(rs.next()){
				emps.add(rs.getString("Empname"));
			}
		}
		return emps;
	}
	
}
