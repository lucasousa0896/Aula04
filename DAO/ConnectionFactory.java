package DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {
	static {
		try {
			Class.forName("com.mysql.jdbc.Driver");
		}catch(Exception e) {
			System.out.println(e);
		}
	}
	

	public static Connection realizarConexao(){
		try {
			return DriverManager.getConnection("jdbc:mysql://localhost/");
		}catch(SQLException e) {
				System.out.println(e);
				}
		return null;
			}
}