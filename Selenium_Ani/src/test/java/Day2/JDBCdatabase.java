package Day2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCdatabase {
	
	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
		}
		catch(ClassNotFoundException e)
		{
			e.printStackTrace();
		}
		
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/","root","March@2021");
		Statement st = con.createStatement();
		String query = "create database demo";
		st.executeUpdate(query);
		System.out.println("Table is created");
		st.close();
		con.close();
	}

}

