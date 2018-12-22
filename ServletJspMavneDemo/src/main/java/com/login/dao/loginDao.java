package com.login.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


public class loginDao {
	String sql="select * from login where uName=? and pass=?";

	public boolean check(String userName,String password) throws SQLException {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/demo?useSSL=false", "root", "root");
			PreparedStatement st = con.prepareStatement(sql);
			st.setString(1,userName);
			st.setString(2,password);
			ResultSet resultSet = st.executeQuery();
			if(resultSet.next()) {
				return true;
			}
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return false;
		
	}
}
