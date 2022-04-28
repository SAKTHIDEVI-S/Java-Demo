package bank;

import java.sql.Connection;
import java.sql.DriverManager;
//import java.sql.Statement;

public class connection {
	static Connection con;
	static String databaseName ="usersdatabase";
	static String url = "jdbc:mysql://localhost:3306/" +databaseName;
	static String username ="root";
	static String password = "1234";
	
	public static Connection getConnection() {
		try {
		//Class.forName("com.mysql.jdbc.Driver");
		con = DriverManager.getConnection(url,username,password);
		//Statement st = connection.createStatement();
		}
		catch (Exception e)
		{
			System.out.println("Connection Failed");
		}
		return con;
	}
} 
