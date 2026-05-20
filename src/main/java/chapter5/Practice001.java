package chapter5;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import tool.Page001;

/**
 * Servlet implementation class Practice001
 */
@WebServlet(urlPatterns={"/chapter5/Practice001"})
public class Practice001 extends HttpServlet {

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
	request.setCharacterEncoding("UTF-8");
	response.setContentType("text/html; charset=UTF-8");
	PrintWriter out=response.getWriter();
	
	String name=request.getParameter("name");
	String ageStr=request.getParameter("age");
	
	Page001.header(out);

	try {
		int age=Integer.parseInt(ageStr);
		if(age<18) {
			out.println("<p>こんにちは"+name+"さん。未成年ですね。</p>");
		}else{
			out.println("<p>こんにちは"+name+"さん。大人ですね。</p>");
		}
	}catch(NumberFormatException e) {
		out.println("<p>年齢は数値で入力してください。</p>");
	}
	
	Page001.footer(out);
	}
}