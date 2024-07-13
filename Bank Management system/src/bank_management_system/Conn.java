package bank_management_system;

import java.sql.*;

public class Conn { // conn --> connection
	
	Connection c;
	Statement s;
	
	public Conn() {
		try { //exception handling.. mysql is an external entity so their are chances of errors. so we use try catch method
			//Class.forName(com.mysql.cj.jdbc.Driver); //driver register
			c = DriverManager.getConnection("jdbc:mysql:///bankmanagementsystem", "root", "root"); //created connection
			s = c.createStatement(); 			
			
		}catch(Exception e) {
			System.out.println(e);
		}
	}

}
