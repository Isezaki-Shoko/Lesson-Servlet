package chapter5;

import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDateTime;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Practice002
 */
@WebServlet(urlPatterns={"/Servlet/chapter5/Practice002"})
public class Practice002 extends HttpServlet {
	
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html;charset=UTF-8");
		PrintWriter out = response.getWriter();
		
		LocalDateTime now =LocalDateTime.now();
		int hour=now.getHour();
		
		String greeting;
		if(hour>=5 && hour<12) {
			greeting="おはようございます。";
		}else if(hour>=12 && hour<18){
			greeting="こんにちは。";
		}else{
			greeting="こんばんは。";
			
			
		
	}

	}

}
