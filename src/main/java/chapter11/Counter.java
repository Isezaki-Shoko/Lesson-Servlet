package chapter11;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.concurrent.atomic.AtomicInteger;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = { "/chapter11/Counter" })
public class Counter extends HttpServlet {

    private AtomicInteger counter;

    public void init() throws ServletException {

        counter = new AtomicInteger(0);

        System.out.println("カウンター初期化");
    }

    protected void doGet(
        HttpServletRequest request,
        HttpServletResponse response
    ) throws ServletException, IOException {

        response.setContentType("text/html; charset=UTF-8");

        PrintWriter out = response.getWriter();

        int count = counter.incrementAndGet();

        out.println("<h1>アクセス回数：" + count + "</h1>");
    }

    public void destroy() {

        System.out.println(
            "最終カウント：" + counter.get()
        );
    }
}