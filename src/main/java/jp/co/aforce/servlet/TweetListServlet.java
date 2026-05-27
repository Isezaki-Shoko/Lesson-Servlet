package jp.co.aforce.servlet;

import java.io.IOException;
import java.util.List;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import jp.co.aforce.beans.Tweet;
import jp.co.aforce.dao.DAO;
import jp.co.aforce.dao.TweetDAO;

@WebServlet(urlPatterns={"/servlet/tweet_list"})
public class TweetListServlet extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		TweetDAO tweetDAO = new TweetDAO();
		

		try {
			List<Tweet> tweets = tweetDAO.getAllTweets();
			request.setAttribute("tweets", tweets);

			if (authorlengh() > 255) {
				String massege = "投稿失敗";
			} else {
				tweets.setAuthor("author");
				tweets.setContent("content");

				DAO.insert(tweets);
				String massage = "投稿成功";
				request.getAttribute("massege", massege);
			}

		} catch (Exception e) {
			e.printStackTrace();

			request.getRequestDispatcher("tweet_list.jsp").forward(request, response);
		}

	}
}
