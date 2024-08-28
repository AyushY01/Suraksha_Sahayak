package Frontend;

import java.sql.*;

public class conn {
	Connection c;
	Statement s;

	public conn() {
		// TODO Auto-generated constructor stub
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");

			// create database and then run the program and enter your own url,username,password.
			// c=DriverManager.getConnection("////","////","////");
			s=c.createStatement();
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	

}
