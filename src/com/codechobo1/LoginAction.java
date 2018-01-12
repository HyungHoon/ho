package com.codechobo1;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/LoginAction")
public class LoginAction extends HttpServlet{
	protected static final long serialVersionUID = 1L;

	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		resp.setContentType("text/html; charset=UTF-8");
	//	PrintWriter out = resp.getWriter();
		
		String id = req.getParameter("id");
		String pwd = req.getParameter("pwd");
		
		
		
		if(id.equals("haha")&&pwd.equals("1234")){
			resp.sendRedirect("/Hello.jsp");
		} else {
			RequestDispatcher reqDis = req.getRequestDispatcher("/reweb.jsp");
			reqDis.forward(req, resp);
		}
		
		
//		out.println("<!DOCTYPE html>");
//		out.println("<html>");
//		out.println("<head>");
//		out.println("</head>");
//		out.println("<body>");
//		out.println("<h1>Hello, "+id+".</h1>");
//		out.println("<h1>Your password is"+pwd+".</h1>");
//		out.println("</body>");
//		out.println("</html>");
//		
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(req, resp);

		}
	}

