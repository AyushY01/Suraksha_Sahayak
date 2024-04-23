package Frontend;

import java.sql.*;

public class conn {
	Connection c;
	Statement s;

	public conn() {
		// TODO Auto-generated constructor stub
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			c=DriverManager.getConnection("jdbc:mysql://localhost:3306/suraksha_sahayak1","root","0987password@@");
			s=c.createStatement();
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	

}
