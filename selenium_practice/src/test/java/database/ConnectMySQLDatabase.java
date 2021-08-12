package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import org.testng.annotations.Test;

public class ConnectMySQLDatabase {

	@Test
	public void testDBConnection( ) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.jdbc.Driver");

		System.out.println("Driver loaded");

		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3308/selenium", "root", "Mydob@210588");

		System.out.println("Connected to DB");

		Statement statement = connection.createStatement();

		ResultSet resultSet = statement.executeQuery("select * FROM seleniumuser");

		while(resultSet.next()) {

			String firstName = resultSet.getString("firstname");

			System.out.println("Database record is "+firstName);

			String emailAddress = resultSet.getString("email");

			System.out.println("Database resord is "+emailAddress);

		}
		connection.close();
	}

	@Test
	public void test_Insert() throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.jdbc.Driver");
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3308/selenium", "root", "Mydob@210588");
		Statement statement = connection.createStatement();
		ResultSet resultSet = statement.executeQuery("select * from seleniumuser");
		while(resultSet.next()) {
			String firstName = resultSet.getString("firstname");
			System.out.println("DB Record is "+firstName);
			String emailAddress = resultSet.getString("email");
			System.out.println("DB Record is "+emailAddress);
		//	System.out.println("Row count is " +resultSet.getRow());

		}
		connection.close();

		
		  /*String newValues =
		  "INSERT INTO seleniumuser(firstname, email) VALUES (?, ?)"; PreparedStatement
		  preparedStatement = connection.prepareStatement(newValues);
		  preparedStatement.setString(1, "Ishan"); preparedStatement.setString(2,
		  "Ishan@gmail.com");
		  
		  preparedStatement.executeUpdate();
		  
		  System.out.println("User Added..");
		  
		  while(resultSet.next()) { String firstName =
		  resultSet.getString("firstname");
		  System.out.println("DB Record is "+firstName); String emailAddress =
		  resultSet.getString("email");
		  System.out.println("DB Record is "+emailAddress);
		  System.out.println("Row count is " +resultSet.getRow());*/
		  
		  }
	
	@Test
	public void test_Update() throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.jdbc.Driver");
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3308/selenium", "root", "Mydob@210588");
		
		
		
		String updateValue = "UPDATE seleniumuser SET email='hit@gmail.com', WHERE firstname='rohit'";
		PreparedStatement preparedstatement = connection.prepareStatement(updateValue);
		/*
		 * preparedstatement.setString(1, "hitman@gmail.com");
		 * preparedstatement.setString(1, "rohit");
		 */
		
		preparedstatement.executeUpdate();
		
		Statement statement = connection.createStatement();
		ResultSet resultSet = statement.executeQuery("select * from seleniumuser");
		
		while(resultSet.next()) {
			String firstName = resultSet.getString("firstname");
			System.out.println("DB Record is "+firstName);
			String emailAddress = resultSet.getString("email");
			System.out.println("DB Record is "+emailAddress);

		}
		
		connection.close();
	}
	
	@Test
	public void test_Delete() throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.jdbc.Driver");
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3308/selenium", "root", "Mydob@210588");
		
		
		
		String updateValue = "DELETE FROM seleniumuser WHERE firstname='Ishan'";
		PreparedStatement preparedstatement = connection.prepareStatement(updateValue);
		/*
		 * preparedstatement.setString(1, "hitman@gmail.com");
		 * preparedstatement.setString(1, "rohit");
		 */
		
		preparedstatement.executeUpdate();
		
		Statement statement = connection.createStatement();
		ResultSet resultSet = statement.executeQuery("select * from seleniumuser");
		
		while(resultSet.next()) {
			String firstName = resultSet.getString("firstname");
			System.out.println("DB Record is "+firstName);
			String emailAddress = resultSet.getString("email");
			System.out.println("DB Record is "+emailAddress);

		}
		
		connection.close();
	}
		 

		 

	}



