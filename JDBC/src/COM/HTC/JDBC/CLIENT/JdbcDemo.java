package COM.HTC.JDBC.CLIENT;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class JdbcDemo {
public static void main(String[] args) {
	
	Connection con = null;
	Statement stmt = null;
	ResultSet rs=null;
	try {
		Class.forName("org.postgresql.Driver");
		System.out.println("class loaded successfully");
	} catch (ClassNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	try {
		con=DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres","postgres","123Welcome");
		System.out.println("connected ");
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
try {
	stmt=con.createStatement();
} catch (SQLException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}

/*String sql=	"select student_id,student_name,course from student";
try {
	rs=stmt.executeQuery(sql);
} catch (SQLException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
	
	System.out.println("id\t\tname\t\tcourse");
			try {
				while(rs.next())
				{
				System.out.println(rs.getString("student_id")+"\t\t"+rs.getString(2)+"\t\t"+rs.getString(3));
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
*/

int i=0;
String sql="insert into student(student_id,student_name,course) values('s1234','Kannan','PHP')";
try {
	 i=stmt.executeUpdate(sql);
} catch (SQLException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
if(i>0)
{
	System.out.println("data inserted successsfullly");
}


}
}