package hello.servlet.basic.response;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "responseHeaderServlet", urlPatterns = "/response-header")
public class ResponseHeaderServlet extends HttpServlet {
    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //status-line
        response.setStatus(HttpServletResponse.SC_OK); //매직넘버 방지. 상수 선언되거 쓰는게 좋다

        //response-header
        response.setHeader("Content-Type", "text/plain;charset=utf-8");
        response.setHeader("Cache-Control", "no-cache, no-store");
        response.setHeader("Pragma", "no-cache");
        response.setHeader("my-header", "hello");

        cookie(response);

        redirect(response);

        //response-body
        PrintWriter writer = response.getWriter();
        writer.print("ok");
    }

    private void content(HttpServletResponse response) {
        response.setContentType("text/plain");
        response.setCharacterEncoding("utf-8");
    }

    private void cookie(HttpServletResponse response) {
        //Set-Cookie: myCookie=good; Max-Age=600
        Cookie cookie = new Cookie("myCookie", "good");
        cookie.setMaxAge(600);
        response.addCookie(cookie);
    }

    private void redirect(HttpServletResponse response) throws IOException {
        //status code: 302
        //location: /basic/hello-form.html

        response.setStatus(HttpServletResponse.SC_FOUND);//302코드
        response.setHeader("Location", "basic/hello-form.html");//location 정보 있어서 브라우저가 리다이렉트라 판단
        //response.sendRedirect("basic/hello-form.html");
    }
}
