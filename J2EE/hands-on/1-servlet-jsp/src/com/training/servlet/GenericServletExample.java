package com.training.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

/**
 * @author lperumalm
 * 
 *         Provides implementation of all methods of these interface except
 *         service method.It handles any type of request, so it is
 *         protocol-independent.
 *
 */
public class GenericServletExample extends GenericServlet {

	private static final long serialVersionUID = 1L;

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		res.setContentType("text/html");

		System.out.println("Service MEthod Call - GenericServlet");
		
		PrintWriter out = res.getWriter();
		out.print("<html><body>");
		out.print("<b>hello generic servlet</b>");
		out.print("</body></html>");
	}

}
