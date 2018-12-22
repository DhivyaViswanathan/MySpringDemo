package com.learning.sample.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.learning.sample.model.StudenModel;

public class StudenDao {
	
	public  List getInfo(int sid) throws SQLException {
		ArrayList<StudenModel> a1=new ArrayList<StudenModel>();
//		s.setSid(1);
//		s.setSname("chikku");
//		s.setDesignation("ECE");
//		s.setAddress("nagar");
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/demo?useSSL=false", "root", "root");
			Statement st = con.createStatement();
			ResultSet resultSet = st.executeQuery("select * from studentInfo  where sid="+sid);
			while(resultSet.next()) {
				StudenModel s=new StudenModel();
				s.setSid(resultSet.getInt("sid"));
				s.setSname(resultSet.getString("sname"));
				s.setDesignation(resultSet.getString("designation"));
				s.setAddress(resultSet.getString("address"));
				a1.add(s);
		}
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
//		System.out.println(a1);
		return a1;
	}

	public void setStudentInfo(int sid, String sname, String designation, String address) throws SQLException {
		try {
			String sql="insert into StudentInfo values(?,?,?,?)";
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/demo?useSSL=false", "root", "root");
			PreparedStatement st = con.prepareStatement(sql);
			st.setInt(1,sid);
			st.setString(2, sname);
			st.setString(3, designation);
			st.setString(4,address);
			st.executeUpdate();
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
