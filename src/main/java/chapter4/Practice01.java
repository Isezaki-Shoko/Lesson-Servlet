package chapter4;

import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Practice01
 */
@WebServlet(urlPatterns= {"/chapter4/practice01"})
public class Practice01 extends HttpServlet {

    
	 
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html; charset=UTF-8");
		PrintWriter out = response.getWriter();
		
		LocalDateTime now = LocalDateTime.now();

		DateTimeFormatter fmt =
		    DateTimeFormatter.ofPattern("yyyy年MM月dd日(E) HH時mm分ss秒");

		String str = now.format(fmt);

		out.println(str);
	
	}

}
