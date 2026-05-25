package chapter17n02;

import java.io.IOException;
import java.util.ArrayList;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import beans.Favorite;

/**
 * Servlet implementation class FavoriteServlet
 */
@WebServlet(urlPatterns={"/chapter17n02/FavoriteServlet"})
public class FavoriteServlet extends HttpServlet {

protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String name=request.getParameter("name");
		String url=request.getParameter("url");
		
		HttpSession session=request.getSession();
		
		ArrayList<Favorite> list=(ArrayList<Favorite>)session.getAttribute("list");
		
		if(list==null) {
			list=new ArrayList<>();
		}
		
		Favorite f =new Favorite();
		
		f.setName(name);
		f.setUrl(url);
		
		list.add(f);
		
		session.setAttribute("list", list);
		
		response.sendRedirect("favorites.jsp");
	}

}
