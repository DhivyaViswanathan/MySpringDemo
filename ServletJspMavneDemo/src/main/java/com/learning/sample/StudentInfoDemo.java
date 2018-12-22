package com.learning.sample;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.learning.sample.dao.StudenDao;
import com.learning.sample.model.StudenModel;

/**
 * Servlet implementation class StudentInfoDemo
 */
public class StudentInfoDemo extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int a=Integer.parseInt(request.getParameter("sid"));
		StudenDao dao=new StudenDao();
//		List student = null;
		List student = null;
		try {
			student = dao.getInfo(a);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		request.setAttribute("studentInfo", student);
		RequestDispatcher dispatcher=request.getRequestDispatcher("display.jsp");
				dispatcher.forward(request, response);
//		System.out.println("helloworld");
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		int sid=Integer.parseInt(request.getParameter("sid"));
		String sname=request.getParameter("sname");
		String designation=request.getParameter("designation");
		String address=request.getParameter("address");
		StudenDao dao=new StudenDao();
		try {
			dao.setStudentInfo(sid,sname,designation,address);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
