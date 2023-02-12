package demo;

import java.sql.*;

public class JdbcDemo {
	public static void main(String args[]) throws Exception{
		
		
		//String url = "jdbc:mysql://localhost:3306/sakila";
		String uname = "root";
		String pass = "Admin@2022";
		String query = "select * from actor";
		//String create = "Create database emp";
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection con = DriverManager.getConnection(url,uname,pass);
		Statement st = con.createStatement();
		
		ResultSet rs = st.executeQuery(query);
		
		
		while(rs.next()) {
		String name = rs.getString("actor_id");
		System.out.println(name);
		}
		
		st.close();
		con.close();
		
	}

}
