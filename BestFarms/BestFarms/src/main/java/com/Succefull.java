package com;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Profile
 */
//if we have annotations we dont need to mention mappimg in web.xml file
@WebServlet("/success")
public class Succefull extends HttpServlet {
	private static final long serialVersionUID = 1L;


	//	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	//		// TODO Auto-generated method stub
	//		response.getWriter().append("Served at: ").append(request.getContextPath());
	//	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");		
		PrintWriter pw = response.getWriter();

		String[] typeStr = request.getParameterValues("type");
		
//if user clicks others he will be redirected to login page again else login succesful will appear
		for(int i=0;i<typeStr.length;i++) {
			if(typeStr[i]=="options" || typeStr[i]=="Options") 
			response.sendRedirect("profile.html");
			else 
				pw.write("login successfull");			
		}

	}

}
