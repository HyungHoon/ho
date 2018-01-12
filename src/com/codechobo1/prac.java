package com.codechobo1;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/prac")
public class prac extends HttpServlet {
@Override
protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	// TODO Auto-generated method stub
	resp.setContentType("text/html; charset=UTF-8");
	
	PrintWriter out = resp.getWriter();
	
	String a="";
	
	for(int i=0; i<5; i++) {
		for(int j =0; j<5; j++) {
			if(i==j||i+j==4) {
				a+="¡Ú";
			} else { a+="&nbsp&nbsp";}
		}
		a+="<br>";
	}
	
	String[] cube = {
		"<img src='C:\\Users\\504CLASS 17\\eclipse-workspace\\haha\\WebContent\\img\\dice1.jpg'>",
		"<img src='C:\\Users\\504CLASS 17\\eclipse-workspace\\haha\\WebContent\\img\\dice2.jpg'>",
		"<img src='C:\\Users\\504CLASS 17\\eclipse-workspace\\haha\\WebContent\\img\\dice3.jpg'>",
		"<img src='C:\\Users\\504CLASS 17\\eclipse-workspace\\haha\\WebContent\\img\\dice4.jpg'>",
		"<img src='C:\\Users\\504CLASS 17\\eclipse-workspace\\haha\\WebContent\\img\\dice5.jpg'>",
		"<img src='C:\\Users\\504CLASS 17\\eclipse-workspace\\haha\\WebContent\\img\\dice6.jpg'>"
	};
	
	String cube1 = "";
	int j=0;
	for(int i =0; i<cube.length; i++) {
		i=(int)(Math.random()*cube.length);
		String c = cube[i];
		cube[i] = cube[j];
		cube[j] = c;
		
		cube1 = cube[i];
	}
	
	String cube2 = "";
	for(int i =0; i<cube.length; i++) {
		i=(int)(Math.random()*cube.length);
		String c = cube[i];
		cube[i] = cube[j];
		cube[j] = c;
		
		cube2 = cube[i];
	}
	
	out.println("<!DOCTYPE html>");
	out.println("<html>");
	out.println("<head>");
	out.println("</head>");
	out.println("<body>");
	out.println(a);
	out.println(cube1);
	out.println(cube2);
	out.println("</body>");
	out.println("</html>");
	
	
}

@Override
protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	// TODO Auto-generated method stub
	doGet(req, resp);

	}
}
