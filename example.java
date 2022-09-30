package googleexample;
import java.sql.*;
public class example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con =DriverManager.getConnection("jdbc:mysql://localhost:3306/tree","root","root");
			Statement stmt=con.createStatement();
			System.out.println("inserting record");
			String sql="Insert into fruit value(45)";
			stmt.executeUpdate(sql);	
			
		}catch(Exception e) {
			System.out.println(e);
		}

	}

}
