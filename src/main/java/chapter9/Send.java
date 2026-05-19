package chapter9;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class done
 */
@WebServlet("/send")
public class Send extends HttpServlet {
	@Override
	  protected void doPost(HttpServletRequest request,
              HttpServletResponse response)
throws ServletException, IOException {
		response.sendRedirect("chapter9/done.jsp");
	}
}