package com.jspider.servlet.servlet.project;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@SuppressWarnings("serial")
@WebServlet("/Netflix")
public class Netflix extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		response.setContentType("text/html");
		PrintWriter writer = response.getWriter();
		//String email = request.getParameter("email");
		
		//writer.println("<h1> Welcome " + email + "..!!</h1>");
		writer.println("<body style=\"margin: 0px\">"
				+ "<div style=\"position:relative; height:100vh; width:100vw; overflow-y:hidden; display:flex; align-items:center; justify-content:center;\r\n"
				+ "                font-family:Netflix Sans,Helvetica Neue,Segoe UI,Roboto,Ubuntu,sans-serif; color:white;\">\r\n"
				+ "        <div style=\"position:absolute; z-index:2; margin-left: -70%; margin-top: -40%;\">\r\n"
				+ "            <img style=\" height:50px; width: 160px; background-size: cover; background-position: center\" \r\n"
				+ "            src=\"https://upload.wikimedia.org/wikipedia/commons/7/7a/Logonetflix.png\" alt=\"\">\r\n"
				+ "        </div>\r\n"
				+ "        <div style=\"position:absolute; z-index:2; margin-left: 50%; margin-top: -39%;\">\r\n"
				+ "            <select name=\"\" id=\"\" style=\"background-color: transparent; color: white; padding: 7px 15px 7px 15px; border-radius: 5px;\">\r\n"
				+ "                <option value=\"\"> English</option>\r\n"
				+ "                <option value=\"\"> Hindi </option>\r\n" + "            </select>\r\n"
				+ "            </optgroup>\r\n" + "        </div>\r\n"
				+ "        <div style=\"position:absolute; z-index:2; margin-left: 63%; margin-top: -39%; background-color: red; padding: 4px 10px 4px 10px;\r\n"
				+ "            border-radius: 5px;\">Sign up</div>\r\n"
				+ "        <div style=\"width:100%; height:100%; position:absolute; background-color:rgba(0, 0, 0, 0.700); z-index:1;\"></div>\r\n"
				+ "        <div style=\"background-color:rgba(255, 255, 255, 0.137) ; position:absolute; z-index:2; font-weight:900; margin-top:-100px; font-size:50px;\r\n"
				+ "                box-shadow: 0px 0px 100px 100px rgba(255, 255, 255, 0.137);\">Unlimited movies, TV shows and more.</div>\r\n"
				+ "        <div style=\"position:absolute; z-index:2; font-size: 25px; margin-top: 20px;\">Watch anywhere. Cancel anytime.</div>\r\n"
				+ "        <div style=\"position: absolute;z-index: 2; font-size: 22px;margin-top: 120px;\">Ready to watch? Enter your email to create or restart your membership.</div>\r\n"
				+ "        <div style=\"position: absolute;z-index: 2; margin-top: 268px;\">\r\n"
				+ "            <form action=\"\" style=\"font-family:Netflix Sans,Helvetica Neue,Segoe UI,Roboto,Ubuntu,sans-serif;\">\r\n"
				+ "                <input class=\"i\" style=\" padding: 2px 10px 2px 10px; font-size: 18px; border-radius: 5px; margin-left:-240px; height: 54px; width: 400px;\r\n"
				+ "                    color: white; background-color: rgba(63, 61, 61, 0.306); border: .5px solid rgba(239, 217, 217, 0.47); \r\n"
				+ "                    outline: width 2px; outline-color: white;\" type=\"email\" name=\"\" id=\"\" placeholder=\"Email address\">\r\n"
				+ "            </form>\r\n" + "        </div>\r\n"
				+ "        <div style=\"position: absolute;z-index: 2; margin-top: 250px;  margin-left:400px; color: white; background-color: red;\r\n"
				+ "                height: 54px; width: 200px; display: flex; justify-content: center; align-items: center; border-radius: 5px;\r\n"
				+ "                font-size: 25px; font-weight: bold;\">Get Started ></div>\r\n"
				+ "        <div style=\"width: 100%; height: 100%; position: absolute\">\r\n"
				+ "            <img width=\"100%\" style=\"background-size: cover; background-position: center\" \r\n"
				+ "                src=\"https://i.ibb.co/XxrN5rT/IN-en-20230306-popsignuptwoweeks-perspective-alpha-website-large.jpg\"\r\n"
				+ "                alt=\"IN-en-20230306-popsignuptwoweeks-perspective-alpha-website-large\" border=\"0\"/>\r\n"
				+ "        </div>\r\n" + "    </div>" + "</body>");
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
