package chapter17;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

/**
 * Servlet implementation class NameInput
 */
@WebServlet(urlPatterns = { "/chapter17/input" })
public class NameInput extends HttpServlet {

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		request.setCharacterEncoding("UTF-8");
		String name = request.getParameter("name");
		HttpSession session = request.getSession();
		session.setAttribute("name", name);
		request.setAttribute("name", name);

		request.getRequestDispatcher("output.jsp")
				.forward(request, response);

	}
}