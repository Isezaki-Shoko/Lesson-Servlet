package chapter12;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class BookApi
 */
@WebServlet(urlPatterns = { "/chapter12/BookApi" })
public class BookApi extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/plain; charset=UTF-8");
		PrintWriter out = response.getWriter();
		String title = request.getParameter("title");

		if (title == null || title.isEmpty()) {
			response.setStatus(
					HttpServletResponse.SC_BAD_REQUEST);

			out.println("titleを入力してください");

			return;

		}

		response.setStatus(HttpServletResponse.SC_OK);

		out.println(title + "の検索結果です");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType(
				"text/plain; charset=UTF-8");
		PrintWriter out=response.getWriter();
		
		BufferedReader reader=
				request.getReader();
		
		String body=reader.readLine();
		
		if(body == null || body.isEmpty()) {
		
			response.setStatus(
					HttpServletResponse.SC_BAD_REQUEST);
			out.println("本の情報がありません");
			return;
		}
				
		response.setStatus(
				HttpServletResponse.SC_OK);
		
		out.println("本を登録しました");
	}
}