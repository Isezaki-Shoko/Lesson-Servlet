package chapter4;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Practice02
 */
@WebServlet(urlPatterns = { "/chapter4/practice02" })
public class Practice02 extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html; charset=UTF-8");
		PrintWriter out = response.getWriter();

		String lang = request.getHeader("Accrpt-Language");

		out.println("<html><body>");
		if (lang != null && lang.startsWith("ja")) {
			out.println("<p>こんにちは</p>");
		} else {
			out.println("<p>Hello</p>");
		}
		out.println("</body></html>");
	}
}
