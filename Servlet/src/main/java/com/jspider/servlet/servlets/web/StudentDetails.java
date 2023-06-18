package com.jspider.servlet.servlets.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@SuppressWarnings("serial")
@WebServlet("/details")
public class StudentDetails extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter writer = response.getWriter();
		String name = request.getParameter("name");
		String email = request.getParameter("email");
		String contact = request.getParameter("contact");
		String city = request.getParameter("city");
		String gender = request.getParameter("r");
		String[] subject = request.getParameterValues("s");
		
		writer.println("<h1> NAME : " + name + "</h1><br>" + 
				"<h1> EMAIL : " + email + "</h1><br>" + 
				"<h1> CONTACT : " + contact + "</h1><br>" +
				"<h1> CITY : " + city + "</h1><br>"+
				"<h1> Gender : " + gender + "</h1><br>");
		
		for(String sub:subject) {
			writer.println("Subject is :"+sub);
		}
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}