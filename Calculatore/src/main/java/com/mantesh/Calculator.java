package com.mantesh;

import java.io.IOException;


import java.io.PrintWriter;


import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;


import javax.servlet.http.HttpServletRequest;


import javax.servlet.http.HttpServletResponse;

@WebServlet("/Calculator")
public class Calculator extends HttpServlet
{
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException
	{
		
		response.setContentType("text/html");
		
		PrintWriter out=response.getWriter();
		
		out.println("<html><head><title>Servlet CalculatorServlet</title></head><body>");              
		double n1 = Double.parseDouble(request.getParameter("txtN1"));

		double n2 = Double.parseDouble(request.getParameter("txtN2"));
		double result =0;
		String opr=request.getParameter("opr");
		if(opr.equals("+")) result=n1+n2;
		if(opr.equals("-")) result=n1-n2; 
		if(opr.equals("*")) result=n1*n2; 
		if(opr.equals("/")) result=n1/n2; 

		out.println("<h1> Result = "+result); 
		out.println("<br><br><a href='../Calculatore/index.html'>Back to home page</a>");
		 out.println("</body></html>");
		}    
 
		
	}
	

